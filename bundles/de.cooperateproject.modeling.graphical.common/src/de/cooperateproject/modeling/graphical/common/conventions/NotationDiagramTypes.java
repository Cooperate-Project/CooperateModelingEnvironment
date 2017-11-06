package de.cooperateproject.modeling.graphical.common.conventions;

import java.util.Arrays;
import java.util.Optional;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public enum NotationDiagramTypes {

    CLASS(DiagramTypes.CLASS, "PapyrusUMLClassDiagram", "org.eclipse.papyrus.uml.diagram.class"),
    USECASE(DiagramTypes.USECASE, "UseCase", "org.eclipse.papyrus.uml.diagram.useCase"),
    ACTIVITY(DiagramTypes.ACTIVITY, "PapyrusUMLActivityDiagram", "org.eclipse.papyrus.uml.diagram.activity"),
    SEQUENCE(DiagramTypes.SEQUENCE, "PapyrusUMLSequenceDiagram", "org.eclipse.papyrus.uml.diagram.sequence"),
    STATE(DiagramTypes.STATE, "PapyrusUMLStateMachineDiagram", "org.eclipse.papyrus.uml.diagram.stateMachine"),
    COMPONENT(DiagramTypes.COMPONENT, "PapyrusUMLComponentDiagram",
            "org.eclipse.papyrus.uml.diagram.component.root.component");

    private final DiagramTypes diagramType;
    private final String notationDiagramType;
    private final String diagramKindId;

    private NotationDiagramTypes(DiagramTypes diagramType, String notationDiagramType, String diagramKindId) {
        this.diagramType = diagramType;
        this.notationDiagramType = notationDiagramType;
        this.diagramKindId = diagramKindId;
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

    public String getPapyrusDiagramKindId() {
        return diagramKindId;
    }
}
