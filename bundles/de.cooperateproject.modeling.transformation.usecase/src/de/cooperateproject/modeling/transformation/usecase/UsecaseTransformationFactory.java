package de.cooperateproject.modeling.transformation.usecase;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.common.impl.InjectedURIResolvingTransformationFactory;
import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.ContentIteratingPostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.switches.NotationPostProcessingSwitch;

public class UsecaseTransformationFactory extends InjectedURIResolvingTransformationFactory {

	private Collection<PostProcessor> t2gProcessors;

	public UsecaseTransformationFactory() {
		super(NotationDiagramTypes.USECASE, "notation", "uc");
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
