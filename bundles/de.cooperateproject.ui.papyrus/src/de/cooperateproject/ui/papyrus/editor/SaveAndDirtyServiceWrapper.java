package de.cooperateproject.ui.papyrus.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.papyrus.infra.ui.lifecycleevents.IEditorInputChangedListener;
import org.eclipse.papyrus.infra.ui.lifecycleevents.ISaveAndDirtyService;
import org.eclipse.ui.ISaveablePart;

public class SaveAndDirtyServiceWrapper implements ISaveAndDirtyService {

	private final ISaveAndDirtyService service;
	
	public SaveAndDirtyServiceWrapper(ISaveAndDirtyService service) {
		this.service = service;
	}

	public void registerIsaveablePart(ISaveablePart saveablePart) {
		service.registerIsaveablePart(saveablePart);
	}

	public void doSave(IProgressMonitor monitor) {
		service.doSave(monitor);
	}

	public void removeIsaveablePart(ISaveablePart saveablePart) {
		service.removeIsaveablePart(saveablePart);
	}

	public void addInputChangedListener(IEditorInputChangedListener inputChangedListener) {
		service.addInputChangedListener(inputChangedListener);
	}

	public void removeInputChangedListener(IEditorInputChangedListener inputChangedListener) {
		service.removeInputChangedListener(inputChangedListener);
	}

	public void doSaveAs() {
		service.doSaveAs();
	}

	public boolean isDirty() {
		return service.isDirty();
	}

	public boolean isSaveAsAllowed() {
		return service.isSaveAsAllowed();
	}

	public boolean isSaveOnCloseNeeded() {
		return service.isSaveOnCloseNeeded();
	}

}
