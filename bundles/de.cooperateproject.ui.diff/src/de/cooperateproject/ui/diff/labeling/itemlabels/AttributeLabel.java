package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Attribute;

public class AttributeLabel implements SummaryItemLabelHandler {
	private final String classText = "attribute";
	private VisibilityLabel visibLabel = new VisibilityLabel();

	public String getText(Object item) {
		Attribute att = (Attribute) item;
		String type = "";
		type = ": " + att.getType().getName();

		return visibLabel.getText(att.getVisibility()) + att.getName() + type;
	}

	public String getClassText() {
		return classText;
	}

}
