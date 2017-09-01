package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Issue;

public interface IConflictingIssueFilter {

    public int getPriority();

    public EPackage getSupportedEPackage();

    public Stream<Issue> filterConflictingIssues(Stream<Issue> unfilteredIssues);

}
