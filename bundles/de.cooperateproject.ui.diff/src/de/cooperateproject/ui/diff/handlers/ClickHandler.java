package de.cooperateproject.ui.diff.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TreeItem;

import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.SummaryItem;
import de.cooperateproject.ui.diff.internal.IsTransitiveChildPredicate;

/**
 * Handles click and keyboard events in DiffView.
 * @author Jasmin, czogalik, persch
 *
 */
public class ClickHandler {
    
    private TableViewer summaryViewer;
    private TreeViewer diffViewer;
    private List<SummaryItem> baseList = new ArrayList<>();
    /**
     * Handles click and keyboard events in DiffView.
     * @param summaryViewer TableViewer of DiffView.
     * @param diffViewer TreeViewer of DiffView.
     */
    public ClickHandler(TableViewer summaryViewer, TreeViewer diffViewer) {
        this.summaryViewer = summaryViewer;
        this.diffViewer = diffViewer;
    }

    /**
     * Handle key release event.
     * @param event the key release event.
     */
    public void handleKeyReleased(KeyEvent event) {
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
     * sets the focus from the tree viewer to the corresponding element in the summary table.
     */
    public void setElementFocus() {
        ISelection selection = diffViewer.getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        if (!(obj instanceof DiffTreeItem)) {
            return;
        }
        DiffTreeItem item = (DiffTreeItem) obj;
        if (!item.getDiffKinds().isEmpty()) {
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
        
		Map<TableItem, SummaryItem> relevantItems = Arrays.asList(summaryViewer.getTable().getItems()).stream()
				.filter(i -> i.getData() instanceof SummaryItem)
				.collect(Collectors.toMap(Function.identity(), i -> (SummaryItem) i.getData()));
		
		for (Map.Entry<TableItem, SummaryItem> relevantItem : relevantItems.entrySet()) {
            SummaryItem summaryItem = relevantItem.getValue();
            TableItem tableItem = relevantItem.getKey();
            
            if (item.getAssociatedDiffs().contains(summaryItem)) {
                summaryViewer.getTable().setSelection(tableItem);
                summaryViewer.getControl().setFocus();
                return;
            } else if (item.getObject() == summaryItem.getChangedObject()) {
                backupParent = tableItem;
            }
        }
        if (backupParent != null) {
            summaryViewer.getTable().setSelection(backupParent);
            summaryViewer.getControl().setFocus();
        }
    }
    
    /**
     * sets the focus from the summary viewer to the corresponding element in the tree viewer.
     */
    public void setFocusToElementInTreeViewer() {
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
                if (diffTreeItem.getAssociatedDiffs().contains(item)) {
                    diffViewer.getTree().setSelection(child);
                    diffViewer.getControl().setFocus();
                    return null;
                } else if (item.getChangedObject() == diffTreeItem.getObject()) {
                    resultParent = child;
                }
            }
        }
        return resultParent;
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
    
    private static List<TreeItem> getAllTreeItems(TreeItem parent) {
        List<TreeItem> allItems = new ArrayList<>();
        allItems.add(parent);
        for (TreeItem child : parent.getItems()) {
            allItems.addAll(getAllTreeItems(child));
        }
        return allItems;
    }
    
    private static List<DiffTreeItem> getAllDiffTreeItems(DiffTreeItem parent) {
        List<DiffTreeItem> allItems = new ArrayList<>();
        allItems.add(parent);
        for (DiffTreeItem child : parent.getContents()) {
            allItems.addAll(getAllDiffTreeItems(child));
        }
        return allItems;
    }
    
	public void filterSummaryTable() {
		ISelection selection = diffViewer.getSelection();
		Object obj = ((IStructuredSelection) selection).getFirstElement();
		DiffTreeItem item = (DiffTreeItem) obj;
		if (item == null) {
			return;
		}

		Collection<DiffTreeItem> childElements = getAllDiffTreeItems(item);
		Collection<SummaryItem> elementsToShow = new ArrayList<>();

		Collection<EObject> relevantObjects = childElements.stream().map(DiffTreeItem::getObject)
				.filter(EObject.class::isInstance).map(EObject.class::cast).collect(Collectors.toSet());

		for (SummaryItem summaryItem : baseList) {

			if (relevantObjects.stream().anyMatch(
					parent -> new IsTransitiveChildPredicate(parent, false).test(summaryItem.getChangedObject()))
					|| Arrays.asList(summaryItem.getChangedObject(), summaryItem.getOldValue(),
							summaryItem.getNewValue()).contains(item.getObject())) {
				elementsToShow.add(summaryItem);
			}
		}

		summaryViewer.getTable().clearAll();
		summaryViewer.setInput(elementsToShow);
		for (TableColumn c : summaryViewer.getTable().getColumns()) {
			c.pack();
		}

		summaryViewer.getTable().update();
	}
    
    public void resetCopiedTableContents() {
        baseList.clear();
        for (TableItem tableItem : summaryViewer.getTable().getItems()) {
            if (tableItem.getData() instanceof SummaryItem) {
            baseList.add((SummaryItem) tableItem.getData());
            }
        }
    }
}
