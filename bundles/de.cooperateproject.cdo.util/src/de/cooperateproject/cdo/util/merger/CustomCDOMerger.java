package de.cooperateproject.cdo.util.merger;

import org.eclipse.emf.cdo.common.revision.delta.CDORevisionDelta;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOSetFeatureDeltaImpl;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;
import org.eclipse.emf.spi.cdo.DefaultCDOMerger.PerFeature.ManyValued;

@SuppressWarnings("restriction")
public class CustomCDOMerger extends ManyValued {

	@Override
	protected boolean merge(Object targetData, Object sourceData) {
		fixNIL(targetData);
		fixNIL(sourceData);
		return super.merge(targetData, sourceData);
	}

	private static void fixNIL(Object unknownData) {
		if (unknownData instanceof CDORevisionDelta) {
			CDORevisionDelta data = (CDORevisionDelta) unknownData;
			data.getFeatureDeltas().stream().filter(CDOSetFeatureDeltaImpl.class::isInstance)
					.map(CDOSetFeatureDeltaImpl.class::cast).forEach(CustomCDOMerger::fixNIL);
		}
	}

	private static void fixNIL(CDOSetFeatureDeltaImpl delta) {
		if (delta.getValue() == DynamicValueHolder.NIL) {
			delta.setValue(null);
		}
	}
}
