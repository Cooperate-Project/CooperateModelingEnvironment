package de.cooperateproject.ui.events;

import org.eclipse.ui.IEditorPart;

public interface IEventListener {

	public void postSaveEvent(IEditorPart sender);
	
}
