package de.cooperateproject.ui.events;

import org.eclipse.ui.IEditorPart;

public abstract class NOPEventListener implements IEventListener {

	@Override
	public void postSaveEvent(IEditorPart sender) {
		return;
	}

}
