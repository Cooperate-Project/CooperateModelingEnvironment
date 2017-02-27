package de.cooperateproject.ui.focus.labeling;

import org.eclipse.emf.ecore.EObject;

/**
 * Represents a saved focus request in the history.
 * @author Jasmin
 *
 */
public class HistoryElement {

	private EObject focusedElement;
	private long timestamp;

	public HistoryElement(EObject focusedElement, long timestamp) {
		this.focusedElement = focusedElement;
		this.timestamp = timestamp;
	}

	public EObject getFocusedElement() {
		return focusedElement;
	}

	public long getTimestamp() {
		return timestamp;
	}

}
