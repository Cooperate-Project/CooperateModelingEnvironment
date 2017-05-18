package de.cooperateproject.ui.focus.filter;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public interface IElementFilterWithSubject extends IElementFilter {

    DiagramTypes getCoveredDiagramType();

}
