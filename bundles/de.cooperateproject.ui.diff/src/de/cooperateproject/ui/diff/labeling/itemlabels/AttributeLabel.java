package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

public class AttributeLabel implements SummaryItemLabelHandler{
	private final String classText = "attribute";
	
	public String getText(EObject item){
		Attribute att = (Attribute)item;
		String type = "";
		type = ": " + att.getType().getName();
		Visibility visibility = att.getVisibility();
		String visibString = "";
		switch(visibility){
		case UNDEFINED: break;
		default: visibString = visibility.getLiteral().toLowerCase() + " ";
		}
		return visibString + att.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}
	
}
