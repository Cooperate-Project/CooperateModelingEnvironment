package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Implementation;

public class ImplementationLabel implements SummaryItemLabelHandler{
	private final String classText = "Implementation";
	private UMLTypeReferenceLabel refLabel = new UMLTypeReferenceLabel();

	public String getText(EObject item ){
		Implementation imp = (Implementation)item;
		String left = refLabel.getText(imp.getLeft());
		String right = refLabel.getText(imp.getRight());
		return left + " impl " + right;
	}

	public String getClassText(){
		return classText;
	}
	
}