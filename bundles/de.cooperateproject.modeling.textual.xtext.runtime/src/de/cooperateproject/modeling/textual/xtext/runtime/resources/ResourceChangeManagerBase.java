package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.collect.Sets;

public abstract class ResourceChangeManagerBase implements IResourceChangeManager {

	public enum PreparationReason {
		DISCOVERED, DISCARDED
	}
	
	@FunctionalInterface
	public interface PreparedResourceListener {
		public void resourceAdded(Resource r, PreparationReason preparationReason);
	}
	
	private final Collection<Resource> resourceEventFilter = Sets.newHashSet();
	private final Collection<PreparedResourceListener> resourceProcessedListeners = Sets.newHashSet();
	private ResourceSet observedResourceSet;

	protected ResourceChangeManagerBase(PreparedResourceListener...listeners) {
		this.resourceProcessedListeners.addAll(Arrays.asList(listeners));
	}

	@Override
	public void addEventFilterFor(Resource r) {
		Validate.notNull(r);
		resourceEventFilter.add(r);
	}

	@Override
	public void removeEventFilterFor(Resource r) {
		resourceEventFilter.remove(r);
	}
	
	@Override
	public void setResourceSet(ResourceSet rs) {
		if (rs == observedResourceSet) {
			return;
		}

		if (observedResourceSet != null) {
			cleanupForOldResourceSet(rs);
		}

		observedResourceSet = rs;
		if (rs != null) {
			initForNewResourceSet(rs);
		}
	}
	
	@Override
	public void close() {
		setResourceSet(null);
		resourceProcessedListeners.clear();
	}

	protected abstract void initForNewResourceSet(ResourceSet rs);

	protected abstract void cleanupForOldResourceSet(ResourceSet rs);

	protected void fireResourceProcessed(Resource r, PreparationReason preparationReason) {
		resourceProcessedListeners.forEach(l -> l.resourceAdded(r, preparationReason));
	}
	
	protected void handleChangedResourceFiltered(Resource r) {
		if (!resourceEventFilter.contains(r)) {
			handleChangedResource(r);
		}
	}

	protected abstract void handleChangedResource(Resource r);

}
