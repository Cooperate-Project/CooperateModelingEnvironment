package de.cooperateproject.ui.focus.internal.model;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.ui.focus.filter.IElementFilter;

public class GroupedElementFilter implements IElementFilter {

    private final Collection<IElementFilter> elementFilters;

    @SuppressWarnings("unchecked")
    public GroupedElementFilter(Collection<? extends IElementFilter> elementFilters) {
        this.elementFilters = (Collection<IElementFilter>) elementFilters;
    }

    @Override
    public boolean isSupported(EObject object) {
        return elementFilters.stream().allMatch(f -> f.isSupported(object));
    }

}
