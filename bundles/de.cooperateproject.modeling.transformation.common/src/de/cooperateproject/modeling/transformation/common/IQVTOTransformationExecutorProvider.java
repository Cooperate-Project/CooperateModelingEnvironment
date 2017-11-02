package de.cooperateproject.modeling.transformation.common;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public interface IQVTOTransformationExecutorProvider {

    TransformationExecutor getTransformationExecutor(URI resourceURI) throws IOException;

}
