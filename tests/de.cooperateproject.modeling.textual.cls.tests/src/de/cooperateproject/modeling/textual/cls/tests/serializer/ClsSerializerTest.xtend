package de.cooperateproject.modeling.textual.cls.tests.serializer

import com.google.inject.Inject
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.junit4.InjectWith
import de.cooperateproject.modeling.textual.cls.tests.scoping.util.ClsCustomizedInjectorProvider
import org.junit.Test
import org.eclipse.xtext.resource.SaveOptions
import org.apache.commons.io.FileUtils
import java.io.File


import static org.junit.Assert.*
import org.eclipse.emf.common.util.URI
import de.cooperateproject.modeling.textual.cls.tests.AbstractClsTest
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.emf.ecore.EObject

@InjectWith(ClsCustomizedInjectorProvider.DefaultProvider)
class ClsSerializerTest extends AbstractClsTest {
	static val TEST_FOLDER = "testmodels/serializer/"

	@Inject extension ISerializer
	
	@Test
	def void testMinimalModel() {
		val diagram = ClsFactory.eINSTANCE.createClassDiagram
		val model = UMLFactory.eINSTANCE.createModel
		model.name = "RootElement"
		
		val umlResource = rs.createResource(URI.createURI("foo.uml"))
		umlResource.contents += model
		val clsResource = rs.createResource(URI.createURI("foo.cls"))
		clsResource.contents += diagram

		val package = ClsFactory.eINSTANCE.createPackage
		package.referencedElement = model
		
		diagram.title = "SomeName"		
		diagram.rootPackage = package
		
		val c1 = ClsFactory.eINSTANCE.createClass
		val umlClass = model.createOwnedClass("Q", false);
		
		c1.referencedElement = umlClass
		
		val c2 = ClsFactory.eINSTANCE.createClass
		val umlClass2 = model.createOwnedClass("Other Q", false);
		val expression = umlClass2.createNameExpression("QQ", null)
		
		c2.referencedElement = umlClass2
		c2.aliasExpression = expression
		
		package.classifiers.add(c1)
		package.classifiers.add(c2)
		
		
		"minimal.cls".test(diagram)
	}
	
	private def test(String modelName, EObject diagram) {
		val path = modelName.getRelativePath
		val expected = path.readText
		val actual = diagram.serialize(SaveOptions.newBuilder.format.options)
		assertEqualsNormalized(expected, actual)
	}	

	private static def getRelativePath(String modelName) {
		return TEST_FOLDER + modelName
	}

	private static def assertEqualsNormalized(String expected, String actual) {
		val normalizedActual = actual.normalize
		val normalizedExpected = expected.normalize
		assertEquals(normalizedExpected, normalizedActual)
	}

	private static def normalize(String text) {
		return text.replaceAll("\\r\\n", "\n").replaceAll("\\n", String.format("%n"))
	}

	private static def readText(String path) {
		return FileUtils.readFileToString(new File(path));
	}
}
