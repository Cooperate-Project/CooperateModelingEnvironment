package de.cooperateproject.modeling.transformation.activity;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.ContentIteratingPostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.switches.NotationPostProcessingSwitch;
import de.cooperateproject.modeling.transformation.registry.BidirectionalTransformationFactoryWithInjectedContext;

public class ActivityTransformationFactory extends BidirectionalTransformationFactoryWithInjectedContext {

	private Collection<PostProcessor> t2gProcessors;

	public ActivityTransformationFactory() {
		super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.ACTIVITY).get(), "notation");
	}

	@Override
	protected Collection<PostProcessor> getTextualToGraphicalPostProcessors() {
		if (t2gProcessors == null) {
			t2gProcessors = Collections.unmodifiableCollection(
					Arrays.asList(new ContentIteratingPostProcessor(50, NotationPostProcessingSwitch::new)));
		}
		return t2gProcessors;
	}

}
