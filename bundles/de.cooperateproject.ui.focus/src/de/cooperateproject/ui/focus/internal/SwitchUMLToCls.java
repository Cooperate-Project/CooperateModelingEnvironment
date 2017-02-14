package de.cooperateproject.ui.focus.internal;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;

public class SwitchUMLToCls extends ClsSwitch<EObject>{

	@Override
	@SuppressWarnings("rawtypes") 
	public org.eclipse.uml2.uml.NamedElement caseNamedElement(de.cooperateproject.modeling.textual.cls.cls.NamedElement object){
		return object.getReferencedElement();
		
	}
}
