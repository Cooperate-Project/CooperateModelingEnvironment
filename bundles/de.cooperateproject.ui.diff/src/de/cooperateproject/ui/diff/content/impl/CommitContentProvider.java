package de.cooperateproject.ui.diff.content.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;

import de.cooperateproject.ui.diff.content.DiffTreeItem;

/**
 * Content Provider for a tree viewer which lists the content of a diagram
 * 
 * @author Jasmin
 *
 */
public class CommitContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof DiffTreeItem) {
            return ((DiffTreeItem) parentElement).getContents().toArray();
        } else if (parentElement instanceof EObject) {
            return ((EObject) parentElement).eContents().toArray();
        }
        return new Object[0];
    }

    @Override
    public Object getParent(Object element) {
        if (element instanceof DiffTreeItem) {
            return ((DiffTreeItem) element).getParent();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof DiffTreeItem) {
            return !(((DiffTreeItem) element).getContents().isEmpty());
        } else if (element instanceof EObject) {
            return !(((EObject) element).eContents().isEmpty());
        }
        return false;
    }

    @Override
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

}
