package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

public class UMLTypeReferenceLabel implements SummaryItemLabelHandler{
	
	private final String classText = "UMLTypeReference";
	
	public String getText(EObject item){
		UMLTypeReference ref = (UMLTypeReference)item;
		return ref.getType().getName();
	}
	
	public String getClassText(){
		return classText;
	}
}
