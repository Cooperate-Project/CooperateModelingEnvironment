package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IReusableEditor;

/**
 * Editor that allows reloading its content. This simulates closing and opening the editor with the same
 * {@link IEditorInput}.
 */
public interface IReloadingEditor extends IReusableEditor {

    /**
     * Reloads the content of the associated document.
     */
    void reloadDocumentContent();

    /**
     * Removes a possibly existing derived state from the editor and its associated resources.
     */
    void cleanDerivedState();

}