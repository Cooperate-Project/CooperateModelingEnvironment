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

@SuppressWarnings("restriction")
public class BasicCooperateTransientValueService extends DefaultTransientValueService
        implements ITransientValueService {

    private final Set<EStructuralFeature> TRANSIENT_FEATURES = createTransientFeaturesSet();
    private final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = createNonTransientFeatureSet();

    @Inject
    private LegacyTransientValueService S2;

    @Override
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        return !owner.eIsSet(feature) || isContainerReferenceInSameResource(owner, feature) || isTransient(feature);
    }

    @Override
    public ListTransient isListTransient(EObject semanticObject, EStructuralFeature feature) {
        return S2.isListTransient(semanticObject, feature);
    }

    @Override
    public boolean isValueInListTransient(EObject semanticObject, int index, EStructuralFeature feature) {
        return S2.isValueInListTransient(semanticObject, index, feature);
    }

    @Override
    public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
        ValueTransient result = S2.isValueTransient(semanticObject, feature);
        if (result == ValueTransient.YES && NON_TRANSIENT_FEATURES.contains(feature)) {
            if (semanticObject.eIsSet(feature)) {
                return ValueTransient.PREFERABLY;
            } else {
                return ValueTransient.YES;
            }
        }
        return result;
    }

    private boolean isTransient(EStructuralFeature feature) {
        return TRANSIENT_FEATURES.contains(feature);
    }

    protected Set<EStructuralFeature> createNonTransientFeatureSet() {
        return new HashSet<>();
    }

    protected Set<EStructuralFeature> createTransientFeaturesSet() {
        return new HashSet<>(Arrays.asList(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT));
    }
}
