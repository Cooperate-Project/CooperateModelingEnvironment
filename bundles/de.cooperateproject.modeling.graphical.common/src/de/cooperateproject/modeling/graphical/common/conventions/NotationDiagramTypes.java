package de.cooperateproject.modeling.graphical.common.conventions;

import java.util.Arrays;
import java.util.Optional;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public enum NotationDiagramTypes {

    CLASS(DiagramTypes.CLASS, "PapyrusUMLClassDiagram"),
    USECASE(DiagramTypes.USECASE, "UseCase"),
    ACTIVITY(DiagramTypes.ACTIVITY, "PapyrusUMLActivityDiagram"),
    SEQUENCE(DiagramTypes.SEQUENCE, "PapyrusUMLSequenceDiagram"),
    COMPONENT(DiagramTypes.COMPONENT, "PapyrusUMLComponentDiagram"),
    STATE(DiagramTypes.STATE, "PapyrusUMLStateMachineDiagram");

    private final DiagramTypes diagramType;
    private final String notationDiagramType;

    private NotationDiagramTypes(DiagramTypes diagramType, String notationDiagramType) {
        this.diagramType = diagramType;
        this.notationDiagramType = notationDiagramType;
    }

    public DiagramTypes getDiagramType() {
        return diagramType;
    }

    public String getNotationDiagramType() {
        return notationDiagramType;
    }

    public static Optional<NotationDiagramTypes> getByDiagramType(DiagramTypes diagramType) {
        return Arrays.stream(values()).filter(x -> x.getDiagramType() == diagramType).findFirst();
    }

    public static Optional<NotationDiagramTypes> getByNotationDiagramType(String notationDiagramType) {
        return Arrays.stream(values()).filter(x -> x.getNotationDiagramType().equals(notationDiagramType)).findFirst();
    }
}
