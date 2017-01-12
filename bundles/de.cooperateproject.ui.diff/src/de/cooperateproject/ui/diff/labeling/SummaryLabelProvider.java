package de.cooperateproject.ui.diff.labeling;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.diff.internal.SummaryItem;
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

/**
 * Label Provider for a table viewer which lists all changes in a commit 
 * @author Jasmin
 *
 */
public class SummaryLabelProvider extends LabelProvider implements ITableLabelProvider{
	
	private Map<String, SummaryItemLabelHandler> itemHandling = 
	        new HashMap<String, SummaryItemLabelHandler>();

	
	public SummaryLabelProvider() {
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
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		
		String ret = "";
		Object notNull;

		if(element instanceof SummaryItem){

			SummaryItem item = ((SummaryItem)element);
		
			if(item.getLeft() != null){
				notNull = item.getLeft();
			}else{
				notNull = item.getRight();
			}
			SummaryItemLabelHandler handlerClass = itemHandling.get(notNull.getClass().getSimpleName());
			SummaryItemLabelHandler handlerClassParent = null;
			if(item.getCommonParent() != null){
				 handlerClassParent = itemHandling.get(item.getCommonParent().getClass().getSimpleName());
			}
			
			if(handlerClass != null){
				switch(columnIndex){
	  				case 0: ret = item.getDifferenceKind().toString()+ " " + handlerClass.getClassText(); break;
	  				case 1: if(handlerClassParent != null) ret = handlerClassParent.getText(item.getCommonParent()); break;
	  				case 2: if(item.getRight() != null) ret = handlerClass.getText(item.getRight()); break;
	  				case 3: if(item.getLeft() != null) ret = handlerClass.getText(item.getLeft()); break;
	  				default: 
			  	}
			}

		}
		
		return ret;
	}


}
