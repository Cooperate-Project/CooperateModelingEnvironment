package de.cooperateproject.ui.diff.content;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        return PostProcessorManager.postProcessSummaryList(sumList);
    }

    private static List<SummaryItem> createSummaryItemList(Comparison comparisonResult, EList<Diff> resultList) {
        List<SummaryItem> sumList = new ArrayList<>();
        for (Diff diff : resultList) {
        	sumList.add(createSummaryItem(diff));
        }
        sumList.removeIf(Objects::isNull);
        return sumList;
    }

    private static SummaryItem createSummaryItem(Diff diff) {
    	if (diff instanceof AttributeChange) {
    		return createSummaryItem((AttributeChange)diff);
    	} else if (diff instanceof ReferenceChange) {
    		return createSummaryItem((ReferenceChange)diff);
    	}
    	return null;
    }
    
    private static SummaryItem createSummaryItem(AttributeChange diff) {
    	// TODO What about changes of multi valued elements?
    	EObject newChangedObject = diff.getMatch().getLeft();
    	EObject oldChangedObject = diff.getMatch().getRight();
    	Object newValue = Optional.ofNullable(newChangedObject.eGet(diff.getAttribute())).orElse(null);
    	Object oldValue = Optional.ofNullable(oldChangedObject.eGet(diff.getAttribute())).orElse(null);
    	return new SummaryItem(diff, oldValue, newValue, diff.getKind(), newChangedObject, diff.getAttribute());
    }
    
	private static SummaryItem createSummaryItem(ReferenceChange diff) {
		EObject newChangedObject = diff.getMatch().getLeft();
		EObject oldChangedObject = diff.getMatch().getRight();
		EObject newValue = diff.getKind() == DifferenceKind.ADD ? diff.getValue() : null;
		EObject oldValue = diff.getKind() == DifferenceKind.DELETE ? diff.getValue() : null;
		if (diff.getKind() == DifferenceKind.CHANGE) {
			newValue = diff.getValue();
			if (diff.getReference().isMany()) {
				// TODO does this need special treatment?
			} else {
				oldValue = Optional.ofNullable(oldChangedObject).filter(EObject.class::isInstance)
						.map(EObject.class::cast).map(o -> (EObject) o.eGet(diff.getReference())).orElse(null);
			}
		}
		if (diff.getKind() == DifferenceKind.MOVE) {
			oldValue = diff.getValue();
			newValue = diff.getValue();
		}
		return new SummaryItem(diff, oldValue, newValue, diff.getKind(),
				Optional.ofNullable(newChangedObject).orElse(oldChangedObject), diff.getReference());
	}

}
