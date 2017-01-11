package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

public class MethodLabel implements SummaryItemLabelHandler{
	private final String classText = "method";
	private ParameterLabel paramLabel = new ParameterLabel();
	
	public String getText(EObject item){
		Method method = (Method)item;
		
		String type = ": "; 
		if(method.getType() != null){
			type = type + method.getType().getName();
		}else{
			type = type + "void";
		}
		EList<Parameter> params = method.getParameters();
		String isAbstract = "";
		if(method.isAbstract()){
			isAbstract = "abstract ";
		}
		
		Visibility visibility = method.getVisibility();
		String visibString = "";
		switch(visibility){
		case UNDEFINED: break;
		default: visibString = visibility.getLiteral().toLowerCase() + " ";
		}
		return visibString + isAbstract + method.getName() + "(" + paramsToString(params) + ")" + type;
	}
	
	public String getClassText(){
		return classText;
	}
	
	private String paramsToString(EList<Parameter> params){
		String ret = "";
		if(params.size() <= 0 ) return ret;
		
		for(Parameter param : params){
			ret = paramLabel.getText(param);
			if(params.indexOf(param) < params.size() - 1){
				ret += ", ";
			}
		}
		
		return ret;
	}
	
}
