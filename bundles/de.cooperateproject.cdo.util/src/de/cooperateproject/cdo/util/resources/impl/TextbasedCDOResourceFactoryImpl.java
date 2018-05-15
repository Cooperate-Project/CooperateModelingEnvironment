package de.cooperateproject.cdo.util.resources.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class TextbasedCDOResourceFactoryImpl implements IVirtualCDOResourceFactory {
    /**
     * Constructor for TextbasedCDOResourceFactoryImpl.
     */
    public TextbasedCDOResourceFactoryImpl() {
        super();
    }

    @Override
    public Resource createResource(URI uri) {
        return new TextbasedCDOResource(uri);
    }

}
