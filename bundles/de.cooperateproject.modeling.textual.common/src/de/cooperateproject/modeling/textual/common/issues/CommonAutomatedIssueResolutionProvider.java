package de.cooperateproject.modeling.textual.common.issues;

import java.util.Collection;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionProviderBase;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;

public class CommonAutomatedIssueResolutionProvider extends AutomatedIssueResolutionProviderBase {

    @Inject
    private IAutomatedIssueResolutionFactoryRegistry registry;

    @Override
    protected Collection<IAutomatedIssueResolutionFactory> findResolutionFactories(String issueCode) {
        return registry.findFactories(TextualCommonsPackage.eINSTANCE, issueCode);
    }

}
