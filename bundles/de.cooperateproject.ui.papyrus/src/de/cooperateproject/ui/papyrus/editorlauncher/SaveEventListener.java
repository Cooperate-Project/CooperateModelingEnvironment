package de.cooperateproject.ui.papyrus.editorlauncher;

import org.eclipse.papyrus.infra.core.lifecycleevents.DoSaveEvent;
import org.eclipse.papyrus.infra.core.lifecycleevents.ISaveEventListener;
import org.eclipse.ui.IEditorPart;


public class SaveEventListener implements ISaveEventListener {

	@FunctionalInterface
	public interface PartSavedHandler {
		public void partSaved(IEditorPart part);
	}
	
	private final PartSavedHandler handler;
	
	public SaveEventListener(PartSavedHandler handler) {
		this.handler = handler;
	}
	
	@Override
	public void doSave(DoSaveEvent event) {
		handler.partSaved(event.getMultiDiagramEditor());
	}

	@Override
	public void doSaveAs(DoSaveEvent event) {
		doSave(event);
	}

}
