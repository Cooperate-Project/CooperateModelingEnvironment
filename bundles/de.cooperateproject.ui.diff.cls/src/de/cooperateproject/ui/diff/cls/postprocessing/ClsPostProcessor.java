package de.cooperateproject.ui.diff.cls.postprocessing;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.IPostProcessor;
import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Postprocessor for editing the results of the builders of the cls diff tree and the summary list.
 * 
 * @author czogalik
 *
 */
public class ClsPostProcessor implements IPostProcessor {

    @Override
    public Map<EObject, DiffTreeItem> postProcessDiffTreeBuilder(Map<EObject, DiffTreeItem> tree) {
        removeUnnecessaryChildren(tree);
        return tree;
    }

    private static void removeUnnecessaryChildren(Map<EObject, DiffTreeItem> tree) {
    	for (Iterator<Entry<EObject, DiffTreeItem>> iter = tree.entrySet().iterator(); iter.hasNext(); ) {
    		Entry<EObject, DiffTreeItem> entry = iter.next();
    		
    		if (!(entry.getValue().getObject() instanceof EObject)) {
                continue;
            }
            EObject eObject = (EObject) entry.getValue().getObject();
            if (eObject instanceof XtextAssociationMemberEndReferencedType || eObject instanceof Cardinality) {
            	DiffTreeItem containerItem = tree.get(eObject.eContainer());
                Object parent = containerItem.getObject();
                if (parent instanceof XtextAssociation) {
                	DiffTreeItem toRemove = tree.get(eObject);
					containerItem.removeChild(toRemove);
					iter.remove();
                }
            }
    	}
    }

    @Override
    public List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList) {	
    	return summaryList;
    }

}
