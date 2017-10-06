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

            customizeUseCasePalette(targetDiagram);

        }

    }

    private static void customizeUseCasePalette(PapyrusDiagram targetDiagram) {
        Optional<ToolConfiguration> subjectToolConfig = findToolConfiguration(targetDiagram, USECASE_TOOL_SUBJECT);
        // Patch the available set of classifiers for subject
        if (subjectToolConfig.isPresent()) {
            EList<ElementDescriptor> descriptors = subjectToolConfig.get().getElementDescriptors();
            Optional<ElementDescriptor> subjectDesc = descriptors.stream()
                    .filter(d -> d.getElementType().getHint().equals(CLASSIFIER_SUBJECT_SHAPE)).findFirst();
            Optional<ElementDescriptor> componentDesc = descriptors.stream()
                    .filter(d -> d.getElementType().getHint().equals(COMPONENT_SHAPE_CN)).findFirst();

            if (subjectDesc.isPresent() && componentDesc.isPresent()) {
                EList<ElementTypeConfiguration> types = getSpecializedTypes(subjectDesc);
                EList<ElementTypeConfiguration> componentTypes = getSpecializedTypes(componentDesc);
                if (!componentTypes.isEmpty()) {
                    types.clear();
                    types.addAll(componentTypes);
                }
            }
        }

        // Remove direct insertion of use case shapes
        Optional<ToolConfiguration> usecaseToolConfig = findToolConfiguration(targetDiagram, USECASE_TOOL_USECASE);
        if (usecaseToolConfig.isPresent()) {
            EList<ElementDescriptor> descriptors = usecaseToolConfig.get().getElementDescriptors();
            descriptors.removeIf(d -> d.getElementType().getHint().equals(USE_CASE_SHAPE));

        }
    }

    private static EList<ElementTypeConfiguration> getSpecializedTypes(Optional<ElementDescriptor> descriptor) {
        EList<ElementTypeConfiguration> types = ((SpecializationTypeConfiguration) descriptor.get().getElementType())
                .getSpecializedTypes();
        return types;
    }

    private static Optional<ToolConfiguration> findToolConfiguration(PapyrusDiagram targetDiagram, String toolId) {
        Optional<ToolConfiguration> toolConfig = targetDiagram.getPalettes().stream()
                .map(PaletteConfiguration::getDrawerConfigurations).flatMap(l -> l.stream())
                .map(DrawerConfiguration::getOwnedConfigurations).flatMap(l -> l.stream())
                .filter(config -> config.getId().equals(toolId)).filter(ToolConfiguration.class::isInstance)
                .map(ToolConfiguration.class::cast).findFirst();
        return toolConfig;
    }

}
