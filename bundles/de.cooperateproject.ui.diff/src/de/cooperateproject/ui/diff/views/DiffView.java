package de.cooperateproject.ui.diff.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

import de.cooperateproject.ui.diff.action.DoubleClickCommitViewerAction;
import de.cooperateproject.ui.diff.action.LiveToggleAction;
import de.cooperateproject.ui.diff.content.CommitContentProvider;
import de.cooperateproject.ui.diff.handlers.ClickHandler;
import de.cooperateproject.ui.diff.internal.ComparisonManager;
import de.cooperateproject.ui.diff.internal.CommitCDOViewManager;
import de.cooperateproject.ui.diff.internal.CommitViewerComparator;
import de.cooperateproject.ui.diff.labeling.CommitLabelProvider;
import de.cooperateproject.ui.diff.labeling.DiffViewLabelProvider;
import de.cooperateproject.ui.diff.labeling.SummaryLabelProvider;
import de.cooperateproject.ui.diff.listener.ViewPartListener;
import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;

import java.util.Calendar;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
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
public class DiffView extends ViewPart implements IDiffView {

    public static final String PLUGIN_ID = "de.cooperateproject.ui.diff.views.DiffView";
    private ComparisonManager comparisonManager;
    private CommitCDOViewManager cdoViewManager;
    private TableViewer commitViewer;
    private TableViewer summaryViewer;
    private TreeViewer diffViewer;
    private TabFolder tabFolder;
    private TabItem commitHistoryTab;
    private TabItem diffViewTab;
    private Composite commitHistoryComposite;
    private Composite diffViewComposite;
    private LiveToggleAction liveUpdateAction;
    private ClickHandler clickHandler;

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

        getSite().getPage().addPartListener(new ViewPartListener(this));
    }
    
    private void setUpClickHandler() {
        clickHandler = new ClickHandler(summaryViewer, diffViewer);
        hookDoubleClickAction();
        hookKeyboard();
    }
    
    private void hookDoubleClickAction() {
        commitViewer.addDoubleClickListener(event -> new DoubleClickCommitViewerAction(comparisonManager, cdoViewManager,
                commitViewer, summaryViewer, diffViewer, tabFolder, diffViewTab).run());
        diffViewer.addDoubleClickListener(event -> clickHandler.setElementFocus());
        summaryViewer.addDoubleClickListener(event -> clickHandler.setFocusToElementInTreeViewer());
    }

    private void hookKeyboard() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                return;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                clickHandler.handleKeyReleased(e);
            }
        };
        diffViewer.getTree().addKeyListener(kl);
    }

    private void createToolbar() {
        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        liveUpdateAction = new LiveToggleAction(this);
        toolBarManager.add(liveUpdateAction);
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
        setCommits(file);
        tabFolder.setSelection(commitHistoryTab);
    }

    @Override
    public void setCommits() {
        if (liveUpdateAction.isLiveActivated()) {
            setCommits(getFile());
        }
    }

    private void setCommits(IFile file) {
        comparisonManager = new ComparisonManager(file);

        Set<CDOCommitInfo> allCommitInfos = comparisonManager.getAllCommitInfos();

        Control control = commitViewer.getControl();
        if (control != null && control.isDisposed()) {
            return;
        }
        commitViewer.setInput(allCommitInfos);
        for (TableColumn c : commitViewer.getTable().getColumns()) {
            c.pack();
        }
    }

    private IFile getFile() {
        IEditorInput input = getSite().getPage().getActiveEditor().getEditorInput();
        if (input instanceof ILauncherFileEditorInput) {
            ILauncherFileEditorInput launcherFileEditorInput = (ILauncherFileEditorInput) input;
            return launcherFileEditorInput.getAssociatedLauncherFile();
        }
        return null;
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @Override
    public void setFocus() {
        commitViewer.getControl().setFocus();
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
