package de.cooperateproject.ui.focus.internal.model;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.ui.focus.filter.IElementFilter;
import de.cooperateproject.ui.focus.filter.IElementFilterWithSubject;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum InternalElementFilterRegistry {

    INSTANCE;

    private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.focus.filter.elementfilter";
    private static final String EXTENSION_POINT_ATTRIBUTE = "class";
    private final Map<DiagramTypes, IElementFilter> factories;

    public static InternalElementFilterRegistry getInstance() {
        return INSTANCE;
    }

    private InternalElementFilterRegistry() {
        factories = getRegisteredFactories();
    }

    private Map<DiagramTypes, IElementFilter> getRegisteredFactories() {
        Collection<IElementFilterWithSubject> elementFilters = ExtensionPointHelper.getExtensions(EXTENSION_POINT_ID,
                EXTENSION_POINT_ATTRIBUTE, IElementFilterWithSubject.class);
        return elementFilters.stream().collect(Collectors.groupingBy(IElementFilterWithSubject::getCoveredDiagramType))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> new GroupedElementFilter(e.getValue())));

    }

    public Optional<IElementFilter> getElementFilterBy(DiagramTypes diagramType) {
        return Optional.ofNullable(factories.getOrDefault(diagramType, null));
    }

}
