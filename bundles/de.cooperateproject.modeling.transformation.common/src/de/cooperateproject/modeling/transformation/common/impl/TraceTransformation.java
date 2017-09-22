package de.cooperateproject.modeling.transformation.common.impl;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

public interface TraceTransformation {

	public IStatus transform(URI traceBase) throws IOException;
	
}
