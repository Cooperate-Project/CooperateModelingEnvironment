package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;

/**
 * Base class for all Cooperate constraints to be used inside of Papyrus.
 */
public abstract class CooperateConstraint extends AbstractModelConstraint {

    private static final String COOPERATE_CONSTRAINT_CATEGORY_ID = "de.cooperateproject.modeling.graphical.papyrus.extensions.validation.cooperateConstraints";

    @Override
    public final IStatus validate(IValidationContext ctx) {
        return validateCooperateModel(ctx);
    }

    protected abstract IStatus validateCooperateModel(IValidationContext ctx);

    /**
     * Checks if the constraint with the given ID is an instance of {@link CooperateConstraint}.
     * 
     * @param constraintId
     *            The constraint ID to check.
     * @return True if the given constraint ID belongs to a {@link CooperateConstraint}. False otherwise.
     */
    public static boolean isCooperateConstraint(String constraintId) {
        return Optional.ofNullable(ConstraintRegistry.getInstance().getDescriptor(constraintId))
                .map(IConstraintDescriptor::getCategories).map(categories -> categories.stream()
                        .anyMatch(c -> COOPERATE_CONSTRAINT_CATEGORY_ID.equals(c.getId())))
                .orElse(false);
    }
}
