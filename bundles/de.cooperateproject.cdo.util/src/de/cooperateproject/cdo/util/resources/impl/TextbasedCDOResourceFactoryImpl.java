package de.cooperateproject.cdo.util.resources.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class TextbasedCDOResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Constructor for TextbasedCDOResourceFactoryImpl.
     */
    public TextbasedCDOResourceFactoryImpl()
    {
      super();
    }

    @Override
    public Resource createResource(URI uri)
    {
      return new TextbasedCDOResource(uri);
    }
}
