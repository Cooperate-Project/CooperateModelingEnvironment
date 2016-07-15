package de.cooperateproject.modeling.textual.xtext.runtime.resources.observer;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceChangeObserver {

	public Resource getObservedResource();
	public void close();
	
}
