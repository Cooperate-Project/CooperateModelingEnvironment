package de.cooperateproject.ui.diff.content;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

/**
 * Represents an item of the differences' summary table.
 * 
 * @author Jasmin, czogalik
 *
 */
public class SummaryItem {

	/**
	 * The object in the "new version" of the diagram.
	 */
	private Object left;
	/**
	 * The object in the "old version" of the diagram.
	 */
	private Object right;
	private DifferenceKind kind;
	private EObject commonParent;
	/**
	 * The object on which the actual difference was detected.
	 */
	private Object value;

	/**
	 * Constructs a new SummaryItem.
	 * 
	 * @param commonParent
	 *            the common parent of both
	 * @param kind
	 *            the DifferenceKind
	 * @param value
	 *            the object on which the actual difference was detected
	 */
	public SummaryItem(EObject commonParent, DifferenceKind kind, Object value) {
		this.kind = kind;
		this.commonParent = commonParent;
		this.value = value;
	}

	public void setCommonParent(EObject parent) {
		commonParent = parent;
	}

	public void setLeft(Object left) {
		this.left = left;
	}

	public void setRight(Object right) {
		this.right = right;
	}

	public void setDifferenceKind(DifferenceKind kind) {
		this.kind = kind;
	}

	public Object getLeft() {
		return left;
	}

	public Object getRight() {
		return right;
	}

	public EObject getCommonParent() {
		return commonParent;
	}

	public DifferenceKind getDifferenceKind() {
		return kind;
	}

	public Object getValue() {
		return value;
	}

}
