package de.cooperateproject.modeling.transformation.transformations.registry;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface TransformationFactory {
    public Optional<Transformation> create(URI changedModelURI, ResourceSet rs);
}
