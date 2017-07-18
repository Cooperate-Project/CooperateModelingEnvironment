package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;

@SuppressWarnings("restriction")
public class QVTOResource implements Resource {

    private final URI uri;
    private final CompiledUnit compiledUnit;

    public QVTOResource(URI qvtoResource, EPackage.Registry packageRegistry) throws IOException {
        this.uri = qvtoResource;
        UnitProxy unit = UnitResolverFactory.Registry.INSTANCE.getUnit(qvtoResource);
        QVTOCompiler compiler = QVTOCompiler.createCompiler(packageRegistry);
        try {
            compiledUnit = compiler.compile(unit, null, new NullProgressMonitor());
        } catch (MdaException e) {
            throw new IOException("Could not load and compile resource.", e);
        }
    }

    public OperationalTransformation getFirstTransformation() {
        return compiledUnit.getModules().stream().filter(m -> m instanceof OperationalTransformation)
                .map(m -> (OperationalTransformation) m).findAny().get();
    }

    @Override
    public EList<Adapter> eAdapters() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean eDeliver() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eSetDeliver(boolean deliver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eNotify(Notification notification) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResourceSet getResourceSet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public URI getURI() {
        return uri;
    }

    @Override
    public void setURI(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getTimeStamp() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTimeStamp(long timeStamp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EList<EObject> getContents() {
        return new BasicEList<EObject>(Arrays.asList(getFirstTransformation()));
    }

    @Override
    public TreeIterator<EObject> getAllContents() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getURIFragment(EObject eObject) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EObject getEObject(String uriFragment) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(Map<?, ?> options) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void load(Map<?, ?> options) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(OutputStream outputStream, Map<?, ?> options) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void load(InputStream inputStream, Map<?, ?> options) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isTrackingModification() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTrackingModification(boolean isTrackingModification) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isModified() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setModified(boolean isModified) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isLoaded() {
        return true;
    }

    @Override
    public void unload() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Map<?, ?> options) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public EList<Diagnostic> getErrors() {
        throw new UnsupportedOperationException();
    }

    @Override
    public EList<Diagnostic> getWarnings() {
        throw new UnsupportedOperationException();
    }

}
