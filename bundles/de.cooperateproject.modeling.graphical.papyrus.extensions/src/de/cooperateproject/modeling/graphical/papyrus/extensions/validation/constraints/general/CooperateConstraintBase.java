package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;

/**
 * Base class for all Cooperate constraints to be used inside of Papyrus.
 * 
 * @param <T>
 *            The type of the element this constraint is about.
 */
public abstract class CooperateConstraintBase<T extends EObject> extends AbstractModelConstraint {

    private static final String COOPERATE_CONSTRAINT_CATEGORY_ID = "de.cooperateproject.modeling.graphical.papyrus.extensions.validation.cooperateConstraints";
    private final Class<? extends T> targetType;

    /**
     * Constructs the constraint.
     * 
     * @param targetType
     *            The type of the element this constraint is about.
     */
    public CooperateConstraintBase(Class<? extends T> targetType) {
        this.targetType = targetType;
    }

    public Class<? extends T> getTargetType() {
        return targetType;
    }

    @Override
    public final IStatus validate(IValidationContext ctx) {
        if (!getTargetType().isInstance(ctx.getTarget())) {
            throw new IllegalArgumentException(String.format("The given target object %s has not the required type %s",
                    ctx.getTarget(), getTargetType().getSimpleName()));
        }
        @SuppressWarnings("unchecked")
        T target = (T) ctx.getTarget();
        if (validateCooperateModel(ctx, target)) {
            return ctx.createSuccessStatus();
        }
        return createFailureStatus(ctx, target);
    }

    protected IStatus createFailureStatus(IValidationContext ctx, EObject target) {
        return ctx.createFailureStatus(target);
    }

    protected abstract boolean validateCooperateModel(IValidationContext ctx, T target);

    /**
     * Checks if the constraint with the given ID is an instance of {@link CooperateConstraintBase}.
     * 
     * @param constraintId
     *            The constraint ID to check.
     * @return True if the given constraint ID belongs to a {@link CooperateConstraintBase}. False otherwise.
     */
    public static boolean isCooperateConstraint(String constraintId) {
        return Optional.ofNullable(ConstraintRegistry.getInstance().getDescriptor(constraintId))
                .map(IConstraintDescriptor::getCategories).map(categories -> categories.stream()
                        .anyMatch(c -> COOPERATE_CONSTRAINT_CATEGORY_ID.equals(c.getId())))
                .orElse(false);
    }
}
