package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;

public interface IReinitializingDocumentProvider {

    void reinitializeDocumentContent(IDocument document, EObject rootElement);

}
