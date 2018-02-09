package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase.validation.constraints;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.Streams;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint that ensures that multiple extend relationships for the same extension location have a condition.
 */
public class UseCaseDiagramConditionAvailableForMultipleExtensions extends CooperateConstraintBase<Model> {

    /**
     * Constructs constraint.
     */
    public UseCaseDiagramConditionAvailableForMultipleExtensions() {
        super(Model.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, Model target) {
        Map<ExtensionPoint, List<Extend>> extendsToCheck = Streams.stream(target.eAllContents())
                .filter(e -> e.eClass() == UMLPackage.eINSTANCE.getExtend()).map(Extend.class::cast)
                .filter(e -> e.getExtensionLocations().size() == 1)
                .collect(Collectors.groupingBy(e -> e.getExtensionLocations().iterator().next()));
        Set<Extend> violatingElements = extendsToCheck.entrySet().stream().filter(e -> e.getValue().size() > 1)
                .map(Entry::getValue).flatMap(Collection::stream).distinct().filter(e -> e.getCondition() == null).collect(Collectors.toSet());
        ctx.addResults(violatingElements);
        return violatingElements.isEmpty();
    }

    @Override
    protected IStatus createFailureStatus(IValidationContext ctx, EObject target) {
        Collection<IStatus> failureStatus = ctx.getResultLocus().stream().filter(Extend.class::isInstance)
                .map(e -> super.createFailureStatus(ctx, e)).collect(Collectors.toSet());
        return ConstraintStatus.createMultiStatus(ctx, failureStatus);
    }

}
