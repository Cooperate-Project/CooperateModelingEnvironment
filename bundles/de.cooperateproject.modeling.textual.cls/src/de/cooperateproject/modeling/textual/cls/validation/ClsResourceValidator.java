package de.cooperateproject.modeling.textual.cls.validation;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;

/**
 * Used to group similar issues.
 * 
 * @deprecated The class is not used anymore because of a changed grammar and editor mechanics.
 */
@Deprecated
public class ClsResourceValidator extends ResourceValidatorImpl {

    private static final Set<String> ISSUE_CODE_BLACKLIST = Sets.newHashSet("org.eclipse.emf.ecore.4");

    @Inject
    private IIssueCodeRegistry issueCodeRegistry;

    @Override
    public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator mon) throws OperationCanceledError {
        List<Issue> issues = super.validate(resource, mode, mon);

        Map<IssueCoordinate, List<Issue>> issueCluster = issues.stream()
                .collect(Collectors.groupingBy(IssueCoordinate::create));
        Set<Issue> customIssues = issues.stream().filter(issue -> issueCodeRegistry.hasIssueCode(issue.getCode()))
                .collect(Collectors.toSet());

        return issueCluster.entrySet().stream()
                .flatMap(g -> filterIssueGroup(g.getKey(), g.getValue(), customIssues).stream())
                .collect(Collectors.toList());
    }

    private static Collection<Issue> filterIssueGroup(IssueCoordinate issueCoordinate, Collection<Issue> issues,
            Collection<Issue> mandatoryIssues) {
        if (IssueCoordinate.UNKNOWN_ISSUE_COORDINATE.equals(issueCoordinate)) {
            return issues;
        }

        Collection<Issue> filteredIssues = issues.stream().filter(i -> mandatoryIssues.contains(i))
                .collect(Collectors.toList());
        if (filteredIssues.isEmpty()) {
            filteredIssues = issues.stream().filter(i -> !ISSUE_CODE_BLACKLIST.contains(i.getCode()))
                    .collect(Collectors.toList());
            if (filteredIssues.isEmpty()) {
                filteredIssues = issues;
            }
        }
        return filteredIssues;
    }

}
