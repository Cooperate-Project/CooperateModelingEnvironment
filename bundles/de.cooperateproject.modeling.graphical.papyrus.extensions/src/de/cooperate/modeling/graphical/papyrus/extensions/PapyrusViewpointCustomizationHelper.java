package de.cooperate.modeling.graphical.papyrus.extensions;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescriptionLanguage;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDomain;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.DrawerConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ElementDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.PaletteConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ToolConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration;

public class PapyrusViewpointCustomizationHelper {

    public static void mergeDiagramKinds(URI architectureURI) {
        ArchitectureDomainManager domainManager = ArchitectureDomainManager.getInstance();

        ResourceSet rs = new ResourceSetImpl();
        Resource r = rs.getResource(architectureURI, true);

        List<PapyrusDiagram> matchingDiagrams = r.getContents().stream().filter(ArchitectureDomain.class::isInstance)
                .map(ArchitectureDomain.class::cast).map(ArchitectureDomain::getContexts).flatMap(Collection::stream)
                .filter(ArchitectureDescriptionLanguage.class::isInstance)
                .map(ArchitectureDescriptionLanguage.class::cast)
                .map(ArchitectureDescriptionLanguage::getRepresentationKinds).flatMap(Collection::stream)
                .filter(PapyrusDiagram.class::isInstance).map(PapyrusDiagram.class::cast).collect(Collectors.toList());

        for (PapyrusDiagram sourceDiagram : matchingDiagrams) {
            RepresentationKind classRepresentation = domainManager.getRepresentationKindById(sourceDiagram.getId());
            if (!(classRepresentation instanceof PapyrusDiagram))
                continue;
            PapyrusDiagram targetDiagram = (PapyrusDiagram) classRepresentation;
            targetDiagram.getAssistantRules().addAll(sourceDiagram.getAssistantRules());
            targetDiagram.getPaletteRules().addAll(sourceDiagram.getPaletteRules());
            targetDiagram.getChildRules().addAll(sourceDiagram.getChildRules());
            targetDiagram.getModelRules().addAll(sourceDiagram.getModelRules());
            targetDiagram.getOwningRules().addAll(sourceDiagram.getOwningRules());

            Optional<ToolConfiguration> toolConfig = targetDiagram.getPalettes().stream()
                    .filter(p -> p.getId().equals("org.eclipse.papyrus.uml.diagram.usecase.paletteconfiguration"))
                    .map(PaletteConfiguration::getDrawerConfigurations).flatMap(l -> l.stream())
                    .filter(dc -> dc.getId().equals("usecase.group.nodes"))
                    .map(DrawerConfiguration::getOwnedConfigurations).flatMap(l -> l.stream())
                    .filter(config -> config.getId().equals("usecase.tool.subject"))
                    .filter(ToolConfiguration.class::isInstance).map(ToolConfiguration.class::cast).findAny();

            // Patch the available set of classifiers
            if (toolConfig.isPresent()) {
                ToolConfiguration t = toolConfig.get();
                ElementDescriptor e0 = t.getElementDescriptors().get(0);
                ElementDescriptor e1 = t.getElementDescriptors().get(1);

                EList<ElementTypeConfiguration> types = ((SpecializationTypeConfiguration) e0.getElementType())
                        .getSpecializedTypes();
                EList<ElementTypeConfiguration> componentTypes = ((SpecializationTypeConfiguration) e1.getElementType())
                        .getSpecializedTypes();
                types.clear();
                types.addAll(componentTypes);

            }

        }

    }

}
