package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Package;

public class PackageLabel implements SummaryItemLabelHandler{
	private final String classText = "package";

	public String getText(EObject item){
		return classText + " " + ((Package)item).getName();
	}

	public String getClassText(){
		return classText;
	}
	

}


