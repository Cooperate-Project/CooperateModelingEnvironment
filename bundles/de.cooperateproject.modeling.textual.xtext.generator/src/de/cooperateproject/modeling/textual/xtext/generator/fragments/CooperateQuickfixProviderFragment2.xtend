package de.cooperateproject.modeling.textual.xtext.generator.fragments

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.xtext.runtime.ui.issues.CooperateQuickfixProvider
import de.cooperateproject.modeling.textual.xtext.runtime.ui.quickfix.CooperateLanguageResourceHelper
import de.cooperateproject.modeling.textual.xtext.runtime.ui.quickfix.CooperateMarkerResolutionGenerator
import org.apache.commons.lang3.StringUtils
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ui.editor.quickfix.ILanguageResourceHelper
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.ui.quickfix.QuickfixProviderFragment2

import static extension de.cooperateproject.modeling.textual.xtext.generator.util.GrammarPackageHandlingUtilities.*
import static extension org.eclipse.xtext.GrammarUtil.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class CooperateQuickfixProviderFragment2 extends QuickfixProviderFragment2 {
	
	@Inject
	Grammar grammar
	
	@Inject
	extension XtextGeneratorNaming naming
	
	@Inject
	FileAccessFactory fileAccessFactory
	
	override generate() {
		super.generate
		registerGuiceBindingsUi();
	}
	
	def registerGuiceBindingsUi() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(ILanguageResourceHelper.typeRef, CooperateLanguageResourceHelper.typeRef)
                .contributeTo(language.eclipsePluginGenModule);
	}
	
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
					super(#[«GrammarUtil.allEPackagesToValidate(grammar).toInstanceString»])
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
					super(Arrays.asList(«GrammarUtil.allEPackagesToValidate(grammar).toInstanceString»));
				}
			
			}
		''').writeTo(projectConfig.eclipsePlugin.src)
	}
	
	protected override addRegistrationToPluginXml() {
		val markerTypePrefix = projectConfig.eclipsePlugin.name + "." + grammar.simpleName.toLowerCase
		val executableExtensionFactory = grammar.eclipsePluginExecutableExtensionFactory

		projectConfig.eclipsePlugin.pluginXml.entries += '''
			<!-- quickfix marker resolution generator for «grammar.name» -->
			<extension
					point="org.eclipse.ui.ide.markerResolution">
				<markerResolutionGenerator
					class="«executableExtensionFactory»:«CooperateMarkerResolutionGenerator.typeRef»"
					markerType="«markerTypePrefix».check.fast">
					<attribute
						name="FIXABLE_KEY"
						value="true">
					</attribute>
				</markerResolutionGenerator>
				<markerResolutionGenerator
					class="«executableExtensionFactory»:«CooperateMarkerResolutionGenerator.typeRef»"
					markerType="«markerTypePrefix».check.normal">
					<attribute
						name="FIXABLE_KEY"
						value="true">
					</attribute>
				</markerResolutionGenerator>
				<markerResolutionGenerator
					class="«executableExtensionFactory»:«CooperateMarkerResolutionGenerator.typeRef»"
					markerType="«markerTypePrefix».check.expensive">
					<attribute
						name="FIXABLE_KEY"
						value="true">
					</attribute>
				</markerResolutionGenerator>
			</extension>
		'''		
	}
	
	private def toInstanceString(Iterable<EPackage> packages) {
		StringUtils.join(packages.map[toInstanceString], ", ")
	}
	
	private def toInstanceString(EPackage pkg) '''
	«pkg.getGeneratedEPackageName(grammar, naming)».eINSTANCE'''
	
	
}
