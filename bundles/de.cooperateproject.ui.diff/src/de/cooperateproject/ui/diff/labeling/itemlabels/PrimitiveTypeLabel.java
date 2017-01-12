package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.uml2.uml.PrimitiveType;

public class PrimitiveTypeLabel  implements SummaryItemLabelHandler{
	private final String classText = "type";

	@Override
	public String getText(Object item) {
		return ((PrimitiveType)item).getName();
	}

	@Override
	public String getClassText() {
		return classText;
	}

}
