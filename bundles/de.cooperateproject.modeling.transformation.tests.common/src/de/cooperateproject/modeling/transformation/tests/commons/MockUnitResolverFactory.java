package de.cooperateproject.modeling.transformation.tests.commons;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.m2m.internal.qvt.oml.compiler.URIUnitResolver;
import org.eclipse.m2m.internal.qvt.oml.compiler.URIUnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;

public class MockUnitResolverFactory extends URIUnitResolverFactory {
    
    private List<URI> baseURIs;

    public MockUnitResolverFactory(List<URI> baseURIs) {
        this.baseURIs = baseURIs;
    }
    
    @Override
    public UnitResolver getResolver(URI uri) {
        return new URIUnitResolver(baseURIs);
    }    

}
