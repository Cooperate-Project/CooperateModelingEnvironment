package de.cooperateproject.modeling.textual.cls.issues;

import java.util.Collection;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionProviderBase;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;

public class ClsAutomatedIssueResolutionProvider extends AutomatedIssueResolutionProviderBase {

    @Inject
    private IAutomatedIssueResolutionFactoryRegistry registry;

    @Override
    protected Collection<IAutomatedIssueResolutionFactory> findResolutionFactories(String issueCode) {
        return registry.findFactories(ClsPackage.eINSTANCE, issueCode);
    }

}
