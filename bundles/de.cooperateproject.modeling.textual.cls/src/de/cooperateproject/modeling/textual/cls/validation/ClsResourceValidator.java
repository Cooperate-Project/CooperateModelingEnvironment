package de.cooperateproject.modeling.textual.cls.validation;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;

public class ClsResourceValidator extends ResourceValidatorImpl {

	@Override
	public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator mon) throws OperationCanceledError {
		List<Issue> issues = super.validate(resource, mode, mon);

		Set<Issue> customIssues = issues.stream().filter(issue -> ClsValidatorIssueId.isContained(issue.getCode()))
				.collect(Collectors.toSet());
		issues = issues.stream().filter(
				i -> customIssues.contains(i) || !customIssues.stream().anyMatch(i2 -> issuesAreForSamePlace(i2, i)))
				.collect(Collectors.toList());

		return issues;
	}

	private static boolean issuesAreForSamePlace(Issue i1, Issue i2) {
		return i1.getOffset().equals(i2.getOffset()) && i1.getLength().equals(i2.getLength());
	}

}
