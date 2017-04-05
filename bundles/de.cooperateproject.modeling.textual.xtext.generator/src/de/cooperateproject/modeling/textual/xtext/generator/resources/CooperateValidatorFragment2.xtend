package de.cooperateproject.modeling.textual.xtext.generator.resources

import com.google.inject.Inject
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.validation.ValidatorFragment2
import org.eclipse.xtext.xtext.generator.validation.ValidatorNaming

import static extension org.eclipse.xtext.GrammarUtil.*

class CooperateValidatorFragment2 extends ValidatorFragment2 {
	
	@Inject extension ValidatorNaming
	@Inject FileAccessFactory fileAccessFactory
	
	protected override generateXtendValidatorStub() {
		
		fileAccessFactory.createXtendFile(grammar.validatorClass, '''
			import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
			import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;
			import com.google.inject.Inject;
		
			/**
			 * This class contains custom validation rules. 
			 *
			 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
			 */
			class «grammar.validatorClass.simpleName» extends «grammar.abstractValidatorClass» {
				
				@Inject
				@SuppressWarnings("unused")
				var ICooperateAutomatedValidator automatedValidator;
				
				@Inject
				@SuppressWarnings("unused")
				var IIssueCodeRegistry issueCodeRegistry;
				
			//	public static val INVALID_NAME = 'invalidName'
			//
			//	@Check
			//	def checkGreetingStartsWithCapital(Greeting greeting) {
			//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
			//			warning('Name should start with a capital', 
			//					«grammar.simpleName»Package.Literals.GREETING__NAME,
			//					INVALID_NAME)
			//		}
			//	}
				
			}
		''').writeTo(projectConfig.runtime.src)
	}
	
	protected override generateJavaValidatorStub() {
		fileAccessFactory.createJavaFile(grammar.validatorClass, '''
			import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
			import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;
			import com.google.inject.Inject;
			
			/**
			 * This class contains custom validation rules. 
			 *
			 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
			 */
			public class «grammar.validatorClass.simpleName» extends «grammar.abstractValidatorClass» {
						
				@Inject
				@SuppressWarnings("unused")
				private ICooperateAutomatedValidator automatedValidator;
				
				@Inject
				@SuppressWarnings("unused")
				private IIssueCodeRegistry issueCodeRegistry;
				
			//	public static final INVALID_NAME = 'invalidName'
			//
			//	@Check
			//	public void checkGreetingStartsWithCapital(Greeting greeting) {
			//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
			//			warning("Name should start with a capital",
			//					«grammar.simpleName»Package.Literals.GREETING__NAME,
			//					INVALID_NAME);
			//		}
			//	}
				
			}
		''').writeTo(projectConfig.runtime.src)
	}
	
	private def getAbstractValidatorClass(Grammar grammar) {
		new TypeReference(grammar.validatorClass.packageName, "Abstract" + grammar.validatorClass.simpleName)
	}
}