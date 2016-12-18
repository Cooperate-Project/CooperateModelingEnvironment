package de.cooperateproject.ui.diff.labeling;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;

import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.TypeReference;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;
import de.cooperateproject.ui.diff.internal.DiffTreeItem;


public class DiffViewLabelProvider extends LabelProvider{
	
	@Override
	public String getText(Object pElement) {

		if(!(pElement instanceof DiffTreeItem)){
			return null;
		}
		
		DiffTreeItem element = (DiffTreeItem)pElement;
		String diff;
		String elementName = "";
		
		if(element.getDiffKind() == null){
			diff = "";
		}else{
			diff = element.getDiffKind().toString() + "- ";
		}
		
		elementName = makeText(element.getEObject());
	
		return diff + elementName;

	}
	
	private String makeText(EObject element){
		String ret = "";
		if(element instanceof Class){
			ret = makeTextClass((Class)element);
		}else if(element instanceof Method){
			ret = makeTextMethod((Method)element) + makeTextTypeReference(((Method) element).getType());
		}else if(element instanceof Attribute){
			ret = makeTextAttribute((Attribute)element) + makeTextTypeReference(((Attribute) element).getType());
		}
		return ret;
	}
	
	private String makeTextTypeReference(TypeReference ref) {
		String ret = "";
		if(ref != null){
			if(ref instanceof DataTypeReference){
				ret = ": " + ((DataTypeReference)ref).getType().getName();
			}else if(ref instanceof UMLTypeReference){
				ret = ":" + ((UMLTypeReference)ref).getType().getName();
			}
		}
		
		return ret;
	}

	private String makeTextClass(Class element){
		return element.getName();
	}
	
	private String makeTextAttribute(Attribute element){	
			return element.getName();
	}
	
	private String makeTextMethod(Method element){
		String ret = "";
		EList<Parameter> list = (EList<Parameter>) element.getParameters();
		ret = ret + element.getName()+"(";
		for(Parameter param: list){
			ret = ret + param.getName()+": "+makeTextTypeReference(param.getType()) + ",";
		}
		return ret + ")";
	}

}
