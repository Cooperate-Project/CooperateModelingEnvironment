package de.cooperateproject.cdo.util.resources.impl;

public interface IVirtualCDOResourceFactoryFactory {

    public IVirtualCDOResourceFactory createFactory();

    public IFileExtensionHandler getFileExtensionHandler();

}
