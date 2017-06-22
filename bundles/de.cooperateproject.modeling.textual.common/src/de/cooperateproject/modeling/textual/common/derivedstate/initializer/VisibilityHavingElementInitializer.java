package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class VisibilityHavingElementInitializer extends AtomicDerivedStateProcessorBase<VisibilityHavingElement> {

    public VisibilityHavingElementInitializer() {
        super(VisibilityHavingElement.class);
    }

    @Override
    protected void applyTyped(VisibilityHavingElement object) {
        if (!(object instanceof UMLReferencingElement)) {
            return;
        }

        @SuppressWarnings("unchecked")
        NamedElement referencedElement = ((UMLReferencingElement<NamedElement>) object).getReferencedElement();
        if (referencedElement == null) {
            return;
        }

        if (referencedElement.isSetVisibility()) {
            object.setVisibility(referencedElement.getVisibility());
        } else {
            object.unsetVisibility();
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
