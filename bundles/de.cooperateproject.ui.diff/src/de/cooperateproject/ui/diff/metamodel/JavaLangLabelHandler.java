package de.cooperateproject.ui.diff.metamodel;

import de.cooperateproject.ui.diff.labeling.LabelHandler;

public class JavaLangLabelHandler implements LabelHandler {

	@Override
	public String getText(Object item) {
		String ret = "";
		if (item instanceof Integer) {
			if ((Integer) item == -1) {
				ret = "*";
			} else {
				ret = ((Integer) item).toString();
			}

		}
		return ret;
	}

	@Override
	public String getClassText(Object item) {
		String ret = "";
		if (item instanceof Integer) {
			ret = "cardinality";
		}
		return ret;
	}

}
