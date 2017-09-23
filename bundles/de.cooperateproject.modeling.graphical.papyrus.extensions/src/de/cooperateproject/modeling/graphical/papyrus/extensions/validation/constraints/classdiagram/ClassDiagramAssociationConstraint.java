package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.classdiagram;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint ensuring that an association in a class diagram has a name.
 */
public class ClassDiagramAssociationConstraint extends CooperateConstraintBase<Association> {

    /**
     * Constructs the constraint.
     */
    public ClassDiagramAssociationConstraint() {
        super(Association.class);
    }

    @Override
    public boolean validateCooperateModel(IValidationContext ctx, Association target) {
        Collection<java.lang.Class<?>> relevantEndTypes = Arrays.asList(Class.class, Interface.class);
        if (!target.getEndTypes().stream().allMatch(
                testType -> relevantEndTypes.stream().anyMatch(relevantType -> relevantType.isInstance(testType)))) {
            // The association is not in a class diagram and therefore not relevant for this constraint
            return true;
        }

        return !StringUtils.isBlank(target.getName());
    }

}
