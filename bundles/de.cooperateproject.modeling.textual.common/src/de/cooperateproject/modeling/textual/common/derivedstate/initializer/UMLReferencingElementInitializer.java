package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsFactory;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State initializer for {@link UMLReferencingElement} elements.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class UMLReferencingElementInitializer extends AtomicDerivedStateProcessorBase<UMLReferencingElement<Element>> {

    /**
     * Instantiates the initializer.
     */
    @SuppressWarnings("unchecked")
    public UMLReferencingElementInitializer() {
        super((Class<UMLReferencingElement<Element>>) (Class<?>) UMLReferencingElement.class);
    }

    @Override
    protected void applyTyped(UMLReferencingElement<Element> object) {
        if (object instanceof NamedElement) {
            handle((NamedElement) object);
        }
        if (!object.isSetAppliedStereotypes() && object.getReferencedElement() != null) {
            EList<Stereotype> appliedStereotypes = object.getReferencedElement().getAppliedStereotypes();
            for (Stereotype stereotype : appliedStereotypes) {
                StereotypeApplication textualApplication = TextualCommonsFactory.eINSTANCE
                        .createStereotypeApplication();
                textualApplication.setStereotype(stereotype);
                EObject stereoApp = object.getReferencedElement().getStereotypeApplication(stereotype);
                textualApplication.setReferencedElement(stereoApp);
                object.getAppliedStereotypes().add(textualApplication);
            }

        }
    }

    private static void handle(NamedElement object) {
        if (StringUtils.isEmpty(object.getName()) && object instanceof UMLReferencingElement) {
            UMLReferencingElement<?> typedObject = (UMLReferencingElement<?>) object;
            if (typedObject.getReferencedElement() instanceof org.eclipse.uml2.uml.NamedElement) {
                object.setName(((org.eclipse.uml2.uml.NamedElement) typedObject.getReferencedElement()).getName());
            }
        }
    }

}
