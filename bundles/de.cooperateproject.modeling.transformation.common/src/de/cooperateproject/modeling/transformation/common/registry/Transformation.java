package de.cooperateproject.modeling.transformation.common.registry;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;

public interface Transformation {
	public IStatus transform(URI traceBase) throws IOException;
	public TransformationCharacteristic getCharacteristics();
}
