package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;

public class AssociationLabel implements SummaryItemLabelHandler{
	private AssociationPropertiesLabel propLabel = new AssociationPropertiesLabel();
	private final String classText = "association";

	public String getText(EObject item){
		Association ass = (Association)item;
		String typeRefLeft = ass.getLeft().getName();
		String typeRefRight = ass.getRight().getName();
		return typeRefLeft + ass.getName() + typeRefRight + propLabel.getText(ass.getProperties());
	}

	public String getClassText(){
		return classText;
	}
	
	private class AssociationPropertiesLabel implements SummaryItemLabelHandler {
		private final String classText = "AssociationProperties";

		public String getText(EObject item){
			AssociationProperties ass = (AssociationProperties)item;
			
			String left = ass.getCardinalityLeft().getLowerBound() + ".." + ass.getCardinalityLeft().getUpperBound(); //TODO: Look what UpperBound has as value for "nothing" and "*"
			String right = ass.getCardinalityRight().getLowerBound() + ".." + ass.getCardinalityRight().getUpperBound(); //TODO: Look what UpperBound has as value for "nothing" and "*"
			return "[" + left + " | " + right + "]"; //TODO: where are the role names?
		}

		public String getClassText(){
			return classText;
		}
	}
}
