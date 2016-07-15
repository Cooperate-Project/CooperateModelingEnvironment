package de.cooperateproject.modeling.textual.xtext.runtime.resources.observer;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Optional;

public class ResourceChangeObserverFactory {

	public static Optional<IResourceChangeObserver> create(Resource r, ResourceChangeHandler changeHandler) {
		if (r instanceof CDOResource) {
			return Optional.fromNullable(new CDOResourceChangeObserver((CDOResource)r, changeHandler));
		} else if (r.getURI().isPlatformResource()) {
			return Optional.fromNullable(new FileResourceChangeObserver(r, changeHandler));
		} else {
			return Optional.absent();
		}
	}
	
}
