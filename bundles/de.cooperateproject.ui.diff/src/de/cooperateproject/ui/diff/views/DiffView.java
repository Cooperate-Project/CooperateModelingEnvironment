package de.cooperateproject.ui.diff.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

import de.cooperateproject.ui.diff.action.DoubleClickCommitViewerAction;
import de.cooperateproject.ui.diff.action.IToggleAction;
import de.cooperateproject.ui.diff.action.LiveToggleAction;
import de.cooperateproject.ui.diff.content.CommitContentProvider;
import de.cooperateproject.ui.diff.content.DiffTreeBuilder;
import de.cooperateproject.ui.diff.content.SummaryItem;
import de.cooperateproject.ui.diff.content.SummaryViewBuilder;
import de.cooperateproject.ui.diff.handlers.ClickHandler;
import de.cooperateproject.ui.diff.internal.ComparisonManager;
import de.cooperateproject.ui.diff.internal.CommitCDOViewManager;
import de.cooperateproject.ui.diff.internal.CommitViewerComparator;
import de.cooperateproject.ui.diff.labeling.CommitLabelProvider;
import de.cooperateproject.ui.diff.labeling.DiffViewLabelProvider;
import de.cooperateproject.ui.diff.labeling.SummaryLabelProvider;
import de.cooperateproject.ui.diff.listener.ViewPartListener;

import java.util.Calendar;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
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
 * @author Jasmin, czogalik
 *
 */
public class DiffView extends ViewPart implements IDiffView {

    public static final String PLUGIN_ID = "de.cooperateproject.ui.diff.views.DiffView";
    private ComparisonManager comparisonManager;
    private TableViewer commitViewer;
    private TableViewer summaryViewer;
    private TreeViewer diffViewer;
    private TabFolder tabFolder;
    private TabItem commitHistoryTab;
    private TabItem diffViewTab;
    private Composite commitHistoryComposite;
    private Composite diffViewComposite;
    private IToggleAction liveUpdateAction;
    private ClickHandler clickHandler;

    private IFile file;

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    @Override
    public void createPartControl(Composite parent) {
        setUpTabs(parent);
        setUpCommitHistoryTabContent();
        setUpDiffViewTabContent();
        setUpClickHandler();

        createToolbar();

        getSite().getPage().addPartListener(new ViewPartListener(this, getSite(), liveUpdateAction));
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @Override
    public void setFocus() {
        commitViewer.getControl().setFocus();
    }

    @Override
    public void setSelectedFile(IFile file) {
        this.file = file;
        setCommits(file);
        if (!isDisposed()) {
            setTabFolder(commitHistoryTab);
        }
    }

    @Override
    public void showDiffViewOfCommit(CommitCDOViewManager cdoViewManager) {
        SummaryViewBuilder svb = new SummaryViewBuilder();
        List<SummaryItem> summaryList = svb.buildSummaryView(
                comparisonManager.getComparison(cdoViewManager.getPreviousView(), cdoViewManager.getCurrentView(), file));
        
        fillTable(summaryViewer, summaryList);
        setTabFolder(diffViewTab);

        setDiffViewerInput(cdoViewManager, summaryList);
    }

    private void setDiffViewerInput(CommitCDOViewManager cdoViewManager, List<SummaryItem> summaryList) {
        CDOResource resource = comparisonManager.getResource(cdoViewManager.getCurrentView(), file);
        DiffTreeBuilder dtb = new DiffTreeBuilder(resource, summaryList);
        diffViewer.setInput(dtb.buildTree());
        diffViewer.expandAll();
        diffViewer.getControl().setFocus();
    }
    
    private static void fillTable(TableViewer viewer, Object input) {
        viewer.setInput(input);
        for (TableColumn c : viewer.getTable().getColumns()) {
            c.pack();
        }
    }
    
    private void setTabFolder(TabItem item) {
        if (tabFolder != null) {
            tabFolder.setSelection(item);
        }
    }

    private boolean isDisposed() {
        Control control = commitViewer.getControl();
        if (control == null) {
            return true;
        }
        return control.isDisposed();
    }

    private void setUpClickHandler() {
        clickHandler = new ClickHandler(summaryViewer, diffViewer);
        hookDoubleClickAction();
        hookKeyboard();
    }

    private void hookDoubleClickAction() {
        commitViewer.addDoubleClickListener(event -> new DoubleClickCommitViewerAction(this, commitViewer, file).run());
        diffViewer.addDoubleClickListener(event -> clickHandler.setElementFocus());
        summaryViewer.addDoubleClickListener(event -> clickHandler.setFocusToElementInTreeViewer());
    }

    private void hookKeyboard() {
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                return;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                clickHandler.handleKeyReleased(e);
            }
        };
        diffViewer.getTree().addKeyListener(keyListener);
    }

    private void createToolbar() {
        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        liveUpdateAction = new LiveToggleAction();
        toolBarManager.add((Action) liveUpdateAction);
    }

    private void setCommits(IFile file) {
        comparisonManager = new ComparisonManager();

        if (isDisposed()) {
            return;
        }
        
        fillTable(commitViewer, comparisonManager.getAllCommitInfos(file));
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
        String[] columnNames1 = new String[] { "Date", "Time", "Message" };
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

                commitViewer.setInput(comparisonManager.getAllCommitInfos(instance.getTimeInMillis(), file));
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
