package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.modeling.transformation.transformations.Activator;
import de.cooperateproject.modeling.transformation.transformations.registry.Transformation;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public abstract class TransformationBase implements Transformation {

	private static final URI UML_PRIMITIVE_TYPES = URI
			.createURI("pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
	protected static final String UML_MODEL_FILE_EXTENSION = "uml";
	private final ResourceSet resourceSet;
	private final TransformationCharacteristic characteristics;
	private final URI sourceURI;
	private final URI targetURI;
	private final String textualFileExtension;

	public TransformationBase(TransformationCharacteristic characteristics, String textualFileExtension, ResourceSet rs, URI source, URI target) {
		this.resourceSet = rs;
		this.characteristics = characteristics;
		this.sourceURI = source;
		this.targetURI = target;
		this.textualFileExtension = textualFileExtension;
		rs.getResources().stream().filter(r -> "qvto".equals(r.getURI().scheme())).forEach(r -> r.unload());
		rs.getResources().stream().filter(r -> !r.isLoaded()).forEach(r -> rs.getResources().remove(r));
	}
	
	public IStatus transform(URI traceBase) throws IOException {
		URI transformationURI = createTransformationURI();
		URI umlURI = createUMLURI(sourceURI, targetURI);
		List<URI> transformationParameters = Lists.newArrayList(sourceURI, targetURI, umlURI, UML_PRIMITIVE_TYPES);
		return transform(transformationURI, createTraceURI(traceBase), transformationParameters);
	}

	private IStatus transform(URI transformationURI, URI traceURI, Collection<URI> parameterURIs) throws IOException {
		final Trace transformationTrace = createTrace(traceURI);
		final List<Pair<ModelExtent, Resource>> transformationResources = parameterURIs.stream().map(uri -> createPair(createModelExtent(uri), createResource(uri))).collect(Collectors.toList());
		final Collection<ModelExtent> transformationParameters = transformationResources.stream().map(r -> r.getFirst()).collect(Collectors.toList());
		
		IStatus transformationResult = transform(transformationURI, transformationParameters, transformationTrace);
		if (transformationResult.getSeverity() == IStatus.OK) {
			saveTransformationResources(transformationResources);
			saveTraceModel(traceURI, transformationTrace);			
		}
		return transformationResult;
	}

	private IStatus transform(URI transformationURI, Collection<ModelExtent> transformationParameters,
			Trace transformationTrace) {
		
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, transformationTrace);
		context.setConfigProperty("keepModeling", true);

		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		ExecutionDiagnostic result = executor.execute(context,
				Iterables.toArray(transformationParameters, ModelExtent.class));

		if (result.getSeverity() != Diagnostic.OK) {
			IStatus status = BasicDiagnostic.toIStatus(result);
			Activator.getDefault().getLog().log(status);
		}
		
		return BasicDiagnostic.toIStatus(result);
	}
	
	protected String getTextualFileExtension() {
		return textualFileExtension;
	}
	
	protected abstract void saveTransformationResources(List<Pair<ModelExtent, Resource>> transformationResources) throws IOException;
	
	protected void save(List<Pair<ModelExtent, Resource>> transformationResources) throws IOException {
		for (Pair<ModelExtent, Resource> transformationResource : transformationResources) {
			save(transformationResource);
		}
	}
	
	private void save(Pair<ModelExtent, Resource> transformationResource) throws IOException {
		Resource resource = transformationResource.getSecond();
		ModelExtent transformationResult = transformationResource.getFirst();
		
		if (transformationResult.getContents().stream().anyMatch(o -> !resource.equals(o.eResource()))) {
			// TODO merge instead of replace
			resource.getContents().clear();
			resource.getContents().addAll(transformationResource.getFirst().getContents());			
		}
		
		resource.save(Collections.emptyMap());
	}

	private void saveTraceModel(URI traceURI, Trace traceModel) throws IOException {
		Resource traceResource = resourceSet.getResource(traceURI, true);
		if (traceResource == null) {
			traceResource = resourceSet.createResource(traceURI);
		}
		traceResource.getContents().clear();
		traceResource.getContents().addAll(traceModel.getTraceContent());
		traceResource.save(Collections.emptyMap());
	}
	
	private URI createUMLURI(URI from, URI to) {
		URI baseURI = getGraphicalModelURI(from, to);
		return baseURI.trimFragment().trimQuery().trimFileExtension().appendFileExtension(UML_MODEL_FILE_EXTENSION);
	}
	
	protected abstract URI getGraphicalModelURI(URI from, URI to);

	private URI createTraceURI(URI traceBase) {
		return traceBase.appendSegment(createTransformationFileName()).trimFileExtension().appendFileExtension("qvtotrace");
	}
	
	private Trace createTrace(URI traceURI) {
		Trace traceModel = Trace.createEmptyTrace();
		if (resourceSet.getURIConverter().exists(traceURI, Collections.emptyMap())) {
			Resource traceResource = resourceSet.getResource(traceURI, true);
			traceModel = new Trace(traceResource.getContents());			
		} else {
			Resource traceResource = resourceSet.createResource(traceURI);
			traceResource.getContents().addAll(traceModel.getTraceContent());			
		}
		return traceModel;
	}

	private URI createTransformationURI() {
		final String path = String.format("/%s/transforms/%s", Activator.PLUGIN_ID,
				createTransformationFileName());
		return URI.createPlatformPluginURI(path, true);
	}

	private String createTransformationFileName() {
		return String.format("%s_to_%s_for_%s.qvto", characteristics.getFrom(), characteristics.getTo(),
				characteristics.getDiagramType().getName());
	}
	
	private Resource createResource(URI uri) {
		return resourceSet.getResource(uri.trimFragment().trimQuery(), false);
	}
	
	private ModelExtent createModelExtent(URI uri) {
		EObject rootObject = null;
		if (uri.hasFragment()) {
			rootObject = resourceSet.getEObject(uri, false);
		} else {
			Resource r = resourceSet.getResource(uri, false);
			rootObject = r.getContents().get(0);
		}
		return createModelExtent(rootObject);		
	}

	private static ModelExtent createModelExtent(EObject rootElement) {
		BasicModelExtent modelExtent = new BasicModelExtent();
		modelExtent.add(rootElement);
		return modelExtent;
	}

	private static <T, S> Pair<T, S> createPair(T first, S second) {
		return new Pair<T, S>(first, second);
	}
	
	protected static class Pair<T, S> {
		private final T first;
		private final S second;
		public Pair(T first, S second) {
			super();
			this.first = first;
			this.second = second;
		}
		public T getFirst() {
			return first;
		}
		public S getSecond() {
			return second;
		}
	}
}
