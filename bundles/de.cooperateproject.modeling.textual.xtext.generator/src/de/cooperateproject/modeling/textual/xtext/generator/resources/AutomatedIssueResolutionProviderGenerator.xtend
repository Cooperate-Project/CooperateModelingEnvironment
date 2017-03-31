package de.cooperateproject.modeling.textual.xtext.generator.resources

import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

import static extension de.cooperateproject.modeling.textual.xtext.generator.resources.GrammarPackageHandlingUtilities.*

class AutomatedIssueResolutionProviderGenerator {
	
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar
	
	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}
	
	def create(JavaFileAccess jva, String simpleClassName) {
		jva.content = '''
		import java.util.Collection;
		
		import com.google.inject.Inject;
		
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionProviderBase;
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
		
		public class «simpleClassName» extends AutomatedIssueResolutionProviderBase {
		
		    @Inject
		    private IAutomatedIssueResolutionFactoryRegistry registry;
		
		    @Override
		    protected Collection<IAutomatedIssueResolutionFactory> findResolutionFactories(String issueCode) {
		    	Collection<IAutomatedIssueResolutionFactory> foundFactories = new HashSet<>();
		    	«FOR e : grammar.getPackages»
		    	foundFactories.addAll(registry.findFactories(«e.getGeneratedEPackageName(grammar, naming)».eINSTANCE, issueCode));
		        «ENDFOR»
		        return foundFactories;
		    }
		
		}

		'''
	}
	
}