package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

public class ParameterLabel implements SummaryItemLabelHandler{
	private final String classText = "Parameter";
	
	public String getText(EObject item ){
		Parameter param = (Parameter)item;
		String type = "";
		if(param.getType() instanceof DataTypeReference){
			type = ": " + ((DataTypeReference)param.getType()).getType().getLiteral();
		}else if(param.getType() instanceof UMLTypeReference){
			type = ": " + ((UMLTypeReference)param.getType()).getType().getName();
		}
		return param.getName()+ type;
	}
	
	public String getClassText(){
		return classText;
	}


}
