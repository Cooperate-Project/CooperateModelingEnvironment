package de.cooperateproject.modeling.graphical.papyrus.extensions.component.palette;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.DrawerConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ElementDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.IconDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.PaletteConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.PaletteconfigurationFactory;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ToolConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration;

import de.cooperateproject.modeling.graphical.papyrus.extensions.IPaletteCustomization;

public class AddClassToComponentDiagramPaletteCustomization implements IPaletteCustomization {

	private static final String CLASS_TOOL_ID = "component.tool.class";
	private static final String CLASS_TOOL_LABEL = "Class";
	private static final String CLASS_TOOL_DESCRIPTION = "Create a class";
	private static final String CLASS_TOOL_PLUGIN_ID = "org.eclipse.uml2.uml.edit";
	private static final String CLASS_TOOL_ICON_PATH = "/icons/full/obj16/Class.gif";
	//private static final String CLASS_SHAPE_CN_ID = "org.eclipse.papyrus.umldi.Class_Shape_CN";
	private static final String CLASS_SHAPE_ID = "org.eclipse.papyrus.umldi.NamedElement_DefaultShape";
	private static final String DIAGRAM_ID = "org.eclipse.papyrus.uml.diagram.component.root.package";
	private static final String PALETTE_CFG_ID = "org.eclipse.papyrus.uml.diagram.component.paletteconfiguration";
	private static final String DRAWER_CFG_ID = "component.group.nodes";
	private static final URI UML_DI_URI = URI.createPlatformPluginURI(
			"/org.eclipse.papyrus.uml.service.types/model/umldi.elementtypesconfigurations", false);

	@Override
	public boolean canHandle(String diagramId) {
		return DIAGRAM_ID.equals(diagramId);
	}

	@Override
	public void customizePalette(PapyrusDiagram diagram) {
		Optional<PaletteConfiguration> relevantPaletteConfiguration = diagram.getPalettes().stream()
				.filter(pc -> PALETTE_CFG_ID.equals(pc.getId()))
				.findFirst();
		if (!relevantPaletteConfiguration.isPresent()) {
			return;
		}

		Optional<DrawerConfiguration> nodeConfiguration = relevantPaletteConfiguration.get().getDrawerConfigurations()
				.stream().filter(dc -> DRAWER_CFG_ID.equals(dc.getId())).findFirst();
		if (!nodeConfiguration.isPresent()) {
			return;
		}

		ToolConfiguration classToolCfg = createClassToolConfiguration(diagram);
		nodeConfiguration.get().getOwnedConfigurations().add(classToolCfg);
	}

	private ToolConfiguration createClassToolConfiguration(PapyrusDiagram diagram) {
		ToolConfiguration classToolCfg = PaletteconfigurationFactory.eINSTANCE.createToolConfiguration();
		classToolCfg.setId(CLASS_TOOL_ID);
		classToolCfg.setLabel(CLASS_TOOL_LABEL);
		classToolCfg.setDescription(CLASS_TOOL_DESCRIPTION);
		IconDescriptor iconDescriptor = PaletteconfigurationFactory.eINSTANCE.createIconDescriptor();
		iconDescriptor.setPluginID(CLASS_TOOL_PLUGIN_ID);
		iconDescriptor.setIconPath(CLASS_TOOL_ICON_PATH);
		classToolCfg.setIcon(iconDescriptor);

		classToolCfg.getElementDescriptors().add(createElementDescriptor(diagram, CLASS_SHAPE_ID));
		//classToolCfg.getElementDescriptors().add(createElementDescriptor(diagram, CLASS_SHAPE_CN_ID));
		return classToolCfg;
	}

	private static ElementDescriptor createElementDescriptor(PapyrusDiagram diagram, String shapeId) {
		final ElementDescriptor descriptor = PaletteconfigurationFactory.eINSTANCE.createElementDescriptor();
		Optional.ofNullable(
				diagram.eResource().getResourceSet()
						.getResource(UML_DI_URI,
								true))
				.map(r -> r.getEObject(shapeId))
				.filter(ElementTypeConfiguration.class::isInstance).map(ElementTypeConfiguration.class::cast)
				.ifPresent(descriptor::setElementType);
		return descriptor;
	}

}
