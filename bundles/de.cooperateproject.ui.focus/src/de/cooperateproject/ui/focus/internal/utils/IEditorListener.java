package de.cooperateproject.ui.focus.internal.utils;

import org.eclipse.ui.IEditorPart;

public interface IEditorListener {

    void editorActivated(IEditorPart editor);

    void editorClosed(IEditorPart editor);

}
