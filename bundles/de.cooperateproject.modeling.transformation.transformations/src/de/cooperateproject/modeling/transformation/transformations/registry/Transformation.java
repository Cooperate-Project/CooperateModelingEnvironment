package de.cooperateproject.modeling.transformation.transformations.registry;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

public interface Transformation {
	public IStatus transform(URI traceBase) throws IOException;
}
