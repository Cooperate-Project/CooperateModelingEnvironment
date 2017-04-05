package de.cooperateproject.modeling.transformation.engine.executor;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.transformation.transformations.registry.Transformation;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationFactory;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationFactoryRegistry;

public enum TransformationExecutor {

    INSTANCE;

    public static TransformationExecutor getInstance() {
        return TransformationExecutor.INSTANCE;
    }

    public void transformChanged(URI changedResource, ResourceSet resourceSet) throws IOException {
        Collection<TransformationFactory> transformationFactories = TransformationFactoryRegistry.getInstance()
                .getTransformationFactories();
        Collection<Transformation> transformations = transformationFactories.stream()
                .map(f -> f.create(changedResource, resourceSet)).filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toSet());
        URI traceBaseURI = changedResource.trimFragment().trimQuery().trimSegments(1);
        for (Transformation transformation : transformations) {
            transformation.transform(traceBaseURI);
        }
    }
}
