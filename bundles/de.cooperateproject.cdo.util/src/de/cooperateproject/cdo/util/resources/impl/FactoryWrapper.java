package de.cooperateproject.cdo.util.resources.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

public class FactoryWrapper implements Resource.Factory.Registry {

    private final Resource.Factory.Registry registry;
    private final Collection<String> fileExtensions;

    public FactoryWrapper(Registry registry) {
        super();
        this.fileExtensions = FileExtensionRegistry.getInstance().getFileExtensions();
        this.registry = registry;
        for (String fileExtension : fileExtensions) {
            registry.getExtensionToFactoryMap().put(fileExtension, new TextbasedCDOResourceFactoryImpl());
        }
    }

    public Factory getFactory(URI uri) {
        for (String fileExtension : fileExtensions) {
            if (fileExtension.equals(uri.fileExtension())) {
                return (Factory) registry.getExtensionToFactoryMap().get(fileExtension);
            }
        }
        return registry.getFactory(uri);
    }

    public Factory getFactory(URI uri, String contentType) {
        for (String fileExtension : fileExtensions) {
            if (fileExtension.equals(uri.fileExtension())) {
                return (Factory) registry.getExtensionToFactoryMap().get(fileExtension);
            }
        }
        return registry.getFactory(uri, contentType);
    }

    public Map<String, Object> getProtocolToFactoryMap() {
        return registry.getProtocolToFactoryMap();
    }

    public Map<String, Object> getExtensionToFactoryMap() {
        return registry.getExtensionToFactoryMap();
    }

    public Map<String, Object> getContentTypeToFactoryMap() {
        return registry.getContentTypeToFactoryMap();
    }
}
