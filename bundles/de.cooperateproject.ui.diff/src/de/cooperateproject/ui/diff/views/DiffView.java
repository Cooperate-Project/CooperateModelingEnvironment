package de.cooperateproject.ui.diff.views;


import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.ui.part.*;

import de.cooperateproject.ui.diff.content.CommitContentProvider;
import de.cooperateproject.ui.diff.internal.CommitInfo;
import de.cooperateproject.ui.diff.internal.CommitManager;
import de.cooperateproject.ui.diff.internal.CommitViewerComparator;
import de.cooperateproject.ui.diff.internal.DiffTreeItem;
import de.cooperateproject.ui.diff.internal.SummaryItem;
import de.cooperateproject.ui.diff.labeling.CommitLabelProvider;
import de.cooperateproject.ui.diff.labeling.DiffViewLabelProvider;
import de.cooperateproject.ui.diff.labeling.SummaryLabelProvider;

import org.eclipse.jface.viewers.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.*;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;

/**
 * Represents the view of the plugin, mainly responsible for the gui and communication between user and program
 * @author Jasmin
 *
 */
public class DiffView extends ViewPart {
	public static final String ID = "de.cooperateproject.ui.diff.views.DiffView";
	private CommitManager commitManager;
	private TableViewer commitViewer, summaryViewer;
	private TreeViewer diffViewer;
	private Action doubleClickActionCommitViewer, doubleClickActionDiffViewer, doubleClickActionSummaryViewer;
	private TabFolder tabFolder;
	private TabItem commitHistoryTab, diffViewTab;
	private Composite commitHistoryComposite, diffViewComposite;

/**
	 * The constructor.
	 */
	public DiffView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		commitManager = new CommitManager();
		setUpView(parent);
		makeActions();
		hookDoubleClickAction();
	}
	
	/**
	 * This method will be invoked from a handler bound to a command that is able to retrieve a selected .cooperate file from the project explorer.
	 * @param file the selected .cooperate file
	 */
	public void setSelectedFile(IFile file){
		commitManager.setFile(file);
		commitViewer.setInput(commitManager.getAllCommitInfos());
		for (TableColumn c : commitViewer.getTable().getColumns()){
			c.pack();
		}
		tabFolder.setSelection(0);
	}



	private void makeActions() {
		doubleClickActionCommitViewer = new Action() {
			public void run() {
				ISelection selection = commitViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();

				if(obj instanceof CommitInfo){
					showDiffViewOfCommit((CommitInfo)obj);
				}
			}
		};
		
		doubleClickActionDiffViewer = new Action() {
			public void run() {
				ISelection selection = diffViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				if(obj instanceof DiffTreeItem){
					DiffTreeItem item = (DiffTreeItem)obj;
					for(TableItem tableItem : summaryViewer.getTable().getItems()){
						if(tableItem.getData() instanceof SummaryItem){
							SummaryItem summaryItem = (SummaryItem) tableItem.getData();
							if(summaryItem.getLeft() == item.getEObject() || summaryItem.getRight() == item.getEObject()){
								summaryViewer.getTable().setSelection(tableItem);
								summaryViewer.getControl().setFocus();
								break;
							}
						}
					}
				}
			}
		};
		
		doubleClickActionSummaryViewer = new Action() {
			public void run() {
				ISelection selection = summaryViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				if(obj instanceof SummaryItem){
					SummaryItem item = (SummaryItem)obj;
					for(TreeItem treeItem : diffViewer.getTree().getItems()){ //gets all roots of the diff viewer
							for(TreeItem child: allItems(treeItem)){
								
								if(child.getData() instanceof DiffTreeItem){
									DiffTreeItem diffTreeItem = (DiffTreeItem) child.getData();
									if(diffTreeItem.getEObject() == item.getLeft() || diffTreeItem.getEObject() == item.getRight()){
										diffViewer.getTree().setSelection(child);
										diffViewer.getControl().setFocus();
										break;
								}
							}
							
						}
					}
				}
			}
			
			private List<TreeItem> allItems(TreeItem parent){
				List<TreeItem> allItems = new ArrayList<TreeItem>();
				allItems.add(parent);
				for(TreeItem child: parent.getItems()){
					allItems.addAll(allItems(child));
				}
				return allItems;
			}
		};
	}
	private void showDiffViewOfCommit(CommitInfo obj){
		summaryViewer.setInput(commitManager.compare(obj));
		for (TableColumn c : summaryViewer.getTable().getColumns()){
			c.pack();
		}
		tabFolder.setSelection(1);
		diffViewer.setInput(commitManager.getRoot());
		diffViewer.expandAll();
		diffViewer.getControl().setFocus();
	}
	
	private void hookDoubleClickAction() {
		commitViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickActionCommitViewer.run();
			}
		});
		diffViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickActionDiffViewer.run();
			}
		});
		summaryViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickActionSummaryViewer.run();
			}
		});
	}
	
	/**
	 * Initializes the view of this plugin. 
	 * @param parent 
	 */
	private void setUpView(Composite parent){
		
		tabFolder = new TabFolder(parent, SWT.BOTTOM);
		
		commitHistoryTab = new TabItem(tabFolder, SWT.NULL);
		commitHistoryTab.setText("Commit History");
		commitHistoryComposite = new Composite(tabFolder, SWT.NULL);
		commitHistoryTab.setControl(commitHistoryComposite);
		
        commitHistoryComposite.setLayout(new FormLayout());
        
        FormData formData = new FormData();
        formData.top = new FormAttachment(0,5);
        formData.bottom = new FormAttachment(90,-5);
        formData.left = new FormAttachment(0,5);
        formData.right = new FormAttachment(100,-5);

    	commitViewer = new TableViewer(commitHistoryComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		commitViewer.setContentProvider(ArrayContentProvider.getInstance());
		commitViewer.setLabelProvider(new CommitLabelProvider());
		commitViewer.getTable().setHeaderVisible(true);
		commitViewer.getTable().setLinesVisible(false);
		commitViewer.setComparator(new CommitViewerComparator());
		String[] columnNames1 = new String[] {
				"Date", "Time", "Number of changes"};
		for(int i = 0; i < columnNames1.length; i++){
			TableColumn tableColumn = new TableColumn(commitViewer.getTable(), SWT.LEFT);
			tableColumn.setText(columnNames1[i]);
			tableColumn.pack();
		}
		getSite().setSelectionProvider(commitViewer); //it will start up with the commitHistory
        commitViewer.getTable().setLayoutData(formData);
		
        final Text filterText = new Text(commitHistoryComposite, SWT.HORIZONTAL | SWT.LEFT | SWT.WRAP | SWT.READ_ONLY);
		filterText.setText("Filter commits by time range:");
		
		final DateTime selectDateToFilter = new DateTime(commitHistoryComposite, SWT.DATE);
		final Button filterButton = new Button(commitHistoryComposite, SWT.PUSH);
		filterButton.setText("filter");
		filterButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent event){
				//If button was pressed, filter the commits
				Calendar instance = Calendar.getInstance();
				instance.set(Calendar.DAY_OF_MONTH, selectDateToFilter.getDay());
				instance.set(Calendar.MONTH, selectDateToFilter.getMonth());
				instance.set(Calendar.YEAR, selectDateToFilter.getYear());
				
				commitViewer.setInput(commitManager.getAllCommitInfos(instance.getTimeInMillis()));
			}
		});

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
		
		diffViewTab = new TabItem(tabFolder, SWT.NULL);
		diffViewTab.setText("Diff View");
		diffViewComposite = new Composite(tabFolder, SWT.NULL);
		diffViewTab.setControl(diffViewComposite);
		diffViewComposite.setLayout(new FormLayout());
		
		diffViewer = new TreeViewer(diffViewComposite, SWT.H_SCROLL | SWT.V_SCROLL);	
		diffViewer.setContentProvider(new CommitContentProvider());
		diffViewer.setLabelProvider(new DiffViewLabelProvider());
	
		summaryViewer = new TableViewer(diffViewComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		summaryViewer.setContentProvider(ArrayContentProvider.getInstance());
		summaryViewer.setLabelProvider(new SummaryLabelProvider());
		summaryViewer.getTable().setHeaderVisible(true);
		summaryViewer.getTable().setLinesVisible(true);
		String[] columnNames2 = new String[] {
				"Change Kind", "At", "From", "To"};
		for(int i = 0; i < columnNames2.length; i++){
			TableColumn tableColumn = new TableColumn(summaryViewer.getTable(), SWT.LEFT);
			tableColumn.setText(columnNames2[i]);
			tableColumn.pack();
		}

		formData = new FormData();
		formData.left = new FormAttachment(0,5);
		formData.right = new FormAttachment(100,-5);
		formData.bottom = new FormAttachment(70,-5);
		formData.top = new FormAttachment(0,5);
		diffViewer.getTree().setLayoutData(formData);
		
		formData = new FormData();
		formData.top = new FormAttachment(diffViewer.getTree(), 5);
		formData.left = new FormAttachment(0,5);
		formData.right = new FormAttachment(100,-5);
		formData.bottom = new FormAttachment(100,-5);
		summaryViewer.getTable().setLayoutData(formData);
	}
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		commitViewer.getControl().setFocus();
	}
}
