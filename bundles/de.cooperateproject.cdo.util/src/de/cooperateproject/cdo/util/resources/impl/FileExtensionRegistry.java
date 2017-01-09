package de.cooperateproject.cdo.util.resources.impl;

import java.util.Collection;
import java.util.stream.Collectors;

import de.cooperateproject.cdo.util.resources.FileExtensionManager;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum FileExtensionRegistry {
    INSTANCE;

    private static final String EXTENSION_ID = "de.cooperateproject.cdo.util.resources";
    private static final String EXTENSION_ATTRIBUTE = "class";
    private final Collection<FileExtensionManager> fileExtensions;

    public static FileExtensionRegistry getInstance() {
        return INSTANCE;
    }

    private FileExtensionRegistry() {
        fileExtensions = ExtensionPointHelper.getExtensions(EXTENSION_ID, EXTENSION_ATTRIBUTE,
                FileExtensionManager.class);
    }

    public Collection<String> getFileExtensions() {
        return fileExtensions.stream().map(FileExtensionManager::getFileExtension).collect(Collectors.toSet());
    }
}
