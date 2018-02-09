package de.cooperateproject.modeling.transformation.registry;

import java.util.Arrays;
import java.util.Optional;

public enum PostProcessorDirection {

    T2G("textual to graphical"),
    G2T("graphical to textual");

    private final String directionName;

    private PostProcessorDirection(String directionName) {
        this.directionName = directionName;
    }

    public static Optional<PostProcessorDirection> findByName(String name) {
        return Arrays.asList(PostProcessorDirection.values()).stream()
                .filter(literal -> literal.directionName.equals(name)).findFirst();
    }

}
