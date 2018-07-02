package de.cooperateproject.ui.util;

import org.eclipse.emf.common.util.URI;

public class LauncherNamingConventions {

    private LauncherNamingConventions() {
        // empty on purpose
    }

    public static String generateLauncherNameFromURI(URI uri) {
        return URI.decode(uri.trimFileExtension().lastSegment());
    }

    public static String generateUMLNameFromLauncherName(String launcherName) {
        return launcherName.substring(0, launcherName.lastIndexOf("-") - 1).concat(".uml");
    }
}
