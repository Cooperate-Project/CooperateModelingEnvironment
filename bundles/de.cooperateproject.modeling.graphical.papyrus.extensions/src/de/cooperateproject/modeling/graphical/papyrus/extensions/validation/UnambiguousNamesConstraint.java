package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.uml.tools.databinding.NamedElementValidator;
import org.eclipse.uml2.uml.NamedElement;

public class UnambiguousNamesConstraint extends CooperateConstraint {

    @Override
    public IStatus validateCooperateModel(IValidationContext ctx) {
        assert ctx.getTarget() instanceof NamedElement;
        NamedElement element = (NamedElement) ctx.getTarget();
        NamedElementValidator validator = new NamedElementValidator(element);
        IStatus status = validator.validate(element.getName());
        if (status.isOK()) {
            return ctx.createSuccessStatus();
        } else {
            return ctx.createFailureStatus(new Object[] { element });
        }
    }

}
