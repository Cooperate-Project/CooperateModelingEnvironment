package de.cooperateproject.modeling.transformation.cls;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.cls.postprocessors.ClassDiagramPostProcessor;
import de.cooperateproject.modeling.transformation.common.impl.InjectedURIResolvingTransformationFactory;
import de.cooperateproject.modeling.transformation.common.impl.PostProcessor;

public class ClsTransformationFactory extends InjectedURIResolvingTransformationFactory {
    private Collection<PostProcessor> postProcessors = null;

    public ClsTransformationFactory() {
        super(NotationDiagramTypes.CLASS, "notation", "cls");
    }
    
    @Override
    protected Collection<PostProcessor> getTextualToGraphicalPostProcessors() {
        if (postProcessors == null) {
            postProcessors = Arrays.asList(new ClassDiagramPostProcessor(50));
        }
        
        return Collections.unmodifiableCollection(postProcessors);
    }

}
