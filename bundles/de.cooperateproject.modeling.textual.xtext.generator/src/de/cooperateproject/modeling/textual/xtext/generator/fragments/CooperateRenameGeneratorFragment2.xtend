package de.cooperateproject.modeling.textual.xtext.generator.fragments

import com.google.inject.Inject
import com.google.inject.Injector
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider
import de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.IRenameUMLElementRefactoringFilter
import java.util.Collection
import java.util.Collections
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.CodeConfig
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2

import static de.cooperateproject.modeling.textual.xtext.generator.util.GrammarPackageHandlingUtilities.*

import static extension org.eclipse.xtext.GrammarUtil.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class CooperateRenameGeneratorFragment2 extends RefactorElementNameFragment2 {

	@Inject Grammar grammar

	@Inject CodeConfig codeConfig

	@Inject FileAccessFactory fileAccessFactory
	
	@Inject extension XtextGeneratorNaming naming

	override generate() {
		generateInjectorProvider()
		generateRenameFilter()
		adjustProjectConfig()
	}

	
	private def getInjectorProviderName() {
		injectorProviderNameString.typeRef
	}
	
	private def String getInjectorProviderNameString()
		'''«grammar.eclipsePluginBasePackage».internal.«grammar.simpleName»InjectorProvider'''
	
	private def getRenameFilterName() {
		renameFilterNameString.typeRef
	}
	
	private def String getRenameFilterNameString()
	'''«grammar.eclipsePluginBasePackage».refactoring.rename.«grammar.simpleName»RenameUMLElementRefactoringFilter'''
	
	private def getUMLReferencingElementName() {
		"de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement".typeRef
	}
	
	private def generateInjectorProvider() {
		fileAccessFactory.createJavaFile(injectorProviderName) => [
				content = generateInjectorProviderContent
				writeTo(projectConfig.eclipsePlugin.srcGen)
			]
	}
	
	private def getEPackage() {
		getGeneratedEPackageName(grammar.metamodelDeclarations.findFirst[alias === null].EPackage, grammar, naming).typeRef
	}
	
	private def StringConcatenationClient generateInjectorProviderContent() '''
		/**
		 * Language-specific injector provider.
		 */
		public class «injectorProviderName.simpleName» implements «IInjectorProvider» {
		
		    @«Inject»
		    private «Injector» injector;
		
		    @Override
		    public «EPackage» getEPackage() {
		        return «EPackage».eINSTANCE;
		    }
		
		    @Override
		    public «Injector» getInjector() {
		        return injector;
		    }
		
		}
	'''
	
	private def generateRenameFilter() {
		fileAccessFactory.createJavaFile(renameFilterName) => [
				content = generateRenameFilterContent
				writeTo(projectConfig.eclipsePlugin.src)
			]
	}
	
	private def StringConcatenationClient generateRenameFilterContent() '''
		/**
		 * Element filter for {@link «UMLReferencingElementName»} elements that shall not be usable in the according rename
		 * refactoring.
		 */
		public class «renameFilterName.simpleName» implements «IRenameUMLElementRefactoringFilter» {
		
		    private static final «Collection»<«EClass»> BLOCKED_ECLASSES = «Collections».emptySet();
		
		    @Override
		    public boolean prohibitRefactoring(«UMLReferencingElementName»<? extends «"org.eclipse.uml2.uml.Element".typeRef»> element) {
		        return BLOCKED_ECLASSES.contains(element.eClass());
		    }
		
		}
	'''
	
	private def adjustProjectConfig() {
		if (projectConfig.eclipsePlugin?.pluginXml !== null) {
			projectConfig.eclipsePlugin.pluginXml.entries += '''
				<!-- Cooperate Refactoring -->
				<extension
					point="de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.providers">
					<class
						class="«grammar.eclipsePluginExecutableExtensionFactory»:«injectorProviderName»">
					</class>
				</extension>
				<extension
					point="de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.filter">
					<class
						class="«grammar.eclipsePluginExecutableExtensionFactory»:«renameFilterName»">
					</class>
				</extension>
				<extension point="org.eclipse.ui.menus">
					<menuContribution
						locationURI="popup:#TextEditorContext?after=group.edit">
						<command commandId="de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename"
							style="push">
							<visibleWhen checkEnabled="false">
								<reference
									definitionId="«grammar.name».Editor.opened">
								</reference>
							</visibleWhen>
						</command>
					</menuContribution>
				</extension>
			'''
		}
	}

}
