package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for package imports.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class PackageImportCalculator extends AtomicDerivedStateProcessorBase<PackageImport> {

    /**
     * Constructs the calculator.
     */
    public PackageImportCalculator() {
        super(PackageImport.class);
    }

    @Override
    protected void applyTyped(PackageImport object) {

        if (object.getImportingPackage() != null && object.getImportingPackage().getReferencedElement() != null
                && object.getImportedPackage() != null) {
            org.eclipse.uml2.uml.PackageImport umlPackageImport = object.getImportingPackage().getReferencedElement()
                    .getPackageImport(object.getImportedPackage());
            object.setReferencedElement(umlPackageImport);
            return;
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
