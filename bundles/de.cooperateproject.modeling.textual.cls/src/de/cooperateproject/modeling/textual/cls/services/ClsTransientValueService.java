package de.cooperateproject.modeling.textual.cls.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

@SuppressWarnings("restriction")
public class ClsTransientValueService extends DefaultTransientValueService implements ITransientValueService {

    private static final Set<EStructuralFeature> TRANSIENT_FEATURES = createTransientFeaturesSet();
    private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = createNonTransientFeatureSet();

    @Inject
    private LegacyTransientValueService S2;

    @Override
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        return !owner.eIsSet(feature) || isContainerReferenceInSameResource(owner, feature) || isClsTransient(feature);
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
            return ValueTransient.PREFERABLY;
        }
        return result;
    }

    private static boolean isClsTransient(EStructuralFeature feature) {
        return TRANSIENT_FEATURES.contains(feature);
    }

    private static Set<EStructuralFeature> createNonTransientFeatureSet() {
        return new HashSet<>(Arrays.asList(ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES,
                ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES,
                // ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES,
                ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES,
                ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND,
                ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY));
    }

    private static Set<EStructuralFeature> createTransientFeaturesSet() {
        return new HashSet<>(Arrays.asList(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT,
                ClsPackage.Literals.ASSOCIATION__MEMBER_ENDS,
                ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES));
    }

}
