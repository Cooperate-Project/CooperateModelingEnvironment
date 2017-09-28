package de.cooperateproject.modeling.transformation.sequence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.common.impl.GraphicsToTextTransformation;
import de.cooperateproject.modeling.transformation.common.impl.InjectedURIResolvingTransformationFactory;
import de.cooperateproject.modeling.transformation.common.impl.TextToGraphicsTransformation;
import de.cooperateproject.modeling.transformation.common.registry.Transformation;


public class SequenceTransformationFactory extends InjectedURIResolvingTransformationFactory {
    public SequenceTransformationFactory() {
        super(NotationDiagramTypes.SEQUENCE, "notation", "seq");
    }
    
    @Override
    protected Transformation createG2TInternal(NotationDiagramTypes diagramType, URI changedModelURI, ResourceSet rs,
            URI targetURI) {
        URI intermediateModelURI = targetURI.trimFileExtension().appendFileExtension("sequenceintermediate");
        if (rs.getResource(intermediateModelURI, true) != null) {
            return new GraphicsToTextTransformation(diagramType.getDiagramType(), getTransformationURIResolver(), rs, changedModelURI, 
                    //Collections.emptyList(), 
                    targetURI, 
                    //Collections.singletonList(intermediateModelURI), 
                    getGraphicalToTextualPostProcessors());
        } else return super.createG2TInternal(diagramType, changedModelURI, rs, targetURI);
    }
    
    @Override
    protected Transformation createT2GInternal(NotationDiagramTypes diagramType, URI changedModelURI, ResourceSet rs,
            URI targetURI) {
        URI intermediateModelURI = changedModelURI.trimFileExtension().appendFileExtension("sequenceintermediate");
        if (rs.getResource(intermediateModelURI, true) != null) {
            return new TextToGraphicsTransformation(diagramType.getDiagramType(), changedModelURI.fileExtension(), getTransformationURIResolver(), rs, changedModelURI, 
                    //Collections.singletonList(intermediateModelURI), 
                    targetURI, 
                    //Collections.emptyList(), 
                    getGraphicalToTextualPostProcessors());
        } else return super.createT2GInternal(diagramType, changedModelURI, rs, targetURI);
    }

}