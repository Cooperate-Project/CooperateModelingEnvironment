package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.ui.diff.labeling.CardinalityHelper;

public class IntegerLabel  implements SummaryItemLabelHandler {
	private final String classText = "cardinality"; //Integer only occurs here when cardinality was changed

	@Override
	public String getText(Object item) {
		CardinalityHelper helper = new CardinalityHelper();
		return helper.convertToString((Integer)item);
	}

	@Override
	public String getClassText() {
		return classText;
	};
	

}
