package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

public abstract class DirectionalTransformationTestBase extends PlainTransformationTestBase {

    private final URI transformationURI;
    private final String sourceFileExtension;
    private final String targetFileExtension;

    protected DirectionalTransformationTestBase(URI transformationUri, String sourceFileExtension,
            String targetFileExtension) {
        this.transformationURI = transformationUri;
        this.sourceFileExtension = sourceFileExtension;
        this.targetFileExtension = targetFileExtension;
    }

    protected void testRegular(String modelName) throws Exception {
        testRegular(modelName, c -> Collections.emptyList());
    }

    protected void testRegular(String modelName, Function<Collection<Diff>, Collection<Diff>> diffProcessor)
            throws Exception {
        URI sourceModelURI = createResourceModelURI(modelName + "." + sourceFileExtension);
        URI umlModelURI = createResourceModelURI(modelName + ".uml");
        URI resultModelURI = createResourceModelURI(modelName + "." + targetFileExtension);

        ModelExtent transformationResult = runTransformation(transformationURI, sourceModelURI, umlModelURI);

        EObject expected = getRootElement(resultModelURI);
        assertEquals(1, transformationResult.getContents().size());
        EObject actual = transformationResult.getContents().get(0);
        EcoreUtil.resolveAll(getResourceSet());

        Resource r = getResourceSet().createResource(URI.createFileURI("asdflihjsdaf.xmi"));
        r.getContents().add(actual);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMIResource.OPTION_ENCODING, "UTF-8");
        options.put(XMIResource.OPTION_USE_XMI_TYPE, true);
        options.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, true);
        options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        r.save(baos, options);
        System.out.println(baos.toString());

        assertModelEquals(expected, actual, diffProcessor);
    }

    protected void testIncremental(String modelName) throws Exception {
        URI sourceModelURI = createResourceModelURI(modelName + "." + sourceFileExtension);
        URI umlModelURI = createResourceModelURI(modelName + ".uml");
        URI resultModelURI = createTemporaryModelURI();
        URI traceModelURI = createTemporaryModelURI();

        // execute transformation
        Trace transformationTrace = new Trace(Collections.emptyList());
        ModelExtent transformationResult = runTransformation(transformationURI, sourceModelURI, umlModelURI,
                transformationTrace);

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
        transformationResult = runTransformation(transformationURI, sourceModelURI, umlModelURI, transformationResult,
                transformationTrace);

        // assert
        EObject actual = transformationResult.getContents().get(0);
        EcoreUtil.resolveAll(getResourceSet());
        assertModelEqualsStrict(expected, actual);
    }

}
