package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.transformation.transformations.impl.QVTOResource;

public class GraphicalToTextualClassTraceTest extends TraceRecordTransformationTestBase {

	private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Class.qvto");
	private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_Class.qvto");
	private static final URI G2T_TRACE_TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Class_Trace.qvto");
	
	static {
		ClsPackage.eINSTANCE.eClass();
	}
	
	@Test
	public void testWithoutPackages() throws Exception {
		test("ClassDiagram");
	}
	
	@Test
	public void testWithPackages() throws Exception {
		test("ClassDiagramPackages");
	}
	
	@Test
	public void testSelfReference() throws Exception {
		test("ClassDiagramSelfReference");
	}
	
	private void test(String modelName) throws Exception {
		// test parameters
		URI textualModelURI = createResourceModelURI(modelName + ".xmi");
		URI umlModelURI = createResourceModelURI(modelName + ".uml");
		URI graphicalModelURI = createResourceModelURI(modelName + "_tmp.notation");

		/*
		 * Run original transformation that yields
		 *   - the graphical model
		 *   - the trace model to be compared (expected)
		 */
		ModelExtent textualModel = createModelExtent(textualModelURI);
		ModelExtent umlModel = createModelExtent(umlModelURI);
		ModelExtent graphicalModel = createModelExtent(graphicalModelURI);
		Trace t2gTraceModel = new Trace(Collections.emptyList());
		runTransformation(T2G_MODEL_TRANSFORMATION_URI, textualModel, umlModel, graphicalModel, t2gTraceModel);
		
		/*
		 * Run graphics to text transformation that yields
		 *   - the second textual model
		 *   - the g2t trace model (input for trace transformation)
		 */
		ModelExtent textualModel2 = new BasicModelExtent();
		Trace g2tTrace = new Trace(Collections.emptyList());
		runTransformation(G2T_MODEL_TRANSFORMATION_URI, graphicalModel, umlModel, textualModel2, g2tTrace);
		
		/*
		 * Transform trace model to point to elements of textualModel instead of textualModel2
		 */
		repairTransformationTrace(textualModel, textualModel2, g2tTrace);
		
		/*
		 * Run trace transformation that yields
		 *   - the actual trace model to be compared (actual) 
		 */
		ModelExtent g2tTraceModel = new BasicModelExtent(g2tTrace.getTraceContent());
		ModelExtent actualTraceModel = new BasicModelExtent();
		ModelExtent t2gTransformationModel = new BasicModelExtent(new QVTOResource(T2G_MODEL_TRANSFORMATION_URI, getResourceSet().getPackageRegistry()).getContents());
		runTransformation(G2T_TRACE_TRANSFORMATION_URI, Arrays.asList(g2tTraceModel, actualTraceModel, textualModel, t2gTransformationModel), new Trace(Collections.emptyList()));
		
		// compare expected and actual
		assertTraceEquals(t2gTraceModel, actualTraceModel);
	}

}
