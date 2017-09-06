package de.cooperateproject.ui.modelcreator;

import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Registry for {@link ISupplementaryModelCreator} that have been registered via the according extension point.
 */
public enum SupplementaryModelCreatorRegistry {
    INSTANCE;

    /**
     * @return The instance of the registry.
     */
    public static SupplementaryModelCreatorRegistry getInstance() {
        return INSTANCE;
    }

    private static final String EP_ID = "de.cooperateproject.ui.modelcreator.supplementarymodelcreator";
    private static final String EP_ATTR = "class";
    private final Collection<ISupplementaryModelCreator> modelCreators;

    private SupplementaryModelCreatorRegistry() {
        modelCreators = initModelCreators();
    }

    private static Collection<ISupplementaryModelCreator> initModelCreators() {
        return Collections.unmodifiableCollection(
                ExtensionPointHelper.getExtensions(EP_ID, EP_ATTR, ISupplementaryModelCreator.class));
    }

    /**
     * @return All registered post processors.
     */
    public Collection<ISupplementaryModelCreator> getSupplementaryModelCreators() {
        return modelCreators;
    }
}
