package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.DrawerConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ElementDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.PaletteConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ToolConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration;

import de.cooperateproject.modeling.graphical.papyrus.extensions.IPaletteCustomization;

public class UseCasePaletteCustomization  implements IPaletteCustomization {

    private static final String DIAGRAM_USE_CASE = "org.eclipse.papyrus.uml.diagram.useCase";
	private static final String USECASE_TOOL_USECASE = "usecase.tool.usecase";
    private static final String USECASE_TOOL_SUBJECT = "usecase.tool.subject";
    private static final String CLASSIFIER_SUBJECT_SHAPE = "Classifier_SubjectShape";
    private static final String COMPONENT_SHAPE_CN = "Component_Shape_CN";
    private static final String USE_CASE_SHAPE = "UseCase_Shape";

   

    public void customizePalette(PapyrusDiagram targetDiagram) {
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

	@Override
	public boolean canHandle(String diagramId) {
		return DIAGRAM_USE_CASE.equals(diagramId);
	}

}
