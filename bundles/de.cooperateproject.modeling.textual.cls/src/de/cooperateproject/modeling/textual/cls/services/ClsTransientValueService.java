package de.cooperateproject.modeling.textual.cls.services;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.common.services.BasicCooperateTransientValueService;

/**
 * Specialized version of the transient value service that can handle class diagram specific features.
 */
public class ClsTransientValueService extends BasicCooperateTransientValueService {

    @Override
    protected Set<EStructuralFeature> createNonTransientFeatureSet() {
        return Stream.concat(Arrays.asList(ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES,
                ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES,
                // ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES,
                ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES,
                ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND,
                ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY).stream(),

                super.createNonTransientFeatureSet().stream()).collect(Collectors.toSet());

    }

    @Override
    protected Set<EStructuralFeature> createTransientFeaturesSet() {
        return Stream.concat(
                Arrays.asList(ClsPackage.Literals.ASSOCIATION__MEMBER_ENDS,
                        ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES).stream(),
                super.createTransientFeaturesSet().stream()).collect(Collectors.toSet());

    }

}
