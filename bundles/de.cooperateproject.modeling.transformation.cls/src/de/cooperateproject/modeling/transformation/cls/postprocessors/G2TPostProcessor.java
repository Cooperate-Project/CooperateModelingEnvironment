package de.cooperateproject.modeling.transformation.cls.postprocessors;

import de.cooperateproject.modeling.transformation.common.impl.postprocessors.ContentIteratingPostProcessor;

public class G2TPostProcessor extends ContentIteratingPostProcessor {

	public G2TPostProcessor() {
		super(50, ClsPostProcessingSwitch::new);
	}

}
