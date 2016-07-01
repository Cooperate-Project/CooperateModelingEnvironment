package de.cooperateproject.modeling.transformation.transformations.registry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface TransformationFactory {
	public Transformation create(URI changedModelURI, ResourceSet rs);
	public boolean canHandle(URI changedModelURI);
}
