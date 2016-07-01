package de.cooperateproject.ui.papyrus.editorlauncher;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher.PartSavedHandler;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.events.EventHandler;

public class PapyrusCDOLauncherFactory implements IEditorLauncherFactory {

	public PapyrusCDOLauncherFactory() {
		// intentionally left blank
	}

	@Override
	public EditorType getSupportedEditorType() {
		return EditorType.GRAPHICAL;
	}

	@Override
	public IEditorLauncher create(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		return new PapyrusCDOLauncher(launcherFile, editorType, new PartSavedHandler() {
			@Override
			public void partSaved(IEditorPart part) {
				EventHandler.getInstance().postModelSave(part);
			}
		});
	}

}
