package de.cooperateproject.ui.focus.views;


import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;


public class FocusView extends ViewPart {
	public static final String ID = "de.cooperateproject.ui.focus.views.FocusView";
	private TableViewer historyViewer; //lists all deictic gestures (element focuses) that have been made
	private Composite focusComposite;
	private Action doubleClickActionHistoryViewer;
	private FocusDialog focusDialog;
	private Button muteButton;

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
	}

/**
	 * The constructor.
	 */
	public FocusView() {
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
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
				//jump to the selection in the editor
				//ISelection selection = historyViewer.getSelection();
				//Object obj = ((IStructuredSelection)selection).getFirstElement();

				//if(obj instanceof don't know yet){
				//	focusElementInEditor((casting)element)
}
				//}
		};
	}


	private void hookDoubleClickAction() {
		historyViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event){
				doubleClickActionHistoryViewer.run();
			}
		});
	}
	

	/**
	 * Initializes the view of this plugin. 
	 * @param parent 
	 */
	private void setUpView(Composite parent){
		
		focusComposite = new Composite(parent, SWT.NULL);
		focusComposite.setLayout(new FormLayout());
		historyViewer = new TableViewer(focusComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);	
		
		FormData formData = new FormData();
	    formData.top = new FormAttachment(0,5);
	    formData.bottom = new FormAttachment(100,-5);
	    formData.left = new FormAttachment(0,5);
	   	formData.right = new FormAttachment(80,-5);
		
		historyViewer.getTable().setLayoutData(formData);
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
	            	//TODO user just muted, unsubscribe from topic
	            	button.setText("unmute");
	            }else{
	            	//TODO user just unmuted, subscribe the topic
	            	button.setText("mute");
	            }
			}
		});
		
		formData = new FormData();
	    formData.top = new FormAttachment(0,10);
	    formData.bottom = new FormAttachment(20,-10);
	    formData.left = new FormAttachment(historyViewer.getTable(),10);
	   	formData.right = new FormAttachment(100,-10);
	   	
	   	muteButton.setLayoutData(formData);
		
		historyViewer.setContentProvider(ArrayContentProvider.getInstance());
		historyViewer.setInput(new String[] { "One", "Two", "Three" });
		historyViewer.setLabelProvider(new ViewLabelProvider());
		getSite().setSelectionProvider(historyViewer);
	}


	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		historyViewer.getControl().setFocus();	
	}
	
	private class FocusDialog extends Dialog {
		
		private Object focusedElement;	

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
			//TODO: change focus to focused element in editor
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

			text.setText("Element XYZ has been focused. Would you like to jump to it?"); //TODO
			
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

		public void setFocusedElement(Object focusedElement) {
			this.focusedElement = focusedElement;
		}
		
	}
}
