package de.cooperateproject.modeling.transformation.registry;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.osgi.service.component.annotations.Component;

import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;

@Component(property = { "service.ranking:Integer=1" })
public class QVTOTransformationExecutorProvider implements IQVTOTransformationExecutorProvider {

    @Override
    public TransformationExecutor getTransformationExecutor(URI resourceURI) throws IOException {
        return new TransformationExecutor(resourceURI);
    }

}
