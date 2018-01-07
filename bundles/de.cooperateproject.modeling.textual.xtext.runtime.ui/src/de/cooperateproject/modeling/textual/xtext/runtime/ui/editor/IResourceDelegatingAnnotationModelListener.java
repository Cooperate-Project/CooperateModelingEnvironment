package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor;

import org.eclipse.jface.text.source.IAnnotationModelListener;

/**
 * A annotation model listener that creates markers at specified resources and thereby delegates the added annotations
 * to them.
 */
public interface IResourceDelegatingAnnotationModelListener extends IAnnotationModelListener {

    /**
     * Disconnect associated resources from the listener.
     */
    void disconnect();

}
