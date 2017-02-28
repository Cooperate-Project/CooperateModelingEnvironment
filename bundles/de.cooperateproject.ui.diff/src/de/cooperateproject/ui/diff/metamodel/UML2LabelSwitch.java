package de.cooperateproject.ui.diff.metamodel;

import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class UML2LabelSwitch extends UMLSwitch<String> {
	
	@Override
	public String casePrimitiveType(PrimitiveType object) {
		return object.getName();
	}

}
