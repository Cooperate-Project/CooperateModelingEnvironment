package de.cooperateproject.ui.focus.filter;

import de.cooperateproject.modeling.common.types.DiagramTypes;

@FunctionalInterface
public interface IElementFilterWithSubject {

    DiagramTypes getCoveredDiagramType();

}
