package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Extend;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint ensuring that constraints on extend relationships are contained in the relationship.
 */
public class UseCaseDiagramConstraintsOnExtendsHaveToBeContained extends CooperateConstraintBase<Constraint> {

    /**
     * Constructs the constraint
     */
    public UseCaseDiagramConstraintsOnExtendsHaveToBeContained() {
        super(Constraint.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Constraint target) {
        return target.getConstrainedElements().stream().filter(Extend.class::isInstance).map(Extend.class::cast)
                .allMatch(extend -> target.eContainer() == extend);
    }

}
