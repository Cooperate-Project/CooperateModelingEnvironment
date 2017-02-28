package de.cooperateproject.ui.diff.metamodel;

import org.eclipse.emf.common.util.EList;

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
import de.cooperateproject.modeling.textual.cls.cls.Visibility;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;

public class ClsLabelSwitch extends ClsSwitch<String> {
	@Override
	public String caseClassDiagram(ClassDiagram object) {
		return object.getTitle();
	}

	@Override
	public String casePackage(de.cooperateproject.modeling.textual.cls.cls.Package object) {
		return "package" + " " + object.getName();
	}

	@Override
	public String casePackageImport(PackageImport object) {
		return "import " + object.getReferencedElement().getImportedPackage().getName();
	}

	@Override
	public String caseClass(de.cooperateproject.modeling.textual.cls.cls.Class object) {
		String isAbstract = "";
		if (object.isAbstract()) {
			isAbstract = "abstract ";
		}

		// TODO: This should be in caseVisibility(Visibility object)!
		Visibility visib = (Visibility) object.getVisibility();
		String visibText = "";
		switch (visib) {
		case UNDEFINED:
			break;
		default:
			visibText = visib.getLiteral().toLowerCase() + " ";
		}

		return visibText + isAbstract + "class " + object.getName();
	}

	@Override
	public String caseInterface(Interface object) {
		String alias = "";
		if (object.getAlias() != null) {
			alias = " as " + object.getAlias();
		}

		// TODO: This should be in caseVisibility(Visibility object)!
		Visibility visib = (Visibility) object.getVisibility();
		String visibText = "";
		switch (visib) {
		case UNDEFINED:
			break;
		default:
			visibText = visib.getLiteral().toLowerCase() + " ";
		}
		return visibText + "interface" + " " + object.getName() + alias;
	}

	@Override
	public String caseAttribute(Attribute object) {
		String type = "";
		type = ": " + object.getType().getName();

		// TODO: This should be in caseVisibility(Visibility object)!
		Visibility visib = (Visibility) object.getVisibility();
		String visibText = "";
		switch (visib) {
		case UNDEFINED:
			break;
		default:
			visibText = visib.getLiteral().toLowerCase() + " ";
		}

		return visibText + object.getName() + type;
	}

	@Override
	public String caseMethod(Method object) {
		String type = ": ";
		if (object.getType() != null) {
			type = type + object.getType().getName();
		} else {
			type = type + "void";
		}
		EList<Parameter> params = object.getParameters();
		String isAbstract = "";
		if (object.isAbstract()) {
			isAbstract = "abstract ";
		}

		// TODO: This should be in caseVisibility(Visibility object)!
		Visibility visib = (Visibility) object.getVisibility();
		String visibText = "";
		switch (visib) {
		case UNDEFINED:
			break;
		default:
			visibText = visib.getLiteral().toLowerCase() + " ";
		}

		String paramText = "";
		for (Parameter param : params) {
			paramText = paramText + caseParameter(param);
			if (params.indexOf(param) < params.size() - 1) {
				paramText += ", ";
			}
		}

		return visibText + isAbstract + object.getName() + "(" + paramText + ")" + type;
	}

	@Override
	public String caseParameter(Parameter object) {
		String type = ": " + object.getType().getName();

		// TODO: This should be in caseVisibility(Visibility object)!
		Visibility visib = (Visibility) object.getVisibility();
		String visibText = "";
		switch (visib) {
		case UNDEFINED:
			break;
		default:
			visibText = visib.getLiteral().toLowerCase() + " ";
		}
		return visibText + object.getName() + type;
	}

	@Override
	public String caseAssociation(Association object) {

		String typeRefLeft = object.getLeft().getName();
		String typeRefRight = object.getRight().getName();

		String ret = typeRefLeft + " " + object.getName() + " " + typeRefRight;
		if (object.getProperties() != null) {
			String leftRole = "";
			String rightRole = "";
			if (object.getProperties().getPropertyLeft().getName() != null)
				leftRole = ", " + object.getProperties().getPropertyLeft().getName();
			if (object.getProperties().getPropertyRight().getName() != null)
				rightRole = ", " + object.getProperties().getPropertyRight().getName();

			ret += " [" + caseCardinality(object.getProperties().getCardinalityLeft()) + leftRole;
			ret += " | " + caseCardinality(object.getProperties().getCardinalityRight()) + rightRole + "]";
		}

		return ret;
	}

	@Override
	public String caseGeneralization(Generalization object) {
		String left = object.getLeft().getName();
		String right = object.getRight().getName();
		return left + " isA " + right;
	}

	@Override
	public String caseImplementation(Implementation object) {
		String left = object.getLeft().getName();
		String right = object.getRight().getName();
		return left + " impl " + right;
	}

	@Override
	public String caseCommentLink(CommentLink object) {
		return object.getComment().getBody();
	}

	@Override
	public String caseAssociationProperties(AssociationProperties object) {
		return "left role: " + object.getPropertyLeft().getName() + ", right role: "
				+ object.getPropertyRight().getName();
	}

	@Override
	public String caseCardinality(Cardinality object) {
		JavaLangLabelHandler integerHandler = new JavaLangLabelHandler();
		return integerHandler.getText(object.getLowerBound()) + ".." + integerHandler.getText(object.getUpperBound());
	}

}
