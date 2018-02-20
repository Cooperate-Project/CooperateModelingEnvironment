package de.cooperateproject.modeling.graphical.papyrus.extensions.component.validation.constraints;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

public class ComponentDiagramClassifierOfPortInDiagram extends CooperateConstraintBase<Shape> {

	private static final String RELEVANT_SHAPE_TYPE = "Port_Shape";

	/**
	 * Constructs the constraint.
	 */
	public ComponentDiagramClassifierOfPortInDiagram() {
		super(Shape.class);
	}

	@Override
	protected boolean validateCooperateModel(IValidationContext ctx, Shape target) {
		if (RELEVANT_SHAPE_TYPE.equals(target.getType())) {
			if (target.getElement() instanceof Port) {
				EList<Object> children = target.getDiagram().getChildren();

				Port port = (Port) target.getElement();
				Type portType = port.getType();
				if (portType instanceof Classifier) {
					if (checkChildren(children, portType)) {
						return true;
					}
					return false;
				}
			}
		}
		return true;
	}

	private boolean checkChildren(EList<?> children, Type portType) {
		for (Object child : children) {
			if (child instanceof Shape && ((Shape) child).getElement() instanceof Classifier) {
				if (portType == ((Shape) child).getElement()) {
					return true;
				} else if (((Shape) child).getChildren() != null) {
					if (checkChildren(((Shape) child).getChildren(), portType)) {return true;}
				}
			} else if (child instanceof BasicCompartment && ((BasicCompartment) child).getChildren() != null) {
				if (checkChildren(((BasicCompartment) child).getChildren(), portType)) {return true;}
			}
		}
		return false;
	}


	@Override
	protected IStatus createFailureStatus(IValidationContext ctx, EObject target) {
		EObject failureElement = Optional.of(target).filter(Shape.class::isInstance).map(Shape.class::cast)
				.map(Shape::getElement).orElse(target);
		return super.createFailureStatus(ctx, failureElement);
	}

}
