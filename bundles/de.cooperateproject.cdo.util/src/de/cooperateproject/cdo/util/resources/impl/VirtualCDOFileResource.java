package de.cooperateproject.cdo.util.resources.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObjectHistory;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.lock.CDOLockState;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.security.CDOPermission;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.google.common.collect.Maps;

public abstract class VirtualCDOFileResource<T extends CDOResourceNode> extends XMIResourceImpl
        implements CDOResourceNode {

    protected static class XMISerializer {

        private final XMIResource resource;
        private final Map<?, ?> options;

        public XMISerializer(XMIResource resource, Map<?, ?> options) {
            this.resource = resource;
            this.options = options;
        }

        public void parse(InputStream is) throws IOException {
            resource.load(is, options);
        }

        public void serialize(OutputStream os) throws IOException {
            resource.save(os, options);
        }
    }

    protected static final String DEFAULT_CHARSET_NAME = "UTF-8";
    protected static final Charset DEFAULT_CHARSET = Charset.forName(DEFAULT_CHARSET_NAME);

    protected VirtualCDOFileResource(URI uri) {
        super(uri);
    }

    protected abstract T getCDOResourceNode(URI uri) throws IOException;

    // TODO abklären ob so okay
    protected abstract T getCDOResourceNode(URI uri, CDOTransaction trans) throws IOException;

    // TODO abklären ob so okay
    protected T getCdoResourceNode(CDOTransaction trans) {
        try {
            return getCDOResourceNode(uri, trans);
        } catch (IOException e) {
            // TODO FIXME
            e.printStackTrace();
        }
        return null;
    }

    protected T getCdoResourceNode() {
        try {
            return getCDOResourceNode(uri);
        } catch (IOException e) {
            // TODO FIXME
            e.printStackTrace();
        }
        return null;
    }

    public void save(Map<?, ?> options) throws IOException {
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        CDOTransaction trans = Arrays.stream(cdoVS.getViews()).filter(CDOTransaction.class::isInstance)
                .map(CDOTransaction.class::cast).findFirst().orElse(null);
        if (trans == null) {
            throw new IOException("Could not gather a transaction to perform the save operation.");
        }
        String realCdoRepositoryPath = getRealCDORepositoryPath(trans);
        XMISerializer accessor = new XMISerializer(this, prepareOptions(options));
        doSave(accessor, trans, realCdoRepositoryPath);
        try {
            trans.commit();
        } catch (CommitException e) {
            throw new IOException(e);
        }
    }

    public void load(Map<?, ?> options) throws IOException {
        CDOViewSet cdoVS = CDOUtil.getViewSet(getResourceSet());
        CDOView view = Arrays.stream(cdoVS.getViews()).filter(CDOView.class::isInstance).findFirst().orElse(null);
        if (view == null) {
            throw new IOException("Could not gather a view to perform the load operation.");
        }
        String realCdoRepositoryPath = getRealCDORepositoryPath(view);
        XMISerializer accessor = new XMISerializer(this, prepareOptions(options));
        doLoad(accessor, view, realCdoRepositoryPath);
    }

    protected abstract String getAdditionalFileExtension();

    protected abstract void doSave(XMISerializer serializer, CDOTransaction trans, String realCdoRepositoryPath)
            throws IOException;

    protected abstract void doLoad(XMISerializer serializer, CDOView view, String realCdoRepositoryPath)
            throws IOException;

    protected Map<?, ?> getNewOptions() {
        return Collections.emptyMap();
    }

    protected String getRealCDORepositoryPath(CDOView view) {
        URI pathUri = getURI().deresolve(view.getRootResource().getURI().appendSegment(""));
        String actualURI = pathUri.toString();
        if (!getAdditionalFileExtension().equals(pathUri.fileExtension())) {
            return String.format("%s.%s", actualURI, getAdditionalFileExtension());
        }
        return actualURI;
    }

    private Map<?, ?> prepareOptions(Map<?, ?> options) {
        HashMap<Object, Object> tmpOptions = Maps.newHashMap(options);
        tmpOptions.put(XMIResource.OPTION_ENCODING, DEFAULT_CHARSET_NAME);
        tmpOptions.putAll(getNewOptions());
        return tmpOptions;
    }

    public boolean isRoot() {
        return getCdoResourceNode().isRoot();
    }

    public CDOResourceFolder getFolder() {
        return getCdoResourceNode().getFolder();
    }

    public CDOID cdoID() {
        return getCdoResourceNode().cdoID();
    }

    public void setFolder(CDOResourceFolder value) {
        getCdoResourceNode().setFolder(value);
    }

    public CDOState cdoState() {
        return getCdoResourceNode().cdoState();
    }

    public boolean cdoConflict() {
        return getCdoResourceNode().cdoConflict();
    }

    public String getName() {
        return getCdoResourceNode().getName();
    }

    public EClass eClass() {
        return getCdoResourceNode().eClass();
    }

    public boolean cdoInvalid() {
        return getCdoResourceNode().cdoInvalid();
    }

    public void setName(String value) {
        getCdoResourceNode().setName(value);
    }

    public Resource eResource() {
        return getCdoResourceNode().eResource();
    }

    public CDOView cdoView() {
        return getCdoResourceNode().cdoView();
    }

    public String getPath() {
        return getCdoResourceNode().getPath();
    }

    public CDORevision cdoRevision() {
        return getCdoResourceNode().cdoRevision();
    }

    public EObject eContainer() {
        return getCdoResourceNode().eContainer();
    }

    public CDORevision cdoRevision(boolean loadOnDemand) {
        return getCdoResourceNode().cdoRevision(loadOnDemand);
    }

    public void setPath(String value) {
        getCdoResourceNode().setPath(value);
    }

    public CDOPermission cdoPermission() {
        return getCdoResourceNode().cdoPermission();
    }

    public String getExtension() {
        return getCdoResourceNode().getExtension();
    }

    public CDOResource cdoResource() {
        return getCdoResourceNode().cdoResource();
    }

    public String trimExtension() {
        return getCdoResourceNode().trimExtension();
    }

    public EStructuralFeature eContainingFeature() {
        return getCdoResourceNode().eContainingFeature();
    }

    public CDOResource cdoDirectResource() {
        return getCdoResourceNode().cdoDirectResource();
    }

    public CDOLock cdoReadLock() {
        return getCdoResourceNode().cdoReadLock();
    }

    public EReference eContainmentFeature() {
        return getCdoResourceNode().eContainmentFeature();
    }

    public CDOLock cdoWriteLock() {
        return getCdoResourceNode().cdoWriteLock();
    }

    public CDOLock cdoWriteOption() {
        return getCdoResourceNode().cdoWriteOption();
    }

    public CDOLockState cdoLockState() {
        return getCdoResourceNode().cdoLockState();
    }

    public EList<EObject> eContents() {
        return getCdoResourceNode().eContents();
    }

    public void cdoPrefetch(int depth) {
        getCdoResourceNode().cdoPrefetch(depth);
    }

    public void cdoReload() {
        getCdoResourceNode().cdoReload();
    }

    public CDOObjectHistory cdoHistory() {
        return getCdoResourceNode().cdoHistory();
    }

    public TreeIterator<EObject> eAllContents() {
        return getCdoResourceNode().eAllContents();
    }

    public boolean eIsProxy() {
        return getCdoResourceNode().eIsProxy();
    }

    public EList<EObject> eCrossReferences() {
        return getCdoResourceNode().eCrossReferences();
    }

    public Object eGet(EStructuralFeature feature) {
        return getCdoResourceNode().eGet(feature);
    }

    public Object eGet(EStructuralFeature feature, boolean resolve) {
        return getCdoResourceNode().eGet(feature, resolve);
    }

    public void eSet(EStructuralFeature feature, Object newValue) {
        getCdoResourceNode().eSet(feature, newValue);
    }

    public boolean eIsSet(EStructuralFeature feature) {
        return getCdoResourceNode().eIsSet(feature);
    }

    public void eUnset(EStructuralFeature feature) {
        getCdoResourceNode().eUnset(feature);
    }

    public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
        return getCdoResourceNode().eInvoke(operation, arguments);
    }

}
