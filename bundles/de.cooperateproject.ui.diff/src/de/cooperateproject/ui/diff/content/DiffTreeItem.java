package de.cooperateproject.ui.diff.content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.compare.DifferenceKind;

/**
 * Represents a single item/element in the Tree Viewer for the diagram to be
 * represented. Since we need information about whether the item has changed in
 * this commit or not, all needed information about the item will be stored
 * here.
 * 
 * @author Jasmin, czogalik
 *
 */
public class DiffTreeItem {

	private final Set<DiffTreeItem> children;
	/** original object (of this one) from the EMF Containment Hierarchy. */
	private final Object object;
	private DiffTreeItem parent;
	private DifferenceKind manuallySetDifferenceKinds = null;
	private final Collection<SummaryItem> associatedChanges = new LinkedHashSet<>();

	/**
	 * Constructs a new DiffTreeItem of the given object (original object from EMF
	 * Containment Hierarchy).
	 * 
	 * @param object
	 *            the original object from EMF Containment Hierarchy
	 */
	public DiffTreeItem(Object object) {
		this.object = object;
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
	 * Returns the original object from EMF Containment Hierarchy that corresponds
	 * to this diffTreeItem.
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
	 * Associates a diff represented by a {@link SummaryItem} element with this tree
	 * item.
	 * 
	 * @param diff
	 *            The diff to be associated.
	 */
	public void addAssociatedDiff(SummaryItem diff) {
		associatedChanges.add(diff);
	}

	public Collection<SummaryItem> getAssociatedDiffs() {
		return Collections.unmodifiableCollection(associatedChanges);
	}

	public Collection<DifferenceKind> getDiffKinds() {
		return Optional.ofNullable(manuallySetDifferenceKinds).map(Arrays::asList).orElseGet(() -> getAssociatedDiffs()
				.stream().map(SummaryItem::getDifferenceKind).distinct().collect(Collectors.toList()));
	}

	public void setDifferenceKindsManually(DifferenceKind diffKind) {
		this.manuallySetDifferenceKinds = diffKind;
	}

}
