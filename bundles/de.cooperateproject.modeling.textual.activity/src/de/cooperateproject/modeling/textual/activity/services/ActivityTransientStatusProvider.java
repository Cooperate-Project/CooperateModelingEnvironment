package de.cooperateproject.modeling.textual.activity.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;

public class ActivityTransientStatusProvider implements ITransientStatusProvider {

	private static final Set<EStructuralFeature> NON_TRANSIENT_FEATURES = new HashSet<>(
			Arrays.asList(ActPackage.Literals.FLOW__SOURCE, ActPackage.Literals.FLOW__TARGET));

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
