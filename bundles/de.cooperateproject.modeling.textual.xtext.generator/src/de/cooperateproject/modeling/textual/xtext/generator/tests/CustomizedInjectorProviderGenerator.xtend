package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.eclipse.xtext.GrammarUtil
import static org.eclipse.xtext.xtext.generator.model.TypeReference.*
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider

class CustomizedInjectorProviderGenerator {

	private val extension XtextGeneratorNaming naming
	private val Grammar grammar

	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}

	def create(JavaFileAccess jva, String simpleClassName) {
		jva.content =
			'''
			public class «simpleClassName» extends «typeRef(getInjectorProviderName())»
			{
			
				public static class DefaultProvider extends «simpleClassName» {
					public DefaultProvider() {
					      	super(«typeRef(customizedRuntimeModuleName)».class);
					}
				}	
			
				private final «grammar.runtimeModule» module;
			
				public «simpleClassName»(«grammar.runtimeModule» module) {
					this.module = module;
				}
			
				public «simpleClassName»(Class<? extends «grammar.runtimeModule»> moduleClass) {
				    try {
						this.module = moduleClass.newInstance();
						  } catch (InstantiationException | IllegalAccessException e) {
						      throw new RuntimeException(e);
					}
				}
			
				@Override
				protected «grammar.runtimeModule» createRuntimeModule() {
				    return module;
				}
			
			}
		'''

	}
	
	private def getInjectorProviderName() {
		return naming.getRuntimeTestBasePackage(grammar) + "." + GrammarUtil.getSimpleName(grammar) + "InjectorProvider";
	}
	
	private def getCustomizedRuntimeModuleName() {
		return naming.getRuntimeTestBasePackage(grammar) + ".scoping.util." + GrammarUtil.getSimpleName(grammar) + "CustomizedRuntimeModule";
	}

}
