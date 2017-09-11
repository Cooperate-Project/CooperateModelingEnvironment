package de.cooperateproject.modeling.transformation.tests.commons;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;

public abstract class UnitTestEnvironmentSetupDelegate {
    abstract public void registerQVTOResolutionURIs(URI uriToRegister);
    
    abstract public void registerPlatformUris(String platformID, URI uri);
    
    public void registerPlatformUris(String platformID, Class<?> classOfPlugin) {
        try {
            registerPlatformUris(platformID, determinePluginUri(platformID, classOfPlugin));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    protected static URI determinePluginUri(String pluginId, Class<?> classOfPlugin) throws URISyntaxException {
        Path p = Paths.get(classOfPlugin.getProtectionDomain().getCodeSource().getLocation().toURI());
        while (p.getParent() != null && !p.getFileName().toString().equals(pluginId)) {
            p = p.getParent();
        }
        return URI.createFileURI(p.toAbsolutePath().toFile().toString() + "/");
    }
}
