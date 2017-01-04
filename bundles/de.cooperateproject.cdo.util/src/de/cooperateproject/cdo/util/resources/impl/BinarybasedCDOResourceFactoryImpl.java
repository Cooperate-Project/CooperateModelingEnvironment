package de.cooperateproject.cdo.util.resources.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import de.cooperateproject.cdo.util.resources.impl.BinarybasedCDOResource;

public class BinarybasedCDOResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Constructor for BinarybasedCDOResourceFactoryImpl.
     */
    public BinarybasedCDOResourceFactoryImpl()
    {
      super();
    }

    @Override
    public Resource createResource(URI uri)
    {
      return new BinarybasedCDOResource(uri);
    }
}
