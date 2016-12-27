package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

public class MethodLabel implements SummaryItemLabelHandler{
	private final String classText = "Method";
	
	public String getText(EObject item ){
		Method method = (Method)item;
		String type = "";
		if(method.getType() instanceof DataTypeReference){
			type = ": " + ((DataTypeReference)method.getType()).getType().getLiteral();
		}else if(method.getType() instanceof UMLTypeReference){
			type = ": " + ((UMLTypeReference)method.getType()).getType().getName();
		}
		EList<Parameter> params = method.getParameters();
		return method.getName() + "("+ paramsToString(params) +")" + type;
	}
	
	public String getClassText(){
		return classText;
	}
	
	private static String paramsToString(EList<Parameter> params){
		String ret = "";
		if(params.size() <= 0 ) return ret;

		for(Parameter param : params){
			String type = "";
			if(param.getType() instanceof DataTypeReference){
				type = ": " + ((DataTypeReference)param.getType()).getType().getLiteral();
			}else if(param.getType() instanceof UMLTypeReference){
				type = ": " + ((UMLTypeReference)param.getType()).getType().getName();
			}
			ret += param.getName() + type + " ";
		}
		
		return ret;
	}
	
}
