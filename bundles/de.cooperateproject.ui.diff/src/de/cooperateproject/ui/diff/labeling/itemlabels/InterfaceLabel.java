package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

public class InterfaceLabel implements SummaryItemLabelHandler{
	private final String classText = "interface";

	public String getText(EObject item){
		Visibility visibility = ((Interface)item).getVisibility();
		String visibString = "";
		switch(visibility){
		case UNDEFINED: break;
		default: visibString = visibility.getLiteral().toLowerCase() + " ";
		}
		return visibString + classText + " " + ((Interface)item).getName() + " as " + ((Interface)item).getAlias();
	}

	public String getClassText(){
		return classText;
	}
	
}

