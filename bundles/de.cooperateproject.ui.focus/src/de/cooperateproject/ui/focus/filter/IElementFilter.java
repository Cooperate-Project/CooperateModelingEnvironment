package de.cooperateproject.ui.focus.filter;

import org.eclipse.emf.ecore.EObject;

public interface IElementFilter {

    public boolean isSupported(EObject object);

}
