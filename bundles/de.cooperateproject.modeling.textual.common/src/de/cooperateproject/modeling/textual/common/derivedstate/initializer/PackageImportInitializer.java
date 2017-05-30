package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Package;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link PackageImport} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class PackageImportInitializer extends AtomicDerivedStateProcessorBase<PackageImport> {

    /**
     * Instantiates the processor.
     */
    public PackageImportInitializer() {
        super(PackageImport.class);
    }

    @Override
    protected void applyTyped(PackageImport object) {
        if (StringUtils.isEmpty(object.getImportedPackage()) && object.getReferencedElement() != null) {
            Package importedPackage = object.getReferencedElement().getImportedPackage();
            String importedPackageName = importedPackage.getQualifiedName().replace(importedPackage.separator(), ".");
            object.setImportedPackage(importedPackageName);
        }
    }

}
