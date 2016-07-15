package de.cooperateproject.modeling.textual.xtext.runtime.resources.observer;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;

public class CDOResourceChangeObserver extends ResourceChangeObserver<CDOResource, IListener> {

	protected CDOResourceChangeObserver(CDOResource resource, ResourceChangeHandler changeHandler) {
		super(resource, changeHandler);
	}

	@Override
	protected IListener createAndRegisterResourceListener(CDOResource r) {
		IListener cdoChangeListener = new IListener() {
			@Override
			public void notifyEvent(IEvent event) {
				if (event instanceof CDOViewInvalidationEvent) {
					CDOViewInvalidationEvent realEvent = (CDOViewInvalidationEvent) event;
					if (realEvent.getDirtyObjects().stream().filter(o -> o instanceof EObject)
							.map(o -> ((EObject) o).eResource()).filter(r -> r instanceof CDOResource)
							.anyMatch(getObservedResource()::equals)) {
						handleResourceChange();
					}
				}
			}
		};
		r.cdoView().addListener(cdoChangeListener);
		return cdoChangeListener;
	}

	@Override
	public void close() {
		getObservedResourceTyped().cdoView().removeListener(getResourceListener());
	}

}
