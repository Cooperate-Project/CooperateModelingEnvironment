package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Issue;

public abstract class ExistingIssuePreconditionFilterBase implements IConflictingIssueFilter {

    private final int priority;
    private final EPackage supportedEPackage;

    public ExistingIssuePreconditionFilterBase(EPackage supportedEPackage, int priority) {
        this.supportedEPackage = supportedEPackage;
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return this.priority;
    }

    @Override
    public EPackage getSupportedEPackage() {
        return this.supportedEPackage;
    }

    protected abstract Collection<String> getIssueCodesToRemove(String presentIssueCode);

    @Override
    public Stream<Issue> filterConflictingIssues(Stream<Issue> unfilteredIssues) {
        Collection<Issue> diagnostics = unfilteredIssues.collect(Collectors.toCollection(() -> new LinkedList<>()));
        Set<String> issuesToRemove = diagnostics.stream().map(Issue::getCode).distinct()
                .map(this::getIssueCodesToRemove).flatMap(Collection::stream).collect(Collectors.toSet());
        return diagnostics.stream().filter(issue -> !issuesToRemove.contains(issue.getCode()));
    }

}
