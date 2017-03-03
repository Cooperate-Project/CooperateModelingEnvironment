package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;

public interface IAutomatedIssueResolutionProvider {

    /**
     * Provides automatically applicable resolutions for a set of issues regarding a resource.
     * 
     * There does not have to be a resolution for every issue.
     * 
     * @param r
     *            The resource that contains the issues.
     * @param issues
     *            The existing issues.
     * @return A set of issue resolutions.
     */
    Collection<IAutomatedIssueResolution> get(Resource r, Collection<Issue> issues);

}
