package de.cooperateproject.ui.textualeditors.editorlauncher;


import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher.PartSavedHandler;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.events.EventHandler;


public class TextualCDOEditorLauncherFactory implements IEditorLauncherFactory {

	public TextualCDOEditorLauncherFactory() {
		// intentionally left blank
	}

	@Override
	public EditorType getSupportedEditorType() {
		return EditorType.TEXTUAL;
	}

	@Override
	public IEditorLauncher create(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		return new TextualCDOEditorLauncher(launcherFile, editorType, new PartSavedHandler() {
			@Override
			public void partSaved(IEditorPart part) {
				EventHandler.getInstance().postModelSave(part);
			}
		});
	}

}
