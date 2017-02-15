package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Class;

public class ClassLabel implements SummaryItemLabelHandler {
	private final String classText = "class";
	private VisibilityLabel visibLabel = new VisibilityLabel();

	public String getText(Object item) {
		Class obj = ((Class) item);
		String isAbstract = "";
		if (obj.isAbstract()) {
			isAbstract = "abstract ";
		}

		return visibLabel.getText(obj.getVisibility()) + isAbstract + classText + " " + obj.getName();
	}

	public String getClassText() {
		return classText;
	}

}
