package de.cooperateproject.cdo.util.resources.impl;

import java.util.Collection;

import de.cooperateproject.cdo.util.resources.IExtensionConverter;

public interface IFileExtensionHandler extends IExtensionConverter {

    Collection<String> getExtensionsToRegister();

}
