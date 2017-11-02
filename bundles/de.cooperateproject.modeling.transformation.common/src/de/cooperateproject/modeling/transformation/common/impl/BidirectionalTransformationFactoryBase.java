package de.cooperateproject.modeling.transformation.common.impl;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.util.NotationSwitch;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.common.ITransformationContextProvider;
import de.cooperateproject.modeling.transformation.common.ITransformationFactory;
import de.cooperateproject.modeling.transformation.common.registry.Transformation;

public abstract class BidirectionalTransformationFactoryBase implements ITransformationFactory {
    private final NotationDiagramTypes diagramType;
    private final String graphicalFileExtension;
    private final String textualFileExtension;
    protected final ITransformationContextProvider transformationContextProvider;

    public BidirectionalTransformationFactoryBase(NotationDiagramTypes diagramType, String graphicalFileExtension,
            String textualFileExtension, ITransformationContextProvider transformationContextProvider) {

        notNull(transformationContextProvider);
        notNull(diagramType);
        notBlank(graphicalFileExtension);
        notBlank(textualFileExtension);
        isTrue(!graphicalFileExtension.equals(textualFileExtension));

        this.diagramType = diagramType;
        this.graphicalFileExtension = graphicalFileExtension;
        this.textualFileExtension = textualFileExtension;
        this.transformationContextProvider = transformationContextProvider;
    }

    @Override
    public Optional<Transformation> create(URI changedModelURI, ResourceSet rs) {
        notNull(changedModelURI);
        notNull(rs);

        if (graphicalFileExtension.equals(changedModelURI.fileExtension())) {
            return createG2T(changedModelURI, rs);
        } else if (textualFileExtension.equals(changedModelURI.fileExtension())) {
            return createT2G(changedModelURI, rs);
        } else {
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    protected Optional<Transformation> createG2T(URI changedModelURI, ResourceSet rs) {
        isTrue(changedModelURI.hasFragment());

        EObject changedEObject = rs.getEObject(changedModelURI, false);

        // Unchecked conversion as NotationSwitch apparently does not constitute an generic EMF switch
        return (Optional<Transformation>) new NotationSwitch() {
            @Override
            public Object caseDiagram(Diagram diagram) {
                if (diagramType.getNotationDiagramType().equals(diagram.getType())) {
                    URI targetURI = ModelNamingConventions.getTextualFromGraphicalURI(changedModelURI,
                            diagram.getName(), textualFileExtension);
                    return Optional.of(createG2TInternal(diagramType, changedModelURI, rs, targetURI));
                }
                return super.caseDiagram(diagram);
            }

            @Override
            public Object defaultCase(EObject object) {
                return Optional.empty();
            }
        }.doSwitch(changedEObject);
    }

    protected Transformation createG2TInternal(NotationDiagramTypes diagramType, URI changedModelURI, ResourceSet rs,
            URI targetURI) {
        return new GraphicsToTextTransformation(diagramType.getDiagramType(),
                transformationContextProvider.getTransformationContext(), rs, changedModelURI, targetURI,
                getGraphicalToTextualPostProcessors());
    }

    protected Optional<Transformation> createT2G(URI changedModelURI, ResourceSet rs) {
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

        return Optional.of(createT2GInternal(diagramType, changedModelURI, rs, targetResourceURI));
    }

    protected Transformation createT2GInternal(NotationDiagramTypes diagramType, URI changedModelURI, ResourceSet rs,
            URI targetURI) {
        return new TextToGraphicsTransformation(diagramType.getDiagramType(), changedModelURI.fileExtension(),
                transformationContextProvider.getTransformationContext(), rs, changedModelURI, targetURI,
                getTextualToGraphicalPostProcessors());
    }

    protected Collection<PostProcessor> getGraphicalToTextualPostProcessors() {
        return Collections.emptyList();
    }

    protected Collection<PostProcessor> getTextualToGraphicalPostProcessors() {
        return Collections.emptyList();
    }
}
