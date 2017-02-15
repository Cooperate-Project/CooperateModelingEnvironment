package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Parameter;

public class ParameterLabel implements SummaryItemLabelHandler {
	private final String classText = "parameter";
	private VisibilityLabel visibLabel = new VisibilityLabel();

	public String getText(Object item) {
		Parameter param = (Parameter) item;
		String type = ": " + param.getType().getName();

		return visibLabel.getText(param.getVisibility()) + param.getName() + type;
	}

	public String getClassText() {
		return classText;
	}

}
