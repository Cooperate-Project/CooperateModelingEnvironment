package de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

public interface IConflictingIssueFilterRegistry {

    Collection<IConflictingIssueFilter> findFilters(Collection<EPackage> ePackages);

}
