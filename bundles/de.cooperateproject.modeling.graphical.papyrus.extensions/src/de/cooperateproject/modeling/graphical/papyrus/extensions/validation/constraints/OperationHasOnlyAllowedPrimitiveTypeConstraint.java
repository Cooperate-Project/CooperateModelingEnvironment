package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;

public class OperationHasOnlyAllowedPrimitiveTypeConstraint extends PrimitiveTypeCheckingConstraintBase<Operation> {

    public OperationHasOnlyAllowedPrimitiveTypeConstraint() {
        super(Operation.class);
    }

    @Override
    protected Type getTypeToCheck(Operation target) {
        return target.getType();
    }

}
