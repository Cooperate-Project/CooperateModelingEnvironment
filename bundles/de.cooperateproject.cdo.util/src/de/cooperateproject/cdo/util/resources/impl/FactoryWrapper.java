package de.cooperateproject.cdo.util.resources.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import de.cooperateproject.cdo.util.resources.IFactoryWrapper;

public class FactoryWrapper implements IFactoryWrapper {

    private static final IVirtualCDOResourceFactoryFactory factoryFactory = new TextbaseCDOResourceFactoryFactory();
    private final Resource.Factory.Registry registry;

    public FactoryWrapper(Registry registry) {
        super();
        this.registry = registry;
        Collection<String> extensions = getDefaultFactoryFactory().getFileExtensionHandler().getExtensionsToRegister();
        extensions.stream()
                .forEach(e -> registry.getExtensionToFactoryMap().put(e, getDefaultFactoryFactory().createFactory()));
    }

    public static IVirtualCDOResourceFactoryFactory getDefaultFactoryFactory() {
        return factoryFactory;
    }

    public Factory getFactory(URI uri) {
        return getFactory(uri, null);
    }

    public Factory getFactory(URI uri, String contentType) {
        Optional<String> relevantExtension = getDefaultFactoryFactory().getFileExtensionHandler()
                .getRelevantExtension(uri);
        return relevantExtension.map(e -> (Factory) registry.getExtensionToFactoryMap().get(e))
                .orElseGet(() -> registry.getFactory(uri, contentType));
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
