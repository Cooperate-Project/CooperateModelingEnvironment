package de.cooperateproject.ui.editors.launcher;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import com.google.common.collect.Iterables;

import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.util.ConversionUtils;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Registry for {@link IEditorLauncherFactory} elements available from extension points.
 */
public enum EditorLauncherRegistry {

    INSTANCE;

    private static final String EXTENSION_ID = "de.cooperateproject.ui.editors.launcher.extensions.editorlauncher";
    private static final String EXTENSION_ATTRIBUTE = "class";
    private final Collection<IEditorLauncherFactory> factories;

    private EditorLauncherRegistry() {
        factories = ExtensionPointHelper.getExtensions(EXTENSION_ID, EXTENSION_ATTRIBUTE, IEditorLauncherFactory.class);
    }

    public static EditorLauncherRegistry getInstance() {
        return INSTANCE;
    }

    /**
     * Find a factory for the given editor type.
     * 
     * @param editorType
     *            The editor type that the factory shall support.
     * @return The found factory or {@link Optional#empty()} otherwise.
     */
    public Optional<IEditorLauncherFactory> getFactory(EditorType editorType) {
        return ConversionUtils
                .convert(Iterables.tryFind(factories, f -> editorType.equals(f.getSupportedEditorType())));
    }

    /**
     * @return All available factories.
     */
    public Collection<IEditorLauncherFactory> getFactories() {
        return Collections.unmodifiableCollection(factories);
    }

}
