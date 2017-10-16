package de.cooperateproject.modeling.transformation.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.osgi.service.component.annotations.Component;

import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;

@Component
public class CachingTransformationExecutorProvider implements IQVTOTransformationExecutorProvider {
    protected final Map<String, TransformationExecutor> executorCache;

    public CachingTransformationExecutorProvider() {
        this.executorCache = new HashMap<>();
    }


    @Override
    public TransformationExecutor getTransformationExecutor(URI resourceURI) throws IOException {
        TransformationExecutor res;
        if ((res = executorCache.get(resourceURI.toString())) == null) {
            res = new TransformationExecutor(resourceURI);
            executorCache.put(resourceURI.toString(), res);
        }
        return res;
    }

}
