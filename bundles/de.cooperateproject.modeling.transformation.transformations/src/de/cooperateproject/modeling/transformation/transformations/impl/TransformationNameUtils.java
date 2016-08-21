package de.cooperateproject.modeling.transformation.transformations.impl;

import java.util.Optional;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.transformation.transformations.Activator;
import de.cooperateproject.modeling.transformation.transformations.registry.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class TransformationNameUtils {

	public static URI createTraceTransformationURI(TransformationCharacteristic characteristics) {
		return createTransformationURI(characteristics, true);
	}
	
	public static URI createTransformationURI(TransformationCharacteristic characteristics) {
		return createTransformationURI(characteristics, false);
	}
	
	private static URI createTransformationURI(TransformationCharacteristic characteristics, boolean trace) {
		final String fileName = TransformationNameUtils.createTransformationFileName(characteristics, trace);
		final String path = String.format("/%s/transforms/%s", Activator.PLUGIN_ID, fileName);
		return URI.createPlatformPluginURI(path, true);
	}
	
	public static URI createTraceURI(TransformationCharacteristic characteristics, URI traceBase) {
		final String fileName = TransformationNameUtils.createTransformationFileName(characteristics);
		return traceBase.appendSegment(fileName).trimFileExtension().appendFileExtension("qvtotrace");
	}
	
	public static TransformationCharacteristic parseTransformationName(String name) {
		String[] segments = name.split("_");
		Validate.inclusiveBetween(3, 4, segments.length);
		String from = segments[0];
		String to = segments[1];
		String diagramType = segments[2];
		//boolean trace = segments.length == 4 && segments[3].equals("Trace");
		
		Optional<DiagramTypes> foundDiagramType = DiagramTypes.getByName(name);
		Optional<ConcreteSyntaxTypes> foundFromSyntax = ConcreteSyntaxTypes.getByName(from);
		Optional<ConcreteSyntaxTypes> foundToSyntax = ConcreteSyntaxTypes.getByName(to);
		Validate.isTrue(foundDiagramType.isPresent(), "The diagram type %s is invalid.", diagramType);
		Validate.isTrue(foundFromSyntax.isPresent(), "The sytax type %s is invalid.", from);
		Validate.isTrue(foundToSyntax.isPresent(), "The sytax type %s is invalid.", to);
		
		return new TransformationCharacteristic(foundDiagramType.get(), foundFromSyntax.get(), foundToSyntax.get());
	}
	
	public static String createTransformationFileName(TransformationCharacteristic characteristics) {
		return createTransformationFileName(characteristics, false);
	}
	
	public static String createTraceTransformationFileName(TransformationCharacteristic characteristics) {
		return createTransformationFileName(characteristics, true);
	}
	
	private static String createTransformationFileName(TransformationCharacteristic characteristics, boolean trace) {
		String baseName = String.format("%s_to_%s_for_%s.qvto", characteristics.getFrom(), characteristics.getTo(),
				characteristics.getDiagramType().getName());
		if (trace) {
			return baseName.replace(".qvto", "_Trace.qvto");
		}
		return baseName;
	}
	
}
