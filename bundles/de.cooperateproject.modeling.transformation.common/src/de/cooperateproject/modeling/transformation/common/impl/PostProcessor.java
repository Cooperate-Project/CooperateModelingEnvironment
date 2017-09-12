package de.cooperateproject.modeling.transformation.common.impl;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

public interface PostProcessor extends Comparable<PostProcessor>{
 
	public int getPriority();
	
	public void process (Collection<ModelExtent> transformationParameters, Optional<Trace> transformationTrace);
	
}
