package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

public class AttributeLabel implements SummaryItemLabelHandler{
	private final String classText = "Attribute";
	private UMLTypeReferenceLabel umlRefLabel = new UMLTypeReferenceLabel();
	private DataTypeReferenceLabel dataRefLabel = new DataTypeReferenceLabel();
	
	public String getText(EObject item){
		Attribute att = (Attribute)item;
		String type = "";
		if(att.getType() instanceof DataTypeReference){
			type = ": " + dataRefLabel.getText(att.getType());
		}else if(att.getType() instanceof UMLTypeReference){
			type = ": " + umlRefLabel.getText(att.getType());
		}
		return att.getName() + type;
	}
	
	public String getClassText(){
		return classText;
	}
	
}
