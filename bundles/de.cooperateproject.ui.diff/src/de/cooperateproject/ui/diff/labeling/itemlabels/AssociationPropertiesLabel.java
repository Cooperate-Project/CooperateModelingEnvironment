package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;

public class AssociationPropertiesLabel implements SummaryItemLabelHandler {
	private final String classText = "association properties";

	public String getText(Object item) {
		AssociationProperties ass = (AssociationProperties) item;
		return "left role: " + ass.getPropertyLeft().getName() + ", right role: " + ass.getPropertyRight().getName();
	}

	public String getClassText() {
		return classText;
	}
}
