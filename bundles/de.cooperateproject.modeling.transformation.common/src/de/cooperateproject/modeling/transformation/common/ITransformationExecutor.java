package de.cooperateproject.modeling.transformation.common;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface ITransformationExecutor {

    public void transformChanged(URI changedResource, ResourceSet resourceSet) throws IOException;

}
