package de.cooperateproject.ui.modelcreator;

import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Registry for {@link IModelCreatorPostProcessor} that have been registered via the according extension point.
 */
public enum ModelCreatorPostProcessorRegistry {
    INSTANCE;

    /**
     * @return The instance of the registry.
     */
    public static ModelCreatorPostProcessorRegistry getInstance() {
        return INSTANCE;
    }

    private static final String EP_ID = "de.cooperateproject.ui.modelcreator.postprocessor";
    private static final String EP_ATTR = "class";
    private final Collection<IModelCreatorPostProcessor> postProcessors;

    private ModelCreatorPostProcessorRegistry() {
        postProcessors = initPostProcessors();
    }

    private static Collection<IModelCreatorPostProcessor> initPostProcessors() {
        return Collections.unmodifiableCollection(
                ExtensionPointHelper.getExtensions(EP_ID, EP_ATTR, IModelCreatorPostProcessor.class));
    }

    /**
     * @return All registered post processors.
     */
    public Collection<IModelCreatorPostProcessor> getPostProcessors() {
        return postProcessors;
    }
}
