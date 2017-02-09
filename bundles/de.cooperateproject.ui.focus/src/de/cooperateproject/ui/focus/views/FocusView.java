package de.cooperateproject.ui.focus.views;


import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;

import de.cooperateproject.ui.focus.connection.SubscriberManager;
import de.cooperateproject.ui.focus.internal.FocusManager;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;


public class FocusView extends ViewPart{
	public static final String ID = "de.cooperateproject.ui.focus.views.FocusView";
	private TableViewer historyViewer; //lists all deictic gestures (element focuses) that have been made
	private Composite focusComposite;
	private Action doubleClickActionHistoryViewer;
	private FocusDialog focusDialog;
	private Button muteButton;
	private Text titleText;

	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		setUpView(parent);
		setUpDialogs(parent);
		makeActions();
		hookDoubleClickAction();
	}
	
	/**
	 * Initializes all needed dialog windows.
	 */
	private void setUpDialogs(Composite parent) {
		focusDialog = new FocusDialog(parent.getShell());	
	}

	private void makeActions(){
		doubleClickActionHistoryViewer = new Action(){
			public void run() {
				IStructuredSelection selection = (IStructuredSelection) historyViewer.getSelection();
				if(selection.getFirstElement() instanceof EObject)
					FocusManager.getInstance().setFocusedElement((EObject) selection.getFirstElement());
			}
		};
	}


	private void hookDoubleClickAction() {
		historyViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event){
				doubleClickActionHistoryViewer.run();
			}
		});
	}
	
	public void setTitleText(String title){
		titleText.setText(title);
	}

	/**
	 * Initializes the view of this plugin. 
	 * @param parent 
	 */
	private void setUpView(Composite parent){
		
		focusComposite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		GridData gridData;
		layout.numColumns = 4;
		layout.makeColumnsEqualWidth = true;
		focusComposite.setLayout(layout);
		titleText = new Text(focusComposite, SWT.HORIZONTAL | SWT.CENTER | SWT.READ_ONLY | SWT.WRAP);
		historyViewer = new TableViewer(focusComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);	
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
		String[] columnNames = new String[] {
				"Time", "Focused element"};
		for(int i = 0; i < columnNames.length; i++){	
			TableColumn tableColumn = new TableColumn(historyViewer.getTable(), SWT.LEFT);
			tableColumn.setText(columnNames[i]);
			tableColumn.pack();
		}

		muteButton = new Button(focusComposite, SWT.TOGGLE);
		muteButton.setText("mute");
		muteButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent event){
				Button button = ((Button) event.widget);
	            if(button.getSelection()){ //selected means muted
	            	SubscriberManager.getInstance().unsubscribe();
	            	button.setText("unmute");
	            }else{
	            	SubscriberManager.getInstance().subscribe();
	            	button.setText("mute");
	            }
			}
		});
		
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.TOP;
		gridData.heightHint = 50;
	   	
	   	muteButton.setLayoutData(gridData);
		
		historyViewer.setContentProvider(ArrayContentProvider.getInstance());
		historyViewer.setInput(new String[] { "One", "Two", "Three" });
		historyViewer.setLabelProvider(new ViewLabelProvider());
		getSite().setSelectionProvider(historyViewer);
	}


	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		historyViewer.getControl().setFocus();	
	}
	
	private class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
	}

	
	private class FocusDialog extends Dialog {
		
		private EObject focusedElement;	

		protected FocusDialog(Shell parentShell) {
			super(parentShell);
		}
		
		@Override
		protected void setShellStyle(int arg0) {
			super.setShellStyle(SWT.TITLE);
		}
	
		@Override
		protected void okPressed(){
			super.okPressed();
			FocusManager.getInstance().setFocusedElement(focusedElement);
		}
		
		@Override
		public int open(){
			int ret = super.open();
			//TODO: make a sound
			return ret;
		}
		
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
			container.getShell().setText("Incoming element focus");
			final Text text = new Text(container, SWT.HORIZONTAL | SWT.LEFT | SWT.WRAP | SWT.READ_ONLY);

			text.setText("Element XYZ has been focused. Would you like to jump to it?");
			
			return text;
		}
		
		@Override
		   protected void createButtonsForButtonBar(Composite parent) {
		    super.createButtonsForButtonBar(parent);
		    Button yes = getButton(IDialogConstants.OK_ID);
			yes.setText("Yes");
			setButtonLayoutData(yes);
			Button no = getButton(IDialogConstants.CANCEL_ID);
			no.setText("No");
			setButtonLayoutData(no);
		}

		
		public Object getFocusedElement() {
			return focusedElement;
		}

		public void setFocusedElement(EObject focusedElement) {
			this.focusedElement = focusedElement;
		}
		
	}

}