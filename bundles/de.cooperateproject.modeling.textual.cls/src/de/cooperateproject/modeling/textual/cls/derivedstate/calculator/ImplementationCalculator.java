package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State calculation for implementations.
 */
public class ImplementationCalculator extends AtomicStateProcessorExtensionBase<Implementation> {

    /**
     * Constructs the calculator.
     * 
     * @param clazz
     *            The class that this calculator can process.
     */
    public ImplementationCalculator(java.lang.Class<Implementation> clazz) {
        super(Implementation.class);
    }

    @Override
    protected Boolean applyTyped(Implementation object) {
        if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                && object.getRight().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Classifier left = object.getLeft().getReferencedElement();
            org.eclipse.uml2.uml.Classifier right = object.getRight().getReferencedElement();
            if (left instanceof Class && right instanceof Interface) {
                InterfaceRealization umlInterfaceRealization = ((Class) left).getInterfaceRealization(null,
                        (Interface) right);
                object.setReferencedElement(umlInterfaceRealization);
                return true;
            }
        }
        return false;
    }

    @Override
    public java.lang.Class<Implementation> getSupportedType() {
        return Implementation.class;
    }

}
