package de.cooperateproject.ui.papyrus.editorlauncher;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.core.resource.sasheditor.AbstractSashModelProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;

public class DummySashModelProvider extends AbstractSashModelProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(DummySashModelProvider.class);
    private final Map<URI, File> tmpFiles = Maps.newHashMap();

    @Override
    public URI getSashModelURI(URI userModelURI) {
        if (!tmpFiles.containsKey(userModelURI)) {
            String normalizedPath = userModelURI.toString().replaceAll("[^A-Za-z0-9]", "_");
            String suffix = normalizedPath.substring(Math.max(0, normalizedPath.length() - 50));
            File tmpFile;
            try {
                tmpFile = File.createTempFile("sashmodel", suffix);
            } catch (IOException e) {
                LOGGER.error("Could not create temporary file.", e);
                return null;
            }
            tmpFile.deleteOnExit();
            tmpFiles.put(userModelURI, tmpFile);
        }
        return URI.createFileURI(tmpFiles.get(userModelURI).getAbsolutePath());
    }

    @Override
    public void dispose() {
        super.dispose();
        tmpFiles.values().forEach(File::delete);
    }

}
