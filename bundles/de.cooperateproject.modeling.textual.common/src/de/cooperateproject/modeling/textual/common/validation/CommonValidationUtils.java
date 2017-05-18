package de.cooperateproject.modeling.textual.common.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;

public class CommonValidationUtils {

    private static class UMLReferencingElementFeatureSwitch extends TextualCommonsSwitch<EStructuralFeature> {

        @Override
        public EStructuralFeature caseNamedElement(NamedElement object) {
            return TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME;
        }

        @Override
        public EStructuralFeature caseComment(Comment object) {
            return TextualCommonsPackage.Literals.COMMENT__BODY;
        }

        @Override
        public EStructuralFeature defaultCase(EObject object) {
            return TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
        }

    }

    private static final UMLReferencingElementFeatureSwitch MISSING_REFERENCE_FEATURE_SWITCH = new UMLReferencingElementFeatureSwitch();

    public static EStructuralFeature getStructuralFeatureMissingElement(EObject object) {
        return MISSING_REFERENCE_FEATURE_SWITCH.doSwitch(object);
    }

}
