package de.cooperateproject.modeling.transformation.common.impl;

import java.util.Optional;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;
import de.cooperateproject.util.conventions.Constants;

public class TransformationNameUtilsOld {

    public static final String TRACE_FILE_EXTENTION = Constants.TRACE_FILE_EXTENTION;

    public static URI createTraceURI(URI traceTransformationURI, URI from, URI to, URI traceBase) {
        final String fileName = traceTransformationURI.trimQuery().trimFragment().lastSegment();
        String modelSpecificPart = String.format("_f_%s_t_%s", from.lastSegment(), to.lastSegment());
        return traceBase.appendSegment(modelSpecificPart + fileName).trimFileExtension()
                .appendFileExtension(TRACE_FILE_EXTENTION);
    }

    public static TransformationCharacteristic parseTransformationName(String name) {
        String[] segments = name.split("_");
        Validate.inclusiveBetween(3, 4, segments.length);
        String from = segments[0];
        String to = segments[1];
        String diagramType = segments[2];
        // boolean trace = segments.length == 4 && segments[3].equals("Trace");

        Optional<IDiagramType> foundDiagramType = DiagramTypeRegistry.getInstance().getByName(name);
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
