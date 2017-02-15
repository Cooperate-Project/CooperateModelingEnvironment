package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.ui.diff.labeling.CardinalityHelper;

public class IntegerLabel implements SummaryItemLabelHandler {
	// Integer only occurs when cardinality was changed
	private final String classText = "cardinality";

	@Override
	public String getText(Object item) {
		CardinalityHelper helper = new CardinalityHelper();
		return helper.convertToString((Integer) item);
	}

	@Override
	public String getClassText() {
		return classText;
	};

}
