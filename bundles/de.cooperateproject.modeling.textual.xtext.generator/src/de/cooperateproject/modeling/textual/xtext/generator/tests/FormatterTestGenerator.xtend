package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import java.io.File
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import static org.eclipse.xtext.xtext.generator.model.TypeReference.*
import java.util.List

class FormatterTestGenerator {
	
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar
	private val List<File> directoryListing
	private val String fileExtension

	new(XtextGeneratorNaming naming, Grammar grammar, List<File> directoryListing, String fileExtension) {
		this.naming = naming
		this.grammar = grammar
        this.directoryListing = directoryListing
        this.fileExtension = fileExtension
	}
	
	def create(JavaFileAccess jva) { 
		jva.content =
		'''
		import org.junit.Test
		
		class FormatterTest extends AbstractFormatterTest {
		
		« FOR file : directoryListing»
			@Test
			def test«file.name.toFirstUpper.replace("."+fileExtension, "")»Model() {
				("«file.name»").test
			}
		«ENDFOR»
			
		}		
		'''
	}
	
}