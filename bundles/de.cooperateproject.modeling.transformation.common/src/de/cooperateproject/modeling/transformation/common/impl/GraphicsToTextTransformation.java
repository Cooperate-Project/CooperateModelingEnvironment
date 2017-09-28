package de.cooperateproject.modeling.transformation.common.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.transformation.common.ITransformationUnitURIResolver;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;

public class GraphicsToTextTransformation extends TransformationBase {

    public GraphicsToTextTransformation(DiagramTypes diagramType,
            ITransformationUnitURIResolver transformationURIResolver, ResourceSet rs, URI source, URI target) {
        this(diagramType, transformationURIResolver, rs, source, target, Collections.emptySet());
    }

    public GraphicsToTextTransformation(DiagramTypes diagramType,
            ITransformationUnitURIResolver transformationURIResolver, ResourceSet rs, URI source,
            List<URI> supplementarySourceURIs, URI target, List<URI> supplementaryTargetURIs) {
        this(diagramType, transformationURIResolver, rs, source, supplementarySourceURIs, target,
                supplementaryTargetURIs, Collections.emptySet());
    }

    public GraphicsToTextTransformation(DiagramTypes diagramType,
            ITransformationUnitURIResolver transformationURIResolver, ResourceSet rs, URI source, URI target,
            Collection<PostProcessor> postProcessors) {
        this(diagramType, transformationURIResolver, rs, source, Collections.emptyList(), target,
                Collections.emptyList(), postProcessors);
    }

    public GraphicsToTextTransformation(DiagramTypes diagramType,
            ITransformationUnitURIResolver transformationURIResolver, ResourceSet rs, URI source,
            List<URI> supplementarySourceURIs, URI target, List<URI> supplementaryTargetURIs,
            Collection<PostProcessor> postProcessors) {
        super(createCharacteristics(diagramType), transformationURIResolver, rs, source, supplementarySourceURIs,
                target, supplementaryTargetURIs, postProcessors);
    }

    @Override
    protected URI getGraphicalModelURI(URI from, URI to) {
        return from;
    }

    private static TransformationCharacteristic createCharacteristics(DiagramTypes diagramType) {
        return new TransformationCharacteristic(diagramType, ConcreteSyntaxTypes.GRAPHICAL,
                ConcreteSyntaxTypes.TEXTUAL);
    }

}
