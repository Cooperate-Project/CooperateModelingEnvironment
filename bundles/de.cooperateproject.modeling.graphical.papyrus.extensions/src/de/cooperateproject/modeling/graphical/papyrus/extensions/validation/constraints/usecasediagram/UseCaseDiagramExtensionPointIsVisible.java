package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.usecasediagram;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint for ensuring that used extension points are visible.
 */
public class UseCaseDiagramExtensionPointIsVisible extends CooperateConstraintBase<Edge> {

    private static final String EXTEND_EDGE_TYPE = "Extend_Edge";
    private static final String EXTENSIONPOINT_SHAPE_TYPE = "ExtensionPoint_ExtensionPointLabel";

    /**
     * Constructs the constraint.
     */
    public UseCaseDiagramExtensionPointIsVisible() {
        super(Edge.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Edge target) {
        if (!EXTEND_EDGE_TYPE.equals(target.getType())) {
            return true;
        }

        Collection<ExtensionPoint> hiddenExtensionPoints = ((Extend) target.getElement()).getExtensionLocations()
                .stream().filter(ep -> !shapeExists(target.getDiagram(), ep)).collect(Collectors.toSet());
        ctx.addResults(hiddenExtensionPoints);
        return hiddenExtensionPoints.isEmpty();
    }

    @SuppressWarnings("unchecked")
    private static boolean shapeExists(Diagram diagram, ExtensionPoint ep) {
        for (LinkedList<EObject> queue = new LinkedList<>((Collection<EObject>) diagram.getChildren()); !queue
                .isEmpty();) {
            EObject element = queue.pop();
            if ((element instanceof Node)) {
                Node shape = (Node) element;
                queue.addAll((Collection<EObject>) shape.getChildren());
                if (EXTENSIONPOINT_SHAPE_TYPE.equals(shape.getType()) && shape.getElement() == ep) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected IStatus createFailureStatus(IValidationContext ctx, EObject target) {
        Collection<IStatus> statuses = ctx.getResultLocus().stream().filter(ep -> ep != target)
                .map(ep -> super.createFailureStatus(ctx, ep)).collect(Collectors.toList());
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }

}
