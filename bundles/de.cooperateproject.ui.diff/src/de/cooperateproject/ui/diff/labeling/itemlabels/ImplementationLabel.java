package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.Implementation;

public class ImplementationLabel implements SummaryItemLabelHandler{
	private final String classText = "implementation";

	public String getText(Object item){
		Implementation imp = (Implementation)item;
		String left = imp.getLeft().getName();
		String right = imp.getLeft().getName();
		return left + " impl " + right;
	}

	public String getClassText(){
		return classText;
	}
	
}