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

    private final Set<ITransformationFactory> factories = Sets.newHashSet();

    public void registerTransformation(ITransformationFactory factory) {
        factories.add(factory);
    }

    public Collection<ITransformationFactory> getTransformationFactories() {
        return Collections.unmodifiableSet(factories);
    }

}
