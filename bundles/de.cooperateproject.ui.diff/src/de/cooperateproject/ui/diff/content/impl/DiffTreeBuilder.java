package de.cooperateproject.ui.diff.content.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.SummaryItem;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

/**
 * Builds an own containment hierarchy of the diagram, also containing deleted elements from the
 * Diff.
 * 
 * @author Jasmin, czogalik
 *
 */
public class DiffTreeBuilder {

    private final Resource resource;
    /**
     * A list of all changes in the commit.
     */
    private final List<SummaryItem> summaryList;
    /**
     * Links all diffTreeItems to their corresponding EObject.
     */
    private final Map<EObject, DiffTreeItem> tree;

    /**
     * Build diagram hierarchy.
     * @param resource document resource.
     * @param summaryList list of all changes in the commit.
     */
    public DiffTreeBuilder(Resource resource, List<SummaryItem> summaryList) {
        this.resource = resource;
        this.summaryList = summaryList;
        this.tree = new LinkedHashMap<>();
    }

    /**
     * Builds the whole tree of the diagram, also with objects that were deleted in the commit, so
     * it will be visible. Creates for all EObjects in the EMF Containment Hierarchy an own
     * DiffTreeItem with added information such as the DiffKind.
     * 
     * @return the new resource/first element of the tree's hierarchy
     */
    public DiffTreeItem buildTree() {

        TreeIterator<EObject> it = resource.getAllContents();
        

        
        DiffTreeItem newResource = createDiffTreeItems(it);
        PostProcessorManager.postProcessDiffTree(tree);
        
        build();

        addChanges();
        return newResource;
    }

    private void build() {
        for (Entry<EObject, DiffTreeItem> entry : tree.entrySet()) {
            entry.getValue();
        }
        
    }

    /**
     * Create new DiffTreeItems for all EObjects in the EMF Containment
     * Hierarchy of this diagram and returns new resource.
     * @param treeIterator
     * @param newResource
     * @return
     */
    private DiffTreeItem createDiffTreeItems(TreeIterator<EObject> treeIterator) {
        DiffTreeItem newResource = null;
        while (treeIterator.hasNext()) {
            EObject next = treeIterator.next();
            DiffTreeItem diffTreeItem = createDiffTreeItem(next);

            // get the root element of the resource
            if (next == resource.getContents().get(0)) {
                newResource = diffTreeItem;
            }

        }
        return newResource;
    }

    /**
     * Create new DiffTreeItems for all EObjects in the EMF Containment Hierarchy.
     * 
     * @param obj
     *            the EObject to create DiffTreeItems.
     * @return the created diffTreeItem.
     */
    private DiffTreeItem createDiffTreeItem(EObject obj) {
        DiffTreeItem diffTreeItem;
        if (!tree.containsKey(obj)) {
            diffTreeItem = new DiffTreeItem(obj);
        } else {
            diffTreeItem = tree.get(obj);
        }

        createDiffTreeItemChildren(obj, diffTreeItem);

        tree.put(obj, diffTreeItem);
        return diffTreeItem;
    }

    private void createDiffTreeItemChildren(EObject obj, DiffTreeItem diffTreeItem) {
        EList<EObject> eContents = obj.eContents();
        for (EObject child : eContents) {
            if (tree.containsKey(child)) {
                continue;
            }
            DiffTreeItem diffTreeItemChild = new DiffTreeItem(child);
            diffTreeItem.addChild(diffTreeItemChild);
            diffTreeItemChild.setParent(diffTreeItem);
            tree.put(child, diffTreeItemChild);
        }
    }

    private void addChanges() {
        if (tree.isEmpty()) {
            return;
        }
        for (SummaryItem item : summaryList) {
            addChanges(item);
        }
    }

    private void addChanges(SummaryItem item) {
        DifferenceKind differenceKind = item.getDifferenceKind();
        if (differenceKind == DifferenceKind.DELETE) {
            addDeleteChange(item);
        } else {
            addAddChangeMoveChange(item, differenceKind);
        }
    }

    private void addAddChangeMoveChange(SummaryItem item, DifferenceKind differenceKind) {
		if (differenceKind == DifferenceKind.ADD) {
			Optional<EObject> newValueEObject = Optional.ofNullable(item.getNewValue())
					.filter(EObject.class::isInstance).map(EObject.class::cast);
			if (newValueEObject.isPresent()) {
				associateWithNextPossibleParent(newValueEObject.get(), item);
			} else {
				Optional.ofNullable(item.getNewValue()).filter(tree::containsKey).map(tree::get)
						.ifPresent(i -> i.addAssociatedDiff(item));

			}
		}
		
		if (differenceKind == DifferenceKind.CHANGE)  {
			associateWithNextPossibleParent(item.getChangedObject(), item);
		}
		
		if (differenceKind == DifferenceKind.MOVE) {
			associateWithNextPossibleParent((EObject)item.getNewValue(), item);
		}
    }

	private void associateWithNextPossibleParent(EObject startObject, SummaryItem item) {
		for (EObject currentObject = startObject; currentObject != null; currentObject = currentObject
				.eContainer()) {
			if (tree.containsKey(currentObject)) {
				tree.get(currentObject).addAssociatedDiff(item);
				break;
			}
		}
	}

    /**
     * Add deleted items into diff tree.
     * 
     * @param item
     *            containing all diff information.
     */
    private void addDeleteChange(SummaryItem item) {
        Object deletedItem = item.getOldValue();
        if (tree.containsKey(item.getChangedObject())) {
            DiffTreeItem affectedParent = tree.get(item.getChangedObject());
            DiffTreeItem newChild = new DiffTreeItem(deletedItem);
            affectedParent.addChild(newChild);
            newChild.setParent(affectedParent);
            addDeletedChildren(newChild);
            newChild.addAssociatedDiff(item);
        }
    }

    /**
     * Adds the deleted children of a parent, that has been deleted itself in the commit.
     * 
     * @param parent
     *            the parent that has been deleted and whose children should be added
     */
    private static void addDeletedChildren(DiffTreeItem parent) {
        if (parent.getObject() instanceof EObject) {
            EObject eObj = (EObject) parent.getObject();
            if (eObj.eContents().isEmpty()) {
                return;
            }
            EList<EObject> childrenList = eObj.eContents();
            for (EObject obj : childrenList) {
                createDeleteDiffKindItem(parent, obj);
            }
        }
    }

    private static void createDeleteDiffKindItem(DiffTreeItem parent, EObject obj) {
        DiffTreeItem diffItem = new DiffTreeItem(obj);
        diffItem.setDifferenceKindsManually(DifferenceKind.DELETE);
        parent.addChild(diffItem);
        diffItem.setParent(parent);
    }

}
