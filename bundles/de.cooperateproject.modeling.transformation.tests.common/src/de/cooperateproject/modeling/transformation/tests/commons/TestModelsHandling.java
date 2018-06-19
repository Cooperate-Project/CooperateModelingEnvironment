package de.cooperateproject.modeling.transformation.tests.commons;

import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.util.CompareSwitch;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;

public interface TestModelsHandling {
    ResourceSet getResourceSet();
    
    static Resource createResource(ResourceSet resourceSet, URI modelUri, boolean load) {
        Resource resource = resourceSet.getResource(modelUri, false);
        if (resource == null) {
            resource = resourceSet.createResource(modelUri);
        }
        if (load && resourceSet.getURIConverter().exists(modelUri, Collections.emptyMap())) {
            try {
                resource.load(Collections.emptyMap());
            } catch (IOException e) {
                e.printStackTrace();
                fail(e.toString());
                return null;
            }
        }
        return resource;
    }

    static ModelExtent createModelExtent(Resource r) {
        return new BasicModelExtent(r.getContents());
    }
    
    default ModelExtent createModelExtent(URI resourceURI, boolean load) throws IOException {
        Resource r = createResource(getResourceSet(), resourceURI, load);
        return createModelExtent(r);
    }
    
    static String prettyPrint(Comparison comparison) {
        String customPrettyPrint = comparison.getDifferences().stream()
                .map(TestModelsHandling::prettyPrintCustom).filter(Objects::nonNull)
                .collect(Collectors.joining(String.format("%n")));
        ByteArrayOutputStream baos = null;
        PrintStream ps = null;
        try {
            baos = new ByteArrayOutputStream();
            ps = new PrintStream(baos);
            EMFComparePrettyPrinter.printDifferences(comparison, ps);
            try {
                return customPrettyPrint + String.format("%n%n") + new String(baos.toByteArray(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                fail(e.toString());
                return null;
            }
        } finally {
            IOUtils.closeQuietly(ps);
            IOUtils.closeQuietly(baos);
        }
    }

    static String prettyPrintCustom(Diff diff) {
        CompareSwitch<String> printer = new CompareSwitch<String>() {

            @Override
            public String caseReferenceChange(ReferenceChange object) {
                EObject actual = object.getMatch().getRight();
                EObject expected = object.getMatch().getLeft();
                EReference reference = object.getReference();

                if (actual != null && expected != null) {
                    EObject parent = actual;
                    String referenceName = String.format("%s::%s", reference.getEContainingClass().getName(),
                            object.getReference().getName());
                    Object actualValue = actual.eGet(reference);
                    Object expectedValue = expected.eGet(reference);

                    return String.format(
                            "ReferenceChange%n\tParent: %s%n\tReference: %s%n\tExpected Value: %s%n\tActual Value: %s",
                            parent, referenceName, expectedValue, actualValue);
                }
                return defaultCase(object);
            }

        };
        return printer.doSwitch(diff);
    }
    
    static void removeDifference(Diff difference) {
        difference.getMatch().getDifferences().remove(difference);
    }

}
