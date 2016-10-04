package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.junit.Test;

import com.google.common.collect.Lists;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.transformation.transformations.tests.util.MatchValueSideConverter;

public class TextualToGraphicalClassTest extends PlainTransformationTestBase {

	private static final URI TRANSFORMATION_URI = createTransformationURI("Textual_to_Graphical_for_Class.qvto");

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
	
	private void testRegular(String modelName) throws Exception {
		URI sourceModelURI = createResourceModelURI(modelName + ".xmi");
		URI umlModelURI = createResourceModelURI(modelName + ".uml");
		URI resultModelURI = createResourceModelURI(modelName + ".notation");
		
		ModelExtent transformationResult = runTransformation(TRANSFORMATION_URI, sourceModelURI, umlModelURI);

		EObject expected = getRootElement(resultModelURI);
		assertEquals(1, transformationResult.getContents().size());
		EObject actual = transformationResult.getContents().get(0);
		EcoreUtil.resolveAll(getResourceSet());
		
		assertModelEquals(expected, actual, TextualToGraphicalClassTest::postProcessDifferences);
	}
	
	private void testIncremental(String modelName) throws Exception {
		URI sourceModelURI = createResourceModelURI(modelName + ".xmi");
		URI umlModelURI = createResourceModelURI(modelName+ ".uml");
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

	private static Collection<Diff> postProcessDifferences(Collection<Diff> diffs) {
		List<Diff> result = Lists.newLinkedList();

		LinkedList<ReferenceChange> potentialCorrectReferences = Lists
				.newLinkedList(diffs.stream().filter(d -> d instanceof ReferenceChange).map(d -> (ReferenceChange) d)
						.filter(d -> Arrays.asList(NotationPackage.eINSTANCE.getEdge_Source(),
								NotationPackage.eINSTANCE.getEdge_Target()).contains(d.getReference()))
						.collect(Collectors.toSet()));

		while (!potentialCorrectReferences.isEmpty()) {
			ReferenceChange c1 = potentialCorrectReferences.pop();
			Set<ReferenceChange> candidates = potentialCorrectReferences.stream().filter(c -> c.getMatch() == c1.getMatch()).collect(Collectors.toSet());
			if (candidates.size() != 1) {
				continue;
			}
			ReferenceChange c2 = candidates.iterator().next();
			
			Match parentMatch = c1.getMatch();
			
			Connector matchLeft = (Connector)parentMatch.getLeft();
			View matchLeftSource = matchLeft.getSource();
			View matchLeftTarget = matchLeft.getTarget();
			
			Connector matchRight = (Connector)parentMatch.getRight();
			View matchRightSource = matchRight.getSource();
			View matchRightTarget = matchRight.getTarget();
			
			MatchValueSideConverter sideConverter = new MatchValueSideConverter();
			sideConverter.add(parentMatch.getComparison().getMatch(c1.getValue()));
			sideConverter.add(parentMatch.getComparison().getMatch(c2.getValue()));
			
			if (sideConverter.convert(matchLeftSource) == matchRightTarget && sideConverter.convert(matchLeftTarget) == matchRightSource) {
				potentialCorrectReferences.remove(c2);
				result.add(c1);
				result.add(c2);
			}
		}

		return result;
	}

}
