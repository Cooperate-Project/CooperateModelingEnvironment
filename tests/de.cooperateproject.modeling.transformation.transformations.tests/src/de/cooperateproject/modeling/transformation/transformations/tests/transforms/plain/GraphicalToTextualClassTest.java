package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
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

	@Test
	public void testIncremental() throws Exception {
		URI sourceModelURI = createResourceModelURI("ClassDiagram.notation");
		URI umlModelURI = createResourceModelURI("ClassDiagram.uml");
		URI resultModelURI = createTemporaryModelURI();
		URI traceModelURI = createTemporaryModelURI();
		
		// execute transformation
		Trace transformationTrace = new Trace(Collections.emptyList());
		ModelExtent transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI, transformationTrace);
		
		// save transformation result and trace
		Resource resultResource = getResourceSet().createResource(resultModelURI);
		resultResource.getContents().addAll(transformationResult.getContents());
		resultResource.save(Collections.emptyMap());
		Resource traceResource = getResourceSet().createResource(traceModelURI);
		traceResource.getContents().addAll(transformationTrace.getTraceContent());
		traceResource.save(Collections.emptyMap());
		
		resultResource.unload();
		traceResource.unload();
		
		// load transformation output model and trace
		resultResource.load(Collections.emptyMap());
		traceResource.load(Collections.emptyMap());		
		transformationResult = new BasicModelExtent(resultResource.getContents());
		EObject expected = EcoreUtil.copy(transformationResult.getContents().get(0));
		transformationTrace = new Trace(traceResource.getContents());
		
		// execute transformation (incremental)
		transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI, transformationResult, transformationTrace);
		
		// assert
		EObject actual = transformationResult.getContents().get(0);
		EcoreUtil.resolveAll(getResourceSet());
		assertModelEqualsStrict(expected, actual);
	}

}
