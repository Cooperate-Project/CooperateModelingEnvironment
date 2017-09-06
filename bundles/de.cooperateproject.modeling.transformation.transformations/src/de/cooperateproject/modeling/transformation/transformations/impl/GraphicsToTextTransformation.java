package de.cooperateproject.modeling.transformation.transformations.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class GraphicsToTextTransformation extends TransformationBase {

    public GraphicsToTextTransformation(DiagramTypes diagramType, ResourceSet rs, URI source, URI target) {
        this(diagramType, rs, source, target, Collections.emptySet());
    }

    public GraphicsToTextTransformation(DiagramTypes diagramType, ResourceSet rs, URI source,
            SortedSet<URI> supplementarySourceURIs, URI target, SortedSet<URI> supplementaryTargetURIs) {
        this(diagramType, rs, source, supplementarySourceURIs, target, supplementaryTargetURIs, Collections.emptySet());
    }

    public GraphicsToTextTransformation(DiagramTypes diagramType, ResourceSet rs, URI source, URI target,
            Collection<PostProcessor> postProcessors) {
        this(diagramType, rs, source, Collections.emptySortedSet(), target, Collections.emptySortedSet(),
                postProcessors);
    }

    public GraphicsToTextTransformation(DiagramTypes diagramType, ResourceSet rs, URI source,
            SortedSet<URI> supplementarySourceURIs, URI target, SortedSet<URI> supplementaryTargetURIs,
            Collection<PostProcessor> postProcessors) {
        super(createCharacteristics(diagramType), rs, source, supplementarySourceURIs, target, supplementaryTargetURIs,
                postProcessors);
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
