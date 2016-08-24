package de.cooperateproject.util.eclipse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ExtensionPointHelper {

	public static <T> Collection<T> getExtensions(String extensionPointId, String extensionAttributeName, Class<T> extensionType) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(extensionPointId);
		Set<T> extensions = Arrays.asList(config).stream()
				.map(c -> convert(c, extensionAttributeName, extensionType)).filter(f -> f.isPresent()).map(f -> f.get())
				.collect(Collectors.toSet());
		return extensions;
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
