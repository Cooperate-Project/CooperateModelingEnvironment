package de.cooperateproject.cdo.util.resources.impl;

public class BinarybasedCDOResourceFactoryFactory implements IVirtualCDOResourceFactoryFactory {

    private final IFileExtensionHandler extensionHandler = new BinarybasedCDOResourceFileExtensionHandler();

    @Override
    public IVirtualCDOResourceFactory createFactory() {
        return new BinarybasedCDOResourceFactoryImpl();
    }

    @Override
    public IFileExtensionHandler getFileExtensionHandler() {
        return extensionHandler;
    }

}
