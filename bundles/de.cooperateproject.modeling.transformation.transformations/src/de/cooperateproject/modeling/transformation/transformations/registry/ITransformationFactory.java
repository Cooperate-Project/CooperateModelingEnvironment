package de.cooperateproject.modeling.transformation.transformations.registry;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Factory for {@link Transformation} elements.
 */
@FunctionalInterface
public interface ITransformationFactory {

    /**
     * Creates a new transformation that can handle the given input model.
     * 
     * @param changedModelURI
     *            The input model that shall be transformed.
     * @param rs
     *            The {@link ResourceSet} that shall be used to resolve the URI and dependencies.
     * @return A {@link Transformation} or {@link Optional#empty()} if a transformation is available that can handle the
     *         given input.
     */
    public Optional<Transformation> create(URI changedModelURI, ResourceSet rs);
}
