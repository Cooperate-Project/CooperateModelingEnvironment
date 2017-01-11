package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

public class ParameterLabel implements SummaryItemLabelHandler{
	private final String classText = "parameter";
	
	public String getText(EObject item){
		Parameter param = (Parameter)item;
		String type = ": " + param.getType().getName();
		
		Visibility visibility = param.getVisibility();
		String visibString = "";
		switch(visibility){
		case UNDEFINED: break;
		default: visibString = visibility.getLiteral().toLowerCase() + " ";
		}
		
		return visibString + param.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}


}
