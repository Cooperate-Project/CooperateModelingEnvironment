package de.cooperateproject.ui.focus.internal.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.focus.internal.history.HistoryElement;
import de.cooperateproject.ui.focus.internal.model.FocusViewManager;
import de.cooperateproject.ui.focus.internal.utils.FocusViewLabelProvider;

/**
 * The view of the plugin.
 * 
 * @author Jasmin
 *
 */
public class FocusView extends ViewPart {
    public static final String ID = "de.cooperateproject.ui.focus.views.FocusView";
    private static final Logger LOGGER = LoggerFactory.getLogger(FocusView.class);

    private final FocusViewManager focusViewManager = new FocusViewManager();

    private TableViewer historyViewer; // lists all deictic gestures (element
                                       // focuses) that have been made
    private Action doubleClickActionHistoryViewer;
    private Text titleText;
    private Button muteButton;
    private Composite parent;

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    @Override
    public void createPartControl(Composite parent) {
        this.parent = parent;
        focusViewManager.init();
        setUpView();
        // setUpDialogs();
        makeActions();
        hookDoubleClickAction();
    }

    @Override
    public void dispose() {
        focusViewManager.dispose();
        super.dispose();
    }

    /**
     * Sets the diagram's title in the view.
     * 
     * @param title
     *            the title of the diagram
     */
    public void setTitleText(String title) {
        titleText.setText(title);
    }

    public String getTitleText() {
        return titleText.getText();
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @Override
    public void setFocus() {
        historyViewer.getControl().setFocus();
    }

    public void hitMuteButton() {
        muteButton.setSelection(!muteButton.getSelection());
        Event e = new Event();
        e.widget = muteButton;
        e.display = muteButton.getDisplay();
        e.type = SWT.Selection;
        muteButton.notifyListeners(e.type, e);
    }

    public void sendCurrentFocus() {
        focusViewManager.sendCurrentFocus();
    }

    private void makeActions() {
        doubleClickActionHistoryViewer = new Action() {
            @Override
            public void run() {
                IStructuredSelection selection = (IStructuredSelection) historyViewer.getSelection();
                if (selection.getFirstElement() instanceof HistoryElement)
                    focusViewManager.setFocus((HistoryElement) selection.getFirstElement());
            }
        };
    }

    private void hookDoubleClickAction() {
        historyViewer.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                doubleClickActionHistoryViewer.run();
            }
        });
    }

    /**
     * Initializes the view of this plugin.
     * 
     * @param parent
     */
    private void setUpView() {

        final Composite focusComposite = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        GridLayout layoutForButtons = new GridLayout();
        GridData gridData;
        layout.numColumns = 4;
        layout.makeColumnsEqualWidth = true;
        focusComposite.setLayout(layout);
        titleText = new Text(focusComposite, SWT.HORIZONTAL | SWT.CENTER | SWT.READ_ONLY | SWT.WRAP);
        historyViewer = new TableViewer(focusComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
        final Composite buttonComposite = new Composite(focusComposite, SWT.NULL);
        buttonComposite.setLayout(layoutForButtons);
        titleText.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));

        gridData = new GridData();
        gridData.horizontalSpan = 4;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = false;
        gridData.horizontalAlignment = SWT.FILL;
        gridData.verticalAlignment = SWT.CENTER;
        gridData.heightHint = 15;

        titleText.setLayoutData(gridData);

        gridData = new GridData();
        gridData.horizontalSpan = 3;
        gridData.horizontalAlignment = SWT.FILL;
        gridData.verticalAlignment = SWT.FILL;
        gridData.grabExcessVerticalSpace = true;
        gridData.grabExcessHorizontalSpace = true;

        historyViewer.getTable().setLayoutData(gridData);
        historyViewer.getTable().setHeaderVisible(true);
        historyViewer.getTable().setLinesVisible(false);
        String[] columnNames = new String[] { "Time", "Focused element" };
        for (int i = 0; i < columnNames.length; i++) {
            TableColumn tableColumn = new TableColumn(historyViewer.getTable(), SWT.LEFT);
            tableColumn.setText(columnNames[i]);
            tableColumn.pack();
        }

        gridData = new GridData();
        gridData.horizontalAlignment = SWT.FILL;
        gridData.verticalAlignment = SWT.FILL;
        buttonComposite.setLayoutData(gridData);

        muteButton = new Button(buttonComposite, SWT.TOGGLE);
        muteButton.setText("mute");

        gridData = new GridData();
        gridData.horizontalAlignment = SWT.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.heightHint = 50;

        muteButton.setLayoutData(gridData);

        final Button focusButton = new Button(buttonComposite, SWT.PUSH);
        focusButton.setText("send focus");
        focusButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                sendCurrentFocus();
            }
        });

        gridData = new GridData();
        gridData.horizontalAlignment = SWT.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.heightHint = 50;

        focusButton.setLayoutData(gridData);

        final Button clearButton = new Button(buttonComposite, SWT.PUSH);
        clearButton.setText("clear history");
        clearButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                focusViewManager.clearHistoryElements();
                historyViewer.refresh();
            }
        });

        gridData = new GridData();
        gridData.horizontalAlignment = SWT.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.heightHint = 50;

        clearButton.setLayoutData(gridData);

        DataBindingContext ctx = new DataBindingContext();
        IObservableValue<String> targetTitle = WidgetProperties.text().observe(titleText);
        ctx.bindValue(targetTitle, focusViewManager.getDiagramTitleObservable(),
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));

        IObservableValue<Boolean> targetMute = WidgetProperties.selection().observe(muteButton);
        ctx.bindValue(targetMute, focusViewManager.getMuteStatusObservable(),
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE),
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));

        historyViewer.setLabelProvider(new FocusViewLabelProvider());
        historyViewer.setContentProvider(new ObservableListContentProvider());
        historyViewer.setInput(focusViewManager.getHistoryElementObservable());
        getSite().setSelectionProvider(historyViewer);
    }

}
