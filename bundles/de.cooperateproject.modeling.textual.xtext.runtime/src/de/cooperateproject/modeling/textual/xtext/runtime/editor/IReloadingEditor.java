package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.ui.IReusableEditor;

public interface IReloadingEditor extends IReusableEditor {

    void reloadDocumentContent();

    void cleanDerivedState();

}