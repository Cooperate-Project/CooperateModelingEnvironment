package de.cooperateproject.modeling.transformation.transformations.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.transformation.transformations.registry.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class TextToGraphicsTransformation extends TransformationBase {
	
	public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension, ResourceSet rs, URI source, URI target) {
		super(createCharacteristics(diagramType), rs, source, target);
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
