/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.tests

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.activity.act.ActPackage
import de.cooperateproject.modeling.textual.activity.act.ActionNode
import de.cooperateproject.modeling.textual.activity.act.ActivityDiagram
import de.cooperateproject.modeling.textual.activity.act.ControlNode
import de.cooperateproject.modeling.textual.activity.act.DecisionNode
import de.cooperateproject.modeling.textual.activity.act.FinalNode
import de.cooperateproject.modeling.textual.activity.act.FlowFinalNode
import de.cooperateproject.modeling.textual.activity.act.ForkNode
import de.cooperateproject.modeling.textual.activity.act.InitialNode
import de.cooperateproject.modeling.textual.activity.act.JoinNode
import de.cooperateproject.modeling.textual.activity.tests.scoping.util.ActivityCustomizedInjectorProvider
import java.util.Collections
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement

@RunWith(XtextRunner)
@InjectWith(ActivityCustomizedInjectorProvider.DefaultProvider)
class ActParsingTest extends AbstractActTest {

	@Inject ValidationTestHelper validationTestHelper

	override setup() {
		super.setup()
		rs.packageRegistry.put(ActPackage.eNS_URI, ActPackage.eINSTANCE)
	}

	@Test
	def void emptyDiagramTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		assertEquals(model.rootPackage.name, "RootElement") 
	}

	@Test
	def void activityNameTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			activityName "Some Name"
			actn A
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		
		assertEquals(model.rootPackage.activity.name, "Some Name") 
	}
	
	@Test
	def void controlNodeTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			ini InitialNode
			fin FinalNode
			ffin FlowFinalNode
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		
		assertEquals(model.rootPackage.activity.nodes.length, 3)
		
		val firstNode = model.rootPackage.activity.nodes.get(0) as ControlNode<?>
		val secondNode = model.rootPackage.activity.nodes.get(1) as ControlNode<?>
		val thirdNode = model.rootPackage.activity.nodes.get(2) as ControlNode<?>
		
		assertEquals(firstNode.name, "InitialNode")
		assertTrue(firstNode instanceof InitialNode)
		assertTrue(secondNode instanceof FinalNode)
		assertTrue(thirdNode instanceof FlowFinalNode)
	}
	
	@Test
	def void activityNodeTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			actn someActivity
			actn anotherActivity as "Another Activity"
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		
		assertEquals(model.rootPackage.activity.nodes.length, 2)
		
		val firstNode = model.rootPackage.activity.nodes.get(0)
		val secondNode = model.rootPackage.activity.nodes.get(1) as AliasedElement
		
		assertEquals(firstNode.name, "someActivity")
		assertEquals(secondNode.name, "Another Activity")
		assertEquals(secondNode.alias, "anotherActivity")
	}
	
	@Test
	def void flowTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			actn someActivity
			actn anotherActivity
			flw(someActivity,anotherActivity)
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		
		assertEquals(model.rootPackage.activity.flows.length, 1)
		assertTrue(model.rootPackage.activity.flows.get(0).source !== null)
		assertTrue(model.rootPackage.activity.flows.get(0).target !== null)
		
		val firstNode = model.rootPackage.activity.flows.get(0).source
		val secondNode = model.rootPackage.activity.flows.get(0).target

		assertEquals(firstNode.name, "someActivity")
		assertEquals(secondNode.name, "anotherActivity")
	}
	
	@Test(expected = AssertionError)
	def void flowWithFailureTest() {
		// Missing activity: "anotherAcivity"
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			actn someActivity
			flw(someActivity,anotherActivity)
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}
	
	@Test
	def void linearDecisionTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			actn A
			actn B
			actn C
			actn D
			decn X
			mrgn Y
			flw(A,Y)
			flw(Y,B)
			flw(B,X)
			flw(X,C) ["one simple test"]
			flw(X,D) ["else"]
			flw(D,Y)
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		
		assertEquals(model.rootPackage.activity.flows.length, 6)
		assertTrue(model.rootPackage.activity.flows.get(3).source !== null)
		assertTrue(model.rootPackage.activity.flows.get(3).target !== null)
		
		
		val conditionFlow = model.rootPackage.activity.flows.get(3)
		val firstNode = conditionFlow.source as ControlNode<?>
		val secondNode = conditionFlow.target

		assertEquals(firstNode.name, "X")
		assertTrue(firstNode instanceof DecisionNode)
		assertEquals(secondNode.name, "C")
		assertEquals(conditionFlow.name, "one simple test")
	}
	
	@Test
	@Ignore
	def void multiFlowTest() {
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			actn A
			actn B
			actn C
			flw(A,B,C)
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		//save(model, rs)
		
		assertEquals(model.rootPackage.activity.flows.length, 1)
		
		// TODO: Reenable Multiflows
		//assertEquals(model.rootPackage.activity.flows.get(0).relatedElements.length, 3)
	}
	
	@Test
	def void parlallelFlowTest() {
		// Example from the documentation
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			actn A
			actn B
			actn C
			actn D
			fork X
			join Y
			join Z
			
			flw(A,X)
			flw(B,Z)
			flw(C,Y)
			flw(D,Y)
			flw(Y,Z)

			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
		
		assertEquals(model.rootPackage.activity.nodes.length, 7)
		
		val firstNode = model.rootPackage.activity.nodes.get(4) as ControlNode<?>
		val secondNode = model.rootPackage.activity.nodes.get(5) as ControlNode<?>

		assertTrue(firstNode instanceof ForkNode)
		assertTrue(secondNode instanceof JoinNode)
	}
	
	@Test
	def void swimlaneTest() {
		// Example from the documentation
		val model = '''
			@start-actd "SomeTitle"
			rootPackage RootElement
			swl Kunde {
			   actn suchen as "Buch suchen"
			   actn kaufen
			}
			swl Mitarbeiter {
			   actn zeigen as "Regal zeigen"
			}

			flw(Kunde.suchen, Mitarbeiter.zeigen) 
			flw(Mitarbeiter.zeigen, Kunde.kaufen)
			@end-actd
		'''.parse(rs)
		validationTestHelper.assertNoIssues(model)
	}

	private static def parse(CharSequence text, ResourceSet rs) {
		val r = rs.createResource(URI.createFileURI("testmodels/testfile.act"))
		val is = IOUtils.toInputStream(text);
		r.load(is, Collections.emptyMap());
		val model = r.contents.get(0) as ActivityDiagram
		return model
	}
	
	private static def save(ActivityDiagram model, ResourceSet rs) {
		val resource = rs.createResource(URI.createFileURI("testmodels/output.xmi"))
		resource.contents.add(model)
		resource.save(Collections.EMPTY_MAP)
	}
}
