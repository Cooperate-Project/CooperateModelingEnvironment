package de.cooperateproject.ui.diff.cls.labelhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.ui.diff.labeling.LabelHandler;

/**
 * Label provider for {@link EStructuralFeature} elements that belong to the class diagram.
 */
public class ClsEStructuralFeatureLabelProvider implements LabelHandler {

	private static final Map<EStructuralFeature, String> LABELS = createLabelMap();

	@Override
	public String getText(Object item) {
		Optional<String> superResult = Optional.ofNullable(LabelHandler.super.getText(item));
		if (superResult.isPresent()) {
			return superResult.get();
		}

		return findText(item);
	}

	private static String findText(Object item) {
		Optional<String> result = Optional.ofNullable(item).filter(AggregationKind.class::isInstance)
				.map(AggregationKind.class::cast).map(ClsEStructuralFeatureLabelProvider::findText);
		if (result.isPresent()) {
			return result.get();
		}

		return null;
	}

	private static String findText(AggregationKind kind) {
		switch (kind) {
		case AGGREGATION:
			return "agg";
		case COMPOSITION:
			return "com";
		case NONE:
			return "asc";
		}
		return null;
	}

	@Override
	public String getText(EObject item) {
		return null;
	}

	@Override
	public String getClassText(EObject item) {
		return Optional.of(item).filter(EStructuralFeature.class::isInstance).map(EStructuralFeature.class::cast)
				.map(LABELS::get).orElse(null);
	}

	private static Map<EStructuralFeature, String> createLabelMap() {
		Map<EStructuralFeature, String> result = new HashMap<>();
		result.put(ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, "aggregationKind");
		return result;
	}

}
