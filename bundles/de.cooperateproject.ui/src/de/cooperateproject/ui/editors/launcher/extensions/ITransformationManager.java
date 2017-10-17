package de.cooperateproject.ui.editors.launcher.extensions;

import org.eclipse.ui.IEditorInput;

import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;

@FunctionalInterface
public interface ITransformationManager {

    public void handleEditorSave(IEditorInput editorInput) throws TransformationException;
}