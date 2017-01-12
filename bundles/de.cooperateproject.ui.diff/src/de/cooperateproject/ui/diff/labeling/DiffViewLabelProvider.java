package de.cooperateproject.ui.diff.labeling;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;

import de.cooperateproject.ui.diff.internal.DiffTreeItem;
import de.cooperateproject.ui.diff.labeling.itemlabels.AssociationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.AssociationPropertiesLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.AttributeLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.CardinalityLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ClassDiagramLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ClassLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.GeneralizationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ImplementationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.IntegerLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.InterfaceLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.MethodLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.PackageLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ParameterLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.PrimitiveTypeLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.SummaryItemLabelHandler;
import de.cooperateproject.ui.diff.labeling.itemlabels.VisibilityLabel;


public class DiffViewLabelProvider extends LabelProvider{
	
	private Map<String, SummaryItemLabelHandler> itemHandling = 
	        new HashMap<String, SummaryItemLabelHandler>();

	
	public DiffViewLabelProvider() {
		itemHandling.put("AttributeImpl", new AttributeLabel());
		itemHandling.put("ClassImpl", new ClassLabel());
		itemHandling.put("MethodImpl", new MethodLabel());
		itemHandling.put("ParameterImpl", new ParameterLabel());
		itemHandling.put("PackageImpl", new PackageLabel());
		itemHandling.put("InterfaceImpl", new InterfaceLabel());
		itemHandling.put("AssociationImpl", new AssociationLabel());
		itemHandling.put("GeneralizationImpl", new GeneralizationLabel());
		itemHandling.put("ImplementationImpl", new ImplementationLabel());
		itemHandling.put("ClassDiagramImpl", new ClassDiagramLabel());
		itemHandling.put("Visibility", new VisibilityLabel());
		itemHandling.put("AssociationPropertiesImpl", new AssociationPropertiesLabel());
		itemHandling.put("CardinalityImpl", new CardinalityLabel());
		itemHandling.put("Integer", new IntegerLabel());
		itemHandling.put("PrimitiveTypeImpl", new PrimitiveTypeLabel());



	}
	
	
	@Override
	public String getText(Object element) {
		String ret = "";
		if(element instanceof DiffTreeItem){
			SummaryItemLabelHandler handlerClass = itemHandling.get(((DiffTreeItem) element).getObject().getClass().getSimpleName());
			if(handlerClass != null){
				if(((DiffTreeItem) element).getDiffKind() != null){
					ret = ((DiffTreeItem) element).getDiffKind().toString()+ " - ";
				}
				
				ret = ret + handlerClass.getText(((DiffTreeItem) element).getObject());
			}
		}
		return ret;
	}
	
}