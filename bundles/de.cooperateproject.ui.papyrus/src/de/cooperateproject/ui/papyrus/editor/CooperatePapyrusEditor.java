package de.cooperateproject.ui.papyrus.editor;

import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.ui.PartInitException;

public class CooperatePapyrusEditor extends PapyrusMultiDiagramEditor {

	public static String ID = "de.cooperateproject.ui.papyrus.editor";
	
	public CooperatePapyrusEditor() {
		super();
	}

	@Override
	protected void loadModelAndServices() throws PartInitException {
		super.loadModelAndServices();
		saveAndDirtyService = new SaveAndDirtyServiceWrapper(saveAndDirtyService);
	}

}
