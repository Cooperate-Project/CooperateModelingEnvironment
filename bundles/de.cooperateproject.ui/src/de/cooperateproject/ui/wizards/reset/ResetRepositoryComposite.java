package de.cooperateproject.ui.wizards.reset;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitHistory;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfoManager;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOUtil;
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

import de.cooperateproject.cdo.util.commitutils.CommitManager;
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

    private void fillTable(IProject project, Optional<IFile> file) {
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
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

    private void selectionChanged(ResetRepositoryPage page) {
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

        return filterCreateDiagramCommit(CommitManager.getCommitsByTime(session, mainBranch, mainHistory, timeStamp,
                getResourceCDOId(session, file)));
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

    private static List<CDOCommitInfo> filterCreateDiagramCommit(List<CDOCommitInfo> commitInfos) {
        if (!commitInfos.isEmpty()) {
            commitInfos.remove(commitInfos.size() - 1);
        }
        return commitInfos;
    }

}
