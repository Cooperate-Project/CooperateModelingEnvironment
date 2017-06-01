package de.cooperateproject.ui.focus.textual.cls;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.ui.focus.filter.IElementFilterWithSubject;

public class ClsElementFilter implements IElementFilterWithSubject {

    @Override
    public DiagramTypes getCoveredDiagramType() {
        return DiagramTypes.CLASS;
    }

}
