package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.ClsStandaloneSetup;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

public class GraphicalToTextualClassTest extends PlainTransformationTestBase {

	private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Class.qvto");

	static {
		ClsPackage.eINSTANCE.eClass();
		ClsStandaloneSetup.doSetup();
	}

	@Test
	public void test() throws Exception {
		URI sourceModelURI = createResourceModelURI("ClassDiagram.notation");
		URI umlModelURI = createResourceModelURI("ClassDiagram.uml");
		URI resultModelURI = createResourceModelURI("ClassDiagram.xmi");
		
		ModelExtent transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI);
		
		EObject expected = getRootElement(resultModelURI);
		EObject actual = transformationResult.getContents().get(0);
		EcoreUtil.resolveAll(getResourceSet());
		
		assertModelEquals(expected, actual);
	}
	


}
