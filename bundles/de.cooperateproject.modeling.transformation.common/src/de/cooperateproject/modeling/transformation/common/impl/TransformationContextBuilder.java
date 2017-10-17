package de.cooperateproject.modeling.transformation.common.impl;

import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;
import de.cooperateproject.modeling.transformation.common.ITransformationContext;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;

public class TransformationContextBuilder {

    private IQVTOResourceProvider iqvtoResourceProvider;
    private IQVTOTransformationExecutorProvider iqvtoTransformationExecutorProvider;
    private ITransformationUnitURIResolver uriResolver;

    public TransformationContextBuilder setQVTOResourceProvider(IQVTOResourceProvider provider) {
        this.iqvtoResourceProvider = provider;
        return this;
    }

    public TransformationContextBuilder setQVTOTransformationExecutorProvider(
            IQVTOTransformationExecutorProvider provider) {
        this.iqvtoTransformationExecutorProvider = provider;
        return this;
    }

    public TransformationContextBuilder setTransformationUnitURIResolver(ITransformationUnitURIResolver uriResolver) {
        this.uriResolver = uriResolver;
        return this;
    }

    public ITransformationContext build() {
        return new ITransformationContext() {

            @Override
            public ITransformationUnitURIResolver getTransformationUnitURIResolver() {
                return uriResolver;
            }

            @Override
            public IQVTOTransformationExecutorProvider getQVTOTransformationExecutorProvider() {
                return iqvtoTransformationExecutorProvider;
            }

            @Override
            public IQVTOResourceProvider getQVTOResourceProvider() {
                return iqvtoResourceProvider;
            }
        };
    }
}
