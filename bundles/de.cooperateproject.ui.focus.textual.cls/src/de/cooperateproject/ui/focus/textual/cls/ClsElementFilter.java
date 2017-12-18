package de.cooperateproject.ui.focus.textual.cls;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.ui.focus.filter.IElementFilterWithSubject;

public class ClsElementFilter implements IElementFilterWithSubject {

    @Override
    public IDiagramType getCoveredDiagramType() {
        return DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.CLASS).get();
    }

}
