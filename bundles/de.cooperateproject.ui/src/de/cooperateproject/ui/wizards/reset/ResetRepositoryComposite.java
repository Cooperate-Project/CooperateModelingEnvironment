package de.cooperateproject.ui.wizards.reset;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.CDOObjectReference;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitHistory;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfoManager;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.revision.CDOIDAndVersion;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.ObjectNotFoundException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.jface.layout.PixelConverter;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class ResetRepositoryComposite extends Composite {

    private static TableViewer tv;
    private static final long LOADING_TIMEOUT = 8000;

    ResetRepositoryComposite(Composite parent, int style, IResource resource, ResetRepositoryPage page) {
        super(parent, style);
        createComposite(style, page);
        fillTable(resource.getProject(), Optional.ofNullable(resource.getAdapter(IFile.class)));
    }

    private static void fillTable(IProject project, Optional<IFile> file) {
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
        // CDOCommitHistory mainHistory = session.getCommitInfoManager()
        // .getHistory(session.getBranchManager().getBranch(0));
        // mainHistory.waitWhileLoading(LOADING_TIMEOUT);
        Set<CDOCommitInfo> commitInfos = new HashSet<>();
        if (file.isPresent()) {
            commitInfos.addAll(findAllCommitsforFile(session, file.get()));
        } else {
            commitInfos.addAll(findAllCommitsforProject(session, project));
        }
        DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
        TreeMap<Long, CDOCommitInfo> map = new TreeMap<>(Collections.reverseOrder());
        for (CDOCommitInfo commit : commitInfos) {
            map.put(commit.getTimeStamp(), commit);
        }
        for (Long l : map.keySet()) {
            CDOCommitInfo commit = map.get(l);
            TableItem temp = new TableItem(tv.getTable(), SWT.NONE);
            temp.setText(new String[] { commit.getComment(), df.format(commit.getTimeStamp()) });
            temp.setData(commit);
        }
    }

    public static CDOCommitInfo getSelectedCommit() {
        TableItem item = tv.getTable().getSelection()[0];
        return (CDOCommitInfo) item.getData();
    }

    private static void selectionChanged(ResetRepositoryPage page) {
        if (tv.getTable().getSelection().length != 1) {
            page.setPageComplete(false);
        } else {
            page.setPageComplete(true);
        }
    }

    private void createComposite(int style, ResetRepositoryPage page) {
        Composite tableComposite = new Composite(this, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 0;
        layout.makeColumnsEqualWidth = false;
        tableComposite.setLayout(layout);

        tableComposite
                .setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL | GridData.FILL_BOTH));

        tv = new TableViewer(tableComposite, style | SWT.BORDER);
        Table table = tv.getTable();
        TableColumn columnCommit = new TableColumn(table, SWT.LEFT);
        columnCommit.setWidth(350);
        TableColumn columnDate = new TableColumn(table, SWT.LEFT);
        columnDate.setWidth(150);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.widthHint = new PixelConverter(tv.getControl()).convertWidthInCharsToPixels(25);
        gridData.heightHint = new PixelConverter(tv.getControl()).convertHeightInCharsToPixels(10);
        tv.getControl().setLayoutData(gridData);
        setLayout(layout);
        tv.addSelectionChangedListener(event -> selectionChanged(page));
    }

    // Temporäre Lösung um Commits zu filtern. Austauschen sobald passende Schnittstelle existiert.

    private static Set<CDOCommitInfo> findAllCommitsforFile(CDOSession session, IFile file) {
        Set<CDOCommitInfo> commitInfos = new HashSet<>();
        commitInfos.addAll(getCommitsFromMainBranch(session, getFirstCommitTimeStamp(session, file), file));
        return commitInfos;
    }

    private static Set<CDOCommitInfo> findAllCommitsforProject(CDOSession session, IProject project) {

        Set<CDOCommitInfo> commitInfos = new HashSet<>();
        try {
            for (IResource resource : ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName())
                    .getFolder("models").members()) {
                if (resource.toString().endsWith(LauncherModelHelper.FILE_EXTENSION)) {
                    IFile file = (IFile) resource;
                    commitInfos.addAll(getCommitsFromMainBranch(session, getFirstCommitTimeStamp(session, file), file));
                }
            }
        } catch (CoreException e) {
            // LOGGER.trace(e.getMessage(), e);
        }
        return commitInfos;
    }

    private static long getFirstCommitTimeStamp(CDOSession session, IFile file) {
        CDOView view = null;
        try {
            view = session.openView();
            CDOID resourceCDOId = getResourceCDOId(view, file);
            return view.getRevision(resourceCDOId).getTimeStamp();
        } finally {
            IOUtil.closeSilent(view);
        }
    }

    private static CDOID getResourceCDOId(ConcreteSyntaxModel textModel) {
        CDOObject textRoot = CDOUtil.getCDOObject(textModel.getRootElement());
        CDOResource cdoResource = textRoot.cdoResource();
        if (cdoResource == null) {
            return null;
        }
        return cdoResource.cdoID();
    }

    private static CDOID getResourceCDOId(CDOView view, IFile file) {
        ConcreteSyntaxModel textModel = getConcreteSyntaxModel(view, file);
        if (textModel == null) {
            return null;
        }
        return getResourceCDOId(textModel);
    }

    private static CDOID getResourceCDOId(CDOSession session, IFile file) {
        CDOView view = null;
        try {
            view = session.openView();
            return getResourceCDOId(view, file);
        } finally {
            IOUtil.closeSilent(view);
        }
    }

    private static List<CDOCommitInfo> getCommitsFromMainBranch(CDOSession session, long timeStamp, IFile file) {
        CDOCommitInfoManager commitManager = session.getCommitInfoManager();
        CDOBranch mainBranch = session.getBranchManager().getMainBranch();
        CDOCommitHistory mainHistory = commitManager.getHistory(mainBranch);

        mainHistory.waitWhileLoading(LOADING_TIMEOUT);

        return getCommitsByTime(session, mainBranch, mainHistory, timeStamp, file);
    }

    private static List<CDOCommitInfo> getCommitsByTime(CDOSession session, CDOBranch mainBranch,
            CDOCommitHistory mainHistory, long timeStamp, IFile file) {
        List<CDOCommitInfo> commitInfos = new ArrayList<>();

        for (int i = 0; i < mainHistory.size(); i++) {
            CDOCommitInfo commitInfo = mainHistory.getElement(i);

            if (isTimeStampValid(commitInfo, timeStamp)) {
                break;
            }

            CDOCommitInfo previousCommitInfo = mainHistory.getElement(i + 1);
            CDOView previousState = null;
            CDOView currentState = null;
            try {
                previousState = session.openView(mainBranch, previousCommitInfo.getTimeStamp());
                currentState = session.openView(mainBranch, commitInfo.getTimeStamp());

                if (doChangedObjectsExists(getResourceCDOId(session, file), previousState, currentState, commitInfo)) {
                    commitInfos.add(commitInfo);
                }
            } finally {
                IOUtil.closeSilent(previousState);
                IOUtil.closeSilent(currentState);
            }
        }
        return commitInfos;
    }

    private static ConcreteSyntaxModel getConcreteSyntaxModel(CDOView view, IFile file) {
        try {
            Diagram launcherModel = LauncherModelHelper.loadDiagram(view.getResourceSet(), file);
            return launcherModel.getConcreteSyntaxModel(EditorType.TEXTUAL.getSupportedSyntaxModel());
        } catch (Exception e) {
            // LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

    private static boolean isTimeStampValid(CDOCommitInfo commitInfo, long firstCommitTimeStamp) {
        boolean isFirstCommitTimeStampGreater = commitInfo.getTimeStamp() < firstCommitTimeStamp;
        boolean isPreviousTimeStampInvalid = commitInfo.getPreviousTimeStamp() == CDOCommitInfo.INVALID_DATE;

        return isFirstCommitTimeStampGreater || isPreviousTimeStampInvalid;
    }

    private static boolean doChangedObjectsExists(CDOID resourceCDOId, CDOView previousState, CDOView currentState,
            CDOCommitInfo commitInfo) {
        Set<CDOID> changeCDOIds = getChangedObjectsId(commitInfo);

        addXRefOfChangedObjects(previousState, changeCDOIds);

        return !changedTextualObjects(resourceCDOId, previousState, currentState, changeCDOIds).isEmpty();
    }

    private static void addXRefOfChangedObjects(CDOView previousState, Set<CDOID> changeCDOIds) {
        List<CDOObjectReference> queryXRefs = getCDOObjectReferenceFromChangedObjects(previousState, changeCDOIds);
        Set<CDOID> queryXRefsIds = queryXRefs.stream().map(CDOObjectReference::getSourceID).collect(Collectors.toSet());
        changeCDOIds.addAll(queryXRefsIds);
    }

    private static Set<CDOID> changedTextualObjects(CDOID resourceCDOId, CDOView previousState, CDOView currentState,
            Set<CDOID> changeCDOIds) {
        return changeCDOIds.stream().filter(object -> parentMatches(object, resourceCDOId, previousState, currentState))
                .collect(Collectors.toSet());
    }

    private static List<CDOObjectReference> getCDOObjectReferenceFromChangedObjects(CDOView previousState,
            Set<CDOID> changeCDOIds) {
        List<CDOObjectReference> queryXRefs = new ArrayList<>();
        for (CDOID id : changeCDOIds) {
            if (id == null) {
                continue;
            }
            try {
                queryXRefs.addAll(previousState.queryXRefs(previousState.getObject(id)));
            } catch (ObjectNotFoundException e) {
                // LOGGER.trace(e.getMessage(), e);
            }
        }
        return queryXRefs;
    }

    private static Set<CDOID> getChangedObjectsId(CDOCommitInfo commitInfo) {
        List<CDOIDAndVersion> changedObjects = Lists.newArrayList(Iterables.concat(commitInfo.getNewObjects(),
                commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));

        return changedObjects.stream().map(CDOIDAndVersion::getID).collect(Collectors.toSet());
    }

    /**
     * Checks if the Object with objectId really belongs to the textual model.
     * 
     * @param objectId
     *            the CDOID of the object to be examined
     * @param parentId
     *            the CDOID of the textual model/resource
     * @param previousView
     *            the previous view of the commit
     * @param currentView
     *            the current view of the commit
     * @return true if it belongs to the textual model, false if not
     */
    private static boolean parentMatches(CDOID objectID, CDOID parentID, CDOView previousView, CDOView currentView) {
        boolean ret = checkParentMatching(objectID, parentID, previousView);
        if (!ret) {
            return checkParentMatching(objectID, parentID, currentView);
        }
        return ret;
    }

    /**
     * Checks if the Object with objectId really belongs to the textual model.
     * 
     * @param objectId
     *            the CDOID of the object to be examined
     * @param parentId
     *            the CDOID of the textual model/resource
     * @param view
     *            the view in which the object is examined
     * @return true if it belongs to the textual model, false if not
     */
    private static boolean checkParentMatching(CDOID objectID, CDOID parentID, CDOView view) {
        try {
            CDOObject object = view.getObject(objectID);
            return object.cdoResource().cdoID().equals(parentID);
        } catch (ObjectNotFoundException e) {
            // LOGGER.trace(e.getMessage(), e);
        }
        return false;
    }
}
