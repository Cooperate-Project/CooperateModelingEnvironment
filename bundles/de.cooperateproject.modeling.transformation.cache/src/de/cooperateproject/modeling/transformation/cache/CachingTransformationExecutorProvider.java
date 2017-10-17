package de.cooperateproject.modeling.transformation.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.component.annotations.ServiceScope;

import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;

@Component(
        property = {
                "service.ranking:Integer=2",
        },
        scope = ServiceScope.SINGLETON
)
public class CachingTransformationExecutorProvider implements IQVTOTransformationExecutorProvider {
    protected final Map<String, TransformationExecutor> executorCache;
    protected IQVTOTransformationExecutorProvider delegateProvider;

    public CachingTransformationExecutorProvider() {
        this.executorCache = new HashMap<>();
    }

    @Reference(
            policy=ReferencePolicy.DYNAMIC,
            policyOption=ReferencePolicyOption.RELUCTANT,
            target="(service.ranking<=1)"
    )
    public void setDelegateProvider(IQVTOTransformationExecutorProvider delegateProvider) {
        this.delegateProvider = delegateProvider;
    }
    
    public void unsetDelegateProvider(IQVTOTransformationExecutorProvider delegateProvider) {
        if (this.delegateProvider == delegateProvider) {
            this.delegateProvider = null;
        }
    }
    
    @Override
    public TransformationExecutor getTransformationExecutor(URI resourceURI) throws IOException {
        TransformationExecutor res;
        if ((res = executorCache.get(resourceURI.toString())) == null) {
            res = delegateProvider.getTransformationExecutor(resourceURI);
            executorCache.put(resourceURI.toString(), res);
        }
        return res;
    }

}
