package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Class;

public class ClassLabel implements SummaryItemLabelHandler{
	private final String classText = "class";

	public String getText(EObject item){
		Class obj = ((Class)item);
		String isAbstract = "";
		if(obj.isAbstract()){
			isAbstract = "abstract ";
		}
		return obj.getVisibility().getName().toLowerCase() + " " + isAbstract + classText + " " + obj.getName();
	}

	public String getClassText(){
		return classText;
	}
	
}
