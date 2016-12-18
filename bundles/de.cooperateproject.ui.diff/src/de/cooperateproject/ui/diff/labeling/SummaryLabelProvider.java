package de.cooperateproject.ui.diff.labeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.TypeReference;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.ui.diff.internal.SummaryItem;

/**
 * Label Provider for a table viewer which lists all changes in a commit 
 * @author Jasmin
 *
 */
public class SummaryLabelProvider extends LabelProvider implements ITableLabelProvider{

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		String ret = "";
		EObject notNull;


		if(element instanceof SummaryItem){

			SummaryItem item = ((SummaryItem)element);
			
		
			if(item.getLeft() != null){
				notNull = item.getLeft();
			}else{
				notNull = item.getRight();
			}
		
		  	if(notNull instanceof Class){

		  		switch(columnIndex){
  				case 0: ret = item.getKind().toString() + " CLASS"; break;
  				case 1: if(item.getLeft() != null) ret = makeTextClass(item.getLeft()); break;
  				case 2: if(item.getRight() != null) ret = makeTextClass(item.getRight()); break;
  				default: 
	  		}
		  					
		  	}
		  	
		  	else if (notNull instanceof Attribute){
		  		
		  		switch(columnIndex){
	  				case 0: ret = item.getKind().toString() + " ATTRIBUTE"; break;
	  				case 1: if(item.getLeft() != null) ret = makeTextAttribute(item.getLeft()); break;
	  				case 2: if(item.getRight() != null) ret = makeTextAttribute(item.getRight()); break;
	  				default: 
		  		}
		  		
		  	}
		  	else if (notNull instanceof Method){
		  		
		  		switch(columnIndex){
		  			case 0: ret = item.getKind().toString() + " METHOD"; break;
		  			case 1: if(item.getLeft() != null) ret = makeTextMethod(item.getLeft()); break;
		  			case 2: if(item.getRight() != null) ret = makeTextMethod(item.getRight()); break;
		  			default: 
		  		}

		  	}

		}
		
		return ret;
	}
	
	private String checkTypeReference(TypeReference ref){
		String type = "";
			
			if(ref instanceof DataTypeReference){
				type = ((DataTypeReference)ref).getType().getName();
			}else if(ref instanceof UMLTypeReference){
				type = ((UMLTypeReference)ref).getType().getName();
			}
			
		return type;
	}
	
	private String makeTextClass(EObject changedObject){
		return ((Class)changedObject).getName();
	}
	
	private String makeTextAttribute(EObject changedObject){
		TypeReference rft = ((Attribute)changedObject).getType();
			String type = checkTypeReference(rft);
			
			return ((Attribute)changedObject).getName() + ": " + type;
	}
	
	private String makeTextMethod(EObject changedObject){
		TypeReference rft = ((Method)changedObject).getType();
		String type = checkTypeReference(rft);
		String ret = "";
		EList<Parameter> list = (EList<Parameter>) ((Method)changedObject).getParameters();
		ret = ret + ((Method)changedObject).getName()+"(";
		for(Parameter param: list){
			ret = ret + param.getName()+": "+checkTypeReference(param.getType()) + ",";
		}
		return ret + ")" + type;
	}


}
