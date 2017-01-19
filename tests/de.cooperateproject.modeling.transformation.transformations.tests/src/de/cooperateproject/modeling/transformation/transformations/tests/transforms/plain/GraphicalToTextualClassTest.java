package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

public class GraphicalToTextualClassTest extends PlainTransformationTestBase {

	private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Class.qvto");

	static {
		ClsPackage.eINSTANCE.eClass();
	}
	
	@Test
	public void testWithoutPackages() throws Exception {
		testRegular("ClassDiagram");
	}

	@Test
	public void testWithoutPackagesIncremental() throws Exception {
		testIncremental("ClassDiagram");
	}
	
	@Test
	public void testPackages() throws Exception {
		testRegular("ClassDiagramPackages");
	}
	
	@Test
	public void testPackagesIncremental() throws Exception {
		testIncremental("ClassDiagramPackages");
	}
	
	@Test
	public void testSelfReference() throws Exception {
		testRegular("ClassDiagramSelfReference");
	}
	
	@Test
	public void testSelfReferenceIncremental() throws Exception {
		testIncremental("ClassDiagramSelfReference");
	}
	
	@Test
	public void testDeleteClass() throws Exception {
		URI sourceModelURI = createResourceModelURI("ClassDiagramSingleClass.notation");
		URI umlModelURI = createResourceModelURI("ClassDiagramSingleClass.uml");
		
		// first transformation
		Trace transformationTrace = new Trace(Collections.emptyList());
		ModelExtent transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI, transformationTrace);
		
		// delete class from graphical model
		Resource notationResource = getResourceSet().getResource(sourceModelURI, false);
		Shape umlClassShape = ((Shape)((Diagram)notationResource.getContents().get(0)).getChildren().get(0));
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class)umlClassShape.getElement();
		EcoreUtil.remove(umlClassShape);
		EcoreUtil.remove(umlClass);
		ClassDiagram textualDiagram = (ClassDiagram)transformationResult.getContents().get(0);
		textualDiagram.getRootPackage().getClassifiers().get(0).eUnset(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
		
		// second transformation (incremental)
		transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI, transformationResult, transformationTrace);
		
		assertEquals(0, textualDiagram.getRootPackage().getClassifiers().size());
	}
	
	private void testRegular(String modelName) throws Exception {
		URI sourceModelURI = createResourceModelURI(modelName + ".notation");
		URI umlModelURI = createResourceModelURI(modelName+ ".uml");
		URI resultModelURI = createResourceModelURI(modelName + ".xmi");
		
		ModelExtent transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI);
		
		EObject expected = getRootElement(resultModelURI);
		assertEquals(1, transformationResult.getContents().size());
		EObject actual = transformationResult.getContents().get(0);
		EcoreUtil.resolveAll(getResourceSet());
		
		assertModelEquals(expected, actual);
	}
		
	private void testIncremental(String modelName) throws Exception {
		URI sourceModelURI = createResourceModelURI(modelName + ".notation");
		URI umlModelURI = createResourceModelURI(modelName + ".uml");
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
		
		// unload result and trace
		resultResource.unload();
		traceResource.unload();
		
		// load transformation output model and trace
		resultResource.load(Collections.emptyMap());
		traceResource.load(Collections.emptyMap());		
		EcoreUtil.resolveAll(traceResource);
		
		// execute transformation (incremental)
		transformationResult = new BasicModelExtent(resultResource.getContents());
		assertEquals(1, transformationResult.getContents().size());
		EObject expected = EcoreUtil.copy(transformationResult.getContents().get(0));
		transformationTrace = new Trace(traceResource.getContents());
		transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI, transformationResult, transformationTrace);
		
		// assert
		EObject actual = transformationResult.getContents().get(0);
		EcoreUtil.resolveAll(getResourceSet());
		assertModelEqualsStrict(expected, actual);
	}

}
