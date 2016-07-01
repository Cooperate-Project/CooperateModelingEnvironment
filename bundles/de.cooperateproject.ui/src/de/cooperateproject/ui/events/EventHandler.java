package de.cooperateproject.ui.events;

import java.util.Set;

import org.eclipse.ui.IEditorPart;

import com.google.common.collect.Sets;

public enum EventHandler {

	INSTANCE;
	
	public static EventHandler getInstance() {
		return INSTANCE;
	}
	
	private final Set<IEventListener> listeners = Sets.newHashSet();
	
	public void registerListener(IEventListener listener) {
		listeners.add(listener);
	}
	
	public void unregisterListener(IEventListener listener) {
		listeners.remove(listener);
	}
	
	public void postModelSave(IEditorPart sender) {
		listeners.forEach(l -> l.postSaveEvent(sender));
	}
	
}
