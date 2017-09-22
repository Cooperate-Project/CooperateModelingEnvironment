package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import java.util.Arrays;

import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TypedElement;

/**
 * Constraint ensuring that an attribute has a type.
 */
public class AttributeMustHaveATypeConstraint extends TypedElementMustHaveATypeConstraint<Property> {

    /**
     * Constructs the constraint.
     */
    public AttributeMustHaveATypeConstraint() {
        super(Property.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, TypedElement target) {
        if (Arrays.asList(Class.class, Interface.class).stream().anyMatch(c -> c.isInstance(target.getOwner()))) {
            return super.validateCooperateModel(ctx, target);
        }
        return true;
    }

}
