package de.cooperateproject.ui.diff.labeling.itemlabels;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;

public class MethodLabel implements SummaryItemLabelHandler{
	private final String classText = "Method";
	private ParameterLabel paramLabel = new ParameterLabel();
	
	public String getText(EObject item ){
		Method method = (Method)item;
		String type = ": " + method.getType().getName();
		EList<Parameter> params = method.getParameters();
		return method.getName() + "("+ paramsToString(params) +")" + type;
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
