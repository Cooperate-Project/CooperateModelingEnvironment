package de.cooperateproject.ui.diff.content;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.compare.DifferenceKind;

/**
 * Represents a single item/element in the Tree Viewer for the diagram to be represented. Since we
 * need information about whether the item has changed in this commit or not, all needed information
 * about the item will be stored here.
 * 
 * @author Jasmin, czogalik
 *
 */
public class DiffTreeItem {

    private final Set<DiffTreeItem> children;
    /**original object (of this one) from the EMF Containment Hierarchy.*/
    private final Object object; 
    private DiffTreeItem parent;
    /** Showing if the item has changed in this commit or not. In latter case it's null.*/
    private DifferenceKind kind;

    /**
     * Constructs a new DiffTreeItem of the given object (original object from EMF Containment
     * Hierarchy).
     * 
     * @param object
     *            the original object from EMF Containment Hierarchy
     */
    public DiffTreeItem(Object object) {
        this.object = object;
        this.kind = null;
        this.parent = null;
        children = new LinkedHashSet<>();
    }

    /**
     * Adds a new child to the item.
     * 
     * @param pChild
     *            the child to be added
     */
    public void addChild(DiffTreeItem pChild) {
        children.add(pChild);
    }

    /**
     * Removes a child from the item.
     * 
     * @param pChild
     *            the child to be removed
     */
    public void removeChild(DiffTreeItem pChild) {
        children.remove(pChild);
    }

    /**
     * Returns all children of the diffTreeItem.
     * 
     * @return a HashSet which contains all children
     */
    public Set<DiffTreeItem> getContents() {
        return children;
    }

    /**
     * Returns a list with all direct and indirect children of this diffTreeItem.
     * 
     * @return
     */
    public List<DiffTreeItem> getAllContents() {
        List<DiffTreeItem> allChildren = new ArrayList<>();
        for (DiffTreeItem item : children) {
            allChildren.addAll(item.getAllContents());
        }
        return allChildren;
    }

    /**
     * Returns the original object from EMF Containment Hierarchy that corresponds to this
     * diffTreeItem.
     * 
     * @return
     */
    public Object getObject() {
        return object;
    }

    /**
     * Sets the parent of this diffTreeItem.
     * 
     * @param parent
     *            the parent to be set
     */
    public void setParent(DiffTreeItem parent) {
        this.parent = parent;
    }

    /**
     * Gets the parent of this diffTreeItem.
     * 
     * @return the parent of this diffTreeItem
     */
    public DiffTreeItem getParent() {
        return parent;
    }

    /**
     * Sets the DifferenceKind of this diffTreeItem. This is important, so we know, if this explicit
     * item has been changed in the commit of the diagram.
     * 
     * @param kind
     */
    public void setDiffKind(DifferenceKind kind) {
        this.kind = kind;
    }

    /**
     * Gets the DifferenceKind of this diffTreeItem
     * 
     * @return The differenceKind of this diffTreeItem, null if it hasn't changed
     */
    public DifferenceKind getDiffKind() {
        return kind;
    }
}
