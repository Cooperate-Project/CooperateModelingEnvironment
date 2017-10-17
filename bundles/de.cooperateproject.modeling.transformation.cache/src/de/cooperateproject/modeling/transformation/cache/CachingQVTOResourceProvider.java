package de.cooperateproject.modeling.transformation.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.component.annotations.ServiceScope;

import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

@Component(
        property = {
                "service.ranking:Integer=2"
        },
        scope = ServiceScope.SINGLETON
)
public class CachingQVTOResourceProvider implements IQVTOResourceProvider {
    protected final Map<String, QVTOResource> resourceCache = new HashMap<>();
    private IQVTOResourceProvider delegateProvider;
    
    @Reference(
            policy=ReferencePolicy.DYNAMIC,
            policyOption=ReferencePolicyOption.RELUCTANT,
            target="(service.ranking<=1)"
    )
    public void setDelegateProvider(IQVTOResourceProvider delegateProvider) {
        this.delegateProvider = delegateProvider;
    }
    
    public void unsetDelegateProvider(IQVTOResourceProvider delegateProvider) {
        if (this.delegateProvider == delegateProvider) {
            this.delegateProvider = null;
        }
    }

    @Override
    public QVTOResource getQVTOResource(URI resourceURI) throws IOException {
        QVTOResource result = null;
        if ((result = resourceCache.get(resourceURI.toString())) == null) {
            result = delegateProvider.getQVTOResource(resourceURI);
            resourceCache.put(resourceURI.toString(), result);
        }
        return result;
    }

}
