package de.cooperateproject.modeling.transformation.transformations;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.util.NotationSwitch;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.textual.common.conventions.FileExtensions;
import de.cooperateproject.modeling.transformation.transformations.impl.GraphicsToTextTransformation;
import de.cooperateproject.modeling.transformation.transformations.impl.PostProcessor;
import de.cooperateproject.modeling.transformation.transformations.impl.TextToGraphicsTransformation;
import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.ClassDiagramPostProcessor;
import de.cooperateproject.modeling.transformation.transformations.registry.Transformation;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationFactory;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationFactoryRegistry;

public class TransformationRegistryInitializer {

    private final TransformationFactoryRegistry registry = TransformationFactoryRegistry.getInstance();

    public void init() {
        registry.registerTransformation(createN2T(NotationDiagramTypes.CLASS, FileExtensions.CLASS.getFileExtension(),
                new ClassDiagramPostProcessor(50)));
        registry.registerTransformation(createT2N(DiagramTypes.CLASS, FileExtensions.CLASS.getFileExtension(),
                new ClassDiagramPostProcessor(50)));
        registry.registerTransformation(
                createN2T(NotationDiagramTypes.USECASE, FileExtensions.USECASE.getFileExtension()));
        registry.registerTransformation(createT2N(DiagramTypes.USECASE, FileExtensions.USECASE.getFileExtension()));

    }

    private static TransformationFactory createN2T(NotationDiagramTypes diagramType, String textualFileExtension,
            PostProcessor... postProcessors) {
        return new TransformationFactory() {

            @SuppressWarnings("unchecked")
            @Override
            public Optional<Transformation> create(URI changedModelURI, ResourceSet rs) {
                notNull(changedModelURI);
                notNull(rs);

                Optional<Transformation> result = Optional.empty();
                if ("notation".equals(changedModelURI.fileExtension())) {
                    isTrue(changedModelURI.hasFragment());

                    EObject changedEObject = rs.getEObject(changedModelURI, false);

                    // Unchecked conversion as NotationSwitch apparently does not constitute an generic EMF switch
                    result = (Optional<Transformation>) new NotationSwitch() {
                        public Object caseDiagram(Diagram diagram) {
                            if (diagramType.getNotationDiagramType().equals(diagram.getType())) {
                                URI targetURI = ModelNamingConventions.getTextualFromGraphicalURI(changedModelURI,
                                        diagram.getName(), textualFileExtension);
                                return Optional.of(new GraphicsToTextTransformation(diagramType.getDiagramType(), rs,
                                        changedModelURI, targetURI, Arrays.asList(postProcessors)));
                            }
                            return super.caseDiagram(diagram);
                        };

                        @Override
                        public Object defaultCase(EObject object) {
                            return Optional.empty();
                        }
                    }.doSwitch(changedEObject);
                }
                return result;
            }
        };

    }

    private static TransformationFactory createT2N(DiagramTypes diagramType, String textualFileExtension,
            PostProcessor... postProcessors) {
        return new TransformationFactory() {

            @Override
            public Optional<Transformation> create(URI changedModelURI, ResourceSet rs) {
                if (textualFileExtension.equals(changedModelURI.fileExtension())) {
                    URI targetResourceURI = ModelNamingConventions.getGraphicalFromTextualURI(changedModelURI);
                    String diagramName = ModelNamingConventions.getDiagramNameFromTextualURI(changedModelURI);

                    if (rs.getURIConverter().exists(targetResourceURI, Collections.emptyMap())) {
                        Resource r = rs.getResource(targetResourceURI, true);
                        Optional<Diagram> diagram = r.getContents().stream().filter(o -> o instanceof Diagram)
                                .map(o -> ((Diagram) o)).filter(d -> diagramName.equals(d.getName())).findAny();
                        if (diagram.isPresent()) {
                            String targetUriFragment = r.getURIFragment(diagram.get());
                            targetResourceURI = targetResourceURI.trimFragment().appendFragment(targetUriFragment);
                        }
                    }
                    return Optional.of(new TextToGraphicsTransformation(diagramType, changedModelURI.fileExtension(),
                            rs, changedModelURI, targetResourceURI, Arrays.asList(postProcessors)));
                }
                return Optional.empty();
            }
        };

    }

}
