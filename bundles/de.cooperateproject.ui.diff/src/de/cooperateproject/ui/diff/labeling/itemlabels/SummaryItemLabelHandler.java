package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

public interface SummaryItemLabelHandler {
	public String getText(EObject item);
	public String getClassText();
}
