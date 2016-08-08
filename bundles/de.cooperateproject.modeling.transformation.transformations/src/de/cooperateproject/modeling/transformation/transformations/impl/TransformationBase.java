package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
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

	protected TransformationBase(TransformationCharacteristic characteristics, ResourceSet rs, URI source, URI target) {
		super(rs);
		this.characteristics = characteristics;
		this.sourceURI = source;
		this.targetURI = target;
		this.traceTransformation = createTraceTransformation(characteristics, targetURI, rs);
		rs.getResources().stream().filter(r -> "qvto".equals(r.getURI().scheme())).forEach(r -> r.unload());
		rs.getResources().stream().filter(r -> !r.isLoaded()).forEach(r -> rs.getResources().remove(r));
	}
	
	private TraceTransformation createTraceTransformation(TransformationCharacteristic sourceCharacteristics, URI targetModelURI, ResourceSet rs) {
		return new TraceTransformationBase(sourceCharacteristics, targetModelURI, rs);
	}

	@Override
	public TransformationCharacteristic getCharacteristics() {
		return characteristics;
	}
	
	public IStatus transform(URI traceBase) throws IOException {
		URI transformationURI = TransformationNameUtils.createTransformationURI(getCharacteristics());
		URI umlURI = createUMLURI(sourceURI, targetURI);
		List<URI> transformationParameters = Lists.newArrayList(sourceURI, targetURI, umlURI, UML_PRIMITIVE_TYPES);
		IStatus transformationStatus = transform(transformationURI, createTraceURI(traceBase), transformationParameters);
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

	private URI createTraceURI(URI traceBase) {
		return TransformationNameUtils.createTraceURI(getCharacteristics(), traceBase);
	}

}
