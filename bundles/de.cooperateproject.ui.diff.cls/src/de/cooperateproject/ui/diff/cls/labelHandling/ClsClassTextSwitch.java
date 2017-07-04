package de.cooperateproject.ui.diff.cls.labelHandling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.PrimitiveType;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility;

public class ClsClassTextSwitch extends ClsSwitch<String> {

	public String doSwitch(Object object) {
		String ret = "";
		if (!(object instanceof EObject)) {
			ret = handleNonEObject(object);
		} else {
			ret = doSwitch((EObject) object);
		}
		return ret;
	}

	@Override
	public String caseClassDiagram(ClassDiagram object) {
		return "classDiagram";
	}

	@Override
	public String casePackage(de.cooperateproject.modeling.textual.cls.cls.Package object) {
		return "package";
	}

	@Override
	public String caseClass(de.cooperateproject.modeling.textual.cls.cls.Class object) {
		return "class";
	}

	@Override
	public String caseInterface(Interface object) {
		return "interface";
	}

	@Override
	public String caseAttribute(Attribute object) {
		return "attribute";
	}

	@Override
	public String caseMethod(Method object) {
		return "method";
	}

	@Override
	public String caseParameter(Parameter object) {
		return "parameter";
	}

	@Override
	public String caseAssociation(Association object) {
		return "association";
	}

	@Override
	public String caseGeneralization(Generalization object) {
		return "generalization";
	}

	@Override
	public String caseImplementation(Implementation object) {
		return "implementation";
	}

	private String handleNonEObject(Object object) {
		String ret = "";
		if (object instanceof Visibility) {
			ret = "visibility";
		} else if (object instanceof Integer) {
			ret = "cardinality";
		} else if (object instanceof PrimitiveType) {
			ret = "type";
		}

		return ret;
	}

}
