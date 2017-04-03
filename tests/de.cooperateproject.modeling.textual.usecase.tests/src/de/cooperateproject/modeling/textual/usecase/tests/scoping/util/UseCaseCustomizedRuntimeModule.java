package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.modeling.textual.usecase.UsecaseRuntimeModule;
import de.cooperateproject.modeling.textual.usecase.tests.UsecaseInjectorProvider;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class UseCaseCustomizedRuntimeModule extends UsecaseRuntimeModule {

    private static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(EPackage ePackage, String issueId) {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(EPackage ePackage) {
            return Collections.emptyList();
        }

        @Override
        public Collection<EPackage> coveredPackages() {
            return Arrays.asList(UsecasePackage.eINSTANCE);
        }

        @Override
        public Collection<String> getAvailableIssueCodes() {
            return Collections.emptyList();
        }

    }

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return UsecaseInjectorProvider.class.getClassLoader();
    }

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return SameNameUMLURIFinder.class;
    }

    @Override
    public Class<? extends IAutomatedIssueResolutionFactoryRegistry> bindIAutomatedIssueResolutionFactoryRegistry() {
        return DummyFactoryRegistry.class;
    }

}
