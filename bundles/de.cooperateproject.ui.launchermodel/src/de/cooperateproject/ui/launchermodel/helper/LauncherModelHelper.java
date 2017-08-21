package de.cooperateproject.ui.launchermodel.helper;

import java.io.IOException;
import java.util.Collections;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.ui.launchermodel.Launcher.Diagram;

/**
 * Helper for loading a diagram.
 *
 */
public class LauncherModelHelper {

    public static final String FILE_EXTENSION = "cooperate";

    public static Diagram loadDiagram(ResourceSet rs, IFile launcherFile) throws IOException {
        Validate.notNull(rs);
        Validate.notNull(launcherFile);

        URI fileUri = URI.createPlatformResourceURI(launcherFile.getFullPath().toString(), false);
        Resource r = rs.createResource(fileUri, FILE_EXTENSION);
        r.load(Collections.emptyMap());
        EObject rootObject = r.getContents().get(0);
        if (!(rootObject instanceof Diagram)) {
            throw new IOException("The root element is not of type Diagram.");
        }
        return (Diagram) rootObject;
    }

}
