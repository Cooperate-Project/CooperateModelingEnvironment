package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Generalization;

public class GeneralizationLabel implements SummaryItemLabelHandler{
	private final String classText = "Generalization";
	private UMLTypeReferenceLabel refLabel = new UMLTypeReferenceLabel();

	public String getText(EObject item ){
		Generalization gen = (Generalization)item;
		String left = refLabel.getText(gen.getLeft());
		String right = refLabel.getText(gen.getRight());
		return left + " isA " + right;
	}

	public String getClassText(){
		return classText;
	}
	
}