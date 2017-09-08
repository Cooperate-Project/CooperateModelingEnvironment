package de.cooperateproject.modeling.textual.common.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

/**
 * Transient status provider for textual commons models.
 */
public class TextualCommonsTransientStatusProvider implements ITransientStatusProvider {

    private static final Set<EStructuralFeature> TRANSIENT_FEATURES = new HashSet<>(
            Arrays.asList(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT,
                    TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__REFERENCED_ELEMENT));

    private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = new HashSet<>(Arrays.asList(
            TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS,
            TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY,
            TextualCommonsPackage.Literals.COMMENT__BODY, TextualCommonsPackage.Literals.CARDINALITY__LOWER_BOUND,
            TextualCommonsPackage.Literals.CARDINALITY__UPPER_BOUND,
            TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE,
            TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE,
            TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES));

    @Override
    public boolean isFeatureConsideredTransient(EStructuralFeature feature) {
        return TRANSIENT_FEATURES.contains(feature);
    }

    @Override
    public boolean isFeatureConsideredNonTransient(EStructuralFeature feature) {
        return NON_TRANSIENT_FEATURES.contains(feature);
    }

}
