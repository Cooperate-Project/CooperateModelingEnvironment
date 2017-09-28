package de.cooperateproject.modeling.transformation.common.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.resource.UMLResource;

import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;
import de.cooperateproject.modeling.transformation.common.TransformationType;
import de.cooperateproject.modeling.transformation.common.registry.Transformation;

public abstract class TransformationBase extends DomainIndependentTransformationBase implements Transformation {

    private static final URI UML_PRIMITIVE_TYPES = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
    protected static final String UML_MODEL_FILE_EXTENSION = "uml";
    private static final int STATIC_MODELS_COUNT = 4;

    private final TransformationCharacteristic characteristics;
    private final URI sourceURI;
    private final Collection<URI> supplementarySourceURIs;
    private final URI targetURI;
    private final Collection<URI> supplementaryTargetURIs;
    private final TraceTransformation traceTransformation;
    private final SortedSet<PostProcessor> postProcessors = new TreeSet<>();

    private ITransformationUnitURIResolver transformationURIResolver;

    protected TransformationBase(TransformationCharacteristic characteristics,
            ITransformationUnitURIResolver uriResolver, ResourceSet rs, URI sourceURI,
            List<URI> supplementarySourceURIs, URI targetURI, List<URI> supplementaryTargetURIs,
            Collection<PostProcessor> postProcessors) {
        super(rs);
        this.characteristics = characteristics;
        this.transformationURIResolver = uriResolver;
        this.sourceURI = sourceURI;
        this.supplementarySourceURIs = Collections.unmodifiableCollection(new ArrayList<>(supplementarySourceURIs));
        this.targetURI = targetURI;
        this.supplementaryTargetURIs = Collections.unmodifiableCollection(new ArrayList<>(supplementaryTargetURIs));
        this.traceTransformation = createTraceTransformation(characteristics, uriResolver, sourceURI, targetURI,
                supplementaryTargetURIs, rs);
        this.postProcessors.addAll(postProcessors);
    }

    private TraceTransformation createTraceTransformation(TransformationCharacteristic sourceCharacteristics,
            ITransformationUnitURIResolver uriResolver, URI sourceURI, URI targetURI,
            Collection<URI> supplementaryTargetURIs, ResourceSet rs) {
        return new TraceTransformationBase(sourceCharacteristics, uriResolver, sourceURI, targetURI,
                supplementaryTargetURIs, rs);
    }

    @Override
    public TransformationCharacteristic getCharacteristics() {
        return characteristics;
    }

    public IStatus transform(URI traceBase) throws IOException {
        URI transformationURI = transformationURIResolver.getTransformationURI(getCharacteristics(),
                TransformationType.REGULAR);
        URI umlURI = createUMLURI(sourceURI, targetURI);
        List<URI> transformationParameters = new ArrayList<>(
                supplementarySourceURIs.size() + supplementaryTargetURIs.size() + STATIC_MODELS_COUNT);
        transformationParameters.add(sourceURI);
        transformationParameters.addAll(supplementarySourceURIs);
        transformationParameters.add(targetURI);
        transformationParameters.addAll(supplementaryTargetURIs);
        transformationParameters.addAll(Arrays.asList(umlURI, UML_PRIMITIVE_TYPES));

        IStatus transformationStatus = transform(transformationURI, createTraceURI(traceBase, sourceURI, targetURI),
                transformationParameters);
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
        return TransformationNameUtilsOld.createTraceURI(
                transformationURIResolver.getTransformationURI(getCharacteristics(), TransformationType.TRACE), from,
                to, traceBase);
    }

    @Override
    protected void postProcessTransformationParametersBeforeSave(List<ModelExtent> transformationParameters,
            Optional<Trace> transformationTrace, List<Integer> writeableParameterIndices) {
        List<ModelExtent> parametersToProcess = writeableParameterIndices.stream().map(transformationParameters::get)
                .collect(Collectors.toList());
        postProcessors.forEach(p -> p.process(parametersToProcess, transformationTrace));
    }
}
