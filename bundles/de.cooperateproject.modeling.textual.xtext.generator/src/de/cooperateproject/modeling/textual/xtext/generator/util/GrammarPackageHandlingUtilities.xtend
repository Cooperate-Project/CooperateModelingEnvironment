package de.cooperateproject.modeling.textual.xtext.generator.util

import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming

class GrammarPackageHandlingUtilities {
	
	public static def getPackages(Grammar grammar) {
		grammar.metamodelDeclarations.filter(GeneratedMetamodel).map[getEPackage]
	}
	
	public static def String getGeneratedEPackageName(EPackage pack, Grammar grammar, extension XtextGeneratorNaming naming) {
		'''«grammar.runtimeBasePackage».«pack.name».«pack.name.toFirstUpper»Package'''
	}
	
}
