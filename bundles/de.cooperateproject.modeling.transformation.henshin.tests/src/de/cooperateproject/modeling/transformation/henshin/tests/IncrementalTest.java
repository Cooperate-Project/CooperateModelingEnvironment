package de.cooperateproject.modeling.transformation.henshin.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.TracePackage;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;


import de.tub.tfs.henshin.tgg.interpreter.TggEngine;
import de.tub.tfs.henshin.tgg.interpreter.TggTransformationInfo;
import de.tub.tfs.henshin.tgg.interpreter.impl.TggApplicationImpl;
import de.tub.tfs.henshin.tgg.interpreter.impl.TggEngineOperational;
import de.tub.tfs.henshin.tgg.interpreter.impl.TggTransformationInfoImpl;

public class IncrementalTest {
	
	/**
	 * Relative path to the example model files.
	 */
	public static final String PATH = "models";
	public static final String name_FT_RULE_FOLDER = "FTRuleFolder";
	public static final String name_BT_RULE_FOLDER = "BTRuleFolder";
	public static final String name_CC_RULE_FOLDER = "CCRuleFolder";
	
	
	@Test
	public void testForwardTransformation() throws IOException {

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(PATH);
		//TggPackage.eINSTANCE.getName();
		TracePackage.eINSTANCE.getName();
		UMLPackage.eINSTANCE.getName();
		NotationPackage.eINSTANCE.getName();

		// resourceSet.initPackageImplementation("org.eclipse.emf.henshin.trace.TracePackage");
		// resourceSet.registerXMIResourceFactories("fragment");

		// Load MMs
		resourceSet.registerDynamicEPackages("cls.ecore");
		//resourceSet.registerDynamicEPackages("Right.ecore");

		// Load the module:
		Module module = resourceSet.getModule("cls2notation.henshin", false);

		// Load the example model into an EGraph:
		Resource textualClassDiagram = resourceSet.getResource("ClassDiagram.xmi");
		// persons.load(Collections.EMPTY_MAP);
		// EcoreUtil.resolveAll(module);

		EGraph inputGraph = new EGraphImpl(textualClassDiagram);
		// MarkerUtil.initGraphMarkers(inputGraph, TripleComponent.SOURCE);

		TggTransformationInfo trafoInfo = new TggTransformationInfoImpl();
		trafoInfo.fillTranslatedMaps(inputGraph.getRoots(), false);

		// TggHenshineGraph
		// Create an engine and a rule application:
		TggEngine engine = new TggEngineOperational(inputGraph, trafoInfo);
		UnitApplication cls2notation = new TggApplicationImpl(engine, trafoInfo);
		cls2notation.setEGraph(inputGraph);

		// Execute forward transformation
		cls2notation.setUnit(module.getUnit(name_FT_RULE_FOLDER));

		if (!cls2notation.execute(null)) {
			throw new RuntimeException("Error applying TGG");
		}

		List<EObject> graphRoots = inputGraph.getRoots();
		Collection<Object> traces = EcoreUtil.getObjectsByType(graphRoots, TracePackage.eINSTANCE.getTrace());
		Assert.isTrue(!traces.isEmpty(), "no traces were created");
		
	}
	
	

}
