package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Association;

public class AssociationLabel implements SummaryItemLabelHandler{
	//private AssociationPropertiesLabel propLabel = new AssociationPropertiesLabel(); not used atm
	private CardinalityLabel cardLabel = new CardinalityLabel();
	private final String classText = "association";

	public String getText(Object item){
		Association ass = (Association)item;
		String typeRefLeft = ass.getLeft().getName();
		String typeRefRight = ass.getRight().getName();

		String ret = typeRefLeft + " " + ass.getName() + " " + typeRefRight;
		if(ass.getProperties() != null){
			ret += " [" + cardLabel.getText(ass.getProperties().getCardinalityLeft()) + " | " + cardLabel.getText(ass.getProperties().getCardinalityRight()) + "]";
		}

		return ret;
				
		//TODO: Where are the rolenames?
	}

	public String getClassText(){
		return classText;
	}
	
}
