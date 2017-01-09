package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Implementation;

public class ImplementationLabel implements SummaryItemLabelHandler{
	private final String classText = "Implementation";

	public String getText(EObject item ){
		Implementation imp = (Implementation)item;
		String left = imp.getLeft().getName();
		String right = imp.getLeft().getName();
		return left + " impl " + right;
	}

	public String getClassText(){
		return classText;
	}
	
}