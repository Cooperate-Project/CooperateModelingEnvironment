package de.cooperateproject.modeling.textual.usecase.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

/**
 * Transient status provider for use case models.
 */
public class UseCaseTransientStatusProvider implements ITransientStatusProvider {

    private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = new HashSet<>(
            Arrays.asList(UsecasePackage.Literals.ACTOR__ABSTRACT, UsecasePackage.Literals.USE_CASE__ABSTRACT));
    private static final Set<EStructuralFeature> TRANSIENT_FEATURES = new HashSet<>();

    @Override
    public boolean isFeatureConsideredTransient(EStructuralFeature feature) {
        return TRANSIENT_FEATURES.contains(feature);
    }

    @Override
    public boolean isFeatureConsideredNonTransient(EStructuralFeature feature) {
        return NON_TRANSIENT_FEATURES.contains(feature);
    }

}
