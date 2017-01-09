package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Generalization;

public class GeneralizationLabel implements SummaryItemLabelHandler{
	private final String classText = "generalization";

	public String getText(EObject item){
		Generalization gen = (Generalization)item;
		String left = gen.getLeft().getName();
		String right = gen.getRight().getName();
		return left + " isA " + right;
	}

	public String getClassText(){
		return classText;
	}
	
}