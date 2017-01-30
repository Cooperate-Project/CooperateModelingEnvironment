package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;

public class AssociationConstraint extends AbstractModelConstraint {

    @Override
    public IStatus validate(IValidationContext ctx) {
        assert (ctx.getTarget() instanceof Association);
        Association association = (Association) ctx.getTarget();
        if (null != association.getName()) {
            if (!"".equals(association.getName().trim())) {
                return ctx.createSuccessStatus();
            }
        }
        return ctx.createFailureStatus(new Object[] { association });
    }

}
