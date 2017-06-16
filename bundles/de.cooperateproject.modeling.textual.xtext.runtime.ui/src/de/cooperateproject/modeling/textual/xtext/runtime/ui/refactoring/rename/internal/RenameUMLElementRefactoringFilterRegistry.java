package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.IRenameUMLElementRefactoringFilter;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum RenameUMLElementRefactoringFilterRegistry {

    INSTANCE;

    private static final String EP_ID = "de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.filter";
    private static final String EP_NAME = "class";
    private final Collection<IRenameUMLElementRefactoringFilter> filters;

    private RenameUMLElementRefactoringFilterRegistry() {
        filters = findFilters();
    }

    public static RenameUMLElementRefactoringFilterRegistry getInstance() {
        return INSTANCE;
    }

    private static Collection<IRenameUMLElementRefactoringFilter> findFilters() {
        return Collections.unmodifiableCollection(
                ExtensionPointHelper.getExtensions(EP_ID, EP_NAME, IRenameUMLElementRefactoringFilter.class));
    }

    public Collection<IRenameUMLElementRefactoringFilter> getFilters() {
        return filters;
    }
}
