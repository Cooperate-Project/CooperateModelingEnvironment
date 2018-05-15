package de.cooperateproject.cdo.util.resources;

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import de.cooperateproject.cdo.util.resources.impl.FactoryWrapper;

public class CDOResourceHandler {

    public static IFactoryWrapper createFactoryWrapper(Registry registry) {
        return new FactoryWrapper(registry);
    }

    public static IExtensionConverter getExtensionConverter() {
        return FactoryWrapper.getDefaultFactoryFactory().getFileExtensionHandler();
    }

}
