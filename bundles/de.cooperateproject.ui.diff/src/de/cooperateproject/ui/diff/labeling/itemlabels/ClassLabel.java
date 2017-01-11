package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

public class ClassLabel implements SummaryItemLabelHandler{
	private final String classText = "class";

	public String getText(EObject item){
		Class obj = ((Class)item);
		String isAbstract = "";
		if(obj.isAbstract()){
			isAbstract = "abstract ";
		}
		Visibility visibility = obj.getVisibility();
		String visibString = "";
		switch(visibility){
		case UNDEFINED: break;
		default: visibString = visibility.getLiteral().toLowerCase() + " ";
		}
		return visibString + isAbstract + classText + " " + obj.getName();
	}

	public String getClassText(){
		return classText;
	}
	
}
