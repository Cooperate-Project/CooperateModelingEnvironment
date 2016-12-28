package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

public class ParameterLabel implements SummaryItemLabelHandler{
	private final String classText = "Parameter";
	private UMLTypeReferenceLabel umlRefLabel = new UMLTypeReferenceLabel();
	private DataTypeReferenceLabel dataRefLabel = new DataTypeReferenceLabel();
	
	public String getText(EObject item ){
		Parameter param = (Parameter)item;
		String type = "";
		if(param.getType() instanceof DataTypeReference){
			type = ": " + dataRefLabel.getText(param.getType());
		}else if(param.getType() instanceof UMLTypeReference){
			type = ": " + umlRefLabel.getText(param.getType());
		}
		return param.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}


}
