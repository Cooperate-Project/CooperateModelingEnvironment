package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Interface;

public class InterfaceLabel implements SummaryItemLabelHandler{
	private final String classText = "Interface";

	public String getText(EObject item ){
		return ((Interface)item).getName() + "as" + ((Interface)item).getAlias();
	}

	public String getClassText(){
		return classText;
	}
	
}

