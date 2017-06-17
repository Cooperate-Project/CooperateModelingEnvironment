package de.cooperateproject.modeling.textual.component.tests.serializer

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentFactory
import de.cooperateproject.modeling.textual.component.component.Package
import de.cooperateproject.modeling.textual.component.tests.AbstractComponentTest
import de.cooperateproject.modeling.textual.component.tests.scoping.util.ComponentCustomizedInjectorProvider
import java.io.File
import org.apache.commons.io.FileUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.testing.InjectWith
import org.junit.Test

import static org.junit.Assert.*

@InjectWith(ComponentCustomizedInjectorProvider.DefaultProvider)
class ComponentSerializerTest extends AbstractComponentTest {
	static val TEST_FOLDER = "testmodels/serializer/"

	@Inject extension ISerializer
	
	@Test
	def void testMinimalModel() {
		"minimal.component".executeTest[package, umlRoot |
			val c1 = ComponentFactory.eINSTANCE.createClass
			val umlClass = umlRoot.createOwnedClass("Q", false);
			
			c1.name = umlClass.name
			c1.referencedElement = umlClass
			
			val c2 = ComponentFactory.eINSTANCE.createClass
			val umlClass2 = umlRoot.createOwnedClass("Other Q", false);
			val expression = umlClass2.createNameExpression("QQ", null)
			
			c2.name = umlClass2.name
			c2.referencedElement = umlClass2
			c2.alias = expression.name
			
			package.classifiers.add(c1)
			package.classifiers.add(c2)
		]
	}
	
	@Test
	def void testAssociation() {
		"association.component".executeTest[package, umlRoot |
			val c1 = ComponentFactory.eINSTANCE.createClass
			c1.name = "First"
			package.classifiers += c1
			c1.referencedElement = umlRoot.createOwnedType(c1.name, UMLPackage.Literals.CLASS) as org.eclipse.uml2.uml.Class;
			
			val c2 = ComponentFactory.eINSTANCE.createClass
			c2.name = "Second"
			package.classifiers += c2
			c2.referencedElement = umlRoot.createOwnedType(c2.name, UMLPackage.Literals.CLASS) as org.eclipse.uml2.uml.Class;
			
			val a1 = ComponentFactory.eINSTANCE.createXtextAssociation
			a1.name = "foo"
			package.connectors += a1			
			a1.referencedElement = umlRoot.createPackagedElement(a1.name, UMLPackage.Literals.ASSOCIATION) as Association
			
			val m1 = ComponentFactory.eINSTANCE.createAssociationMemberEnd
			m1.type = c1
			a1.memberEnds += m1
			m1.referencedElement = a1.referencedElement.createNavigableOwnedEnd(null, m1.type.referencedElement)
			
			val m2 = ComponentFactory.eINSTANCE.createAssociationMemberEnd
			m2.type = c2
			a1.memberEnds += m2
			m2.referencedElement = a1.referencedElement.createOwnedEnd(null, m2.type.referencedElement)
		]
	}
	
	@FunctionalInterface
	private interface ModelBuilder {
		def void create(Package rootPackage, Model umlRoot)
	}
	
	private def executeTest(String referenceModelName, ModelBuilder modelBuilder) {
		val umlResource = rs.createResource(URI.createURI("foo.uml"))
		val componentResource = rs.createResource(URI.createURI("foo.component"))
		
		val diagram = ComponentFactory.eINSTANCE.createClassDiagram
		diagram.title = "SomeName"		

		val model = UMLFactory.eINSTANCE.createModel
		model.name = "RootElement"
		
		val package = ComponentFactory.eINSTANCE.createPackage
		package.name = model.name
		package.referencedElement = model
		diagram.rootPackage = package
		
		modelBuilder.create(package, model)
		
		umlResource.contents += model
		componentResource.contents += diagram
		
		referenceModelName.test(EcoreUtil.getRootContainer(package))
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
