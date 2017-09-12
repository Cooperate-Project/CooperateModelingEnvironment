package de.cooperateproject.modeling.transformation.common.impl.postprocessors;

import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;

public abstract class PostProcessorBase implements PostProcessor {

	private final int priority;

	protected PostProcessorBase(int priority) {
		this.priority = priority;
	}

	@Override
	public int getPriority() {
		return priority;
	}

	@Override
	public int compareTo(PostProcessor o) {
		return o.getPriority() - this.getPriority();
	}

}
