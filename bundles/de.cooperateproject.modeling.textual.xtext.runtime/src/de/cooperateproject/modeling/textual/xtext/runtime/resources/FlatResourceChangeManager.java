package de.cooperateproject.modeling.textual.xtext.runtime.resources;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.Optional;
import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.xtext.runtime.resources.observer.IResourceChangeObserver;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.observer.ResourceChangeObserverFactory;

public abstract class FlatResourceChangeManager extends ResourceChangeManagerBase {

	private class ResourceSetAdapter extends AdapterImpl {
		
		@Override
		public void notifyChanged(Notification notification) {
			int notificationType = notification.getEventType();
			if ((notificationType & (Notification.ADD | Notification.ADD_MANY)) != 0) {
				handleChange(notification.getNewValue(), this::handleAddedResource);
			} else if ((notificationType & (Notification.REMOVE | Notification.REMOVE_MANY)) != 0) {
				handleChange(notification.getOldValue(), this::handleRemovedResource);
			}
		}
		
		private void handleChange(Object value, Consumer<Resource> consumer) {
			Collection<Resource> resources = null;
			if (value instanceof Collection) {
				resources = ((Collection<?>)value).stream().filter(e -> e != null && e instanceof Resource).map(e -> (Resource)e).collect(Collectors.toList());
			} else if (value instanceof Resource) {
				resources = Arrays.asList((Resource)value);
			}
			if (resources != null) {
				resources.forEach(consumer);
			}
		}
		
		private void handleAddedResource(Resource r) {
			registerAdapter(r);
		}
		
		private void handleRemovedResource(Resource r) {
			unregisterAdapter(r);
		}

	}
	
	private final Collection<IResourceChangeObserver> resourceObservers = Sets.newHashSet();
	private ResourceSetAdapter resourceSetObserver;
	
	public FlatResourceChangeManager(PreparedResourceListener...listeners) {
		super(listeners);
	}

	@Override
	protected void initForNewResourceSet(ResourceSet rs) {
		registerAdapters(rs);
	}

	@Override
	protected void cleanupForOldResourceSet(ResourceSet rs) {
		unregisterAdapters(rs);
	}

	private void registerAdapters(ResourceSet rs) {
		Validate.notNull(rs);
		
		registerAdapter(rs);
		rs.getResources().stream().forEach(this::registerAdapter);		
	}
	
	private void registerAdapter(ResourceSet rs) {
		Validate.notNull(rs);
		
		resourceSetObserver = new ResourceSetAdapter();
		rs.eAdapters().add(resourceSetObserver);		
	}
	
	private void registerAdapter(Resource r) {
		Validate.notNull(r);
		
		Optional<IResourceChangeObserver> adapter = createResourceAdapter(r);
		if (adapter.isPresent()) {
			resourceObservers.add(adapter.get());
		}
		fireResourceProcessed(r, PreparationReason.DISCOVERED);
	}
	
	private Optional<IResourceChangeObserver> createResourceAdapter(Resource r) {
		Validate.notNull(r);
		
		return ResourceChangeObserverFactory.create(r, this::handleChangedResourceFiltered);
	}

	private void unregisterAdapters(ResourceSet rs) {
		Validate.notNull(rs);
		
		unregisterAdapter(rs);
		rs.getResources().iterator().forEachRemaining(this::unregisterAdapter);
	}
	
	private void unregisterAdapter(ResourceSet rs) {
		Validate.notNull(rs);
		
		rs.eAdapters().removeIf(a -> a == resourceSetObserver);
		resourceSetObserver = null;
	}
	
	private void unregisterAdapter(Resource r) {
		Validate.notNull(r);
		
		resourceObservers.stream().filter(o -> o.getObservedResource() == r).forEach(o -> o.close());
		resourceObservers.removeIf(o -> o.getObservedResource() == r);
		fireResourceProcessed(r, PreparationReason.DISCARDED);
	}

}
