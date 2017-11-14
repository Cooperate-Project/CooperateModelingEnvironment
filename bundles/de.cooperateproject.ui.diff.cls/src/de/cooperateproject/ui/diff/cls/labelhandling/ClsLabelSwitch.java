package de.cooperateproject.ui.diff.cls.labelhandling;

import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.uml2.uml.PrimitiveType;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

/**
 * Switch to invoke description method for each cls model class.
 * 
 * @author Jasmin, czogalik
 *
 */
public class ClsLabelSwitch extends ClsSwitch<String> {

	private static final Switch<String> TYPE_LABEL_SWITCH = new ClsClassTextSwitch();
	private static final LabelHandler ESTRUCUTRAL_FEATURE_LABEL_SWITCH = new ClsEStructuralFeatureLabelProvider();

	@Override
	public String caseClassDiagram(ClassDiagram object) {
		return object.getTitle();
	}

	@Override
	public String caseNamedElement(NamedElement object) {
		return String.format("%s %s", TYPE_LABEL_SWITCH.doSwitch(object), object.getName());
	}

	@Override
	public String casePackage(Package object) {
		return String.format("%s %s", TYPE_LABEL_SWITCH.doSwitch(object), getPackageName(object));
	}

	private static String getPackageName(Package object) {
		if (object.getOwningPackage() == null) {
			return object.getReferencedElement().getName();
		}
		return object.getName();
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

		String visibText = handleNonEObject(object.getVisibility());

		StringBuilder paramText = new StringBuilder();
		for (Parameter param : params) {
			paramText.append(caseParameter(param));
			if (params.indexOf(param) < params.size() - 1) {
				paramText.append(", ");
			}
		}

		return visibText + isAbstract + object.getName() + "(" + paramText + ")" + type;
	}

	@Override
	public String caseGeneralization(Generalization object) {
		String left = object.getLeft().getName();
		String right = object.getRight().getName();
		return left + " isA " + right;
	}

	@Override
	public String caseXtextAssociation(XtextAssociation object) {
		return ESTRUCUTRAL_FEATURE_LABEL_SWITCH.getText(object.getTwoSideAggregationKind()) + " "
				+ Optional.ofNullable(object.getName())
						.orElseGet(() -> object.getMemberEndTypes().stream()
								.map(XtextAssociationMemberEndReferencedType::getType).map(NamedElement::getName)
								.collect(Collectors.joining(", ", "(", ")")));
	}

	@Override
	public String caseXtextAssociationMemberEndReferencedType(XtextAssociationMemberEndReferencedType object) {
		Optional<XtextAssociation> association = Optional.ofNullable(object.eContainer())
				.filter(XtextAssociation.class::isInstance).map(XtextAssociation.class::cast);
		Optional<Integer> index = association.map(XtextAssociation::getMemberEndTypes)
				.map(types -> types.indexOf(object));
		if (index.isPresent()) {
			return "memberEnd " + association.filter(asc -> asc.getMemberEndNames().size() > index.get())
					.map(asc -> asc.getMemberEndNames().get(index.get()))
					.orElse(index.map(i -> i + 1).get().toString());
		}

		return "memberEnd";
	}

	@Override
	public String caseAssociationMemberEnd(AssociationMemberEnd object) {
		return "memberEnd " + object.getType().getName();
	}

	@Override
	public String caseImplementation(Implementation object) {
		String left = object.getLeft().getName();
		String right = object.getRight().getName();
		return left + " impl " + right;
	}

	private static String handleNonEObject(Object object) {
		String ret = "";
		if (object instanceof Integer) {
			if ((Integer) object == -1) {
				ret = "*";
			} else {
				ret = ((Integer) object).toString();
			}

		} else if (object instanceof PrimitiveType) {
			ret = ((PrimitiveType) object).getName();
		}

		return ret;
	}
}
