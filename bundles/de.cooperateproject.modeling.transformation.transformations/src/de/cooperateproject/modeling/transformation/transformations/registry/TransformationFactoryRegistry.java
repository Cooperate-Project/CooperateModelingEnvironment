package de.cooperateproject.modeling.transformation.transformations.registry;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.google.common.collect.Sets;

public enum TransformationFactoryRegistry {

    INSTANCE;

    public static TransformationFactoryRegistry getInstance() {
        return INSTANCE;
    }

    private final Set<TransformationFactory> factories = Sets.newHashSet();

    public void registerTransformation(TransformationFactory factory) {
        factories.add(factory);
    }

    public Collection<TransformationFactory> getTransformationFactories() {
        return Collections.unmodifiableSet(factories);
    }

}
