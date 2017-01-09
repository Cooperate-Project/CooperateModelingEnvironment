package de.cooperateproject.ui.diff.labeling;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;

import de.cooperateproject.ui.diff.internal.DiffTreeItem;
import de.cooperateproject.ui.diff.labeling.itemlabels.AssociationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.AttributeLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ClassDiagramLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ClassLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.DataTypeReferenceLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.GeneralizationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ImplementationLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.InterfaceLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.MethodLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.PackageLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.ParameterLabel;
import de.cooperateproject.ui.diff.labeling.itemlabels.SummaryItemLabelHandler;
import de.cooperateproject.ui.diff.labeling.itemlabels.UMLTypeReferenceLabel;


public class DiffViewLabelProvider extends LabelProvider{
	
	private Map<String, SummaryItemLabelHandler> itemHandling = 
	        new HashMap<String, SummaryItemLabelHandler>();

	
	public DiffViewLabelProvider() {
		itemHandling.put("AttributeImpl", new AttributeLabel());
		itemHandling.put("ClassImpl", new ClassLabel());
		itemHandling.put("UMLTypeReferenceImpl", new UMLTypeReferenceLabel());
		itemHandling.put("DataTypeReferenceImpl", new DataTypeReferenceLabel());
		itemHandling.put("MethodImpl", new MethodLabel());
		itemHandling.put("ParameterImpl", new ParameterLabel());
		itemHandling.put("PackageImpl", new PackageLabel());
		itemHandling.put("InterfaceImpl", new InterfaceLabel());
		itemHandling.put("AssociationImpl", new AssociationLabel());
		itemHandling.put("GeneralizationImpl", new GeneralizationLabel());
		itemHandling.put("ImplementationImpl", new ImplementationLabel());
		itemHandling.put("ClassDiagramImpl", new ClassDiagramLabel());
	}
	
	
	@Override
	public String getText(Object element) {
		String ret = "";
		if(element instanceof DiffTreeItem){
			SummaryItemLabelHandler handlerClass = itemHandling.get(((DiffTreeItem) element).getEObject().getClass().getSimpleName());
			if(handlerClass != null){
				if(((DiffTreeItem) element).getDiffKind() != null){
					ret = ((DiffTreeItem) element).getDiffKind().toString()+ " - " + handlerClass.getClassText() + " " + handlerClass.getText(((DiffTreeItem) element).getEObject());
				}
				else{
					ret = handlerClass.getClassText() + " " + handlerClass.getText(((DiffTreeItem) element).getEObject());
				}
				}
		}
		return ret;
	}
	
}