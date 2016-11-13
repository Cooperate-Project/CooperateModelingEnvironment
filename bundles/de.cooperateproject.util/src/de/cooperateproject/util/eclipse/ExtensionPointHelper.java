package de.cooperateproject.util.eclipse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ExtensionPointHelper {

	interface AttributeProvider {
		Map<String, String> getAttributes(IConfigurationElement config);
	}
	
	public static <T> Collection<T> getExtensions(String extensionPointId, String extensionAttributeName, Class<T> extensionType) {
		Collection<Pair<T, Map<String, String>>> extensions = getExtensions(extensionPointId, extensionAttributeName, extensionType, new String[0]);
		return extensions.stream().map(Pair::getKey).collect(Collectors.toSet());
	}
	
	public static <T> Collection<Pair<T, Map<String, String>>> getExtensions(String extensionPointId, String extensionAttributeName, Class<T> extensionType, String... relevantAttributeIds) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null) {
			return Collections.emptyList();
		}
		IConfigurationElement[] config = registry.getConfigurationElementsFor(extensionPointId);
		Set<Pair<T, Map<String, String>>> extensions = Arrays.asList(config).stream()
				.map(c -> convert(c, extensionAttributeName, extensionType, relevantAttributeIds)).filter(Objects::nonNull).collect(Collectors.toSet());
		return extensions;
	}
	
	private static <T> Pair<T, Map<String, String>> convert(IConfigurationElement c, String extensionAttributeName, Class<T> extensionType,
			String[] relevantAttributeIds) {
		Optional<T> extensionObject = convert(c, extensionAttributeName, extensionType);
		Map<String, String> attributes = Arrays.stream(relevantAttributeIds).collect(Collectors.toMap(a -> a, a -> c.getAttribute(a)));		
		if (!extensionObject.isPresent()) {
			return null;
		}
		return Pair.of(extensionObject.get(), attributes);
	}
	
	@SuppressWarnings("unchecked")
	private static <T> Optional<T> convert(IConfigurationElement configurationElement, String extensionAttributeName, Class<T> extensionType) {
		try {
			final Object o = configurationElement.createExecutableExtension(extensionAttributeName);
			if (o != null && extensionType.isAssignableFrom(o.getClass())) {
				return Optional.of((T) o);
			}
			return Optional.empty();
		} catch (CoreException ex) {
			return Optional.empty();
		}
	}
	
}
