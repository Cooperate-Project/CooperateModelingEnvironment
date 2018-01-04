package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor;

import org.eclipse.core.resources.IFile;

/**
 * Factory for {@link IResourceDelegatingAnnotationModelListener} elements.
 */
@FunctionalInterface
public interface IResourceDelegatingAnnotationModelListenerFactory {

    /**
     * Creates a concrete implementation of {@link IResourceDelegatingAnnotationModelListener}.
     * 
     * @param delegationTarget
     *            The resource to which the listener shall delegate the annotations.
     * @return The newly created listener.
     */
    IResourceDelegatingAnnotationModelListener create(IFile delegationTarget);

}