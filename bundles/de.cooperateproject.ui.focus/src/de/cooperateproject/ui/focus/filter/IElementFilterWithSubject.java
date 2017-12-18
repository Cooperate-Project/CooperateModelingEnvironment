package de.cooperateproject.ui.focus.filter;

import de.cooperateproject.modeling.common.types.IDiagramType;

@FunctionalInterface
public interface IElementFilterWithSubject {

    IDiagramType getCoveredDiagramType();

}
