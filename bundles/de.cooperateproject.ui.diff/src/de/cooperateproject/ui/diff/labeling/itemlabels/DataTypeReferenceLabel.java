package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;

public class DataTypeReferenceLabel implements SummaryItemLabelHandler{
private final String classText = "DataTypeReference";
	
	public String getText(EObject item){
		DataTypeReference ref = (DataTypeReference)item;
		return ref.getType().getLiteral();
	}
	
	public String getClassText(){
		return classText;
	}

}
