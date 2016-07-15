package de.cooperateproject.modeling.textual.xtext.runtime.resources.observer;

import org.eclipse.emf.ecore.resource.Resource;

public abstract class ResourceChangeObserver <T extends Resource, U> implements IResourceChangeObserver {

	private final T resource;
	private final U resourceListener;
	private final ResourceChangeHandler changeHandler;
	
	protected ResourceChangeObserver(T resource, ResourceChangeHandler changeHandler) {
		this.resource = resource;
		this.changeHandler = changeHandler;
		resourceListener = createAndRegisterResourceListener(resource);
	}
	
	@Override
	public Resource getObservedResource() {
		return resource;
	}
	
	protected T getObservedResourceTyped() {
		return resource;
	}
	
	protected void handleResourceChange() {
		changeHandler.resourceHasChanged(resource);
	}
	
	protected U getResourceListener() {
		return resourceListener;
	}
	
	protected abstract U createAndRegisterResourceListener(T r);
	
}
