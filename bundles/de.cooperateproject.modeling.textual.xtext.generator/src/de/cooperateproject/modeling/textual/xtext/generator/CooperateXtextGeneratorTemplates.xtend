package de.cooperateproject.modeling.textual.xtext.generator

import com.google.common.collect.Maps
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Module
import java.util.Collections
import java.util.List
import java.util.Map
import org.eclipse.xtext.util.Modules2
import org.eclipse.xtext.xtext.generator.CodeConfig
import org.eclipse.xtext.xtext.generator.IXtextGeneratorLanguage
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class CooperateXtextGeneratorTemplates {
	
	@Inject CodeConfig codeConfig

	@Inject FileAccessFactory fileAccessFactory
	
	@Inject extension XtextGeneratorNaming naming
	
	new() {
		super()
	}
	
	def JavaFileAccess createEclipsePluginActivator(List<? extends IXtextGeneratorLanguage> langConfigs) {
		val activator = eclipsePluginActivator
		val file = fileAccessFactory.createGeneratedJavaFile(activator)
		
		file.typeComment = '''
			/**
			 * This class was generated. Customizations should only happen in a newly
			 * introduced subclass. 
			 */
		'''
		file.content = '''
			public class «activator.simpleName» extends «'org.eclipse.ui.plugin.AbstractUIPlugin'.typeRef» {
			
				«FOR lang : langConfigs»
					public static final String «lang.grammar.name.toUpperCase.replaceAll('\\.', '_')» = "«lang.grammar.name»";
				«ENDFOR»
				
				private static final «Logger» logger = «LoggerFactory».getLogger(«activator.simpleName».class);
				
				private static «activator.simpleName» INSTANCE;
				
				private «Map»<String, «Injector»> injectors = «Collections».synchronizedMap(«Maps».<String, «Injector»> newHashMapWithExpectedSize(1));
				
				@Override
				public void start(«'org.osgi.framework.BundleContext'.typeRef» context) throws Exception {
					super.start(context);
					INSTANCE = this;
				}
				
				@Override
				public void stop(«'org.osgi.framework.BundleContext'.typeRef» context) throws Exception {
					injectors.clear();
					INSTANCE = null;
					super.stop(context);
				}
				
				public static «activator.simpleName» getInstance() {
					return INSTANCE;
				}
				
				public «Injector» getInjector(String language) {
					synchronized (injectors) {
						«Injector» injector = injectors.get(language);
						if (injector == null) {
							injectors.put(language, injector = createInjector(language));
						}
						return injector;
					}
				}
				
				protected «Injector» createInjector(String language) {
					try {
						«Module» runtimeModule = getRuntimeModule(language);
						«Module» sharedStateModule = getSharedStateModule();
						«Module» uiModule = getUiModule(language);
						«Module» mergedModule = «Modules2».mixin(runtimeModule, sharedStateModule, uiModule);
						return «Guice».createInjector(mergedModule);
					} catch (Exception e) {
						logger.error("Failed to create injector for {}", language);
						logger.error(e.getMessage(), e);
						throw new RuntimeException("Failed to create injector for " + language, e);
					}
				}
				
				protected Module getRuntimeModule(String grammar) {
					«FOR lang : langConfigs»
						if («lang.grammar.name.toUpperCase.replaceAll('\\.', '_')».equals(grammar)) {
							return new «getRuntimeModule(lang.grammar)»();
						}
					«ENDFOR»
					throw new IllegalArgumentException(grammar);
				}
				
				protected «Module» getUiModule(String grammar) {
					«FOR lang : langConfigs»
						if («lang.grammar.name.toUpperCase.replaceAll('\\.', '_')».equals(grammar)) {
							return new «getEclipsePluginModule(lang.grammar)»(this);
						}
					«ENDFOR»
					throw new IllegalArgumentException(grammar);
				}
				
				protected «Module» getSharedStateModule() {
					return new «'org.eclipse.xtext.ui.shared.SharedStateModule'.typeRef»();
				}
				
			}
		'''
		return file
	}

}