package de.cooperateproject.ui.focus.papyrus;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.ui.focus.filter.IElementFilterWithSubject;

/**
 * Filters class diagrams.
 * 
 * @author czogalik
 *
 */
public class ClassDiagramElementFilter implements IElementFilterWithSubject {

    @Override
    public DiagramTypes getCoveredDiagramType() {
        return DiagramTypes.CLASS;
    }

}
