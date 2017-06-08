package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import java.util.Collection;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicMappingEstablishingProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculation for {@link UMLReferencingElement}.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class UMLReferencingElementCalculator
        extends AtomicMappingEstablishingProcessorBase<UMLReferencingElement<Element>> {

    /**
     * Constructs the calculator.
     */
    @SuppressWarnings("unchecked")
    public UMLReferencingElementCalculator() {
        super((Class<UMLReferencingElement<Element>>) (Class<?>) UMLReferencingElement.class);
    }

    @Override
    protected void applyTyped(UMLReferencingElement<Element> object) {
        Collection<Element> matchingElements = getReferenceCandidates(object);
        if (matchingElements.size() == 1) {
            object.setReferencedElement(matchingElements.iterator().next());
        } else {
            object.setReferencedElement(null);
        }
    }

    @Override
    protected EStructuralFeature getReferenceFeature() {
        return TextualCommonsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement();
    }

}
