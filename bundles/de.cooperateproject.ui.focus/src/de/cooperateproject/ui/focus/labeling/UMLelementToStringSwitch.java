package de.cooperateproject.ui.focus.labeling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class UMLelementToStringSwitch extends UMLSwitch<String> {

	private static final EClass[] SET_VALUES = new EClass[] { UMLPackage.Literals.CLASS,
			UMLPackage.Literals.ASSOCIATION, UMLPackage.Literals.INTERFACE, UMLPackage.Literals.OPERATION,
			UMLPackage.Literals.PROPERTY, UMLPackage.Literals.PACKAGE };
	private static final Set<EClass> supportedTypes = new HashSet<EClass>(Arrays.asList(SET_VALUES));

	public static boolean isOfSupportedType(EObject obj) {
		boolean ret = false;
		if(obj != null){
			ret = supportedTypes.contains(obj.eClass());
		}
		return ret;
	}

	@Override
	public String caseClass(org.eclipse.uml2.uml.Class object) {
		return "class " + object.getName();
	}

	@Override
	public String caseAssociation(Association object) {
		return "association " + object.getName();
	}

	@Override
	public String caseInterface(Interface object) {
		return "interface " + object.getName();
	}

	@Override
	public String caseOperation(Operation object) {
		return "operation " + object.getName() + " at " + ((NamedElement) object.eContainer()).getName();
	}

	@Override
	public String caseProperty(Property object) {
		return "property " + object.getName() + " at " + ((NamedElement) object.eContainer()).getName();
	}

	@Override
	public String casePackage(Package object) {
		return "package " + object.getName();
	}

	@Override
	public String caseNamedElement(NamedElement object) {
		return object.getName();
	}

}