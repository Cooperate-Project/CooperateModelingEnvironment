package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

public interface IAutomatedIssueResolutionFactoryRegistry {

    Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages, String issueId);

    Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages);

    Collection<EPackage> coveredPackages();

    Collection<String> getAvailableIssueCodes();

}