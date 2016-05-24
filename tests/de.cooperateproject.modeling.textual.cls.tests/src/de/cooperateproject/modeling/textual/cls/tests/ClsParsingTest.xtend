/*
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.textual.cls.tests

import com.google.inject.Inject
import java.util.Map

import org.junit.Assert
import org.junit.Test
import org.junit.BeforeClass
import org.junit.AfterClass
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
//import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EPackage.Registry
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cooperateproject.modeling.textual.cls.ClsInjectorProvider

@RunWith(XtextRunner)
@InjectWith(ClsInjectorProvider)
class ClsParsingTest {
	@Inject extension ParseHelper<ClassDiagram>
	//@Inject extension ValidationTestHelper
	
	private static val TEST_FOLDER = "testmodels/"
	
	private static Resource.Factory.Registry registry
	private static Map<String, Object> map
	private static Registry preg
	
	@BeforeClass
	static def void ressourceSetUp() {
		registry = Resource.Factory.Registry.INSTANCE
		
		map = registry.getExtensionToFactoryMap()
		map.put("xmi", new XMIResourceFactoryImpl())

		preg = EPackage.Registry.INSTANCE
		preg.replace(ClsPackage.eNS_URI, ClsPackage.eINSTANCE)
	}
	
	@AfterClass
	static def void cleanUp() {
		registry = null
		map = null
		preg = null
	}
	
	def ClassDiagram getDiagram(String uri) {
		val resSet = new ResourceSetImpl()
    	val resource = resSet.getResource(URI.createURI(uri), true) 
    	
   		return resource.getContents().get(0) as ClassDiagram
	}
	
	def compare(ClassDiagram expected, ClassDiagram diagram) {
		val scope = new DefaultComparisonScope(expected, diagram, null)
		val comparison = EMFCompare.builder().build().compare(scope)
		return comparison.getDifferences();
	}
	
	def assertEqualsModel(ClassDiagram expected, ClassDiagram diagram) {		
		EcoreUtil.resolveAll(expected)
		val diff = compare(expected, diagram)
		try {
			Assert::assertTrue(diff.isEmpty)
		} catch(AssertionError e) {
			println("Differences:")
			printDiff(diff)
			throw(e)
		}
	}
	
	def printDiff(EList<Diff> diff) {
		for(d : diff) {
			println(d)
		}
	}
	
	@Test
	def void classDefTest() {		
		val xmiModel = getDiagram(TEST_FOLDER + "classDef.xmi")
		val model = '''
			@startclass
			class {Alice, Bob}
			@endclass
		'''.parse		
		
		assertEqualsModel(model, xmiModel)
	}

	@Test
	def interfaceDefTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "interfaceDef.xmi")
		val model = '''
			@startclass
			interface {Alice, Bob}
			@endclass
		'''.parse

		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def longnameToShortnameTest() {
		ClsPackage.eINSTANCE.eClass()
		val xmiModel = getDiagram(TEST_FOLDER + "longnameToShortname.xmi")
		val model = '''
			@startclass
			class {Alice as A}
			A {
			}
			@endclass
		'''.parse
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def abstractClassWithoutMembersTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "abstractClassWithoutMembers.xmi")
		val model = '''
			@startclass
			class {Alice}
			abstract Alice {
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test 
	def classWithAttributesTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classWithAttributes.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				firstName : string
				lastName : string
				age : int
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def classWithMethodesTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classWithMethodes.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				getFirstName() : string
				setFirstName(name : string)
				calculateAge(date : int) : int
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def visibiliesTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "visibilies.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				-firstName : string
				+lastName : string
				~age : int
				#height : int
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def classWithMethodsAndAttributesTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classWithMethodsAndAttributes.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				- firstName : string
				+ getFirstName() : string
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test 
	def classWithStaticAndFinalAttributesTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classWithStaticAndFinalAttributes.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				static firstName : string
				final lastName : string
				static final height : int
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def classWithAbstractStaticAndFinalMethodesTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classWithAbstractStaticAndFinalMethodes.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				abstract buildHouse()
				static getDate() : int
				final getHeight() : int
				abstract static final work()
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def classGeneralizationTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classGeneralization.xmi")
		val model = '''
			@startclass
			class {Person, Alice}
			Alice isa Person
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)		
	}
	
	@Test
	def classImplementationTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classImplementation.xmi")
		val model = '''
			@startclass
			class {Person, Alice}
			Alice impl Person
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def simpleClassAssociationTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "simpleClassAssociation.xmi")
		val model = '''
			@startclass
			class {Alice, Bob}
			Alice - Bob
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def classWithNoteTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classWithNote.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice - note["this is a note"]
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)		
	}
	
	@Test
	def ClassAsscociationWithNoteTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classAsscociationWithNote.xmi")
		val model = '''
			@startclass
			class {Alice, Bob}
			Alice - Bob note["this is a note"]
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
		
	@Test
	def CardinalityTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "cardinality.xmi")
		val model = '''
			@startclass
			class {Alice, Bob}
			Alice - Bob [*]
			Alice - Bob [|1..*]
			Alice - Bob [24|24..42]
			Alice - Bob [*|*|"this is a label"]
			Alice - Bob []
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}

	@Test
	def classAssociationDirectionTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classAssociationDirection.xmi")
		val model = '''
			@startclass
			class {Alice, Bob}
			Alice - Bob [24|42|labelID <]
			Alice - Bob [42|24|labelID >]
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def datatypeTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "datatype.xmi")
		val model = '''
			@startclass
			class {Alice}
			Alice {
				a : string
				b : int 
				c : double
				d : boolean
				e : char
				f : byte
				g : short
				h : long
				i : float
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
	@Test
	def classTypeTest() {
		val xmiModel = getDiagram(TEST_FOLDER + "classType.xmi")
		val model = '''
			@startclass
			class {Alice, Bob}
			Alice {
				bob : Bob
			}
			@endclass
		'''.parse
		
		assertEqualsModel(model, xmiModel)
	}
	
}
