package de.cooperateproject.modeling.textual.cls.tests.scoping.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.tests.ClsInjectorProvider;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class ClsCustomizedRuntimeModule extends ClsRuntimeModule {

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
            return Arrays.asList(ClsPackage.eINSTANCE, TextualCommonsPackage.eINSTANCE);
        }

        @Override
        public Collection<String> getAvailableIssueCodes() {
            return Collections.emptyList();
        }

    }

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return ClsInjectorProvider.class.getClassLoader();
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
