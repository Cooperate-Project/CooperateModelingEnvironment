
package de.cooperateproject.uml.xtext.clazz

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDiagram
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import de.cooperateproject.uml.xtext.clazz.umlDsl.ClassDef
import org.junit.Assert
import de.cooperateproject.uml.xtext.clazz.umlDsl.Name

@RunWith(XtextRunner)
@InjectWith(UmlDslInjectorProvider)
class UmlDslParsingTest {
	@Inject extension ParseHelper<ClassDiagram>
	@Inject extension ValidationTestHelper
	
	@Test
	def classDefTest() {
		val model = '''
		@startclass
		class {Alice, Bob}
		@endclass
		'''.parse
		
		val classes = (model.elements.head as ClassDef).classes
		Assert::assertEquals(2, classes.size)
		Assert::assertEquals("Alice", (classes.get(0) as Name).name)
		Assert::assertEquals("Bob", (classes.get(1) as Name).name)
	}
	
	@Test
	def interfaceDefTest() {
		val model = '''
		@startclass
		interface {Alice, Bob}
		@endclass
		'''.parse
		
		val classes = (model.elements.head as ClassDef).classes
		Assert::assertEquals(2, classes.size)
		Assert::assertEquals("Alice", (classes.get(0) as Name).name)
		Assert::assertEquals("Bob", (classes.get(1) as Name).name)
	}
	
}