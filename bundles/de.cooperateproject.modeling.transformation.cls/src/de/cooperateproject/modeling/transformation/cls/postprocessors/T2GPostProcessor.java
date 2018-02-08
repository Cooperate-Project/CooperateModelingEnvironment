package de.cooperateproject.modeling.transformation.cls.postprocessors;

import de.cooperateproject.modeling.transformation.common.impl.postprocessors.ContentIteratingPostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.postprocessors.switches.NotationPostProcessingSwitch;

public class T2GPostProcessor extends ContentIteratingPostProcessor {

	public T2GPostProcessor() {
		super(50, NotationPostProcessingSwitch::new);
	}

}
