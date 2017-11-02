package de.cooperateproject.modeling.transformation.common;

@FunctionalInterface
public interface ITransformationContextProvider {
    ITransformationContext getTransformationContext();
}
