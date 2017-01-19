package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class TraceTransformationBase extends DomainIndependentTransformationBase implements TraceTransformation {

	private final TransformationCharacteristic sourceTransformationCharacteristic;
	private final URI sourceModelURI;
	private final URI targetModelURI;

	public TraceTransformationBase(TransformationCharacteristic sourceCharacteristics, URI sourceModelURI, URI targetModelURI,
			ResourceSet rs) {
		super(rs);
		this.sourceTransformationCharacteristic = sourceCharacteristics;
		this.sourceModelURI = sourceModelURI;
		this.targetModelURI = targetModelURI;
	}

	@Override
	public IStatus transform(URI traceBase) throws IOException {
		URI transformationURI = TransformationNameUtils.createTraceTransformationURI(sourceTransformationCharacteristic);
		//URI sourceTransformationURI = TransformationNameUtils.createTransformationURI(sourceTransformationCharacteristic);
		URI targetTransformationURI = TransformationNameUtils.createTransformationURI(sourceTransformationCharacteristic.inverse());
		URI traceSourceURI = TransformationNameUtils.createTraceURI(sourceTransformationCharacteristic, sourceModelURI, targetModelURI, traceBase);
		URI traceTargetURI = TransformationNameUtils.createTraceURI(sourceTransformationCharacteristic.inverse(), targetModelURI, sourceModelURI, traceBase);
		
		Collection<URI> parameterURIs = Arrays.asList(traceSourceURI, traceTargetURI, targetModelURI, targetTransformationURI);
		return transform(transformationURI, parameterURIs);
	}

	@Override
	protected void postProcessTransformationParametersBeforeSave(Collection<ModelExtent> transformationParameters,
			Optional<Trace> transformationTrace) {
		// intentionally left blank
		return;
	}

}
