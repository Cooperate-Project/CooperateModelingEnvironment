package de.cooperateproject.modeling.transformation.tests.commons.utils;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;

public abstract class NOPPostProcessor implements IPostProcessor {

	@Override
	public void postMatch(Comparison comparison, Monitor monitor) {
		return;
	}

	@Override
	public void postDiff(Comparison comparison, Monitor monitor) {
		return;
	}

	@Override
	public void postRequirements(Comparison comparison, Monitor monitor) {
		return;
	}

	@Override
	public void postEquivalences(Comparison comparison, Monitor monitor) {
		return;
	}

	@Override
	public void postConflicts(Comparison comparison, Monitor monitor) {
		return;
	}

	@Override
	public void postComparison(Comparison comparison, Monitor monitor) {
		return;
	}

}
