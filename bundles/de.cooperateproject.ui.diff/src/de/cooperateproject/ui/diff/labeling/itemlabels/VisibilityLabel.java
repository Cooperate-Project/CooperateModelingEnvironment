package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Visibility;


public class VisibilityLabel implements SummaryItemLabelHandler{

	private final String classText = "visibility";
	
	@Override
	public String getText(Object item) {
		String ret = "";
		Visibility visib = (Visibility)item;
		switch(visib){
			case UNDEFINED: break;
			default: ret = visib.getLiteral().toLowerCase() + " ";
		}
		return ret;
	}

	@Override
	public String getClassText() {
		return classText;
	}

}
