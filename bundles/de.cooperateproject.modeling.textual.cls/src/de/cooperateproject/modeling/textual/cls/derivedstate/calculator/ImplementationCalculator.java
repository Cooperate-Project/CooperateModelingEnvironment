package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculation for implementations.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class ImplementationCalculator extends AtomicDerivedStateProcessorBase<Implementation> {

    /**
     * Constructs the calculator.
     */
    public ImplementationCalculator() {
        super(Implementation.class);
    }

    @Override
    protected void applyTyped(Implementation object) {
        if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                && object.getRight().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Classifier left = object.getLeft().getReferencedElement();
            org.eclipse.uml2.uml.Classifier right = object.getRight().getReferencedElement();
            if (left instanceof Class && right instanceof Interface) {
                InterfaceRealization umlInterfaceRealization = ((Class) left).getInterfaceRealization(null,
                        (Interface) right);
                object.setReferencedElement(umlInterfaceRealization);
                return;
            }
        }
    }

    @Override
    public Collection<java.lang.Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
