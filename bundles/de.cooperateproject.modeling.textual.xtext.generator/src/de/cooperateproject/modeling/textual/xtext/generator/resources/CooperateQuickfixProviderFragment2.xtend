package de.cooperateproject.modeling.textual.xtext.generator.resources

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.xtext.runtime.ui.issues.CooperateQuickfixProvider
import org.apache.commons.lang3.StringUtils
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.ui.quickfix.QuickfixProviderFragment2

import static extension de.cooperateproject.modeling.textual.xtext.generator.resources.GrammarPackageHandlingUtilities.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class CooperateQuickfixProviderFragment2 extends QuickfixProviderFragment2 {
	
	@Inject
	Grammar grammar
	
	@Inject
	XtextGeneratorNaming naming
	
	@Inject
	FileAccessFactory fileAccessFactory
	
	override getQuickfixProviderSuperClass(Grammar g) {
		CooperateQuickfixProvider.typeRef()
	}
	
	override generateXtendQuickfixProvider() {
		fileAccessFactory.createXtendFile(grammar.quickfixProviderClass, '''
			/**
			 * Custom quickfixes.
			 *
			 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
			 */
			class «grammar.quickfixProviderClass.simpleName» extends «grammar.quickfixProviderSuperClass» {
			
				new() {
					super(#[«grammar.packages.toInstanceString»])
				}

			}
		''').writeTo(projectConfig.eclipsePlugin.src)
	}
	
	override generateJavaQuickfixProvider() {
		fileAccessFactory.createJavaFile(grammar.quickfixProviderClass, '''
			/**
			 * Custom quickfixes.
			 *
			 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
			 */
			public class «grammar.quickfixProviderClass.simpleName» extends «grammar.quickfixProviderSuperClass» {
			
				public «grammar.quickfixProviderClass.simpleName»() {
					super(Arrays.asList(«grammar.packages.toInstanceString»));
				}
			
			}
		''').writeTo(projectConfig.eclipsePlugin.src)
	}
	
	private def toInstanceString(Iterable<EPackage> packages) {
		StringUtils.join(packages.map[toInstanceString], ',')
	}
	
	private def toInstanceString(EPackage pkg) '''
		«pkg.getGeneratedEPackageName(grammar, naming)».eINSTANCE
	'''
	
	
}