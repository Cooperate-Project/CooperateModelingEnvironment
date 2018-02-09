package de.cooperateproject.modeling.transformation.registry;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.modeling.transformation.common.ITransformationContext;
import de.cooperateproject.modeling.transformation.common.ITransformationContextProvider;
import de.cooperateproject.modeling.transformation.common.impl.BidirectionalTransformationFactoryBase;
import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;

public class BidirectionalTransformationFactoryWithInjectedContext extends BidirectionalTransformationFactoryBase
        implements InjectTransformationContext, InjectPostProcessors {

    private static class InjectedTransformationContextProvider
            implements ITransformationContextProvider, InjectTransformationContext {
        private ITransformationContext currentContext;

        @Override
        public void setTransformationContext(ITransformationContext context) {
            this.currentContext = context;
        }

        @Override
        public ITransformationContext getTransformationContext() {
            return currentContext;
        }

    }

    private Map<PostProcessorDirection, Collection<PostProcessor>> postProcessors;

    public BidirectionalTransformationFactoryWithInjectedContext(IDiagramType diagramType,
            String graphicalFileExtension) {
        super(diagramType, graphicalFileExtension, diagramType.getTextualFileExtension(),
                new InjectedTransformationContextProvider());
    }

    @Override
    public void setTransformationContext(ITransformationContext context) {
        ((InjectTransformationContext) this.transformationContextProvider).setTransformationContext(context);
    }

    @Override
    protected Collection<PostProcessor> getGraphicalToTextualPostProcessors() {
        return postProcessors.getOrDefault(PostProcessorDirection.G2T, Collections.emptyList());
    }

    @Override
    protected Collection<PostProcessor> getTextualToGraphicalPostProcessors() {
        return postProcessors.getOrDefault(PostProcessorDirection.T2G, Collections.emptyList());
    }

    @Override
    public void setPostProcessors(Map<PostProcessorDirection, Collection<PostProcessor>> postProcessors) {
        this.postProcessors = postProcessors;
    }

}
