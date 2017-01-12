package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Interface;

public class InterfaceLabel implements SummaryItemLabelHandler{
	private final String classText = "interface";
	private VisibilityLabel visibLabel = new VisibilityLabel();


	public String getText(Object item){
		return visibLabel.getText(((Interface)item).getVisibility()) + classText + " " + ((Interface)item).getName() + " as " + ((Interface)item).getAlias();
	}

	public String getClassText(){
		return classText;
	}
	
}

