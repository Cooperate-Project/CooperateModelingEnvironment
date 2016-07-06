package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cls.ClsStandaloneSetup;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

public class GraphicalToTextualClassTest extends PlainTransformationTestBase {

	private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Class.qvto");

	static {
		ClsPackage.eINSTANCE.eClass();
	}

	@Override
	protected void beforeTest() throws Exception {
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
		
		((ClassDiagram)expected).getClassifiers().get(0).getReferencedElement();
		
		DefaultComparisonScope scope = new DefaultComparisonScope(expected, actual, null);
		Comparison comparisonResult = EMFCompare.builder().build().compare(scope);
		assertEquals(pretty(comparisonResult), 0, comparisonResult.getDifferences().size());
	}
	
	private String pretty(Comparison comparison) throws UnsupportedEncodingException {
		ByteArrayOutputStream baos = null;
		PrintStream ps = null;
		try {
			baos = new ByteArrayOutputStream();
			ps = new PrintStream(baos);
			EMFComparePrettyPrinter.printDifferences(comparison, ps);
			return new String(baos.toByteArray(), "UTF-8");
		} finally {
			IOUtils.closeQuietly(ps);
			IOUtils.closeQuietly(baos);
		}
	}

}
