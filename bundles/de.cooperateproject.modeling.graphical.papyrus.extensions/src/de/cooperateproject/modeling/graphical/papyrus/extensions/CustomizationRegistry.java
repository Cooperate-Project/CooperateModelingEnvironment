package de.cooperateproject.modeling.graphical.papyrus.extensions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Registry for Customization elements that are contributed via extension
 * points.
 */
public enum CustomizationRegistry {
    INSTANCE;

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.modeling.graphical.papyrus.extensions.PaletteCustomization";
    private static final String CLASS_ATTRIBUTE_ID = "class";
    private final Set<IPaletteCustomization> paletteCustomizations;

    public Set<IPaletteCustomization> getPaletteCustomizations() {
        return paletteCustomizations;
    }

    private CustomizationRegistry() {
        paletteCustomizations = findPaletteCustomizations();
    }

    private static Set<IPaletteCustomization> findPaletteCustomizations() {
        Collection<IPaletteCustomization> extensions = ExtensionPointHelper.getExtensions(EXTENSION_POINT_ID,
                CLASS_ATTRIBUTE_ID, IPaletteCustomization.class);
        return new HashSet<IPaletteCustomization>(extensions);
    }

    public static CustomizationRegistry getInstance() {
        return INSTANCE;
    }
}
