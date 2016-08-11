package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.transformation.transformations.registry.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class TraceTransformationBase extends DomainIndependentTransformationBase implements TraceTransformation {

	private final TransformationCharacteristic sourceTransformationCharacteristic;
	private final URI targetModelURI;

	public TraceTransformationBase(TransformationCharacteristic sourceCharacteristics, URI targetModelURI,
			ResourceSet rs) {
		super(rs);
		this.sourceTransformationCharacteristic = sourceCharacteristics;
		this.targetModelURI = targetModelURI;
	}

	@Override
	public IStatus transform(URI traceBase) throws IOException {
		URI transformationURI = TransformationNameUtils.createTraceTransformationURI(sourceTransformationCharacteristic);
		//URI sourceTransformationURI = TransformationNameUtils.createTransformationURI(sourceTransformationCharacteristic);
		URI targetTransformationURI = TransformationNameUtils.createTransformationURI(sourceTransformationCharacteristic.inverse());
		URI traceSourceURI = TransformationNameUtils.createTraceURI(sourceTransformationCharacteristic, traceBase);
		URI traceTargetURI = TransformationNameUtils.createTraceURI(sourceTransformationCharacteristic.inverse(), traceBase);
		
		//TODO remove
		if (sourceTransformationCharacteristic.getFrom() == ConcreteSyntaxTypes.TEXTUAL) {
			return Status.OK_STATUS;
		}
		
		Collection<URI> parameterURIs = Arrays.asList(traceSourceURI, traceTargetURI, targetModelURI, targetTransformationURI);
		return transform(transformationURI, parameterURIs);
	}

}
