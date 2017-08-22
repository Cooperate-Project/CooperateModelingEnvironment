package de.cooperateproject.ui.diff.content;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import java.util.HashMap;
import java.util.List;

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
    private final HashMap<EObject, DiffTreeItem> tree;

    /**
     * Build diagram hierarchy.
     * @param resource document resource.
     * @param summaryList list of all changes in the commit.
     */
    public DiffTreeBuilder(Resource resource, List<SummaryItem> summaryList) {
        this.resource = resource;
        this.summaryList = summaryList;
        this.tree = new HashMap<>();
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

        addChanges();
        return newResource;
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
        for (EObject child : obj.eContents()) {
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
        if (differenceKind == DifferenceKind.ADD || differenceKind == DifferenceKind.CHANGE
                || differenceKind == DifferenceKind.MOVE) {
            if (tree.containsKey(item.getLeft())) {
                tree.get(item.getLeft()).setDiffKind(differenceKind);
            } else if (tree.containsKey(item.getRight())) {
                tree.get(item.getRight()).setDiffKind(differenceKind);
            } else if (tree.containsKey(item.getCommonParent())) {
                setParentDiffKind(item, differenceKind);
            }
        }
    }

    private void setParentDiffKind(SummaryItem item, DifferenceKind differenceKind) {
        DiffTreeItem temp = tree.get(item.getCommonParent());
        if (temp.getDiffKind() == null) {
            temp.setDiffKind(differenceKind);
        }
    }

    /**
     * Add deleted items into diff tree.
     * 
     * @param item
     *            containing all diff information.
     */
    private void addDeleteChange(SummaryItem item) {
        Object deletedItem = item.getRight();
        if (tree.containsKey(item.getCommonParent())) {
            DiffTreeItem affectedParent = tree.get(item.getCommonParent());
            DiffTreeItem newChild = new DiffTreeItem(deletedItem);
            affectedParent.addChild(newChild);
            newChild.setParent(affectedParent);
            addDeletedChildren(newChild);
            newChild.setDiffKind(DifferenceKind.DELETE);
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
        diffItem.setDiffKind(DifferenceKind.DELETE);
        parent.addChild(diffItem);
        diffItem.setParent(parent);
    }

}
