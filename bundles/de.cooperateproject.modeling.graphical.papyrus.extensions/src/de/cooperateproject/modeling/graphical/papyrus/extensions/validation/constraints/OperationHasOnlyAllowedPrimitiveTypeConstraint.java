package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;

/**
 * Constraint ensuring that operations have valid primitive return types.
 */
public class OperationHasOnlyAllowedPrimitiveTypeConstraint extends PrimitiveTypeCheckingConstraintBase<Operation> {

    /**
     * Constructs the constraint.
     */
    public OperationHasOnlyAllowedPrimitiveTypeConstraint() {
        super(Operation.class);
    }

    @Override
    protected Type getTypeToCheck(Operation target) {
        return target.getType();
    }

}
