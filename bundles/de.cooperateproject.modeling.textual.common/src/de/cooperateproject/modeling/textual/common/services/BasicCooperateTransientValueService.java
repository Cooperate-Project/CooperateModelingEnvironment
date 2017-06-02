package de.cooperateproject.modeling.textual.common.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

/**
 * Transient value service that includes special handling for transient structural features.
 * 
 * Even if features are transient in the meta model, they might be required for the serialization of the model. The
 * values might originate from state calculators. This service holds sets of features that shall not be treated
 * transient even if they are transient in the model. On the other side, there might be features that are not transient
 * but most not be serialized because they hold internal state. The service can handle them as well.
 * 
 * Whether a feature is considered transient or not can be defined by implementing an {@link ITransientStatusProvider}
 * and using the according extension point.
 */
@SuppressWarnings("restriction")
public class BasicCooperateTransientValueService extends DefaultTransientValueService
        implements ITransientValueService {

    @Inject
    private ITransientStatusProvider transientStatusProvider;

    @Inject
    private LegacyTransientValueService legacyService;

    @Override
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        return !owner.eIsSet(feature) || isContainerReferenceInSameResource(owner, feature) || isTransient(feature);
    }

    @Override
    public ListTransient isListTransient(EObject semanticObject, EStructuralFeature feature) {
        return legacyService.isListTransient(semanticObject, feature);
    }

    @Override
    public boolean isValueInListTransient(EObject semanticObject, int index, EStructuralFeature feature) {
        return legacyService.isValueInListTransient(semanticObject, index, feature);
    }

    @Override
    public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
        ValueTransient result = legacyService.isValueTransient(semanticObject, feature);
        if (result == ValueTransient.YES && transientStatusProvider.isFeatureConsideredNonTransient(feature)) {
            if (semanticObject.eIsSet(feature)) {
                return ValueTransient.PREFERABLY;
            } else {
                return ValueTransient.YES;
            }
        }
        return result;
    }

    private boolean isTransient(EStructuralFeature feature) {
        return transientStatusProvider.isFeatureConsideredTransient(feature);
    }

}
