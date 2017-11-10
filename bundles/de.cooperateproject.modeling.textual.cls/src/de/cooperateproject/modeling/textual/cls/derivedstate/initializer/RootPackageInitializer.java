package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Model;

import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * Initializer for the RootPackage.
 * 
 * @author czogalik
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class RootPackageInitializer extends AtomicDerivedStateProcessorBase<Package> {

    /**
     * Instantiates the initializer.
     */
    public RootPackageInitializer() {
        super(Package.class);
    }

    @Override
    protected void applyTyped(Package object) {
        handle(object);
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

    private static void handle(NamedElement object) {
        Optional.of(object).filter(UMLReferencingElement.class::isInstance).map(UMLReferencingElement.class::cast)
                .map(UMLReferencingElement::getReferencedElement).filter(Model.class::isInstance)
                .filter(o -> o.eContainer() == null).ifPresent(o -> object.unsetName());
    }

}