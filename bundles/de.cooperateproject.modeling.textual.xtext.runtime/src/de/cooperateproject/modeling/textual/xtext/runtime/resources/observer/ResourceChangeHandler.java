package de.cooperateproject.modeling.textual.xtext.runtime.resources.observer;

import org.eclipse.emf.ecore.resource.Resource;

@FunctionalInterface
public interface ResourceChangeHandler {

	public void resourceHasChanged(Resource r);
	
}
