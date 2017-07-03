package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * Initialize for derived state of {@link VisibilityHavingElement} elements.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class VisibilityHavingElementInitializer extends AtomicDerivedStateProcessorBase<VisibilityHavingElement> {

    /**
     * Instantiates the initializer.
     */
    public VisibilityHavingElementInitializer() {
        super(VisibilityHavingElement.class);
    }

    @Override
    protected void applyTyped(VisibilityHavingElement object) {
        if (!(object instanceof UMLReferencingElement) || object.isSetVisibility()) {
            return;
        }

        @SuppressWarnings("unchecked")
        Optional<NamedElement> referencedElement = Optional
                .ofNullable(((UMLReferencingElement<NamedElement>) object).getReferencedElement());
        referencedElement.filter(NamedElement::isSetVisibility)
                .ifPresent(ref -> object.setVisibility(ref.getVisibility()));
        referencedElement.filter(ref -> !ref.isSetVisibility()).ifPresent(ref -> object.unsetVisibility());
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
