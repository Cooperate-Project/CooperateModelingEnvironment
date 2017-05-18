package de.cooperateproject.ui.focus.manager;

import org.eclipse.ui.IEditorPart;

public abstract class FocusManagerBase<T extends IEditorPart> implements IFocusManager {

    private final T editorPart;

    public FocusManagerBase(T editorPart) {
        this.editorPart = editorPart;
    }

    @Override
    public T getEditorPart() {
        return editorPart;
    }

}
