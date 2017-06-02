package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Type;

public class ClassDiagramAssociationConstraint extends CooperateConstraint {

    @Override
    public IStatus validateCooperateModel(IValidationContext ctx) {
        assert (ctx.getTarget() instanceof Association);
        Association association = (Association) ctx.getTarget();
        for (Type end : association.getEndTypes()) {
            if (!(end instanceof Class || end instanceof Interface)) {
                // The association is not in a class diagram and therefore not relevant for this constraint
                return ctx.createSuccessStatus();
            }
        }
        if (null != association.getName()) {
            if (!"".equals(association.getName().trim())) {
                return ctx.createSuccessStatus();
            }
        }
        return ctx.createFailureStatus(new Object[] { association });
    }

}
