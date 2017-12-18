package de.cooperateproject.modeling.common.types;

import java.util.Arrays;
import java.util.Optional;

@Deprecated
public enum DiagramTypesDeprecated {

    CLASS("Class"),
    USECASE("UseCase"),
    ACTIVITY("Activity"),
    SEQUENCE("Sequence"),
    COMPONENT("Component"),
    STATE("State");

    private String name;

    private DiagramTypesDeprecated(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Optional<DiagramTypesDeprecated> getByName(String name) {
        return Arrays.stream(values()).filter(t -> t.getName().equals(name)).findFirst();
    }
}
