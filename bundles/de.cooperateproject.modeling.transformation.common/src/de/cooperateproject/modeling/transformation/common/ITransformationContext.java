package de.cooperateproject.modeling.transformation.common;

public interface ITransformationContext {

    IQVTOResourceProvider getQVTOResourceProvider();

    IQVTOTransformationExecutorProvider getQVTOTransformationExecutorProvider();

    ITransformationUnitURIResolver getTransformationUnitURIResolver();
}
