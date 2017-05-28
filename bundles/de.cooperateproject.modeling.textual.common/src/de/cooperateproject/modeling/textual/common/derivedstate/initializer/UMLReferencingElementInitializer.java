package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class UMLReferencingElementInitializer extends AtomicDerivedStateProcessorBase<UMLReferencingElement<Element>> {

    @SuppressWarnings("unchecked")
    public UMLReferencingElementInitializer() {
        super((Class<UMLReferencingElement<Element>>) (Class<?>) UMLReferencingElement.class);
    }

    @Override
    protected void applyTyped(UMLReferencingElement<Element> object) {
        if (object instanceof NamedElement) {
            handle((NamedElement) object);
        }
    }

    private static void handle(NamedElement object) {
        if (StringUtils.isEmpty(object.getName()) && object instanceof UMLReferencingElement) {
            UMLReferencingElement typedObject = (UMLReferencingElement) object;
            if (typedObject.getReferencedElement() instanceof org.eclipse.uml2.uml.NamedElement) {
                object.setName(((org.eclipse.uml2.uml.NamedElement) typedObject.getReferencedElement()).getName());
            }
        }
    }

}
