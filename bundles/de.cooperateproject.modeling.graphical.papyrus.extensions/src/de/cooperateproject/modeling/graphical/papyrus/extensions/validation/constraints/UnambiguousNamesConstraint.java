package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.uml.tools.databinding.NamedElementValidator;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Constraint ensuring that names are not ambiguous.
 */
public class UnambiguousNamesConstraint extends CooperateConstraintBase<NamedElement> {

    /**
     * Constructs the constraint.
     */
    public UnambiguousNamesConstraint() {
        super(NamedElement.class);
    }

    @Override
    public boolean validateCooperateModel(IValidationContext ctx, NamedElement target) {
        NamedElementValidator validator = new NamedElementValidator(target);
        IStatus status = validator.validate(target.getName());
        return status.isOK();
    }

}
