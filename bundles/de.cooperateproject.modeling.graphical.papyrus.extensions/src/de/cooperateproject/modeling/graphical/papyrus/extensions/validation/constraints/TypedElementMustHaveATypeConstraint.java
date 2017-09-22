package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.CooperateConstraintBase;

/**
 * Base constraint that ensures that a typed element has a type.
 * 
 * @param <T>
 *            The concrete type that is a subtype of a {@link TypedElement}.
 */
public abstract class TypedElementMustHaveATypeConstraint<T extends TypedElement>
        extends CooperateConstraintBase<TypedElement> {

    /**
     * Constructs the constraint.
     * 
     * @param targetType
     *            The concrete type this constraint is about.
     */
    public TypedElementMustHaveATypeConstraint(Class<T> targetType) {
        super(targetType);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, TypedElement target) {
        return target.eIsSet(UMLPackage.Literals.TYPED_ELEMENT__TYPE);
    }

}
