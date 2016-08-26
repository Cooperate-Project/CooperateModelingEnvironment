package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorPart;

public interface IEditorLauncherFactory {

	public IEditorLauncher create(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException;	
	public EditorType getSupportedEditorType();
	public Optional<IEditorPart> findExistingEditor(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException;
	
}
