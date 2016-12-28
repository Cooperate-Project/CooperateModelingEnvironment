package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;

public class ClassDiagramLabel implements SummaryItemLabelHandler{
	private final String classText = "ClassDiagram";

	public String getText(EObject item ){
		return ((ClassDiagram)item).getTitle();
	}

	public String getClassText(){
		return classText;
	}
	
}