package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.GrammarUtil

import static org.eclipse.xtext.xtext.generator.model.TypeReference.*

class AbstractCustomizedRuntimeModuleGenerator {
	
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar

	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}
	

	def create(JavaFileAccess jva, String simpleClassName) {
		jva.content = 
		'''
		import java.util.Arrays;
		import java.util.Collection;
		import java.util.Collections;
		
		import org.eclipse.emf.ecore.EPackage;
		
		import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
		import de.cooperateproject.modeling.textual.common.services.TextualCommonsTransientStatusProvider;
		import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
		import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;
		import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.DelegatingTransientStatusProvider;
		import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;
		
		public abstract class «simpleClassName» extends «typeRef(runtimeModuleName)» {
		
		    protected static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {
		        @Override
		        public Collection<EPackage> coveredPackages() {
		            return Arrays.asList(«packageName».eINSTANCE, TextualCommonsPackage.eINSTANCE);
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
		
		    private static class StaticallyBoundTransientStatusProvider extends DelegatingTransientStatusProvider {
		        public StaticallyBoundTransientStatusProvider() {
		            super(Arrays.asList(new «typeRef(transientStatusProviderName)»(), new TextualCommonsTransientStatusProvider()));
		        }
		    }
		
		    @Override
		    public ClassLoader bindClassLoaderToInstance() {
		        return «typeRef(injectorProviderName)».class.getClassLoader();
		    }
		
		    @Override
		    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
		        return SameNameUMLURIFinder.class;
		    }
		
		    @Override
		    public Class<? extends IAutomatedIssueResolutionFactoryRegistry> bindIAutomatedIssueResolutionFactoryRegistry() {
		        return DummyFactoryRegistry.class;
		    }
		
		    @Override
		    public abstract Class<? extends IAtomicDerivedStateProcessorRegistry> bindIAtomicDerivedStateProcessorRegistry();
		
		    @Override
		    public Class<? extends ITransientStatusProvider> bindITransientStatusProvider() {
		        return StaticallyBoundTransientStatusProvider.class;
		    }
		
		}
		'''
	}
	
	private def getRuntimeModuleName() {
		return naming.getRuntimeBasePackage(grammar) + "." + GrammarUtil.getSimpleName(grammar) + "RuntimeModule";
	}
	
	private def getInjectorProviderName() {
		return naming.getRuntimeTestBasePackage(grammar) + "." + GrammarUtil.getSimpleName(grammar) + "InjectorProvider";
	}
	
	private def getPackageName() {
		return naming.getRuntimeBasePackage(grammar) + "." + GrammarUtil.getSimpleName(grammar).toLowerCase + "." + GrammarUtil.getSimpleName(grammar) + "Package";
	}
	
	private def getTransientStatusProviderName() {
		return naming.getRuntimeBasePackage(grammar) + ".services." + GrammarUtil.getSimpleName(grammar) + "TransientStatusProvider";
	}

}