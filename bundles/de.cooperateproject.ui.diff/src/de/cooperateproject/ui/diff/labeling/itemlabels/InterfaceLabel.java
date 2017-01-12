package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Interface;

public class InterfaceLabel implements SummaryItemLabelHandler{
	private final String classText = "interface";
	private VisibilityLabel visibLabel = new VisibilityLabel();


	public String getText(Object item){
		Interface intf = (Interface)item;
		String alias = "";
		if(intf.getAlias() != null){
			alias = " as " + intf.getAlias();
		}
		return visibLabel.getText(intf.getVisibility()) + classText + " " + intf.getName() + alias;
	}

	public String getClassText(){
		return classText;
	}
	
}

