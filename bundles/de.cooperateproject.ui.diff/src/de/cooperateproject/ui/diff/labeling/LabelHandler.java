package de.cooperateproject.ui.diff.labeling;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface provides functions for the labeling of items.
 * @author Jasmin
 *
 */
public interface LabelHandler {
	public String getText(EObject item);

	public String getClassText(EObject item);
}
