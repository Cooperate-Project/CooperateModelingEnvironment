package de.cooperateproject.cdo.util.resources.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class BinarybasedCDOResourceFactoryImpl implements IVirtualCDOResourceFactory {
    /**
     * Constructor for BinarybasedCDOResourceFactoryImpl.
     */
    public BinarybasedCDOResourceFactoryImpl() {
        super();
    }

    @Override
    public Resource createResource(URI uri) {
        return new BinarybasedCDOResource(uri);
    }
}
