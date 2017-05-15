package de.cooperateproject.modeling.textual.sequence.tests.scoping.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.modeling.textual.sequence.SequenceRuntimeModule;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.sequence.tests.SequenceInjectorProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class SequenceCustomizedRuntimeModule extends SequenceRuntimeModule {

    private static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {

        @Override
        public Collection<EPackage> coveredPackages() {
            return Arrays.asList(SequencePackage.eINSTANCE);
        }

        @Override
        public Collection<String> getAvailableIssueCodes() {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages,
                String issueId) {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages) {
            return Collections.emptyList();
        }

    }

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return SequenceInjectorProvider.class.getClassLoader();
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
