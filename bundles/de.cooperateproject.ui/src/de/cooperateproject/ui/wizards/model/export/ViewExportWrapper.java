package de.cooperateproject.ui.wizards.model.export;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.CDOObjectHistory;
import org.eclipse.emf.cdo.CDOObjectReference;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;
import org.eclipse.emf.cdo.common.commit.CDOChangeSetData;
import org.eclipse.emf.cdo.common.commit.CDOCommitHistory;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.lock.CDOLockState;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.eresource.CDOBinaryResource;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.eresource.CDOTextResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.view.CDOObjectHandler;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDORegistrationHandler;
import org.eclipse.emf.cdo.view.CDOUnitManager;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewProvider;
import org.eclipse.emf.cdo.view.CDOViewSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.net4j.util.collection.CloseableIterator;
import org.eclipse.net4j.util.concurrent.IRWLockManager.LockType;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.registry.IRegistry;

import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.util.conventions.Constants;

public class ViewExportWrapper implements CDOView {

    private CDOView view;

    public ViewExportWrapper(CDOView view) {
        this.view = view;

        view.getResourceSet().setResourceFactoryRegistry(
                (CDOResourceHandler.createFactoryWrapper(view.getResourceSet().getResourceFactoryRegistry())));
    }

    public void close() {
        view.close();
    }

    public boolean isClosed() {
        return view.isClosed();
    }

    public IRegistry<String, Object> properties() {
        return view.properties();
    }

    public int getSessionID() {
        return view.getSessionID();
    }

    public CDORevision getRevision(CDOID id) {
        return view.getRevision(id);
    }

    public long getLastUpdateTime() {
        return view.getLastUpdateTime();
    }

    public boolean isDurableView() {
        return view.isDurableView();
    }

    public void addListener(IListener listener) {
        view.addListener(listener);
    }

    public boolean isEmpty() {
        return view.isEmpty();
    }

    public CDOResourceNode[] getElements() {
        return view.getElements();
    }

    public void waitForUpdate(long updateTime) {
        view.waitForUpdate(updateTime);
    }

    public boolean waitForUpdate(long updateTime, long timeoutMillis) {
        return view.waitForUpdate(updateTime, timeoutMillis);
    }

    public void removeListener(IListener listener) {
        view.removeListener(listener);
    }

    public boolean hasListeners() {
        return view.hasListeners();
    }

    public CDOBranch getBranch() {
        return view.getBranch();
    }

    public <T> T getAdapter(Class<T> adapter) {
        return view.getAdapter(adapter);
    }

    public int getViewID() {
        return view.getViewID();
    }

    public boolean isReadOnly() {
        return view.isReadOnly();
    }

    public boolean isHistorical() {
        return view.isHistorical();
    }

    public IListener[] getListeners() {
        return view.getListeners();
    }

    public boolean runAfterUpdate(long updateTime, Runnable runnable) {
        return view.runAfterUpdate(updateTime, runnable);
    }

    public long getTimeStamp() {
        return view.getTimeStamp();
    }

    public String getDurableLockingID() {
        return view.getDurableLockingID();
    }

    public CDOCommitHistory getHistory() {
        return view.getHistory();
    }

    public CDOObjectHistory getHistory(CDOObject key) {
        return view.getHistory(key);
    }

    public CDOSession getSession() {
        return view.getSession();
    }

    public CDOViewProvider getProvider() {
        return view.getProvider();
    }

    public CDOViewSet getViewSet() {
        return view.getViewSet();
    }

    public Lock getViewLock() {
        return view.getViewLock();
    }

    public void syncExec(Runnable runnable) {
        view.syncExec(runnable);
    }

    public <V> V syncExec(Callable<V> callable) throws Exception {
        return view.syncExec(callable);
    }

    public ResourceSet getResourceSet() {
        return view.getResourceSet();
    }

    public URIHandler getURIHandler() {
        return view.getURIHandler();
    }

    public CDOUnitManager getUnitManager() {
        return view.getUnitManager();
    }

    public boolean setBranchPoint(CDOBranch branch, long timeStamp) {
        return view.setBranchPoint(branch, timeStamp);
    }

    public boolean setBranchPoint(CDOBranch branch, long timeStamp, IProgressMonitor monitor) {
        return view.setBranchPoint(branch, timeStamp, monitor);
    }

    public boolean setBranchPoint(CDOBranchPoint branchPoint) {
        return view.setBranchPoint(branchPoint);
    }

    public boolean setBranchPoint(CDOBranchPoint branchPoint, IProgressMonitor monitor) {
        return view.setBranchPoint(branchPoint, monitor);
    }

    public boolean setBranch(CDOBranch branch) {
        return view.setBranch(branch);
    }

    public boolean setBranch(CDOBranch branch, IProgressMonitor monitor) {
        return view.setBranch(branch, monitor);
    }

    public boolean setTimeStamp(long timeStamp) {
        return view.setTimeStamp(timeStamp);
    }

    public boolean setTimeStamp(long timeStamp, IProgressMonitor monitor) {
        return view.setTimeStamp(timeStamp, monitor);
    }

    public boolean isInvalidationRunnerActive() {
        return view.isInvalidationRunnerActive();
    }

    public boolean isLegacyModeEnabled() {
        return view.isLegacyModeEnabled();
    }

    public boolean isDirty() {
        return view.isDirty();
    }

    public boolean hasConflict() {
        return view.hasConflict();
    }

    public boolean hasResource(String path) {
        return view.hasResource(path);
    }

    public CDOResource getResource(String path, boolean loadOnDemand) {
        return view.getResource(path, loadOnDemand);
    }

    public CDOResource getResource(String path) {
        return view.getResource(path);
    }

    public CDOTextResource getTextResource(String path) {
        return view.getTextResource(path);
    }

    public CDOBinaryResource getBinaryResource(String path) {
        return view.getBinaryResource(path);
    }

    public CDOResourceFolder getResourceFolder(String path) {
        return view.getResourceFolder(path);
    }

    public CDOResource getRootResource() {
        return view.getRootResource();
    }

    public void setResourcePathCache(Map<String, CDOID> resourcePathCache) {
        view.setResourcePathCache(resourcePathCache);
    }

    public URI createResourceURI(String path) {
        return view.createResourceURI(path);
    }

    public List<CDOResourceNode> queryResources(CDOResourceFolder folder, String name, boolean exactMatch) {
        return view.queryResources(folder, name, exactMatch);
    }

    public CloseableIterator<CDOResourceNode> queryResourcesAsync(CDOResourceFolder folder, String name,
            boolean exactMatch) {
        return view.queryResourcesAsync(folder, name, exactMatch);
    }

    public <T extends EObject> List<T> queryInstances(EClass type) {
        return view.queryInstances(type);
    }

    public <T extends EObject> CloseableIterator<T> queryInstancesAsync(EClass type) {
        return view.queryInstancesAsync(type);
    }

    public <T extends EObject> CloseableIterator<T> queryInstancesAsync(EClass type, boolean exact) {
        return view.queryInstancesAsync(type, exact);
    }

    public List<CDOObjectReference> queryXRefs(CDOObject targetObject, EReference... sourceReferences) {
        return view.queryXRefs(targetObject, sourceReferences);
    }

    public List<CDOObjectReference> queryXRefs(Set<CDOObject> targetObjects, EReference... sourceReferences) {
        return view.queryXRefs(targetObjects, sourceReferences);
    }

    public CloseableIterator<CDOObjectReference> queryXRefsAsync(Set<CDOObject> targetObjects,
            EReference... sourceReferences) {
        return view.queryXRefsAsync(targetObjects, sourceReferences);
    }

    public CDOObject getObject(CDOID id, boolean loadOnDemand) {
        return view.getObject(id, loadOnDemand);
    }

    public CDOObject getObject(CDOID id) {
        return view.getObject(id);
    }

    public <T extends EObject> T getObject(T objectFromDifferentView) {
        return view.getObject(objectFromDifferentView);
    }

    public boolean isObjectRegistered(CDOID id) {
        return view.isObjectRegistered(id);
    }

    public int reload(CDOObject... objects) {
        return view.reload(objects);
    }

    public CDOLockState[] getLockStates(Collection<CDOID> ids) {
        return view.getLockStates(ids);
    }

    public CDOLockState[] getLockStatesOfObjects(Collection<? extends CDOObject> objects) {
        return view.getLockStatesOfObjects(objects);
    }

    public void lockObjects(Collection<? extends CDOObject> objects, LockType lockType, long timeout)
            throws InterruptedException {
        view.lockObjects(objects, lockType, timeout);
    }

    public void lockObjects(Collection<? extends CDOObject> objects, LockType lockType, long timeout, boolean recursive)
            throws InterruptedException {
        view.lockObjects(objects, lockType, timeout, recursive);
    }

    public void unlockObjects(Collection<? extends CDOObject> objects, LockType lockType) {
        view.unlockObjects(objects, lockType);
    }

    public void unlockObjects(Collection<? extends CDOObject> objects, LockType lockType, boolean recursive) {
        view.unlockObjects(objects, lockType, recursive);
    }

    public void unlockObjects() {
        view.unlockObjects();
    }

    public String enableDurableLocking(boolean enable) {
        return view.enableDurableLocking(enable);
    }

    public String enableDurableLocking() {
        return view.enableDurableLocking();
    }

    public void disableDurableLocking(boolean releaseLocks) {
        view.disableDurableLocking(releaseLocks);
    }

    public void addObjectHandler(CDOObjectHandler handler) {
        view.addObjectHandler(handler);
    }

    public void removeObjectHandler(CDOObjectHandler handler) {
        view.removeObjectHandler(handler);
    }

    public CDOObjectHandler[] getObjectHandlers() {
        return view.getObjectHandlers();
    }

    public void addRegistrationHandler(CDORegistrationHandler handler) {
        view.addRegistrationHandler(handler);
    }

    public void removeRegistrationHandler(CDORegistrationHandler handler) {
        view.removeRegistrationHandler(handler);
    }

    public CDORegistrationHandler[] getRegistrationHandlers() {
        return view.getRegistrationHandlers();
    }

    public CDOQuery createQuery(String language, String queryString) {
        return view.createQuery(language, queryString);
    }

    public CDOQuery createQuery(String language, String queryString, Object context) {
        return view.createQuery(language, queryString, context);
    }

    public CDOChangeSetData compareRevisions(CDOBranchPoint source) {
        return view.compareRevisions(source);
    }

    public Options options() {
        return view.options();
    }

    @Override
    public CDOResourceNode getResourceNode(String path) {
        URI uri = CDOURIUtil.createResourceURI(view, path.toString());
        if (uri.toString().contains(Constants.TRACE_FILE_EXTENTION)) {
            return (CDOResourceNode) view.getResourceSet().getResource(uri.trimFileExtension(), true);
        } else {
            return view.getResourceNode(path);
        }
    }
}
