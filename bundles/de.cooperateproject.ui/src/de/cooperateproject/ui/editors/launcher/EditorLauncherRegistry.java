package de.cooperateproject.ui.editors.launcher;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.util.ConversionUtils;

public enum EditorLauncherRegistry {

	INSTANCE;

	private static final String EXTENSION_ID = "de.cooperateproject.ui.editors.launcher.extensions.editorlauncher";
	private final Collection<IEditorLauncherFactory> factories = Sets.newHashSet();
	private boolean initialized = false;

	public static EditorLauncherRegistry getInstance() {
		return INSTANCE;
	}

	public Optional<IEditorLauncherFactory> getFactory(EditorType editorType) {
		synchronized (factories) {
			if (!initialized) {
				fillFactories();
			}
			return ConversionUtils
					.convert(Iterables.tryFind(factories, f -> editorType.equals(f.getSupportedEditorType())));
		}
	}

	private void fillFactories() {
		synchronized (factories) {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IConfigurationElement[] config = registry.getConfigurationElementsFor(EXTENSION_ID);
			Set<IEditorLauncherFactory> extensions = Arrays.asList(config).stream()
					.map(EditorLauncherRegistry::processConfigurationElement).filter(f -> f != null)
					.collect(Collectors.toSet());
			this.factories.addAll(extensions);
			initialized = true;
		}
	}

	private static IEditorLauncherFactory processConfigurationElement(IConfigurationElement e) {
		try {
			final Object o = e.createExecutableExtension("class");
			if (o instanceof IEditorLauncherFactory) {
				return (IEditorLauncherFactory) o;
			}
			return null;
		} catch (CoreException ex) {
			return null;
		}

	}

}
