package de.cooperateproject.cdo.util.resources.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

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
            registry.getExtensionToFactoryMap().put(
                    String.format("%s.%s", fileExtension, TextbasedCDOResourceFactoryImpl.getAdditionalFileExtension()),
                    new TextbasedCDOResourceFactoryImpl());
        }
    }

    public Factory getFactory(URI uri) {
        return getFactory(uri, null);
    }

    public Factory getFactory(URI uri, String contentType) {
        String fileExtensionToCheck = getFileExtension(uri);
        if (shallForwardToExtensionMap(fileExtensionToCheck)) {
            return (Factory) registry.getExtensionToFactoryMap().get(fileExtensionToCheck);
        }
        return registry.getFactory(uri, contentType);
    }

    private boolean shallForwardToExtensionMap(String fileExtension) {
        if (fileExtension == null) {
            return false;
        }

        String realFileExtension = fileExtension;

        String[] fileExtensionParts = fileExtension.split("\\.");
        if (fileExtensionParts.length == 2) {
            if (!TextbasedCDOResourceFactoryImpl.getAdditionalFileExtension().equals(fileExtensionParts[1])) {
                realFileExtension = fileExtensionParts[1];
            } else {
                realFileExtension = fileExtensionParts[0];
            }
        }

        for (String fe : fileExtensions) {
            if (fe.equals(realFileExtension)) {
                return true;
            }
        }
        return false;
    }

    private String getFileExtension(URI uri) {
        String additionalFileExtension = uri.fileExtension();
        if (!TextbasedCDOResourceFactoryImpl.getAdditionalFileExtension().equals(additionalFileExtension)) {
            return uri.fileExtension();
        }
        return Optional.ofNullable(uri.trimFileExtension().fileExtension())
                .map(fe -> String.format("%s.%s", fe, additionalFileExtension)).orElse(additionalFileExtension);
        //
        //
        // Optional<String> lastSegment = Optional.ofNullable(uri.lastSegment());
        // return lastSegment.map(s -> s.split("\\.")).filter(array -> array.length > 1)
        // .map(array -> ArrayUtils.subarray(array, 1, array.length)).map(array -> StringUtils.join(array, "."))
        // .orElse(uri.fileExtension());
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
