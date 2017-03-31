package de.cooperateproject.modeling.textual.xtext.generator.resources

import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

import static extension de.cooperateproject.modeling.textual.xtext.generator.resources.GrammarPackageHandlingUtilities.*

class AutomatedIssueResolutionFactoryBaseGenerator {
	
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar
	
	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}
	
	def create(JavaFileAccess jva, String simpleName) {
		jva.content = '''
		import org.eclipse.emf.ecore.EObject;
		import org.eclipse.emf.ecore.EPackage;
		
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryBase;
		import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker;
		
		public abstract class «simpleName»<T extends EObject>
		        extends AutomatedIssueResolutionFactoryBase<T> {
		
		    public «simpleName»(String issueId, IResolvableChecker<T> checker,
		            Class<T> acceptedType) {
		        super(issueId, checker, acceptedType);
		    }
		
		    @Override
		    public EPackage getSupportedEPackage() {
		        return «grammar.packages.findFirst[true].getGeneratedEPackageName(grammar, naming) ».eINSTANCE;
		    }
		}
		'''	
	}
	
	

	
}