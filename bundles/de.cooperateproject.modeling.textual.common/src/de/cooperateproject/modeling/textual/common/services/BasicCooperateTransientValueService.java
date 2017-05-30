package de.cooperateproject.modeling.textual.common.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

/**
 * Transient value service that includes special handling for transient structural features.
 * 
 * Even if features are transient in the meta model, they might be required for the serialization of the model. The
 * values might originate from state calculators. This service holds sets of features that shall not be treated
 * transient even if they are transient in the model. On the other side, there might be features that are not transient
 * but most not be serialized because they hold internal state. The service can handle them as well.
 * 
 * This class can be extended by overriding
 * {@link BasicCooperateTransientValueService#createNonTransientFeatureSet()} and
 * {@link BasicCooperateTransientValueService#createTransientFeaturesSet()}.
 */
@SuppressWarnings("restriction")
public class BasicCooperateTransientValueService extends DefaultTransientValueService
        implements ITransientValueService {

    private final Set<EStructuralFeature> transientFeatures = createTransientFeaturesSet();
    private final Set<EStructuralFeature> nonTransientFeatures = createNonTransientFeatureSet();

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
        if (result == ValueTransient.YES && nonTransientFeatures.contains(feature)) {
            if (semanticObject.eIsSet(feature)) {
                return ValueTransient.PREFERABLY;
            } else {
                return ValueTransient.YES;
            }
        }
        return result;
    }

    private boolean isTransient(EStructuralFeature feature) {
        return transientFeatures.contains(feature);
    }

    protected Set<EStructuralFeature> createNonTransientFeatureSet() {
        return new HashSet<>(Arrays.asList(TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME,
                TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS,
                TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY,
                TextualCommonsPackage.Literals.COMMENT__BODY));
    }

    protected Set<EStructuralFeature> createTransientFeaturesSet() {
        return new HashSet<>(Arrays.asList(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT));
    }
}
