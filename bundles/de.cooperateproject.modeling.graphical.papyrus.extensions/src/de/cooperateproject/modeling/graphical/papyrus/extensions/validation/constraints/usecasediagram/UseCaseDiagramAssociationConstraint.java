package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint ensuring that associations in use case diagrams do not have names.
 */
public class UseCaseDiagramAssociationConstraint extends CooperateConstraintBase<Association> {

    /**
     * Constructs the constraint.
     */
    public UseCaseDiagramAssociationConstraint() {
        super(Association.class);
    }

    @Override
    public boolean validateCooperateModel(IValidationContext ctx, Association target) {
        Collection<java.lang.Class<?>> relevantEndTypes = Arrays.asList(Actor.class, UseCase.class);
        if (!target.getEndTypes().stream().allMatch(
                testType -> relevantEndTypes.stream().anyMatch(relevantType -> relevantType.isInstance(testType)))) {
            // The association is not in a use case diagram and therefore not relevant for this constraint
            return true;
        }

        return StringUtils.isBlank(target.getName());
    }

}
