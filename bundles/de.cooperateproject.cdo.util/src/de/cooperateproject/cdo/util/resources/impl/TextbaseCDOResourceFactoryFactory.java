package de.cooperateproject.cdo.util.resources.impl;

public class TextbaseCDOResourceFactoryFactory implements IVirtualCDOResourceFactoryFactory {

    @Override
    public IVirtualCDOResourceFactory createFactory() {
        return new TextbasedCDOResourceFactoryImpl();
    }

    @Override
    public IFileExtensionHandler getFileExtensionHandler() {
        return TextbasedCDOResource.EXTENSION_HANDLER;
    }

}
