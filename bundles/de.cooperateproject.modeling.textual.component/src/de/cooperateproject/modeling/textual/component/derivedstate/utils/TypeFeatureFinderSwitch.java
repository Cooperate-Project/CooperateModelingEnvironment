package de.cooperateproject.modeling.textual.component.derivedstate.utils;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * Switch that allows finding the type feature of an UML model element.
 */
public class TypeFeatureFinderSwitch extends UMLSwitch<EReference> {

    /**
     * Determines the type feature of the given element.
     * 
     * @param o
     *            The element that has a type feature.
     * @return The found type feature or {@link Optional#empty()} otherwise.
     */
    public static Optional<EReference> doSwitch(NamedElement o) {
        if (o == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(new TypeFeatureFinderSwitch().doSwitch((EObject) o));
    }

    @Override
    public EReference caseTypedElement(TypedElement object) {
        return UMLPackage.Literals.TYPED_ELEMENT__TYPE;
    }

    @Override
    public EReference caseOperation(Operation object) {
        return UMLPackage.Literals.OPERATION__TYPE;
    }

}