package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

@Applicability(applicabilities = DerivedStateProcessorApplicability.CLEANING)
public class UMLReferencingElementRemover extends AtomicDerivedStateProcessorBase<UMLReferencingElement<Element>> {

    @SuppressWarnings("unchecked")
    public UMLReferencingElementRemover() {
        super((Class<UMLReferencingElement<Element>>) (Class<?>) UMLReferencingElement.class);
    }

    @Override
    protected void applyTyped(UMLReferencingElement<Element> object) {
        if (object instanceof NamedElement) {
            handle((NamedElement) object);
        }
    }

    private static void handle(NamedElement object) {
        if (object instanceof UMLReferencingElement) {
            if (((UMLReferencingElement) object).getReferencedElement() != null) {
                object.eUnset(TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
            }
        }
    }

}
