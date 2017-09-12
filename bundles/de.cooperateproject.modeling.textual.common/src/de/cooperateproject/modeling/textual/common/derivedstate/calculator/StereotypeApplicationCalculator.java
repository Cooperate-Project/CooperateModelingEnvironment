package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for package imports.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class StereotypeApplicationCalculator extends AtomicDerivedStateProcessorBase<StereotypeApplication> {

    /**
     * Constructs the calculator.
     */
    public StereotypeApplicationCalculator() {
        super(StereotypeApplication.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void applyTyped(StereotypeApplication object) {

        EObject stereotypedObject = ((EObject) object).eContainer();
        if (stereotypedObject instanceof UMLReferencingElement<?>)
            handle(object, (UMLReferencingElement<Element>) stereotypedObject);

    }

    private void handle(StereotypeApplication object, UMLReferencingElement<Element> stereotypedElement) {
        if (object.getStereotype() != null && stereotypedElement.getReferencedElement() != null) {
            Element umlElement = stereotypedElement.getReferencedElement();
            Optional<Stereotype> appliedStereo = umlElement.getAppliedStereotypes().stream()
                    .filter(s -> s.getName().equals(object.getStereotype())).findFirst();
            if (appliedStereo.isPresent()) {
                object.setReferencedElement(appliedStereo.get());
            }
            return;
        }
    }

}
