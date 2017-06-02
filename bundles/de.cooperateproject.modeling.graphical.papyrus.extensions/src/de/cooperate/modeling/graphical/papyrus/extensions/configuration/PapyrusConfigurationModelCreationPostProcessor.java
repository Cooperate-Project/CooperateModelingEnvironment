package de.cooperate.modeling.graphical.papyrus.extensions.configuration;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusDiagram;
import org.eclipse.papyrus.infra.viewpoints.style.PapyrusViewStyle;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.ui.modelcreator.IModelCreatorPostProcessor;

/**
 * Post processor for created models that introduces a Papyrus configuration if available.
 */
public class PapyrusConfigurationModelCreationPostProcessor implements IModelCreatorPostProcessor {

    @Override
    public void postProcessModel(EObject rootElement) {
        if (NotationPackage.Literals.DIAGRAM.isSuperTypeOf(rootElement.eClass())) {
            postProcessModel((Diagram) rootElement);
        }
    }

    private static void postProcessModel(Diagram rootElement) {
        Optional<NotationDiagramTypes> diagramType = NotationDiagramTypes
                .getByNotationDiagramType(rootElement.getType());
        if (!diagramType.isPresent()) {
            return;
        }

        Optional<URI> configUri = PapyrusConfigurationUtilities.getDiagramConfigurationURI(diagramType.get());
        if (!configUri.isPresent()) {
            return;
        }

        Resource configResource = rootElement.eResource().getResourceSet().getResource(configUri.get(), true);
        if (configResource == null) {
            return;
        }

        PapyrusDiagram config = (PapyrusDiagram) configResource.getEObject(configUri.get().fragment());
        if (config == null) {
            return;
        }

        getStyles(rootElement).stream().filter(PapyrusViewStyle.class::isInstance).map(PapyrusViewStyle.class::cast)
                .findFirst().ifPresent(style -> style.setConfiguration(config));

    }

    @SuppressWarnings("unchecked")
    private static Collection<Style> getStyles(Diagram diagram) {
        return (Collection<Style>) diagram.getStyles();
    }
}
