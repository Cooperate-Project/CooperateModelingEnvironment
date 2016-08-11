package de.cooperateproject.modeling.transformation.transformations.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.transformation.transformations.registry.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class GraphicsToTextTransformation extends TransformationBase {

	public GraphicsToTextTransformation(DiagramTypes diagramType, ResourceSet rs, URI source, URI target) {
		super(createCharacteristics(diagramType), rs, source, target);
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
