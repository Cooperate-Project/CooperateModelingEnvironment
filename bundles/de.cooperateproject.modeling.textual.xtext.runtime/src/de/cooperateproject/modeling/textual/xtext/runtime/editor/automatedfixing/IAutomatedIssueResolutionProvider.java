package de.cooperateproject.modeling.textual.xtext.runtime.editor.automatedfixing;

import java.util.Collection;

import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.validation.Issue;

public interface IAutomatedIssueResolutionProvider {

    /**
     * Fixes (a part) of the issues given as argument.
     * 
     * @param issues
     *            The existing issues.
     * @return True if further fixes are possible after a new validation.
     */
    Collection<IssueResolution> get(Collection<Issue> issues);

}
