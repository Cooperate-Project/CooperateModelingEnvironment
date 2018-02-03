package de.cooperateproject.modeling.textual.component.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

public class ComponentTransientStatusProvider implements ITransientStatusProvider {

    private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = new HashSet<>( Arrays.asList(
    		CmpPackage.Literals.INTERFACE_RELATION__INTERFACE,
    		CmpPackage.Literals.PORT__CONJUGATED,
    		CmpPackage.Literals.PORT__REALIZED_CLASSIFIER,
    		CmpPackage.Literals.CONNECTOR_END__PART,
    		CmpPackage.Literals.CONNECTOR_END__ROLE,
    		CmpPackage.Literals.PROPERTY__TYPE,
    		CmpPackage.Literals.PROPERTY__STATIC,
    		CmpPackage.Literals.METHOD__ABSTRACT,
    		CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER,
    		CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER
    		));

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
