package de.cooperateproject.modeling.transformation.common.registry;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

public interface TransformationExecutor {

	public IStatus transform(URI changedModelURI) throws IOException;
	
}
