package de.cooperateproject.ui.diff.content;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Represents an item of the differences' summary table.
 * 
 * @author Jasmin, czogalik
 *
 */
public class SummaryItem {

	private Diff originalDiff;

	private final Object oldValue;
	private final Object newValue;
	private final DifferenceKind differenceKind;
	private final EObject changedObject;
	private final EStructuralFeature changedFeature;

	/**
	 * Constructs a new {@link SummaryItem} instance.
	 * 
	 * @param originalDiff
	 *            The original diff that is represented by this instance.
	 * @param oldValue
	 *            The old value of the change.
	 * @param newValue
	 *            The new value of the change.
	 * @param differenceKind
	 *            The kind of difference.
	 * @param changedObject
	 *            The objects that has been changed.
	 * @param changedFeature
	 *            The feature that is affected by the change.
	 */
	public SummaryItem(Diff originalDiff, Object oldValue, Object newValue, DifferenceKind differenceKind,
			EObject changedObject, EAttribute changedFeature) {
		this(originalDiff, oldValue, newValue, differenceKind, changedObject, (EStructuralFeature) changedFeature);
	}

	/**
	 * Constructs a new {@link SummaryItem} instance.
	 * 
	 * @param originalDiff
	 *            The original diff that is represented by this instance.
	 * @param oldValue
	 *            The old value of the change.
	 * @param newValue
	 *            The new value of the change.
	 * @param differenceKind
	 *            The kind of difference.
	 * @param changedObject
	 *            The objects that has been changed.
	 * @param changedFeature
	 *            The feature that is affected by the change.
	 */
	public SummaryItem(Diff originalDiff, EObject oldValue, EObject newValue, DifferenceKind differenceKind,
			EObject changedObject, EReference changedFeature) {
		this(originalDiff, oldValue, newValue, differenceKind, changedObject, (EStructuralFeature) changedFeature);
	}

	private SummaryItem(Diff originalDiff, Object oldValue, Object newValue, DifferenceKind differenceKind,
			EObject changedObject, EStructuralFeature changedFeature) {
		super();
		this.originalDiff = originalDiff;
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.differenceKind = differenceKind;
		this.changedObject = changedObject;
		this.changedFeature = changedFeature;
	}

	public Diff getOriginalDiff() {
		return originalDiff;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public Object getNewValue() {
		return newValue;
	}

	public DifferenceKind getDifferenceKind() {
		return differenceKind;
	}

	public EObject getChangedObject() {
		return changedObject;
	}

	public EStructuralFeature getChangedFeature() {
		return changedFeature;
	}

}
