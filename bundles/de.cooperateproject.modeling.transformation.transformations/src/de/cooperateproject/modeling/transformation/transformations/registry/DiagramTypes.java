package de.cooperateproject.modeling.transformation.transformations.registry;

import java.util.Arrays;
import java.util.Optional;

import com.google.common.collect.Iterables;

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
	
	public static Optional<DiagramTypes> getByName(String name) {
		com.google.common.base.Optional<DiagramTypes> foundType = Iterables.tryFind(Arrays.asList(values()), t -> t.getName().equals(name));
		if (foundType.isPresent()) {
			Optional.of(foundType.get());
		}
		return Optional.empty();
	}
}
