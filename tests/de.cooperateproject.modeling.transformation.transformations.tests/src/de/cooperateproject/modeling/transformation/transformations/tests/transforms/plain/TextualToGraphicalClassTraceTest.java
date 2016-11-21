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

public class TextualToGraphicalClassTraceTest extends TraceRecordTransformationTestBase {

	private static final URI T2G_MODEL_TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_Class.qvto");
	private static final URI G2T_MODEL_TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Class.qvto");
	private static final URI T2G_TRACE_TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_Class_Trace.qvto");
	
	static {
		ClsPackage.eINSTANCE.eClass();
	}
	
	@Test
	public void testWithoutPackages() throws Exception {
		testTraceTransformation("ClassDiagram");
	}
	
	@Test
	public void testWithPackages() throws Exception {
		testTraceTransformation("ClassDiagramPackages");
	}
	
	@Test
	public void testSelfReference() throws Exception {
		testTraceTransformation("ClassDiagramSelfReference");
	}
	
	private void testTraceTransformation(String modelName) throws Exception {
		// test parameters
		URI graphicalModelURI = createResourceModelURI(modelName + ".notation");
		URI umlModelURI = createResourceModelURI(modelName + ".uml");
		URI textualModelURI = createResourceModelURI(modelName + "_tmp.xmi");

		/*
		 * Run original transformation that yields
		 *   - the textual model
		 *   - the trace model to be compared (expected)
		 */
		ModelExtent graphicalModel = createModelExtent(graphicalModelURI);
		ModelExtent umlModel = createModelExtent(umlModelURI);
		ModelExtent textualModel = createModelExtent(textualModelURI);
		Trace g2tTraceModel = new Trace(Collections.emptyList());
		runTransformation(G2T_MODEL_TRANSFORMATION_URI, graphicalModel, umlModel, textualModel, g2tTraceModel);
		
		/*
		 * Run text to graphics transformation that yields
		 *   - the second graphical model
		 *   - the t2g trace model (input for trace transformation)
		 */
		ModelExtent graphicalModel2 = new BasicModelExtent();
		Trace t2gTrace = new Trace(Collections.emptyList());
		runTransformation(T2G_MODEL_TRANSFORMATION_URI, textualModel, umlModel, graphicalModel2, t2gTrace);
		
		/*
		 * Transform trace model to point to elements of graphicalModel instead of graphicalModel2
		 */
		repairTransformationTrace(graphicalModel, graphicalModel2, t2gTrace);
		
		/*
		 * Run trace transformation that yields
		 *   - the actual trace model to be compared (actual) 
		 */
		ModelExtent t2gTraceModel = new BasicModelExtent(t2gTrace.getTraceContent());
		ModelExtent actualTraceModel = new BasicModelExtent();
		ModelExtent g2tTransformationModel = new BasicModelExtent(new QVTOResource(G2T_MODEL_TRANSFORMATION_URI, getResourceSet().getPackageRegistry()).getContents());
		runTransformation(T2G_TRACE_TRANSFORMATION_URI, Arrays.asList(t2gTraceModel, actualTraceModel, graphicalModel, g2tTransformationModel), new Trace(Collections.emptyList()));
		
		// compare expected and actual
		assertTraceEquals(g2tTraceModel, actualTraceModel);
	}

}
