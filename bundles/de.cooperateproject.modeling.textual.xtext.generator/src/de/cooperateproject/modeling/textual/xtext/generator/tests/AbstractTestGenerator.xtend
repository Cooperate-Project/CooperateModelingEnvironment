package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

class AbstractTestGenerator {
	
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar

	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}
	
	def create(JavaFileAccess jva, String simpleClassName) {
		jva.content = '''
			import org.eclipse.emf.ecore.resource.ResourceSet
			import org.junit.Before
			import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
			import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil
			import org.junit.After
			import org.junit.runner.RunWith
			import org.eclipse.xtext.testing.XtextRunner
			
			@RunWith(XtextRunner)
			public abstract class «simpleClassName» {
				var protected ResourceSet rs;
			
				@Before
				def void setup() {
					rs = new ResourceSetImpl
					UMLResourcesUtil.init(rs);
				}
			
				@After
				def void tearDown() {
					if (rs !== null) {
						rs.resources.forEach[r|r.unload]
					}
					rs = null
				}
			}
		'''

	}
	
}