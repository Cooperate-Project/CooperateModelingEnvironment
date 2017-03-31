package de.cooperateproject.modeling.textual.usecase.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.validation.Check;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.validation.CommonValidationUtils;
import de.cooperateproject.modeling.textual.usecase.issues.UsecaseUMLReferencingElementMissingElement;

public class UsecaseValidator extends AbstractUsecaseValidator {
    @Check
    private void checkGreetingStartsWithCapital(UMLReferencingElement<Element> referencingElement) {
        if (UsecaseUMLReferencingElementMissingElement.hasIssue(referencingElement)) {
            info("The element is not available in UML. It will be created when saving.",
                    CommonValidationUtils.getStructuralFeatureMissingElement(referencingElement),
                    UsecaseUMLReferencingElementMissingElement.MISSING_UML_REFERENCE);
        }
    }

    private void info(String message, EStructuralFeature feature, String code) {
        info(message, feature, code, new String[0]);
    }
}
