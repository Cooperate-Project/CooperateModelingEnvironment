package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

public interface IAutomatedIssueResolutionFactoryRegistry {

    Collection<IAutomatedIssueResolutionFactory> findFactories(EPackage ePackage, String issueId);

    Collection<IAutomatedIssueResolutionFactory> findFactories(EPackage ePackage);

    Collection<EPackage> coveredPackages();

    Collection<String> getAvailableIssueCodes();

}