package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Removes the state of {@link PackageImport} elements.
 */
@Applicability(applicabilities = CLEANING)
public class PackageImportRemover extends AtomicDerivedStateProcessorBase<PackageImport> {

    /**
     * Constructs the processor.
     */
    public PackageImportRemover() {
        super(PackageImport.class);
    }

    @Override
    protected void applyTyped(PackageImport object) {
        if (object.getReferencedElement() != null) {
            object.eUnset(TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE);
        }
    }

}
