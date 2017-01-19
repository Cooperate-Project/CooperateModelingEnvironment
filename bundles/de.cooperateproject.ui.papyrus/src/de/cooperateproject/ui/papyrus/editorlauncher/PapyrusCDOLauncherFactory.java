package de.cooperateproject.ui.papyrus.editorlauncher;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

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
		return new PapyrusCDOLauncher(launcherFile, editorType);
	}

	@Override
	public Optional<IEditorPart> findExistingEditor(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		return PapyrusCDOLauncher.findExistingEditor(launcherFile, editorType);
	}

}
