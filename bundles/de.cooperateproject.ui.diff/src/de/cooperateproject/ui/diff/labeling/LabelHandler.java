package de.cooperateproject.ui.diff.labeling;

/**
 * This interface provides functions for the labeling of items.
 * @author Jasmin
 *
 */
public interface LabelHandler {
	public String getText(Object item);

	public String getClassText(Object item);
}
