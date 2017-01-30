package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Association;

public class AssociationLabel implements SummaryItemLabelHandler{
	private CardinalityLabel cardLabel = new CardinalityLabel();
	private final String classText = "association";

	public String getText(Object item){
		Association ass = (Association)item;
		String typeRefLeft = ass.getLeft().getName();
		String typeRefRight = ass.getRight().getName();

		String ret = typeRefLeft + " " + ass.getName() + " " + typeRefRight;
		if(ass.getProperties() != null){
			String leftRole = "";
			String rightRole = "";
			if(ass.getProperties().getPropertyLeft().getName() != null)
				leftRole = ", " + ass.getProperties().getPropertyLeft().getName();
			if(ass.getProperties().getPropertyRight().getName() != null)
				rightRole =  ", " + ass.getProperties().getPropertyRight().getName();
			
			ret += " [" + cardLabel.getText(ass.getProperties().getCardinalityLeft()) + leftRole;
			ret += " | " + cardLabel.getText(ass.getProperties().getCardinalityRight()) + rightRole + "]";
		}

		return ret;
	}

	public String getClassText(){
		return classText;
	}
	
}

