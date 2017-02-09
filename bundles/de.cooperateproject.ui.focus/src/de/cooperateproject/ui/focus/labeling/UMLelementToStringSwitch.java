package de.cooperateproject.ui.focus.labeling;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class UMLelementToStringSwitch extends UMLSwitch<String>{

	@Override 
	public String caseClass(org.eclipse.uml2.uml.Class object){
		return "class " + object.getName();
	}
	
	@Override
	public String caseAssociation(Association object){
		return "association " + object.getName();
	}
	
	@Override
	public String caseInterface(Interface object){
		return "interface " + object.getName();
	}
	
	@Override
	public String caseOperation(Operation object){
		return "operation " + object.getName() + " at " + ((NamedElement)object.eContainer()).getName();
	}
	
	@Override
	public String caseProperty(Property object){
		return "property " + object.getName() + " at " + ((NamedElement)object.eContainer()).getName();
	}
	
	@Override
	public String casePackage(Package object){
		return "package " + object.getName();
	}
	
	@Override
	public String caseNamedElement(NamedElement object){
		return object.getName();
	}
	
}