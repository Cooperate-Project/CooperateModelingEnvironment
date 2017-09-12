package de.cooperateproject.ui.diff.action;

import java.util.List;

import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableColumn;

import de.cooperateproject.ui.diff.content.DiffTreeBuilder;
import de.cooperateproject.ui.diff.content.SummaryItem;
import de.cooperateproject.ui.diff.content.SummaryViewBuilder;
import de.cooperateproject.ui.diff.internal.CommitCDOViewManager;
import de.cooperateproject.ui.diff.internal.ComparisonManager;

public class DoubleClickCommitViewerAction extends Action {

    private ComparisonManager comparisonManager;
    private CommitCDOViewManager cdoViewManager;
    private TableViewer commitViewer;
    private TableViewer summaryViewer;
    private TreeViewer diffViewer;
    private TabFolder tabFolder;
    private TabItem diffViewTab;

    public DoubleClickCommitViewerAction(ComparisonManager comparisonManager, CommitCDOViewManager cdoViewManager,
            TableViewer commitViewer, TableViewer summaryViewer, TreeViewer diffViewer, TabFolder tabFolder,
            TabItem diffViewTab) {
        this.comparisonManager = comparisonManager;
        this.cdoViewManager = cdoViewManager;
        this.commitViewer = commitViewer;
        this.summaryViewer = summaryViewer;
        this.diffViewer = diffViewer;
        this.tabFolder = tabFolder;
        this.diffViewTab = diffViewTab;
    }

    @Override
    public void run() {
        ISelection selection = commitViewer.getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        if (obj instanceof CDOCommitInfo) {
            cdoViewManager = new CommitCDOViewManager((CDOCommitInfo) obj, null);
            showDiffViewOfCommit();
        }
    }

    private void showDiffViewOfCommit() {
        SummaryViewBuilder svb = new SummaryViewBuilder();
        List<SummaryItem> summaryList = svb.buildSummaryView(
                comparisonManager.getComparison(cdoViewManager.getPreviousView(), cdoViewManager.getCurrentView()));
        summaryViewer.setInput(summaryList);

        for (TableColumn c : summaryViewer.getTable().getColumns()) {
            c.pack();
        }
        tabFolder.setSelection(diffViewTab);

        CDOResource resource = comparisonManager.getResource(cdoViewManager.getCurrentView());
        DiffTreeBuilder dtb = new DiffTreeBuilder(resource, summaryList);
        diffViewer.setInput(dtb.buildTree());
        diffViewer.expandAll();
        diffViewer.getControl().setFocus();
    }

}
