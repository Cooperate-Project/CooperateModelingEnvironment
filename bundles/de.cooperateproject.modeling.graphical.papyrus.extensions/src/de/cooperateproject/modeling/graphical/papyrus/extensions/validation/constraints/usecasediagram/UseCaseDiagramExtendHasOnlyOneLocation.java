package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Extend;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint for ensuring that extend relationships have exactly one extension location.
 */
public class UseCaseDiagramExtendHasOnlyOneLocation extends CooperateConstraintBase<Extend> {

    /**
     * Constructs the constraint.
     */
    public UseCaseDiagramExtendHasOnlyOneLocation() {
        super(Extend.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Extend target) {
        return target.getExtensionLocations().size() == 1;
    }

}
