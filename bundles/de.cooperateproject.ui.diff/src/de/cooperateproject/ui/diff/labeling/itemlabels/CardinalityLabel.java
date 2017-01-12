package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.ui.diff.labeling.CardinalityHelper;

public class CardinalityLabel implements SummaryItemLabelHandler {
	private final String classText = "cardinality";
	private CardinalityHelper helper = new CardinalityHelper();

	public String getText(Object item){
		Cardinality card = (Cardinality)item;
		return helper.convertToString(card.getLowerBound())+".."+ helper.convertToString(card.getUpperBound());
	}

	public String getClassText(){
		return classText;
	}
}
