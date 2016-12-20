package de.cooperateproject.cdo.util.resources;

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import de.cooperateproject.cdo.util.resources.impl.FactoryWrapper;

public class CDOResourceHandler {
    public static FactoryWrapper createFactoryWrapper(Registry registry) {
        return new FactoryWrapper(registry);
    }
}
