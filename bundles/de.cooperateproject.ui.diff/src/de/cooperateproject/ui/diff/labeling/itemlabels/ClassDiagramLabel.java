package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;

public class ClassDiagramLabel implements SummaryItemLabelHandler{
	private final String classText = "classDiagram";

	public String getText(Object item){
		return ((ClassDiagram)item).getTitle();
	}

	public String getClassText(){
		return classText;
	}
	
}