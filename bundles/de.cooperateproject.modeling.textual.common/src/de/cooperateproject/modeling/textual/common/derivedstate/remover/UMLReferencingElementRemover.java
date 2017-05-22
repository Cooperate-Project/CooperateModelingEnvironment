package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

public class UMLReferencingElementRemover extends AtomicStateProcessorExtensionBase<UMLReferencingElement<Element>> {

    @SuppressWarnings("unchecked")
    public UMLReferencingElementRemover() {
        super((Class<UMLReferencingElement<Element>>) (Class<?>) UMLReferencingElement.class);
    }

    @Override
    protected Boolean applyTyped(UMLReferencingElement<Element> object) {
        if (object instanceof NamedElement) {
            handle((NamedElement) object);
        }
        return true;
    }

    private static void handle(NamedElement object) {
        object.eUnset(TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

}
