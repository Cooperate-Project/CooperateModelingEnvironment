package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

public class AttributeLabel implements SummaryItemLabelHandler{
	private final String classText = "Attribute";
	
	public String getText(EObject item ){
		Attribute att = (Attribute)item;
		String type = "";
		if(att.getType() instanceof DataTypeReference){
			type = ": " + ((DataTypeReference)att.getType()).getType().getLiteral();
		}else if(att.getType() instanceof UMLTypeReference){
			type = ": " + ((UMLTypeReference)att.getType()).getType().getName();
		}
		return att.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}
	
}
