package de.cooperateproject.modeling.textual.xtext.runtime.issues;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;

import com.google.common.collect.Streams;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IConflictingIssueFilter;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IConflictingIssueFilterRegistry;

public class CooperateConflictingIssueFilteringResourceValidator extends ResourceValidatorImpl {
    @Inject
    private IConflictingIssueFilterRegistry filterRegistry;

    @Override
    public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator mon) throws OperationCanceledError {
        List<Issue> issues = super.validate(resource, mode, mon);
        if (!resource.getContents().isEmpty()) {
            EPackage pkg = resource.getContents().iterator().next().eClass().getEPackage();
            Collection<IConflictingIssueFilter> filters = filterRegistry.findFilters(Collections.singletonList(pkg));
            if (!filters.isEmpty()) {
                return filters.stream().reduce(issues.stream(), (is, filter) -> filter.filterConflictingIssues(is),
                        (a, b) -> Streams.concat(a, b)).collect(Collectors.toList());
            }
        }
        return issues;
    }

}
