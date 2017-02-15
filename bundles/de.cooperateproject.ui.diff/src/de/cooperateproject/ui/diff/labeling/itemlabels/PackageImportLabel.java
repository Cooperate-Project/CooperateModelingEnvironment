package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.PackageImport;

public class PackageImportLabel implements SummaryItemLabelHandler {

	private final String classText = "package import";

	@Override
	public String getText(Object item) {
		return "import " + ((PackageImport) item).getReferencedElement().getImportedPackage().getName();
	}

	@Override
	public String getClassText() {
		return classText;
	}
}
