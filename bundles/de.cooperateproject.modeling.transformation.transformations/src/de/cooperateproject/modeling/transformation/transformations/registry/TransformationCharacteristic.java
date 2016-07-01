package de.cooperateproject.modeling.transformation.transformations.registry;

public class TransformationCharacteristic {

	private final DiagramTypes diagramType;
	private final ConcreteSyntaxTypes from;
	private final ConcreteSyntaxTypes to;

	public TransformationCharacteristic(DiagramTypes diagramType, ConcreteSyntaxTypes from, ConcreteSyntaxTypes to) {
		super();
		this.diagramType = diagramType;
		this.from = from;
		this.to = to;
	}

	public DiagramTypes getDiagramType() {
		return diagramType;
	}

	public ConcreteSyntaxTypes getFrom() {
		return from;
	}

	public ConcreteSyntaxTypes getTo() {
		return to;
	}

}
