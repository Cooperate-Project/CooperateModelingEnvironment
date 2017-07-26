package de.cooperateproject.modeling.textual.cls.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

/**
 * Transient status provider for class diagrams.
 */
public class ClsTransientStatusProvider implements ITransientStatusProvider {

    private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = new HashSet<>(
            Arrays.asList(ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES,
                    ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES,
                    ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES,
                    ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND,
                    ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY,
                    ClsPackage.Literals.CLASS__ABSTRACT, ClsPackage.Literals.METHOD__ABSTRACT,
                    ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE,
                    ClsPackage.Literals.MEMBER__STATIC, ClsPackage.Literals.TYPED_CONNECTOR__LEFT,
                    ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, ClsPackage.Literals.PROPERTY__TYPE));

    private static final Set<EStructuralFeature> TRANSIENT_FEATURES = new HashSet<>(
            Arrays.asList(ClsPackage.Literals.ASSOCIATION__MEMBER_ENDS,
                    ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES));

    @Override
    public boolean isFeatureConsideredTransient(EStructuralFeature feature) {
        return TRANSIENT_FEATURES.contains(feature);
    }

    @Override
    public boolean isFeatureConsideredNonTransient(EStructuralFeature feature) {
        return NON_TRANSIENT_FEATURES.contains(feature);
    }

}
