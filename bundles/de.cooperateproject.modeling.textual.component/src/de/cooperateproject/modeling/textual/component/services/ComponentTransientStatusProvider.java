package de.cooperateproject.modeling.textual.component.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.component.component.ComponentPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

public class ComponentTransientStatusProvider implements ITransientStatusProvider {

    private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = new HashSet<>( Arrays.asList(
    		ComponentPackage.Literals.INTERFACE_RELATION__INTERFACE,
    		ComponentPackage.Literals.PORT__CONJUGATED,
    		ComponentPackage.Literals.PORT__REALIZED_CLASSIFIER,
    		ComponentPackage.Literals.CONNECTOR_END__PART,
    		ComponentPackage.Literals.CONNECTOR_END__ROLE,
    		ComponentPackage.Literals.PROPERTY__TYPE,
    		ComponentPackage.Literals.PROPERTY__STATIC,
    		ComponentPackage.Literals.METHOD__ABSTRACT,
    		ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER,
    		ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER
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
