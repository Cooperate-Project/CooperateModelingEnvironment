package de.cooperateproject.ui.diff.cls.labelhandling;

import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.cls.cls.Class;

public class ClsClassTextSwitch extends ClsSwitch<String> {

	@Override
	public String caseClassDiagram(ClassDiagram object) {
		return "classDiagram";
	}

	@Override
	public String casePackage(Package object) {
		return "package";
	}

	@Override
	public String caseClass(Class object) {
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
	public String caseXtextAssociation(XtextAssociation object) {
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

}
