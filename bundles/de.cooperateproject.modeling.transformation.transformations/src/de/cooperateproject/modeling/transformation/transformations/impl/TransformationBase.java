package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.resource.UMLResource;

import com.google.common.collect.Lists;

import de.cooperateproject.modeling.transformation.transformations.registry.Transformation;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public abstract class TransformationBase extends DomainIndependentTransformationBase implements Transformation {

	private static final URI UML_PRIMITIVE_TYPES = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
	protected static final String UML_MODEL_FILE_EXTENSION = "uml";
	private final TransformationCharacteristic characteristics;
	private final URI sourceURI;
	private final URI targetURI;
	private final TraceTransformation traceTransformation;
	private final SortedSet<PostProcessor> postProcessors = new TreeSet<>();

	protected TransformationBase(TransformationCharacteristic characteristics, ResourceSet rs, URI source, URI target, Collection<PostProcessor> postProcessors) {
		super(rs);
		this.characteristics = characteristics;
		this.sourceURI = source;
		this.targetURI = target;
		this.traceTransformation = createTraceTransformation(characteristics, sourceURI, targetURI, rs);
		this.postProcessors.addAll(postProcessors);
	}
	
	private TraceTransformation createTraceTransformation(TransformationCharacteristic sourceCharacteristics, URI sourceModelURI, URI targetModelURI, ResourceSet rs) {
		return new TraceTransformationBase(sourceCharacteristics, sourceModelURI, targetModelURI, rs);
	}

	@Override
	public TransformationCharacteristic getCharacteristics() {
		return characteristics;
	}
	
	public IStatus transform(URI traceBase) throws IOException {
		URI transformationURI = TransformationNameUtils.createTransformationURI(getCharacteristics());
		URI umlURI = createUMLURI(sourceURI, targetURI);
		List<URI> transformationParameters = Lists.newArrayList(sourceURI, targetURI, umlURI, UML_PRIMITIVE_TYPES);
		IStatus transformationStatus = transform(transformationURI, createTraceURI(traceBase, sourceURI, targetURI), transformationParameters);
		if (transformationStatus.getSeverity() == IStatus.OK) {
			IStatus traceTransformationStatus = traceTransformation.transform(traceBase);
			if (traceTransformationStatus.getSeverity() != IStatus.OK) {
				return traceTransformationStatus;
			}
		}
		return transformationStatus;
	}
	
	private URI createUMLURI(URI from, URI to) {
		URI baseURI = getGraphicalModelURI(from, to);
		return baseURI.trimFragment().trimQuery().trimFileExtension().appendFileExtension(UML_MODEL_FILE_EXTENSION);
	}
	
	protected abstract URI getGraphicalModelURI(URI from, URI to);

	private URI createTraceURI(URI traceBase, URI from, URI to) {
		return TransformationNameUtils.createTraceURI(getCharacteristics(), from, to, traceBase);
	}

	@Override
	protected void postProcessTransformationParametersBeforeSave(Collection<ModelExtent> transformationParameters,
			Optional<Trace> transformationTrace) {
		postProcessors.forEach(p -> p.process(transformationParameters, transformationTrace));
	}

}
