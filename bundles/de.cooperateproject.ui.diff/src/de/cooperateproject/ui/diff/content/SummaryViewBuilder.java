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

/**
 * This class builds the content for the summary view table.
 * 
 * @author Jasmin, czogalik
 *
 */
public class SummaryViewBuilder {

    /**
     * Builds the content for the summary view table and returns it as list of SummaryItems.
     * @param comparison comparison of the commit.
     * @return A list containing all SummaryItems
     */
    public List<SummaryItem> buildSummaryView(Comparison comparison) {

        Comparison comparisonResult = comparison;
        EList<Diff> resultList = comparisonResult.getDifferences();
        List<SummaryItem> sumList = createSummaryItemList(comparisonResult, resultList);

        PostProcessorManager.postProcessSummaryList(sumList);

        return sumList;
    }

    private static List<SummaryItem> createSummaryItemList(Comparison comparisonResult, EList<Diff> resultList) {
        List<SummaryItem> sumList = new ArrayList<>();
        for (Diff diff : resultList) {
            Object value = getValue(diff);
            EObject parent = diff.getMatch().getLeft();

            if (value != null && parent != null) {
                sumList.add(createSummaryItem(diff, parent, value, comparisonResult));
            }
        }
        return sumList;
    }

    private static SummaryItem createSummaryItem(Diff diff, EObject parent, Object value, Comparison comparisonResult) {
        DifferenceKind kind = diff.getKind();
        SummaryItem summaryItem = new SummaryItem(parent, kind, value);

        if (kind == DifferenceKind.DELETE) {
            summaryItem.setRight(value);
        } else if (kind == DifferenceKind.ADD) {
            summaryItem.setLeft(value);
        } else {
            summaryItem.setLeft(value);
            if (diff.getMatch().getRight() != null) {
                summaryItem.setRight(getOldValue(diff, comparisonResult, value));
            }
        }

        return summaryItem;
    }

    /**
     * Makes out, of which type the Diff was and returns the item, on which the actual difference
     * was detected.
     * 
     * @param diff
     *            the Diff to be examined.
     * @return the value on which the difference was detected
     */
    private static Object getValue(Diff diff) {

        if (diff instanceof ReferenceChange) {
            return ((ReferenceChange) diff).getValue();
        } else if (diff instanceof AttributeChange) {
            return ((AttributeChange) diff).getValue();
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    /**
     * Finds and returns the old value, the "old version" of the given value, on which a difference
     * has been detected.
     * 
     * @param diff
     *            the Diff, in which the given EObject has experienced a difference
     * @param comparisonResult
     *            the whole Comparison, in which the diff is contained.
     * @param value
     *            the value, for which we look for its old/before version
     * @return the old value
     */
    private static Object getOldValue(Diff diff, Comparison comparisonResult, Object value) {
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
