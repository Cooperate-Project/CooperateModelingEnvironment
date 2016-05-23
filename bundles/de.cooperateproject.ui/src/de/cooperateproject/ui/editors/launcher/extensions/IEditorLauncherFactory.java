package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;

public interface IEditorLauncherFactory {

	public IEditorLauncher create(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException;
	public EditorType getSupportedEditorType();
	
}
