package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * Constraint ensuring that {@link TypedElement} elements have valid primitive types.
 */
public class TypedElementHasOnlyAllowedPrimitiveTypeConstraint
        extends PrimitiveTypeCheckingConstraintBase<TypedElement> {

    /**
     * Constructs the constraint.
     */
    public TypedElementHasOnlyAllowedPrimitiveTypeConstraint() {
        super(TypedElement.class);
    }

    @Override
    protected Type getTypeToCheck(TypedElement target) {
        return target.getType();
    }

}
