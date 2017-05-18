package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UseCase;

public class UseCaseDiagramAssociationConstraint extends CooperateConstraint {
    @Override
    public IStatus validateCooperateModel(IValidationContext ctx) {
        assert (ctx.getTarget() instanceof Association);
        Association association = (Association) ctx.getTarget();
        for (Type end : association.getEndTypes()) {
            if (!(end instanceof Actor || end instanceof UseCase)) {
                // The association is not in a use case diagram and therefore not relevant for this constraint
                return ctx.createSuccessStatus();
            }
        }
        if (null != association.getName()) {
            if ("".equals(association.getName().trim())) {
                return ctx.createSuccessStatus();
            }
        } else {
            return ctx.createSuccessStatus();
        }
        return ctx.createFailureStatus(new Object[] { association });
    }

}
