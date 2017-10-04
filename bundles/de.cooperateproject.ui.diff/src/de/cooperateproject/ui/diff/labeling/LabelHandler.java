package de.cooperateproject.ui.diff.labeling;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface provides functions for the labeling of items.
 * 
 * @author Jasmin
 *
 */
public interface LabelHandler {

    /**
     * Returns description for given item.
     * 
     * @param item
     *            given item to decript.
     * @return description for given item.
     */
    public String getText(EObject item);

    /**
     * Returns type of diff kind of given item.
     * 
     * @param item
     *            given item to label.
     * @return type of diff kind of given item.
     */
    public String getClassText(EObject item);
}
