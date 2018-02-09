package de.cooperateproject.modeling.graphical.papyrus.extensions;

import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;

/**
 * Interface for realizing palette customizers.
 * 
 * @author henss
 *
 */
public interface IPaletteCustomization {

    /**
     * Check whether this diagram is supported by the customizer.
     * 
     * @param diagram
     * @return
     */
    default public boolean canHandle(PapyrusDiagram diagram) {
        return canHandle(diagram.getId());
    }

    /**
     * Check whether the provided diagramId is supported.
     * 
     * @param diagramId
     * @return
     */
    public boolean canHandle(String diagramId);

    /**
     * Customize the palette entries.
     * 
     * @param diagram
     */
    public void customizePalette(PapyrusDiagram diagram);

}
