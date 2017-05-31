package de.cooperateproject.ui.focus.manager;

import org.eclipse.ui.IEditorPart;

/**
 * Base class for FocusManager implementations.
 * 
 * @author Tischner, czogalik
 *
 * @param <T>
 *            type of EditorPart
 */
public abstract class FocusManagerBase<T extends IEditorPart> implements IFocusManager {

    private final T editorPart;

    /**
     * Sets the actual editor part.
     * 
     * @param editorPart
     *            the actual editor part.
     */
    public FocusManagerBase(T editorPart) {
        this.editorPart = editorPart;
    }

    @Override
    public T getEditorPart() {
        return editorPart;
    }

}
