package de.cooperateproject.modeling.graphical.papyrus.extensions;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescriptionLanguage;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDomain;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;

public class PapyrusViewpointCustomizationHelper {

    private static final String USECASE_TOOL_USECASE = "usecase.tool.usecase";
    private static final String USECASE_TOOL_SUBJECT = "usecase.tool.subject";
    private static final String CLASSIFIER_SUBJECT_SHAPE = "Classifier_SubjectShape";
    private static final String COMPONENT_SHAPE_CN = "Component_Shape_CN";
    private static final String USE_CASE_SHAPE = "UseCase_Shape";

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

        Set<IPaletteCustomization> paletteCustomizatzions = CustomizationRegistry.getInstance()
                .getPaletteCustomizations();

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

            for (IPaletteCustomization pc : paletteCustomizatzions) {
                if (pc.canHandle(targetDiagram))
                    pc.customizePalette(targetDiagram);
            }

        }

    }

}
