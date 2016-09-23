package de.cooperateproject.modeling.transformation.henshin.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.Trace;
import org.eclipse.emf.henshin.trace.TracePackage;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.papyrus.infra.viewpoints.style.StylePackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Before;
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
	
	HenshinResourceSet resourceSet;
	Module module;
	
	
	@Before
	public void setupHenshinResources () {
		
		// Create a resource set with a base directory:
		resourceSet = new HenshinResourceSet(PATH);
		//TggPackage.eINSTANCE.getName();
		TracePackage.eINSTANCE.getName();
		UMLPackage.eINSTANCE.getName();
		NotationPackage.eINSTANCE.getName();
		StylePackage.eINSTANCE.getName();
		resourceSet.registerXMIResourceFactories("notation");

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
	
		// Load MMs
		resourceSet.registerDynamicEPackages("cls.ecore");
		
		// Load the module:
		module = resourceSet.getModule("cls2notation.henshin", false);
	}
	
	@Test
	public void testForwardTransformation() throws IOException {


		// Load the example model into an EGraph:
		Resource textualClassDiagram = resourceSet.getResource("ClassDiagram.xmi");
		EList<EObject> diagrams = textualClassDiagram.getContents();
		EGraph inputGraph = new EGraphImpl(textualClassDiagram);

		TggTransformationInfo trafoInfo = new TggTransformationInfoImpl();
		//only mark the top most diagram elements
		trafoInfo.fillTranslatedMaps(diagrams, false);
		

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
		Collection<Trace> traces = EcoreUtil.getObjectsByType(graphRoots, TracePackage.eINSTANCE.getTrace());
		Diagram notationDiagram = (Diagram) EcoreUtil.getObjectByType(graphRoots, NotationPackage.eINSTANCE.getDiagram());
		Assert.isTrue(!traces.isEmpty(), "no traces were created");
		
		//Save notation file
		Resource notationRes = resourceSet.createResource("ft_classDiagram.notation");
		notationRes.getContents().add(notationDiagram);
		notationRes.save(Collections.EMPTY_MAP);
		
		//Saves traces
		Resource traceRes = resourceSet.createResource("ft_traces.xmi");
		traceRes.getContents().addAll(traces);
		traceRes.save(Collections.EMPTY_MAP);
		
		
	}
	
	
	@Test
	public void testConsistencyTransformation() throws IOException {


		// Load the example model into an EGraph:
		Resource umlBaseModelRes = resourceSet.getResource("ClassDiagram.uml");
		Resource textualClassDiagramRes = resourceSet.getResource("ClassDiagram.xmi");
		Resource graphicalClassDiagramRes = resourceSet.getResource("ft_classDiagram.notation");
		Resource tracesRes = resourceSet.getResource("ft_traces.xmi");
		EcoreUtil.resolveAll(resourceSet);
		
		EGraph inputGraph = new EGraphImpl(textualClassDiagramRes);
		
		//add graphical diagram
		Diagram papyrusClassDiagram = (Diagram) graphicalClassDiagramRes.getContents().get(0);
		inputGraph.addGraph(papyrusClassDiagram);
		
		//add trace file
		EList<EObject> traces = tracesRes.getContents();
		inputGraph.addAll(traces);
		

		TggTransformationInfo trafoInfo = new TggTransformationInfoImpl();

		trafoInfo.fillTranslatedMaps(inputGraph.getRoots(), false);
		
		// TggHenshineGraph
		// Create an engine and a rule application:
		TggEngine engine = new TggEngineOperational(inputGraph, trafoInfo);
		UnitApplication cls2notation = new TggApplicationImpl(engine, trafoInfo);
		cls2notation.setEGraph(inputGraph);

		// Execute forward transformation
		cls2notation.setUnit(module.getUnit(name_CC_RULE_FOLDER));

		if (!cls2notation.execute(null)) {
			throw new RuntimeException("Error applying TGG");
		}

		List<EObject> graphRoots = inputGraph.getRoots();
		Collection<Trace> newTraces = EcoreUtil.getObjectsByType(graphRoots, TracePackage.eINSTANCE.getTrace());
		 
		Assert.isTrue(!newTraces.isEmpty(), "no traces were created");
		
		
		
		
	}
	

}
