package de.cooperateproject.modeling.common.types;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import de.cooperateproject.modeling.common.types.impl.DiagramTypeImpl;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum DiagramTypeRegistry {

    INSTANCE;

    private static final String EP_ID = "de.cooperateproject.modeling.common.types";
    private static final String EP_ATTR_NAME = "name";
    private static final String EP_ATTR_TXT_EXT = "textualFileExtension";
    private static final String EP_ATTR_TXT_ID = "textualEditorId";
    private static final String EP_ATTR_PAP_KIND = "papyrusDiagramKind";
    private static final String EP_ATTR_PAP_TYPE = "papyrusDiagramType";

    private final Collection<IDiagramType> types;

    private DiagramTypeRegistry() {
        types = Collections.unmodifiableCollection(getTypesFromExtensionPoint());
    }

    public static DiagramTypeRegistry getInstance() {
        return INSTANCE;
    }

    public Optional<IDiagramType> getByName(String name) {
        return types.stream().filter(t -> t.getName().equals(name)).findFirst();
    }

    public Optional<IDiagramType> getByFileExtension(String fileExtension) {
        return types.stream().filter(x -> x.getTextualFileExtension().equals(fileExtension)).findFirst();
    }

    public Optional<IDiagramType> getByNotationDiagramType(String notationDiagramType) {
        return types.stream().filter(x -> x.getPapyrusDiagramType().equals(notationDiagramType)).findFirst();
    }

    public Optional<IDiagramType> getByTextualEditorId(String textualEditorId) {
        return types.stream().filter(x -> x.getTextualEditorId().equals(textualEditorId)).findFirst();
    }

    @Deprecated
    public Optional<IDiagramType> getByDiagramTypeDeprecated(DiagramTypesDeprecated diagramType) {
        return getByName(diagramType.getName());
    }

    private static Collection<IDiagramType> getTypesFromExtensionPoint() {
        Collection<Map<String, String>> extensions = ExtensionPointHelper.getExtensions(EP_ID,
                new String[] { EP_ATTR_NAME, EP_ATTR_TXT_EXT, EP_ATTR_PAP_KIND, EP_ATTR_PAP_TYPE });
        return extensions.stream().map(DiagramTypeRegistry::create).collect(Collectors.toList());
    }

    private static IDiagramType create(Map<String, String> attributes) {
        String name = attributes.get(EP_ATTR_NAME);
        String textualFileExtension = attributes.get(EP_ATTR_TXT_EXT);
        String textualEditorId = attributes.get(EP_ATTR_TXT_ID);
        String papyrusDiagramKind = attributes.get(EP_ATTR_PAP_KIND);
        String papyrusDiagramType = attributes.get(EP_ATTR_PAP_TYPE);
        return new DiagramTypeImpl(name, textualFileExtension, textualEditorId, papyrusDiagramKind, papyrusDiagramType);
    }
}
