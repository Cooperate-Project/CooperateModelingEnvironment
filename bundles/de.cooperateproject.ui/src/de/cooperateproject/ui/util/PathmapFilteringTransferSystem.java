package de.cooperateproject.ui.util;

import java.io.InputStream;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.transfer.CDOTransferElement;
import org.eclipse.emf.cdo.transfer.CDOTransferSystem;
import org.eclipse.emf.cdo.transfer.CDOTransferType;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.DerivedStateAwareResource;

public class PathmapFilteringTransferSystem extends CDOTransferSystem {
    private final CDOTransferSystem transferSystem;

    public PathmapFilteringTransferSystem(CDOTransferSystem transferSystem) {
        super(false);
        this.transferSystem = transferSystem;
    }

    @Override
    public void saveModels(EList<Resource> resources, IProgressMonitor monitor) {
        BasicEList<Resource> filteredResources = new BasicEList<>(
                resources.stream().filter(r -> !"pathmap".equals(r.getURI().scheme())).collect(Collectors.toList()));
        resources.stream().filter(DerivedStateAwareResource.class::isInstance)
                .map(DerivedStateAwareResource.class::cast).forEach(PathmapFilteringTransferSystem::calculateState);
        transferSystem.saveModels(filteredResources, monitor);
    }

    private static void calculateState(DerivedStateAwareResource resource) {
        resource.discardDerivedState();
        resource.installDerivedState(false);
    }

    // delegation methods

    @Override
    public int hashCode() {
        return transferSystem.hashCode();
    }

    @Override
    public String getType() {
        return transferSystem.getType();
    }

    @Override
    public boolean isReadOnly() {
        return transferSystem.isReadOnly();
    }

    @Override
    public CDOTransferType getDefaultTransferType(CDOTransferElement element) {
        return transferSystem.getDefaultTransferType(element);
    }

    @Override
    public URI getURI(IPath path) {
        return transferSystem.getURI(path);
    }

    @Override
    public CDOTransferElement getElement(String path) {
        return transferSystem.getElement(path);
    }

    @Override
    public CDOTransferElement getElement(IPath path) {
        return transferSystem.getElement(path);
    }

    @Override
    public CDOTransferElement getElement(URI uri) {
        return transferSystem.getElement(uri);
    }

    @Override
    public void createFolder(IPath path) {
        transferSystem.createFolder(path);
    }

    @Override
    public Resource createModel(ResourceSet resourceSet, IPath path) {
        return transferSystem.createModel(resourceSet, path);
    }

    @Override
    public void createBinary(IPath path, InputStream source, IProgressMonitor monitor) {
        transferSystem.createBinary(path, source, monitor);
    }

    @Override
    public void createText(IPath path, InputStream source, String encoding, IProgressMonitor monitor) {
        transferSystem.createText(path, source, encoding, monitor);
    }

    @Override
    public boolean equals(Object obj) {
        return transferSystem.equals(obj);
    }

    @Override
    public String toString() {
        return transferSystem.toString();
    }

}
