package de.cooperateproject.modeling.transformation.common.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;
import de.cooperateproject.modeling.transformation.common.TransformationType;

public class TraceTransformationBase extends DomainIndependentTransformationBase implements TraceTransformation {

    private static final int STATIC_MODEL_COUNT = 4;

    private final TransformationCharacteristic sourceTransformationCharacteristic;
    private final Collection<URI> supplementaryTargetModelURIs;
    private final URI sourceModelURI;
    private final URI targetModelURI;

    private ITransformationUnitURIResolver transformationUnitURIResolver;

    public TraceTransformationBase(TransformationCharacteristic sourceCharacteristics,
            ITransformationUnitURIResolver uriResolver, URI sourceURI, URI targetURI,
            Collection<URI> supplementaryTargetModelURIs, ResourceSet rs) {
        super(rs);
        this.sourceTransformationCharacteristic = sourceCharacteristics;
        this.transformationUnitURIResolver = uriResolver;
        this.sourceModelURI = sourceURI;
        this.targetModelURI = targetURI;
        this.supplementaryTargetModelURIs = supplementaryTargetModelURIs;
    }

    @Override
    public IStatus transform(URI traceBase) throws IOException {
        URI transformationURI = transformationUnitURIResolver.getTransformationURI(sourceTransformationCharacteristic,
                TransformationType.TRACE);
        // URI sourceTransformationURI =
        // TransformationNameUtils.createTransformationURI(sourceTransformationCharacteristic);
        URI targetTransformationURI = transformationUnitURIResolver
                .getTransformationURI(sourceTransformationCharacteristic.inverse(), TransformationType.REGULAR);
        URI traceSourceURI = TransformationNameUtilsOld.createTraceURI(transformationURI, sourceModelURI,
                targetModelURI, traceBase);
        URI traceTargetURI = TransformationNameUtilsOld.createTraceURI(transformationUnitURIResolver
                .getTransformationURI(sourceTransformationCharacteristic.inverse(), TransformationType.TRACE),
                targetModelURI, sourceModelURI, traceBase);

        Collection<URI> parameterURIs = new ArrayList<>(supplementaryTargetModelURIs.size() + STATIC_MODEL_COUNT);
        parameterURIs.addAll(Arrays.asList(traceSourceURI, traceTargetURI, targetModelURI));
        parameterURIs.addAll(supplementaryTargetModelURIs);
        parameterURIs.add(targetTransformationURI);
        return transform(transformationURI, parameterURIs);
    }

    @Override
    protected void postProcessTransformationParametersBeforeSave(List<ModelExtent> transformationParameters,
            Optional<Trace> transformationTrace, List<Integer> writeableParameterIndices) {
        // intentionally left blank
        return;
    }

}
