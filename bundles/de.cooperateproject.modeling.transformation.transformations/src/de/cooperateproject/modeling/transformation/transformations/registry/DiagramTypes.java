package de.cooperateproject.modeling.transformation.transformations.registry;

public enum DiagramTypes {

	CLASS("Class"),
	USECASE("UseCase"),
	ACTIVITY("Activity"),
	SEQUENCE("Sequence"),
	STATE("State");
	
	private String name;

	private DiagramTypes(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
