package de.cooperateproject.ui.diff.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;

import de.cooperateproject.ui.diff.content.CommitContentProvider;
import de.cooperateproject.ui.diff.content.DiffTreeBuilder;
import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.SummaryItem;
import de.cooperateproject.ui.diff.content.SummaryViewBuilder;
import de.cooperateproject.ui.diff.internal.ComparisonManager;
import de.cooperateproject.ui.diff.internal.CommitCDOViewManager;
import de.cooperateproject.ui.diff.internal.CommitViewerComparator;
import de.cooperateproject.ui.diff.labeling.CommitLabelProvider;
import de.cooperateproject.ui.diff.labeling.DiffViewLabelProvider;
import de.cooperateproject.ui.diff.labeling.SummaryLabelProvider;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;

/**
 * Represents the view of the plugin, mainly responsible for the gui and communication between user
 * and program.
 * 
 * @author Jasmin, thomcz
 *
 */
public class DiffView extends ViewPart {
    public static final String ID = "de.cooperateproject.ui.diff.views.DiffView";
    private ComparisonManager comparisonManager;
    private CommitCDOViewManager cdoViewManager;
    private TableViewer commitViewer;
    private TableViewer summaryViewer;
    private TreeViewer diffViewer;
    private Action doubleClickActionCommitViewer;
    private Action doubleClickActionDiffViewer;
    private Action doubleClickActionSummaryViewer;
    private TabFolder tabFolder;
    private TabItem commitHistoryTab;
    private TabItem diffViewTab;
    private Composite commitHistoryComposite;
    private Composite diffViewComposite;
    private IFile selectedFile;

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    @Override
    public void createPartControl(Composite parent) {
        parent.addDisposeListener(e -> {
            if (cdoViewManager != null) {
                cdoViewManager.closeAllViews();
            }
        });
        setUpTabs(parent);
        setUpCommitHistoryTabContent();
        setUpDiffViewTabContent();
        makeActionSummaryViewer();
        makeActionDiffViewer();
        makeActionCommitViewer();
        hookKeyboard();
        hookDoubleClickAction();
    }

    /**
     * This method will be invoked from a handler bound to a command that is able to retrieve a
     * selected .cooperate file from the project explorer.
     * 
     * @param file
     *            the selected .cooperate file
     */
    public void setSelectedFile(IFile file) {
        // If a new file is selected, close all CDOViews that may still be open.
        if (cdoViewManager != null) {
            cdoViewManager.closeAllViews();
        }
        selectedFile = file;
        comparisonManager = new ComparisonManager(file);
        Set<CDOCommitInfo> allCommitInfos = comparisonManager.getAllCommitInfos();
        commitViewer.setInput(allCommitInfos);
        for (TableColumn c : commitViewer.getTable().getColumns()) {
            c.pack();
        }
        tabFolder.setSelection(commitHistoryTab);
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @Override
    public void setFocus() {
        commitViewer.getControl().setFocus();
    }

    private void makeActionCommitViewer() {
        // tells this class to open the diff view of the diagram's selected
        // commit if Enter is pressed on it
        doubleClickActionCommitViewer = new Action() {
            @Override
            public void run() {
                ISelection selection = commitViewer.getSelection();
                Object obj = ((IStructuredSelection) selection).getFirstElement();

                if (obj instanceof CDOCommitInfo) {
                    cdoViewManager = new CommitCDOViewManager((CDOCommitInfo) obj, selectedFile);
                    showDiffViewOfCommit();
                }
            }
        };
    }

    private void makeActionDiffViewer() {
        doubleClickActionDiffViewer = new Action() {
            @Override
            public void run() {
                setElementFocus();
            }
        };
    }

    /**
     * sets the focus from the tree viewer to the corresponding element in the summary table.
     */
    private void setElementFocus() {
        ISelection selection = diffViewer.getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        if (!(obj instanceof DiffTreeItem)) {
            return;
        }
        DiffTreeItem item = (DiffTreeItem) obj;
        if (item.getDiffKind() != null) {
            setElementFocus(item);
        }
    }

    /**
     * if it can't find a linking with the elements, just set the focus to its parent (if existing).
     * 
     * @param item
     *            the item to set focus.
     */
    private void setElementFocus(DiffTreeItem item) {
        TableItem backupParent = null;
        for (TableItem tableItem : summaryViewer.getTable().getItems()) {

            if (!(tableItem.getData() instanceof SummaryItem)) {
                break;
            }

            SummaryItem summaryItem = (SummaryItem) tableItem.getData();
            if (summaryItem.getLeft() == item.getObject() || summaryItem.getRight() == item.getObject()) {
                summaryViewer.getTable().setSelection(tableItem);
                summaryViewer.getControl().setFocus();
                return;
            } else if (item.getObject() == summaryItem.getCommonParent()) {
                backupParent = tableItem;
            }
        }
        if (backupParent != null) {
            summaryViewer.getTable().setSelection(backupParent);
            summaryViewer.getControl().setFocus();
        }
    }

    private void makeActionSummaryViewer() {
        doubleClickActionSummaryViewer = new Action() {
            @Override
            public void run() {
                setFocusToElementInTreeViewer();
            }
        };
    }

    /**
     * sets the focus from the summary viewer to the corresponding element in the tree viewer.
     */
    private void setFocusToElementInTreeViewer() {
        ISelection selection = summaryViewer.getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        if (!(obj instanceof SummaryItem)) {
            return;
        }
        SummaryItem item = (SummaryItem) obj;
        // if it can't find a linking with the elements, just set
        // the focus to its parent (if existing)
        TreeItem backupParent = null;
        backupParent = getRootsOfDiffViewer(item, backupParent);
        if (backupParent != null) {
            diffViewer.getTree().setSelection(backupParent);
            diffViewer.getControl().setFocus();
        }
    }

    private TreeItem getRootsOfDiffViewer(SummaryItem item, TreeItem backupParent) {
        TreeItem resultParent = backupParent;
        for (TreeItem treeItem : diffViewer.getTree().getItems()) {
            for (TreeItem child : getAllTreeItems(treeItem)) {

                if (!(child.getData() instanceof DiffTreeItem)) {
                    break;
                }
                DiffTreeItem diffTreeItem = (DiffTreeItem) child.getData();
                if (diffTreeItem.getObject() == item.getLeft() || diffTreeItem.getObject() == item.getRight()) {
                    diffViewer.getTree().setSelection(child);
                    diffViewer.getControl().setFocus();
                    return null;
                } else if (item.getCommonParent() == diffTreeItem.getObject()) {
                    resultParent = child;
                }
            }
        }
        return resultParent;
    }

    private static List<TreeItem> getAllTreeItems(TreeItem parent) {
        List<TreeItem> allItems = new ArrayList<>();
        allItems.add(parent);
        for (TreeItem child : parent.getItems()) {
            allItems.addAll(getAllTreeItems(child));
        }
        return allItems;
    }

    /**
     * Opens the tabFolder with the tree viewer and summary table for the selected commit.
     * 
     * @param obj
     *            the commit of interest and to be opened in the tree viewer and summary table
     */
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

    private void hookDoubleClickAction() {
        commitViewer.addDoubleClickListener(event -> doubleClickActionCommitViewer.run());
        diffViewer.addDoubleClickListener(event -> doubleClickActionDiffViewer.run());
        summaryViewer.addDoubleClickListener(event -> doubleClickActionSummaryViewer.run());
    }

    private void hookKeyboard() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                return;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                handleKeyReleased(e);
            }
        };
        diffViewer.getTree().addKeyListener(kl);
    }

    private void handleKeyReleased(KeyEvent event) {
        // If space was released, set the focus on the item's parent in the
        // tree.
        if (event.character == SWT.SPACE) {
            focusOnParentTreeItem();
        }
        // collapse to level of classes
        else if (event.keyCode == SWT.KEYPAD_1) {
            diffViewer.collapseAll();
            diffViewer.expandToLevel(2);
        }
        // expand to level of attributes and methods
        else if (event.keyCode == SWT.KEYPAD_2) {
            diffViewer.collapseAll();
            diffViewer.expandToLevel(3);

        }
        // expand all levels
        else if (event.keyCode == SWT.KEYPAD_3) {
            diffViewer.expandAll();
        }
    }

    /**
     * Finds the parent of the current selection in the diffViewer and sets the focus on it.
     */
    private void focusOnParentTreeItem() {
        ISelection selection = diffViewer.getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        if (!(obj instanceof DiffTreeItem)) {
            return;
        }
        DiffTreeItem item = (DiffTreeItem) obj;
        DiffTreeItem parent = item.getParent();

        // gets all roots of the diff viewer
        for (TreeItem treeItem : diffViewer.getTree().getItems()) {
            for (TreeItem child : getAllTreeItems(treeItem)) {
                if (!(child.getData() instanceof DiffTreeItem)) {
                    break;
                }
                DiffTreeItem diffTreeItem = (DiffTreeItem) child.getData();
                if (diffTreeItem == parent) {
                    diffViewer.getTree().setSelection(child);
                    diffViewer.getControl().setFocus();
                    return;
                }
            }

        }
    }

    private void setUpTabs(Composite parent) {

        tabFolder = new TabFolder(parent, SWT.BOTTOM);

        commitHistoryTab = new TabItem(tabFolder, SWT.NULL);
        commitHistoryTab.setText("Commit History");
        commitHistoryComposite = new Composite(tabFolder, SWT.NULL);
        commitHistoryTab.setControl(commitHistoryComposite);
        commitHistoryComposite.setLayout(new FormLayout());

        diffViewTab = new TabItem(tabFolder, SWT.NULL);
        diffViewTab.setText("Diff View");
        diffViewComposite = new Composite(tabFolder, SWT.NULL);
        diffViewTab.setControl(diffViewComposite);
        diffViewComposite.setLayout(new FormLayout());

    }

    private void setUpDiffViewTabContent() {

        diffViewer = new TreeViewer(diffViewComposite, SWT.H_SCROLL | SWT.V_SCROLL);
        diffViewer.setContentProvider(new CommitContentProvider());
        diffViewer.setLabelProvider(new DiffViewLabelProvider());

        summaryViewer = new TableViewer(diffViewComposite,
                SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
        summaryViewer.setContentProvider(ArrayContentProvider.getInstance());
        summaryViewer.setLabelProvider(new SummaryLabelProvider());
        summaryViewer.getTable().setHeaderVisible(true);
        summaryViewer.getTable().setLinesVisible(true);
        String[] columnNames2 = new String[] { "Change Kind", "At", "From", "To" };
        for (int i = 0; i < columnNames2.length; i++) {
            TableColumn tableColumn = new TableColumn(summaryViewer.getTable(), SWT.LEFT);
            tableColumn.setText(columnNames2[i]);
            tableColumn.pack();
        }

        FormData formData = new FormData();
        formData.left = new FormAttachment(0, 5);
        formData.right = new FormAttachment(50, -5);
        formData.bottom = new FormAttachment(100, -5);
        formData.top = new FormAttachment(0, 5);
        diffViewer.getTree().setLayoutData(formData);

        formData = new FormData();
        formData.top = new FormAttachment(0, 5);
        formData.left = new FormAttachment(diffViewer.getTree(), 5);
        formData.right = new FormAttachment(100, -5);
        formData.bottom = new FormAttachment(100, -5);
        summaryViewer.getTable().setLayoutData(formData);

    }

    private void setUpCommitHistoryTabContent() {

        commitViewer = new TableViewer(commitHistoryComposite,
                SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
        commitViewer.setContentProvider(ArrayContentProvider.getInstance());
        commitViewer.setLabelProvider(new CommitLabelProvider());
        commitViewer.getTable().setHeaderVisible(true);
        commitViewer.getTable().setLinesVisible(false);
        commitViewer.setComparator(new CommitViewerComparator());
        String[] columnNames1 = new String[] { "Date", "Time" };
        for (int i = 0; i < columnNames1.length; i++) {
            TableColumn tableColumn = new TableColumn(commitViewer.getTable(), SWT.LEFT);
            tableColumn.setText(columnNames1[i]);
            tableColumn.pack();
        }
        getSite().setSelectionProvider(commitViewer);

        final Text filterText = new Text(commitHistoryComposite, SWT.HORIZONTAL | SWT.LEFT | SWT.WRAP | SWT.READ_ONLY);
        filterText.setText("Filter commits by time range:");

        final DateTime selectDateToFilter = new DateTime(commitHistoryComposite, SWT.DATE);

        final Button filterButton = new Button(commitHistoryComposite, SWT.PUSH);
        filterButton.setText("filter");
        filterButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                // If button was pressed, filter the commits
                Calendar instance = Calendar.getInstance();
                instance.set(Calendar.HOUR_OF_DAY, 0);
                instance.set(Calendar.MINUTE, 0);
                instance.set(Calendar.SECOND, 0);
                instance.set(Calendar.MILLISECOND, 0);
                instance.set(Calendar.DAY_OF_MONTH, selectDateToFilter.getDay());
                instance.set(Calendar.MONTH, selectDateToFilter.getMonth());
                instance.set(Calendar.YEAR, selectDateToFilter.getYear());

                commitViewer.setInput(comparisonManager.getAllCommitInfos(instance.getTimeInMillis()));
            }
        });

        FormData formData = new FormData();
        formData.top = new FormAttachment(0, 5);
        formData.bottom = new FormAttachment(90, -5);
        formData.left = new FormAttachment(0, 5);
        formData.right = new FormAttachment(100, -5);
        commitViewer.getTable().setLayoutData(formData);

        formData = new FormData();
        formData.top = new FormAttachment(commitViewer.getTable(), 5);
        formData.bottom = new FormAttachment(100, -5);
        formData.left = new FormAttachment(filterText, 5);
        formData.right = new FormAttachment(80, -5);
        selectDateToFilter.setLayoutData(formData);

        formData = new FormData();
        formData.top = new FormAttachment(commitViewer.getTable(), 5);
        formData.bottom = new FormAttachment(100, -5);
        formData.left = new FormAttachment(0, 5);
        formData.right = new FormAttachment(20, -5);
        filterText.setLayoutData(formData);

        formData = new FormData();
        formData.top = new FormAttachment(commitViewer.getTable(), 5);
        formData.bottom = new FormAttachment(100, -5);
        formData.left = new FormAttachment(selectDateToFilter, 5);
        formData.right = new FormAttachment(100, -5);
        filterButton.setLayoutData(formData);
    }

}
