package de.cooperateproject.ui.diff.metamodel;

import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class UML2ClassTextSwitch extends UMLSwitch<String> {

	@Override
	public String casePrimitiveType(PrimitiveType object) {
		return "type";
	}

}
