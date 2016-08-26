package de.cooperateproject.ui.editors.launcher.extensions;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

public interface IEditorLauncher {

	public IEditorPart openEditor() throws PartInitException;
	
}
