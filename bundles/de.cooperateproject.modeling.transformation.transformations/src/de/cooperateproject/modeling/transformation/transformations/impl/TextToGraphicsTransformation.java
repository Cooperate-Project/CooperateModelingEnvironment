package de.cooperateproject.modeling.transformation.transformations.impl;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class TextToGraphicsTransformation extends TransformationBase {
	
	public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension, ResourceSet rs, URI source, URI target) {
		this(diagramType, fileExtension, rs, source, target, Collections.emptySet());
	}
	
	public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension, ResourceSet rs, URI source, URI target, Collection<PostProcessor> postProcessors) {
		super(createCharacteristics(diagramType), rs, source, target, postProcessors);
	}

	@Override
	protected URI getGraphicalModelURI(URI from, URI to) {
		return to;
	}

	private static TransformationCharacteristic createCharacteristics(DiagramTypes diagramType) {
		return new TransformationCharacteristic(diagramType, ConcreteSyntaxTypes.TEXTUAL,
				ConcreteSyntaxTypes.GRAPHICAL);
	}
}
