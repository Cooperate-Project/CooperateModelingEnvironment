package de.cooperateproject.ui.diff.content;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.UMLPackage;

import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.ui.diff.internal.CommentLinkAdapt;

/**
 * This class builds the content for the summary view table.
 * 
 * @author Jasmin
 *
 */
public class SummaryViewBuilder {

	/**
	 * Builds the content for the summary view table and returns it as list of
	 * SummaryItems.
	 * 
	 * @param cm
	 *            The CommitManager from which it will get the list of
	 *            differences
	 * @param commitInfo
	 *            The selected commit
	 * @return A list containing all SummaryItems
	 */
	public List<SummaryItem> buildSummaryView(Comparison comparison) {

		Comparison comparisonResult = comparison;
		EList<Diff> resultList = comparisonResult.getDifferences();
		List<SummaryItem> sumList = new ArrayList<SummaryItem>();

		for (Diff diff : resultList) {
			Object value = getValue(diff);
			// Don't consider changes of objects that are from this package,
			// because we have internal cooperate instances for those, which are
			// being handled here.
			if (value == null || value.getClass().getPackage().getName()
					.contentEquals(UMLPackage.eINSTANCE.getClass().getPackage().getName())) {
				continue;
			}

			// left side is the object in the "new version" of the
			// commit
			Object left = null;
			// right side is the object in the "old version" of the
			// commit
			Object right = null;
			EObject parent = diff.getMatch().getLeft();

			if (value instanceof CommentLink) {
				parent = CommentLinkAdapt.findParent((CommentLink) value);
			}

			// don't add a summary item that has no parent class
			if (parent == null) {
				continue;
			}
			switch (diff.getKind()) {
			case DELETE:
				right = value;
				break;
			case ADD:
				left = value;
				break;
			default:
				left = value;
				if (diff.getMatch().getRight() != null) {
					right = getOldValue(diff, comparisonResult, value);
				}

			}
			sumList.add(new SummaryItem(left, right, parent, diff.getKind()));
		}

		return sumList;
	}

	/**
	 * Makes out, of which type the Diff was and returns the item, on which the
	 * actual difference was detected.
	 * 
	 * @param diff
	 *            the Diff to be examined.
	 * @return the value on which the difference was detected
	 */
	private Object getValue(Diff diff) {
		Object value = null;

		if (diff instanceof ReferenceChange) {
			value = ((ReferenceChange) diff).getValue();
		} else if (diff instanceof AttributeChange) {
			value = ((AttributeChange) diff).getValue();
		}
		return value;
	}

	@SuppressWarnings("rawtypes")
	/**
	 * Finds and returns the old value, the "old version" of the given value, on
	 * which a difference has been detected.
	 * 
	 * @param diff
	 *            the Diff, in which the given EObject has experienced a
	 *            difference
	 * @param comparisonResult
	 *            the whole Comparison, in which the diff is contained.
	 * @param value
	 *            the value, for which we look for its old/before version
	 * @return the old value
	 */
	private Object getOldValue(Diff diff, Comparison comparisonResult, Object value) {
		Object oldValue = null;
		if (diff instanceof AttributeChange) {
			oldValue = diff.getMatch().getRight().eGet(((AttributeChange) diff).getAttribute());
		} else if (diff instanceof ReferenceChange) {
			if (diff.getKind() == DifferenceKind.MOVE) {
				oldValue = comparisonResult.getMatch((EObject) value).getRight().eContainer();
			} else {
				oldValue = diff.getMatch().getRight().eGet(((ReferenceChange) diff).getReference());
			}
		}
		if (oldValue instanceof org.eclipse.emf.ecore.util.DelegatingEcoreEList) {
			oldValue = ((org.eclipse.emf.ecore.util.DelegatingEcoreEList) oldValue).getEObject();
		}

		return oldValue;
	}
}
