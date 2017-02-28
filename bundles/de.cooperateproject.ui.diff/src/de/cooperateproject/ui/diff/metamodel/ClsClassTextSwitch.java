package de.cooperateproject.ui.diff.metamodel;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;

public class ClsClassTextSwitch extends ClsSwitch<String> {
	@Override
	public String caseClassDiagram(ClassDiagram object) {
		return "classDiagram";
	}

	@Override
	public String casePackage(de.cooperateproject.modeling.textual.cls.cls.Package object) {
		return "package";
	}

	@Override
	public String casePackageImport(PackageImport object) {
		return "packageImport";
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

	@Override
	public String caseCommentLink(CommentLink object) {
		return "comment";
	}

	@Override
	public String caseAssociationProperties(AssociationProperties object) {
		return "associationProperties";
	}

	@Override
	public String caseCardinality(Cardinality object) {
		return "cardinality";
	}
	
	//TODO: [...] caseVisibility(Visibility object)

}
