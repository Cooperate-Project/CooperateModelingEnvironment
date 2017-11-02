/*
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.textual.cls.tests.parsing

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Member
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.tests.AbstractClsTest
import de.cooperateproject.modeling.textual.cls.tests.util.ClsTestInjectorProvider
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
import java.util.Collections
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.PrimitiveType
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.VisibilityKind
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertNull
import static org.junit.Assert.assertTrue

@InjectWith(ClsTestInjectorProvider.DefaultProvider)
class ClsParsingTest extends AbstractClsTest {
	
	@Inject extension ValidationTestHelper 
	
	override setup() {
		super.setup()
		rs.packageRegistry.put(ClsPackage.eNS_URI, ClsPackage.eINSTANCE)
	}
	
	@Test
	def void diagramTitleWithoutSpaceTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
	}
	
	@Test
	def void diagramTitleWithSpaceTest() {
		val model = '''
			@start-clsd "Some Name"
			rootPackage RootElement
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
	}

	@Test
	def void classDefTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			assertTrue(clsClass instanceof de.cooperateproject.modeling.textual.cls.cls.Class)

			val refClass = clsClass.referencedElement
			assertTrue(refClass instanceof Class)
			assertEquals("Alice", refClass.name)
		]
	}

	/**
	 * Checks and returns an expected cls class from a given list.
	 * @param classifiers an iterable of all possible classifiers.
	 * @param expectedClassifier the expected class name.
	 * @return the expected cls class.
	 */
	private def de.cooperateproject.modeling.textual.cls.cls.Class findAndCheckClass(Iterable<Classifier> classifiers, String expectedClassifier) {
		val clsClass = findAndCheckClassifier(classifiers, expectedClassifier)
		assertTrue(clsClass instanceof de.cooperateproject.modeling.textual.cls.cls.Class)
		return clsClass as de.cooperateproject.modeling.textual.cls.cls.Class
	}

	/**
	 * Checks and returns an expected cls interface from a given list.
	 * @param classifiers an iterable of all possible classifiers.
	 * @param expectedClassifier the expected interface name.
	 * @return the expected cls interface.
	 */
	private def Interface findAndCheckInterface(Iterable<Classifier> classifiers, String expectedClassifier) {
		val clsInterface = findAndCheckClassifier(classifiers, expectedClassifier)
		assertTrue(clsInterface instanceof Interface)
		return clsInterface as Interface
	}

	/**
	 * Checks and returns an expected cls classifier from a given list.
	 * @param classifiers an iterable of all possible classifiers.
	 * @param expectedClassifier the expected classifier name.
	 * @return the expected cls classifier.
	 */
	private def Classifier findAndCheckClassifier(Iterable<Classifier> classifiers, String expectedClassifier) {
		val clsClass = classifiers.findFirst[x|x.name.equals(expectedClassifier)]
		assertNotNull(clsClass)
		return clsClass
	}

	@Test
	def void interfaceDefTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			interface IAlice {}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsInterface = findAndCheckInterface(allTransitiveClassifiers.filter(Classifier), "IAlice")

			val refInterface = clsInterface.referencedElement
			assertTrue(refInterface instanceof org.eclipse.uml2.uml.Interface)
			assertEquals("IAlice", refInterface.name)
		]
	}

	@Test
	def void correctAliasUseTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class AA as "Alias Alice" {
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alias Alice")
			assertEquals("AA", clsClass.alias)

			val refClass = clsClass.referencedElement
			assertTrue(refClass instanceof Class)
			assertEquals("Alias Alice", refClass.name)
			assertEquals("AA", refClass.nameExpression.name)
		]
	}

	@Test(expected=AssertionError)
	def void wrongAliasUseWithoutAliasTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class "Alias Alice"
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
	}

	@Test(expected=AssertionError)
	def void wrongAliasUseIDWithAliasTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice as AA
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
	}

	@Test
	def void abstractClassWithoutMembersTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			abstract class AbstractAlice {
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "AbstractAlice")
			assertTrue((clsClass as de.cooperateproject.modeling.textual.cls.cls.Class).abstract)

			val refClass = clsClass.referencedElement
			assertTrue(refClass instanceof Class)
			assertEquals("AbstractAlice", refClass.name)
			assertTrue((refClass as Class).abstract)
		]
	}

	@Test
	def void classWithAttributesTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice {
				name : string
				static age : int
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")

			val clsMembers = clsClass.members
			assertEquals(2, clsMembers.size)

			val nameMember = clsMembers.findFirst[x|x.name.equals("name")] as Attribute
			val ageMember = clsMembers.findFirst[x|x.name.equals("age")] as Attribute

			assertTrue(nameMember.type instanceof PrimitiveType)
			assertEquals("EString", nameMember.type.name)

			assertTrue(ageMember.type instanceof PrimitiveType)
			assertEquals("EInt", ageMember.type.name)
		]
	}

	@Test
	def void classWithMethodesTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice {
				static getName() : string
				setName(name : string)
				abstract calculateAge(date : int) : int
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")

			val clsMembers = clsClass.members
			assertEquals(3, clsMembers.size)

			val getNameMember = clsMembers.findFirst[x|x.name.equals("getName")] as Method
			val setNameMember = clsMembers.findFirst[x|x.name.equals("setName")] as Method
			val calculateAgeMember = clsMembers.findFirst[x|x.name.equals("calculateAge")] as Method

			checkType(getNameMember, "EString")
			assertEquals(0, getNameMember.parameters.size)

			val setNameMemberParameter = setNameMember.parameters
			assertNull(setNameMember.type)
			assertEquals(1, setNameMemberParameter.size)
			assertEquals("name", setNameMemberParameter.last.name)
			assertTrue(setNameMemberParameter.last.type instanceof PrimitiveType)
			assertEquals("EString", setNameMemberParameter.last.type.name)

			checkType(calculateAgeMember, "EInt")

			val calculateAgeMemberParameter = calculateAgeMember.parameters
			assertEquals(1, calculateAgeMemberParameter.size)
			assertEquals("date", calculateAgeMemberParameter.last.name)
			assertTrue(calculateAgeMemberParameter.last.type instanceof PrimitiveType)
			assertEquals("EInt", calculateAgeMemberParameter.last.type.name)
		]
	}

	@Test
	def void visibiliesTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice {
				+name : string
				- static age : int
				# static getName() : string
				#setName(name : string)
				~ abstract calculateAge(date : int) : int
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")

			val clsMembers = clsClass.members
			assertEquals(5, clsMembers.size)

			val nameMember = clsMembers.findFirst[x|x.name.equals("name")] as Attribute
			val ageMember = clsMembers.findFirst[x|x.name.equals("age")] as Attribute

			val getNameMember = clsMembers.findFirst[x|x.name.equals("getName")] as Method
			val setNameMember = clsMembers.findFirst[x|x.name.equals("setName")] as Method
			val calculateAgeMember = clsMembers.findFirst[x|x.name.equals("calculateAge")] as Method

			checkVisibility(nameMember, VisibilityKind.PUBLIC_LITERAL)
			checkVisibility(ageMember, VisibilityKind.PRIVATE_LITERAL)
			checkVisibility(getNameMember, VisibilityKind.PROTECTED_LITERAL)
			checkVisibility(setNameMember, VisibilityKind.PROTECTED_LITERAL)
			checkVisibility(calculateAgeMember, VisibilityKind.PACKAGE_LITERAL)
		]
	}

	/**
	 * Checks the visibility of a given member.
	 * @param member the member to check.
	 * @param visibility the visibility the member should have.
	 * @param kind the visibility the referenced element of the member should have.
	 */
	private def void checkVisibility(Member<? extends NamedElement> member, VisibilityKind visibility) {
		assertEquals(visibility, member.visibility)
		assertEquals(visibility, member.referencedElement.visibility)
	}

	@Test
	def void classWithStaticAndFinalAttributesTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice {
				name : string
				static age : int
				
				static getName() : string
				setName(name : string)
				abstract calculateAge(date : int) : int
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")

			val clsMembers = clsClass.members
			assertEquals(5, clsMembers.size)

			val nameMember = clsMembers.findFirst[x|x.name.equals("name")] as Attribute
			val ageMember = clsMembers.findFirst[x|x.name.equals("age")] as Attribute

			val getNameMember = clsMembers.findFirst[x|x.name.equals("getName")] as Method
			val setNameMember = clsMembers.findFirst[x|x.name.equals("setName")] as Method
			val calculateAgeMember = clsMembers.findFirst[x|x.name.equals("calculateAge")] as Method

			checkPropertyQualifier(nameMember, false)
			checkPropertyQualifier(ageMember, true)
			checkOperationQualifier(getNameMember, true, false)
			checkOperationQualifier(setNameMember, false, false)
			checkOperationQualifier(calculateAgeMember, false, true)
		]
	}

	/**
	 * Checks the qualifiers of a given attribute.
	 * @param member the attribute to check.
	 * @param isStatic true if member should be static, false otherwise. 
	 */
	private def void checkPropertyQualifier(Attribute member, boolean isStatic) {
		assertEquals(isStatic, member.isStatic)
		assertEquals(isStatic, member.referencedElement.isStatic)
	}

	/**
	 * Checks the qualifiers of a given method.
	 * @param member the method to check.
	 * @param isStatic true if member should be static, false otherwise. 
	 * @param isAbstract true if member should be abstract, false otherwise. 
	 */
	private def void checkOperationQualifier(Method member, boolean isStatic, boolean isAbstract) {
		assertEquals(isStatic, member.isStatic)
		assertEquals(isAbstract, member.isAbstract)
		assertEquals(isStatic, member.referencedElement.isStatic)
		assertEquals(isAbstract, member.referencedElement.isAbstract)
	}

	@Test
	def void datatypeTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class AliceAllTypes {
				stringMember : string
				intMember : int 
				doubleMember : double
				booleanMember : boolean
				charMember : char
				byteMember : byte
				shortMember : short
				longMember : long
				floatMember : float
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val clsClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "AliceAllTypes")

			val clsMembers = clsClass.members
			assertEquals(9, clsMembers.size)

			val stringMember = clsMembers.findFirst[x|x.name.equals("stringMember")] as Attribute
			val intMember = clsMembers.findFirst[x|x.name.equals("intMember")] as Attribute
			val doubleMember = clsMembers.findFirst[x|x.name.equals("doubleMember")] as Attribute
			val booleanMember = clsMembers.findFirst[x|x.name.equals("booleanMember")] as Attribute
			val charMember = clsMembers.findFirst[x|x.name.equals("charMember")] as Attribute
			val byteMember = clsMembers.findFirst[x|x.name.equals("byteMember")] as Attribute
			val shortMember = clsMembers.findFirst[x|x.name.equals("shortMember")] as Attribute
			val longMember = clsMembers.findFirst[x|x.name.equals("longMember")] as Attribute
			val floatMember = clsMembers.findFirst[x|x.name.equals("floatMember")] as Attribute

			checkType(stringMember, "EString")
			checkType(intMember, "EInt")
			checkType(doubleMember, "EDouble")
			checkType(booleanMember, "EBoolean")
			checkType(charMember, "EChar")
			checkType(byteMember, "EByte")
			checkType(shortMember, "EShort")
			checkType(longMember, "ELong")
			checkType(floatMember, "EFloat")

		]
	}

	/**
	 * Checks the type of a given cls member.
	 * @param member the member to check.
	 * @param expected the expected type name. 
	 */
	private def void checkType(Member member, String expected) {
		assertTrue(member.type instanceof PrimitiveType)
		assertEquals(expected, member.type.name)
	}

	@Test
	def void classTypeTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice
			class Bob {
				alice : Alice
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			val bobClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Bob")

			val bobMembers = bobClass.members
			assertEquals(1, bobMembers.size)
			val bobsMember = bobMembers.findFirst[x|x.name.equals("alice")] as Attribute

			assertTrue(bobsMember.type instanceof Class)
			assertEquals("Alice", (bobsMember.type as Class).name)
		]
	}

	@Test
	def void classGeneralizationTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice
			class Bob
			isa (Bob, Alice)
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Bob")
			val generalization = allTransitiveConnectors.findFirst[x|x instanceof Generalization] as Generalization

			checkConnectorEnds(generalization, "Bob", "Alice")

			assertEquals("Alice", generalization.referencedElement.general.name)

		]
	}

	@Test
	def void classImplementationTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Bob
			interface IBob
			impl (Bob, IBob)
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Bob")
			findAndCheckInterface(allTransitiveClassifiers.filter(Classifier), "IBob")
			val interface = allTransitiveConnectors.findFirst[x|x instanceof Implementation] as Implementation

			checkConnectorEnds(interface, "Bob", "IBob")

			assertEquals("IBob", interface.referencedElement.contract.name)

		]

	}

	@Test
	def void simpleClassAssociationTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice
			class Bob
			asc association (Alice, Bob)
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val aliceClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Bob")
			val associations = allTransitiveConnectors.filter(Association)

			assertEquals(1, associations.size)
			val association = associations.last

			checkConnectorEnds(association, "Alice", "Bob")
			checkUmlConnectorEnds(association.referencedElement, aliceClass, "Alice", "Bob")
		]
	}

	/**
	 * Checks if the association ends of an UML association are as expected.
	 * @param association the association to check.
	 * @param leftClassifier the left side of the association.
	 * @param expectedLeft the expected left class name. 
	 * @param expectedRight the expected right class name. 
	 */
	private def void checkUmlConnectorEnds(org.eclipse.uml2.uml.Association association,
		Classifier<? extends org.eclipse.uml2.uml.Classifier> leftClassifier, String expectedLeft, String expectedRight) {
		var leftAscEnd = association.memberEnds.findFirst[x|x.type.name.equals(expectedLeft)]
		assertNotNull(leftAscEnd)

		var leftProperties = leftClassifier.referencedElement.members.filter(Property)
		var rightAscEnd = leftProperties.findFirst [ x |
			x.association !== null && x.type instanceof Class
		]
		assertEquals(expectedRight, rightAscEnd.type.name)
	}

	/**
	 * Checks if the connector ends of an cls association are as expected.
	 * @param association the association to check.
	 * @param expectedLeft the expected left classifier name. 
	 * @param expectedRight the expected right classifier name. 
	 */
	private def dispatch void checkConnectorEnds(Association association, String expectedLeft, String expectedRight) {
		assertEquals(expectedLeft, association.memberEnds.get(0).type.name)
		assertEquals(expectedRight, association.memberEnds.get(1).type.name)
	}

	/**
	 * Checks if the connector ends of an cls implementation are as expected.
	 * @param implementation the implementation to check.
	 * @param expectedLeft the expected left classifier name. 
	 * @param expectedRight the expected right classifier name. 
	 */
	private def dispatch void checkConnectorEnds(Implementation implementation, String expectedLeft,
		String expectedRight) {
		assertEquals(expectedLeft, implementation.left.name)
		assertEquals(expectedRight, implementation.right.name)
	}

	/**
	 * Checks if the connector ends of an cls generalization are as expected.
	 * @param generalization the generalization to check.
	 * @param expectedLeft the expected left classifier name. 
	 * @param expectedRight the expected right classifier name. 
	 */
	private def dispatch void checkConnectorEnds(Generalization generalization, String expectedLeft,
		String expectedRight) {
		assertEquals(expectedLeft, generalization.left.name)
		assertEquals(expectedRight, generalization.right.name)
	}

	@Test
	def void classWithNoteTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice note "this is a note"
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			val comment = model.eAllContents.filter(Comment).findFirst[true];
			assertTrue(comment.commentedElement instanceof de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement);
			assertEquals("Alice", (comment.commentedElement as de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement).name)
			assertEquals("this is a note", comment.body)
		]

	}
	
		@Test
	def void complexClassWithNoteTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice {
				note "this is a note"
			}
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			val comment = model.eAllContents.filter(Comment).findFirst[true];
			assertTrue(comment.commentedElement instanceof de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement);
			assertEquals("Alice", (comment.commentedElement as de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement).name)
			assertEquals("this is a note", comment.body)
		]

	}

	@Test
	def void ClassAsscociationWithNoteTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class Alice
			class Bob
			asc association (Alice, Bob) note "this is another note"
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model => [
			val aliceClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Alice")
			findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "Bob")
			val association = allTransitiveConnectors.findFirst[x|x instanceof Association] as Association

			checkConnectorEnds(association, "Alice", "Bob")
			checkUmlConnectorEnds(association.referencedElement, aliceClass, "Alice", "Bob")

			assertEquals("this is another note", association.comments.get(0).body)
		]
	}

	@Test
	def void CardinalityTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class AliceAsc 
			class BobAsc
			asc card0 (AliceAsc, BobAsc) card [*]
			asc card1 (AliceAsc, BobAsc) card [42:1..*]
			asc card2 (AliceAsc, BobAsc) card [*:24..42]
			asc card3 (AliceAsc, BobAsc) card [24..42:*]
			asc card4 (AliceAsc, BobAsc) card [*:*]
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model =>
			[
				val aliceClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "AliceAsc")
				findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "BobAsc")
				val associations = allTransitiveConnectors.filter(Association)

				assertEquals(5, associations.size)

				val asc0 = associations.findFirst[x|x.referencedElement.name.equals("card0")]
				val asc1 = associations.findFirst[x|x.referencedElement.name.equals("card1")]
				val asc2 = associations.findFirst[x|x.referencedElement.name.equals("card2")]
				val asc3 = associations.findFirst[x|x.referencedElement.name.equals("card3")]
				val asc4 = associations.findFirst[x|x.referencedElement.name.equals("card4")]

				checkConnectorEnds(asc0, "AliceAsc", "BobAsc")
				checkUmlConnectorEnds(asc0.referencedElement, aliceClass, "AliceAsc", "BobAsc")
				checkConnectorEnds(asc1, "AliceAsc", "BobAsc")
				checkUmlConnectorEnds(asc1.referencedElement, aliceClass, "AliceAsc", "BobAsc")
				checkConnectorEnds(asc2, "AliceAsc", "BobAsc")
				checkUmlConnectorEnds(asc2.referencedElement, aliceClass, "AliceAsc", "BobAsc")
				checkConnectorEnds(asc3, "AliceAsc", "BobAsc")
				checkUmlConnectorEnds(asc3.referencedElement, aliceClass, "AliceAsc", "BobAsc")
				checkConnectorEnds(asc4, "AliceAsc", "BobAsc")
				checkUmlConnectorEnds(asc4.referencedElement, aliceClass, "AliceAsc", "BobAsc")

				// Check UML and cls cardinalities
				val aliceClassMembers = aliceClass.referencedElement.members.filter(Property)
				// card0 [*]
				checkClsCardinality(asc0.memberEnds.get(0).cardinality, asc0.memberEnds.get(1).cardinality, 0, -1, 0, 0)
				checkUMLCardinality(aliceClassMembers, asc0.referencedElement.members.filter(Property), "AliceAsc",
					"BobAsc", 0, -1, 0, -1)

				// card1 [42|1..*]
				checkClsCardinality(asc1.memberEnds.get(0).cardinality, asc1.memberEnds.get(1).cardinality, 42, 42, 1, -1)
				checkUMLCardinality(aliceClassMembers, asc1.referencedElement.members.filter(Property), "AliceAsc",
					"BobAsc", 42, 42, 1, -1)
				// card2 [*|24..42]
				checkClsCardinality(asc2.memberEnds.get(0).cardinality, asc2.memberEnds.get(1).cardinality, 0, -1, 24, 42)
				checkUMLCardinality(aliceClassMembers, asc2.referencedElement.members.filter(Property), "AliceAsc",
					"BobAsc", 0, -1, 24, 42)
				// card3 [24..42|*]
				checkClsCardinality(asc3.memberEnds.get(0).cardinality, asc3.memberEnds.get(1).cardinality, 24, 42, 0, -1)
				checkUMLCardinality(aliceClassMembers, asc3.referencedElement.members.filter(Property), "AliceAsc",
					"BobAsc", 24, 42, 0, -1)
				// card4 [*|*]
				checkClsCardinality(asc4.memberEnds.get(0).cardinality, asc4.memberEnds.get(1).cardinality, 0, -1, 0, -1)
				checkUMLCardinality(aliceClassMembers, asc4.referencedElement.members.filter(Property), "AliceAsc",
					"BobAsc", 0, -1, 0, -1)

			]
	}

	/**
	 * Checks the cls cardinality of an association.
	 * @param left the left Cardinality.
	 * @param right the right Cardinality.
	 * @param leftLower the lower limit of the left side of the association. 
	 * @param leftUpper the upper limit of the left side of the association. 
	 * @param rightLower the lower limit of the right side of the association. 
	 * @param rightUpper the upper limit of the right side of the association.
	 */
	private def void checkClsCardinality(Cardinality left, Cardinality right, int leftLower, int leftUpper,
		int rightLower, int rightUpper) {
		checkClsCardinality(left, leftLower, leftUpper)
		if (right !== null) {
			checkClsCardinality(right, rightLower, rightUpper)
		}
	}

	/**
	 * Checks the cls cardinality of one side of an association.
	 * @param cardinality Cardinality to check.
	 * @param lower the lower limit of one side of the association. 
	 * @param upper the upper limit of one side of the association. 
	 */
	private def void checkClsCardinality(Cardinality cardinality, int lower, int upper) {
		assertEquals(lower, cardinality.lowerBound)
		assertEquals(upper, cardinality.upperBound)
	}

	/**
	 * Checks the UML cardinality of a association.
	 * @param leftProperties the properties of the left side of the association.
	 * @param rightProperties the properties of the right side of the association. 
	 * @param ascLeftName the expected class name of the left side of the association. 
	 * @param ascRightName the expected class name of the right side of the association.  
	 * @param leftLower the lower limit of the left side of the association. 
	 * @param leftUpper the upper limit of the left side of the association. 
	 * @param rightLower the lower limit of the right side of the association. 
	 * @param rightUpper the upper limit of the right side of the association.
	 */
	private def void checkUMLCardinality(Iterable<Property> leftProperties, Iterable<Property> rightProperties,
		String ascLeftName, String ascRightName, int leftLower, int leftUpper, int rightLower, int rightUpper) {

		var leftAscEnd = rightProperties.findFirst[x|x.type.name.equals(ascLeftName)]
		assertEquals(leftUpper, leftAscEnd.upper)
		assertEquals(leftLower, leftAscEnd.lower)

		var rightAscEnd = leftProperties.findFirst [ x |
			/*x.association == asc &&*/ x.type.name.equals(ascRightName) && x.upper == rightUpper &&
				x.lower == rightLower
		]
		assertNotNull(rightAscEnd)
	}

	@Test
	def void bidirectionTest() {
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class AliceBi
			class BobBi
			bi asc bidirection (AliceBi, BobBi)
			bi asc bidirectionCard (AliceBi, BobBi) card [24:42]
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model =>
			[
				val aliceClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "AliceBi")
				val bobClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), "BobBi")
				val associations = allTransitiveConnectors.filter(Association)

				assertEquals(2, associations.size)
				val association = associations.findFirst[x|x.name.equals("bidirection")]
				val associationCard = associations.findFirst[x|x.name.equals("bidirectionCard")]

				checkConnectorEnds(association, "AliceBi", "BobBi")
				assertTrue(association.memberEnds.get(1).navigable)
				checkUmlConnectorEnds(association.referencedElement, aliceClass, "AliceBi", "BobBi")

				checkConnectorEnds(associationCard, "AliceBi", "BobBi")
				assertTrue(associationCard.memberEnds.get(1).navigable)
				checkUmlConnectorEnds(associationCard.referencedElement, aliceClass, "AliceBi",
					"BobBi")

				// check if association is bidirectional in uml
				bidirectionalCardinalityTest(aliceClass.referencedElement.members.filter(Property),
					bobClass.referencedElement.members.filter(Property), "AliceBi", "BobBi", association, 0, -1, 0, -1)

				checkClsCardinality(associationCard.memberEnds.get(0).cardinality,
					associationCard.memberEnds.get(1).cardinality, 24, 24, 42, 42)

				bidirectionalCardinalityTest(aliceClass.referencedElement.members.filter(Property),
					bobClass.referencedElement.members.filter(Property), "AliceBi", "BobBi", associationCard, 24, 24,
					42, 42)

			]
	}

	/**
	 * Checks the cardinality of a bidirectional association.
	 * @param leftProperties the properties of the left side of the association.
	 * @param rightProperties the properties of the right side of the association. 
	 * @param ascLeftName the expected class name of the left side of the association. 
	 * @param ascRightName the expected class name of the right side of the association.  
	 * @param association the association to check. 
	 * @param leftLower the lower limit of the left side of the association. 
	 * @param leftUpper the upper limit of the left side of the association. 
	 * @param rightLower the lower limit of the right side of the association. 
	 * @param rightUpper the upper limit of the right side of the association.
	 */
	private def void bidirectionalCardinalityTest(Iterable<Property> leftProperties, Iterable<Property> rightProperties,
		String ascLeftName, String ascRightName, Association association, int leftLower, int leftUpper, int rightLower,
		int rightUpper) {

		val leftPropertiesFiltered = leftProperties.filter[x|x.association == association.referencedElement]
		val rightPropertiesFiltered = rightProperties.filter[x|x.association == association.referencedElement]

		checkUMLCardinality(leftPropertiesFiltered, rightPropertiesFiltered, ascLeftName, ascRightName, leftLower,
			leftUpper, rightLower, rightUpper)
	}

	@Test
	def void aggregationKindTest() {
		val leftClassName = "AliceAgrKind"
		val rightClassName = "BobAgrKind"
		val associationName = "agrKind0"
		val aggregationName = "agrKind1"
		val compositionName = "agrKind2"
		val model = '''
			@start-clsd "SomeName"
			rootPackage RootElement
			class «leftClassName»
			class «rightClassName»
			asc «associationName» («leftClassName», «rightClassName»)
			agg «aggregationName» («leftClassName», «rightClassName»)
			com «compositionName» («leftClassName», «rightClassName»)
			@end-clsd
		'''.parse(rs)
		assertNoIssues(model)
		model =>
			[
				val aliceClass = findAndCheckClass(allTransitiveClassifiers.filter(Classifier), leftClassName)
				findAndCheckClass(allTransitiveClassifiers.filter(Classifier), rightClassName)
				val associations = allTransitiveConnectors.filter(Association)

				assertEquals(3, associations.size)
				val association = associations.findFirst[x|x.name.equals(associationName)]
				val aggregation = associations.findFirst[x|x.name.equals(aggregationName)]
				val composition = associations.findFirst[x|x.name.equals(compositionName)]

				checkConnectorEnds(association, leftClassName, rightClassName)
				checkConnectorEnds(aggregation, leftClassName, rightClassName)
				checkConnectorEnds(composition, leftClassName, rightClassName)

				checkUmlConnectorEnds(association.referencedElement, aliceClass, leftClassName,
					rightClassName)
				checkUmlConnectorEnds(aggregation.referencedElement, aliceClass, leftClassName,
					rightClassName)
				checkUmlConnectorEnds(composition.referencedElement, aliceClass, leftClassName,
					rightClassName)

				checkAggregationKind(association.referencedElement, AggregationKind.NONE_LITERAL)
				checkAggregationKind(aggregation.referencedElement, AggregationKind.SHARED_LITERAL)
				checkAggregationKind(composition.referencedElement, AggregationKind.COMPOSITE_LITERAL)

			]
	}

	/**
	 * Checks if the aggreagation of the given association is equal to the given aggregation kind.
	 * @param association the given association to check.
	 * @param kind the expected aggregation kind of the association. 
	 */
	private def void checkAggregationKind(org.eclipse.uml2.uml.Association association, AggregationKind kind) {
		var properties = association.members.filter(Property)
		assertNotNull(properties.findFirst[x|x.aggregation == kind])
	}
	
	private static def parse(CharSequence text, ResourceSet rs) {
		val r = rs.createResource(URI.createFileURI("somefile.cls"))
		val is = IOUtils.toInputStream(text);
		r.load(is, Collections.emptyMap());
		return r.contents.get(0) as ClassDiagram
	}

}
