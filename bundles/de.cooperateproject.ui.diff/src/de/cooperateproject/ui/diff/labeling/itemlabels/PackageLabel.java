package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Package;

public class PackageLabel implements SummaryItemLabelHandler {
	private final String classText = "package";

	public String getText(Object item) {
		return classText + " " + ((Package) item).getName();
	}

	public String getClassText() {
		return classText;
	}

}
