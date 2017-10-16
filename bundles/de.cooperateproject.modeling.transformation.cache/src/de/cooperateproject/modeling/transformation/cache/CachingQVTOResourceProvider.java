package de.cooperateproject.modeling.transformation.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.osgi.service.component.annotations.Component;

import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.impl.QVTOResource;

@Component
public class CachingQVTOResourceProvider implements IQVTOResourceProvider {
    private final Registry packageRegistry;
    protected final Map<String, QVTOResource> resourceCache;

    public CachingQVTOResourceProvider() {
        this(EPackage.Registry.INSTANCE);
    }
    
    
    public CachingQVTOResourceProvider(EPackage.Registry packageRegistry) {
        this.packageRegistry = packageRegistry;
        this.resourceCache = new HashMap<>();
    }

    @Override
    public QVTOResource getQVTOResource(URI resourceURI) throws IOException {
        QVTOResource result = null;
        if ((result = resourceCache.get(resourceURI.toString())) == null) {
            result = new QVTOResource(resourceURI, packageRegistry);
            resourceCache.put(resourceURI.toString(), result);
        }
        return result;
    }

}
