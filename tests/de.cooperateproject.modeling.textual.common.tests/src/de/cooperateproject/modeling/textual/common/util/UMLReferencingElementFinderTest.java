package de.cooperateproject.modeling.textual.common.util;

import static org.junit.Assert.assertSame;

import java.util.Optional;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import dummy.Container;
import dummy.DummyFactory;
import dummy.ReferencingElement;
import dummy.ReferencingElement2;

public class UMLReferencingElementFinderTest {

	private static Container testModel;
	private UMLReferencingElementFinder subject;
	
	@BeforeClass
	public static void init() {
		testModel = createTestModel();
	}
	
	@Before
	public void setUp() throws Exception {
		subject = UMLReferencingElementFinder.create(testModel);
	}

	@Test
	public void testBasicFinding() {
		ReferencingElement wantedElement = (ReferencingElement) testModel.getContent().get(1);
		Optional<ReferencingElement> foundElement = subject.findElement(wantedElement.getReferencedElement(), ReferencingElement.class);
		assertSame(wantedElement, foundElement.get());
	}
	
	@Test
	public void testTypedFinding() {
		ReferencingElement2 wantedElement = (ReferencingElement2) ((Container) testModel.getContent().get(2)).getContent().get(2);
		Optional<ReferencingElement2> foundElement = subject.findElement(wantedElement.getReferencedElement(), ReferencingElement2.class);
		assertSame(wantedElement, foundElement.get());
	}
	
	private static Container createTestModel() {
		Model umlRoot = UMLFactory.eINSTANCE.createModel();
		Container rootElement = DummyFactory.eINSTANCE.createContainer();

		ReferencingElement refElem11 = rootElement.createReferencingElement();
		setElement(umlRoot, refElem11);
		ReferencingElement refElem12 = rootElement.createReferencingElement();
		setElement(umlRoot, refElem12);
		Container cont11 = rootElement.createContainer();
		Container cont21 = cont11.createContainer();
		ReferencingElement refElem21 = cont11.createReferencingElement();
		setElement(umlRoot, refElem21);
		ReferencingElement2 refElem22 = cont11.createReferencingElement2();
		refElem22.setReferencedElement(refElem21.getReferencedElement());

		return rootElement;
	}
	
	private static void setElement(Model umlRoot, UMLReferencingElement<Element> element) {
		Package pkg = UMLFactory.eINSTANCE.createPackage();
		umlRoot.getPackagedElements().add(pkg);
		element.setReferencedElement(pkg);
	}

}
