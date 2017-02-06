package de.cooperateproject.modeling.textual.usecase.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.xtext.validation.Check;

import de.cooperateproject.modeling.textual.usecase.usecase.Comment;
import de.cooperateproject.modeling.textual.usecase.usecase.NamedElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;

public class UsecaseValidator extends AbstractUsecaseValidator {

    public static final String MISSING_UML_REFERENCE = "missingUMLReference";
    private static final Switch<EStructuralFeature> MISSING_REFERENCE_FEATURE_SWITCH = new UMLReferencingElementFeatureSwitch();

    @Check
    private void checkGreetingStartsWithCapital(UMLReferencingElement referencingElement) {
        if (referencingElement.getReferencedElement() == null) {
            info("The element is not available in UML. It will be created when saving.",
                    MISSING_REFERENCE_FEATURE_SWITCH.doSwitch(referencingElement), MISSING_UML_REFERENCE);
        }
    }

    private void info(String message, EStructuralFeature feature, String code) {
        info(message, feature, code, new String[0]);
    }

    private static class UMLReferencingElementFeatureSwitch extends UsecaseSwitch<EStructuralFeature> {

        @Override
        public EStructuralFeature caseNamedElement(NamedElement object) {
            return UsecasePackage.Literals.NAMED_ELEMENT__NAME;
        }

        @Override
        public EStructuralFeature caseComment(Comment object) {
            return UsecasePackage.Literals.COMMENT__COMMENT;
        }

        @Override
        public EStructuralFeature defaultCase(EObject object) {
            return UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
        }

    }
}
