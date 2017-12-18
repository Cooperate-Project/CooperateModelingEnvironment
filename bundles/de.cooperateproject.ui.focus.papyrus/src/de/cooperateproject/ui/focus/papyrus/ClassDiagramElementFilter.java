package de.cooperateproject.ui.focus.papyrus;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.ui.focus.filter.IElementFilterWithSubject;

/**
 * Filters class diagrams.
 * 
 * @author czogalik
 *
 */
public class ClassDiagramElementFilter implements IElementFilterWithSubject {

    @Override
    public IDiagramType getCoveredDiagramType() {
        return DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.CLASS).get();
    }

}
