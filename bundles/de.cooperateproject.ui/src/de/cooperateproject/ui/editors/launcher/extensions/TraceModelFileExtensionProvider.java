package de.cooperateproject.ui.editors.launcher.extensions;

import de.cooperateproject.cdo.util.resources.FileExtensionManager;

public class TraceModelFileExtensionProvider implements FileExtensionManager {

    @Override
    public String getFileExtension() {
        return de.cooperateproject.util.conventions.Constants.TRACE_FILE_EXTENTION;
    }
    
}