package de.cooperateproject.modeling.transformation.transformations;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.textual.common.convetions.ModelNamingConventions;
import de.cooperateproject.modeling.transformation.transformations.impl.GraphicsToTextTransformation;
import de.cooperateproject.modeling.transformation.transformations.impl.TextToGraphicsTransformation;
import de.cooperateproject.modeling.transformation.transformations.registry.Transformation;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationFactory;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationFactoryRegistry;

public class TransformationRegistryInitializer {

	private final TransformationFactoryRegistry registry = TransformationFactoryRegistry.getInstance();
	
	public void init() {
		registry.registerTransformation(createN2T(DiagramTypes.CLASS, "cls"));
		registry.registerTransformation(createT2N(DiagramTypes.CLASS, "cls"));
	}
	
	private static TransformationFactory createN2T(DiagramTypes diagramType, String textualFileExtension) {
		return new TransformationFactory() {
			
			@Override
			public Transformation create(URI changedModelURI, ResourceSet rs) {
				notNull(changedModelURI);
				notNull(rs);
				isTrue(changedModelURI.hasFragment());
				
				EObject changedEObject = rs.getEObject(changedModelURI, false);
				String diagramName = ((Diagram)changedEObject).getName();
				URI targetURI = ModelNamingConventions.getTextualFromGraphicalURI(changedModelURI, diagramName, textualFileExtension);
				return new GraphicsToTextTransformation(diagramType, rs, changedModelURI, targetURI);
			}
			
			@Override
			public boolean canHandle(URI changedModelURI) {
				return "notation".equals(changedModelURI.fileExtension());
			}
		};

	}
	
	private static TransformationFactory createT2N(DiagramTypes diagramType, String textualFileExtension) {
		return new TransformationFactory() {
			
			@Override
			public Transformation create(URI changedModelURI, ResourceSet rs) {
				
				URI targetResourceURI = ModelNamingConventions.getGraphicalFromTextualURI(changedModelURI);
				String diagramName = ModelNamingConventions.getDiagramNameFromTextualURI(changedModelURI);

				if (rs.getURIConverter().exists(targetResourceURI, Collections.emptyMap())) {
					Resource r = rs.getResource(targetResourceURI, true);
					Optional<Diagram> diagram = r.getContents().stream().filter(o -> o instanceof Diagram).map(o -> ((Diagram)o)).filter(d -> diagramName.equals(d.getName())).findAny();
					if (diagram.isPresent()) {
						String targetUriFragment = r.getURIFragment(diagram.get());
						targetResourceURI = targetResourceURI.trimFragment().appendFragment(targetUriFragment);
					}
				}
				return new TextToGraphicsTransformation(diagramType, changedModelURI.fileExtension(), rs, changedModelURI, targetResourceURI);
			}
			
			@Override
			public boolean canHandle(URI changedModelURI) {
				return textualFileExtension.equals(changedModelURI.fileExtension());
			}
		};
		
	}
	
}
