package de.cooperateproject.modeling.transformation.registry;

import java.util.Collection;
import java.util.Map;

import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;

@FunctionalInterface
public interface InjectPostProcessors {

    void setPostProcessors(Map<PostProcessorDirection, Collection<PostProcessor>> postProcessors);

}
