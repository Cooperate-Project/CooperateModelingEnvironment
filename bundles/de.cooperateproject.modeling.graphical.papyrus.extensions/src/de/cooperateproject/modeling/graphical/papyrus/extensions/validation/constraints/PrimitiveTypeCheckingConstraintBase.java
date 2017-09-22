package de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;

import de.cooperateproject.modeling.common.primitivetypes.DefaultUMLPrimitiveTypeFilter;
import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.CooperateConstraintBase;

public abstract class PrimitiveTypeCheckingConstraintBase<T extends Element> extends CooperateConstraintBase<T> {

    private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);

    public PrimitiveTypeCheckingConstraintBase(Class<? extends T> targetType) {
        super(targetType);
    }

    @Override
    protected boolean validateCooperateModel(IValidationContext ctx, T target) {
        Type type = getTypeToCheck(target);
        return !isPrimitiveType(type) || isAllowedPrimitiveType(type);
    }

    protected abstract Type getTypeToCheck(T target);

    /**
     * Checks if a given type is a primitive type.
     * 
     * @param type
     *            The type to be checked.
     * @return True, if the type is a primitive type.
     */
    private static boolean isPrimitiveType(Type type) {
        return type instanceof PrimitiveType;
    }

    /**
     * Checks if the given type is an allowed primitive type.
     * 
     * @param type
     *            The type to be checked.
     * @return True, if the type is a allowed primitive type.
     */
    private static boolean isAllowedPrimitiveType(Type type) {
        if (!isPrimitiveType(type)) {
            return false;
        }

        if (!Optional.ofNullable(type.eResource()).map(Resource::getURI).map(UML_PRIMITIVE_TYPES_URI::equals)
                .orElse(false)) {
            return false;
        }

        return new DefaultUMLPrimitiveTypeFilter().isAllowed((PrimitiveType) type);
    }

}
