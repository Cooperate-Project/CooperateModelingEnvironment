package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

public class TypedElementHasOnlyAllowedPrimitiveType extends PrimitiveTypeCheckingConstraintBase<TypedElement> {

    public TypedElementHasOnlyAllowedPrimitiveType() {
        super(TypedElement.class);
    }

    @Override
    protected Type getTypeToCheck(TypedElement target) {
        return target.getType();
    }

}
