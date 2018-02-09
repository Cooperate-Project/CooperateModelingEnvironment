package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.uml2.uml.Component;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint ensuring that systems in use case diagrams are of type component.
 */
public class UseCaseSystemMustBeOfTypeComponent extends CooperateConstraintBase<Shape> {

    private static final String RELEVANT_SHAPE_TYPE = "Classifier_SubjectShape";

    /**
     * Constructs the constraint.
     */
    public UseCaseSystemMustBeOfTypeComponent() {
        super(Shape.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Shape target) {

        if (!RELEVANT_SHAPE_TYPE.equals(target.getType())) {
            return true;
        }

        return target.getElement() instanceof Component;
    }

    @Override
    protected IStatus createFailureStatus(IValidationContext ctx, EObject target) {
        EObject failureElement = Optional.of(target).filter(Shape.class::isInstance).map(Shape.class::cast)
                .map(Shape::getElement).orElse(target);
        return super.createFailureStatus(ctx, failureElement);
    }

}
