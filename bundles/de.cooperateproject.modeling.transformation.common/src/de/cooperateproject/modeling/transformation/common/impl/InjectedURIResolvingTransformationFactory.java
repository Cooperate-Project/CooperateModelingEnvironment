package de.cooperateproject.modeling.transformation.common.impl;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolverInjectionExpecting;

public class InjectedURIResolvingTransformationFactory extends BidirectionalTransformationFactoryBase
        implements ITransformationUnitURIResolverInjectionExpecting {
    public InjectedURIResolvingTransformationFactory(NotationDiagramTypes diagramType, String graphicalFileExtension,
            String textualFileExtension) {
        super(diagramType, graphicalFileExtension, textualFileExtension);
    }

    private ITransformationUnitURIResolver resolver;

    @Override
    public void injectTransformationUnitURIResolver(ITransformationUnitURIResolver resolver) {
        this.resolver = resolver;
    }

    @Override
    protected ITransformationUnitURIResolver getTransformationURIResolver() {
        return resolver;
    }

}
