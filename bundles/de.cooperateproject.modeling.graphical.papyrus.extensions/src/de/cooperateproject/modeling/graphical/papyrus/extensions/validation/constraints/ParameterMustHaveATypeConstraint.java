package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.uml2.uml.Parameter;

/**
 * Constraint ensuring that parameters only have valid primitive types.
 */
public class ParameterMustHaveATypeConstraint extends TypedElementMustHaveATypeConstraint<Parameter> {

    /**
     * Constructs the constraint.
     */
    public ParameterMustHaveATypeConstraint() {
        super(Parameter.class);
    }

}
