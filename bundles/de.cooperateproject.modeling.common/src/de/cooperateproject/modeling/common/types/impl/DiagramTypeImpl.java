package de.cooperateproject.modeling.common.types.impl;

import de.cooperateproject.modeling.common.types.IDiagramType;

public class DiagramTypeImpl implements IDiagramType {

    private final String name;
    private final String textualFileExtension;
    private final String textualEditorId;
    private final String papyrusDiagramKind;
    private final String papyrusDiagramType;

    public DiagramTypeImpl(String name, String textualFileExtension, String textualEditorId, String papyrusDiagramKind,
            String papyrusDiagramType) {
        super();
        this.name = name;
        this.textualFileExtension = textualFileExtension;
        this.textualEditorId = textualEditorId;
        this.papyrusDiagramKind = papyrusDiagramKind;
        this.papyrusDiagramType = papyrusDiagramType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTextualFileExtension() {
        return textualFileExtension;
    }

    public String getTextualEditorId() {
        return textualEditorId;
    }

    @Override
    public String getPapyrusDiagramKindId() {
        return papyrusDiagramKind;
    }

    @Override
    public String getPapyrusDiagramType() {
        return papyrusDiagramType;
    }

}
