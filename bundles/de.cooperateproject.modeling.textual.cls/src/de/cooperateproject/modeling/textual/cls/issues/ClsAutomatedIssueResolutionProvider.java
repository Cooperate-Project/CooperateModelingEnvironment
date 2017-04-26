package de.cooperateproject.modeling.textual.cls.issues;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionProviderBase;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;

public class ClsAutomatedIssueResolutionProvider extends AutomatedIssueResolutionProviderBase {

    private static final Collection<EPackage> REQUIRED_PACKAGES = Arrays.asList(ClsPackage.eINSTANCE,
            TextualCommonsPackage.eINSTANCE);
    @Inject
    private IAutomatedIssueResolutionFactoryRegistry registry;

    @Override
    protected Collection<IAutomatedIssueResolutionFactory> findResolutionFactories(String issueCode) {
        return registry.findFactories(REQUIRED_PACKAGES, issueCode);
    }

}
