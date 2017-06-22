package de.cooperate.modeling.graphical.papyrus.extensions.configuration;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusConfiguration;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusDiagram;
import org.eclipse.papyrus.infra.viewpoints.iso42010.ArchitectureViewpoint;

import de.cooperate.modeling.graphical.papyrus.extensions.Activator;
import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;

/**
 * Utility class for applying / using Papyrus configurations.
 */
public final class PapyrusConfigurationUtilities {

    private static final String DIAGRAM_CONFIGURATION_PATH = "resource/CooperateModeling.configuration";

    private PapyrusConfigurationUtilities() {
        // intentionally left blank
    }

    /**
     * Determines the URI of configuration for the requested diagram type.
     * 
     * The result will include a fragment that directly leads to the required {@link PapyrusDiagram} configuration
     * element.
     * 
     * @param diagramType
     *            The requested diagram type of the configuration.
     * @return The URI to the configuration element.
     */
    public static Optional<URI> getDiagramConfigurationURI(NotationDiagramTypes diagramType) {
        String bundleName = Activator.getPluginInstance().getBundle().getSymbolicName();
        String pathName = String.format("/%s/%s", bundleName, DIAGRAM_CONFIGURATION_PATH);
        URI configurationURI = URI.createPlatformPluginURI(pathName, true);

        ResourceSet rs = new ResourceSetImpl();
        Resource r = rs.getResource(configurationURI, true);
        if (r == null || r.getContents().isEmpty()) {
            return Optional.empty();
        }

        List<PapyrusDiagram> matchingViewpoints = r.getContents().stream()
                .filter(PapyrusConfiguration.class::isInstance).map(PapyrusConfiguration.class::cast)
                .map(PapyrusConfiguration::getViewpoints).flatMap(Collection::stream)
                .map(ArchitectureViewpoint::getModelKinds).flatMap(Collection::stream)
                .filter(PapyrusDiagram.class::isInstance).map(PapyrusDiagram.class::cast)
                .filter(d -> diagramType.getNotationDiagramType().equals(d.getImplementationID()))
                .collect(Collectors.toList());

        if (matchingViewpoints.size() != 1) {
            return Optional.empty();
        }

        PapyrusDiagram matchingViewpoint = matchingViewpoints.get(0);
        String uriFragment = r.getURIFragment(matchingViewpoint);
        URI requestedURI = configurationURI.appendFragment(uriFragment);
        return Optional.of(requestedURI);
    }

}
