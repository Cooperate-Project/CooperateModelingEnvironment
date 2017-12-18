package de.cooperateproject.modeling.transformation.common;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.IDiagramType;

public class TransformationCharacteristic {

    private final IDiagramType diagramType;
    private final ConcreteSyntaxTypes from;
    private final ConcreteSyntaxTypes to;

    public TransformationCharacteristic(IDiagramType diagramType, ConcreteSyntaxTypes from, ConcreteSyntaxTypes to) {
        super();
        this.diagramType = diagramType;
        this.from = from;
        this.to = to;
    }

    public IDiagramType getDiagramType() {
        return diagramType;
    }

    public ConcreteSyntaxTypes getFrom() {
        return from;
    }

    public ConcreteSyntaxTypes getTo() {
        return to;
    }

    public TransformationCharacteristic inverse() {
        return new TransformationCharacteristic(diagramType, to, from);
    }

}
