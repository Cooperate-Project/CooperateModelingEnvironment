package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.classdiagram;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;

/**
 * Constraint ensuring that an association in a class diagram has a name or is unambiguous.
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

        if (!StringUtils.isBlank(target.getName())) {
            return true;
        }

        Collection<Type> wantedTypes = getTypes(target);
        return target.getNearestPackage().getMembers().stream().filter(Association.class::isInstance)
                .map(Association.class::cast).filter(a -> a != target).allMatch(a -> !getTypes(a).equals(wantedTypes));
    }

    private static Collection<Type> getTypes(Association association) {
        return association.getMemberEnds().stream().map(Property::getType).collect(Collectors.toList());
    }

}
