package de.cooperateproject.util.eclipse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for handling extensions registered for an extension point.
 */
public final class ExtensionPointHelper {

    @FunctionalInterface
    private interface AttributeProvider {
        /**
         * Gathers attributes from a configuration element. All attributes are represented as strings.
         * 
         * @param config
         *            The configuration element for deriving the attributes.
         * @return A map from attribute name to value.
         */
        Map<String, String> getAttributes(IConfigurationElement config);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtensionPointHelper.class);

    /**
     * Instantiates and returns an executable extension.
     * 
     * @param extensionPointId
     *            The extension point id of the extension.
     * @param extensionAttributeName
     *            The attribute name of the executable extension element.
     * @param extensionType
     *            The type of the executable extension.
     * @return The executable extension or <code>null</code> in case of an error.
     */
    public static <T> Collection<T> getExtensions(String extensionPointId, String extensionAttributeName,
            Class<T> extensionType) {
        Collection<Pair<T, Map<String, String>>> extensions = getExtensions(extensionPointId, extensionAttributeName,
                extensionType, new String[0]);
        return extensions.stream().map(Pair::getKey).collect(Collectors.toSet());
    }

    /**
     * Instantiates and returns an executable extension as well as a selected set of according attributes.
     * 
     * @param extensionPointId
     *            The extension point id of the extension.
     * @param extensionAttributeName
     *            The attribute name of the executable extension element.
     * @param extensionType
     *            The type of the executable extension.
     * @param relevantAttributeIds
     *            The IDs of all attributes that shall be gathered.
     * @return The extension and its attributes or an empty collection in case of an error.
     */
    public static <T> Collection<Pair<T, Map<String, String>>> getExtensions(String extensionPointId,
            String extensionAttributeName, Class<T> extensionType, String... relevantAttributeIds) {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        if (registry == null) {
            return Collections.emptyList();
        }
        IConfigurationElement[] config = registry.getConfigurationElementsFor(extensionPointId);
        return Arrays.asList(config).stream()
                .map(c -> convert(c, extensionAttributeName, extensionType, relevantAttributeIds))
                .filter(Objects::nonNull).collect(Collectors.toSet());
    }

    private static <T> Pair<T, Map<String, String>> convert(IConfigurationElement c, String extensionAttributeName,
            Class<T> extensionType, String[] relevantAttributeIds) {
        Optional<T> extensionObject = convert(c, extensionAttributeName, extensionType);
        Map<String, String> attributes = Arrays.stream(relevantAttributeIds)
                .collect(Collectors.toMap(a -> a, c::getAttribute));
        if (!extensionObject.isPresent()) {
            return null;
        }
        return Pair.of(extensionObject.get(), attributes);
    }

    @SuppressWarnings("unchecked")
    public static <T> Optional<T> convert(IConfigurationElement configurationElement, String extensionAttributeName,
            Class<T> extensionType) {
        try {
            final Object o = configurationElement.createExecutableExtension(extensionAttributeName);
            if (o != null && extensionType.isAssignableFrom(o.getClass())) {
                return Optional.of((T) o);
            }
            return Optional.empty();
        } catch (CoreException ex) {
            LOGGER.error("Could not gather the executable configuration.", ex);
            return Optional.empty();
        }
    }

}
