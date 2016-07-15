package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IResourceChangeManager {

	public void setResourceSet(ResourceSet rs);
	public void addEventFilterFor(Resource r);
	public void removeEventFilterFor(Resource r);
	public void close();
	
}
