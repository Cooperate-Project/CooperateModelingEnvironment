package de.cooperateproject.ui.wizards.reset;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.jface.layout.PixelConverter;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class ResetRepositoryComposite extends Composite {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResetRepositoryComposite.class);
    private TableViewer tv;

    ResetRepositoryComposite(Composite parent, int style, IResource resource, ResetRepositoryPage page) {
        super(parent, style);
        createComposite(style, page);
        try {
            fillTable(resource.getProject(), Optional.ofNullable(resource.getAdapter(IFile.class)));
        } catch (ConcreteSyntaxTypeNotAvailableException | CoreException | IOException e) {
            LOGGER.error("Failed to fill table with available commits.", e);
            // TODO inform the user
            return;
        }
    }

    private void fillTable(IProject project, Optional<IFile> file)
            throws CoreException, IOException, ConcreteSyntaxTypeNotAvailableException {
        Collection<IFile> relevantFiles = getRelevantFiles(project, file);
        Set<CDOCommitInfo> commitInfos = new HashSet<>();
        for (IFile currentFile : relevantFiles) {
            commitInfos.addAll(Activator.getDefault().getCommitHistoryManager().getCommitsForLauncher(currentFile));
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

    private static Collection<IFile> getRelevantFiles(IProject project, Optional<IFile> file) throws CoreException {
        if (file.isPresent()) {
            return Arrays.asList(file.get());
        } else {
            Collection<IFile> relevantFiles = new ArrayList<>();
            for (IResource r : ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName())
                    .getFolder("models").members()) {
                if (r.getName().endsWith(LauncherModelHelper.FILE_EXTENSION)) {
                    relevantFiles.add((IFile) r);
                }
            }
            return relevantFiles;
        }
    }

    public CDOCommitInfo getSelectedCommit() {
        TableItem item = tv.getTable().getSelection()[0];
        return (CDOCommitInfo) item.getData();
    }

    private void selectionChanged(ResetRepositoryPage page) {
        if (tv.getTable().getSelection().length != 1) {
            page.setPageComplete(false);
        } else {
            page.setSelectedCommit(getSelectedCommit());
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

}
