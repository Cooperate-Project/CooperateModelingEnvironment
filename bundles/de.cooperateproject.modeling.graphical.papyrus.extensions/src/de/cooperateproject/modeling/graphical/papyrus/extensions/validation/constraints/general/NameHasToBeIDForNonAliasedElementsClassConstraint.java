package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UseCase;

/**
 * Constraint ensuring that elements have names available that can be used in qualified names.
 */
public class NameHasToBeIDForNonAliasedElementsClassConstraint extends CooperateConstraintBase<NamedElement> {

    private static final Collection<Class<? extends NamedElement>> IGNORED_ELEMENTS = Arrays
            .asList(StringExpression.class);
    private static final Collection<Class<? extends NamedElement>> ALIASED_ELEMENTS = Arrays.asList(
            org.eclipse.uml2.uml.Class.class, Interface.class, Actor.class, ExtensionPoint.class, UseCase.class);

    /**
     * Constructs the constraint.
     */
    public NameHasToBeIDForNonAliasedElementsClassConstraint() {
        super(NamedElement.class);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, NamedElement target) {
        if (IGNORED_ELEMENTS.stream().anyMatch(ignoredType -> ignoredType.isInstance(target))) {
            return true;
        }

        if (StringUtils.isBlank(target.getName())) {
            // non optional names should be handled via other constraints
            return true;
        }

        return isID(target.getName())
                || ALIASED_ELEMENTS.stream().anyMatch(aliasedType -> aliasedType.isInstance(target))
                        && Optional.ofNullable(target.getNameExpression()).map(StringExpression::getName)
                                .map(NameHasToBeIDForNonAliasedElementsClassConstraint::isID).orElse(false);
    }

    private static boolean isID(String name) {
        return StringUtils.isNotBlank(name) && name.matches("[a-zA-Z0-9]*");
    }

}
