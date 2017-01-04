package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Class;

public class ClassLabel implements SummaryItemLabelHandler{
	private final String classText = "Class";

	public String getText(EObject item ){
		return ((Class)item).getName();
	}

	public String getClassText(){
		return classText;
	}
	
}
