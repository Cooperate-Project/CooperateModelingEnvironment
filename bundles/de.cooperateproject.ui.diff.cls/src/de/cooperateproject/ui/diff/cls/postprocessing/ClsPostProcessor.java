package de.cooperateproject.ui.diff.cls.postprocessing;

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
        for (Entry<EObject, DiffTreeItem> obj : tree.entrySet()) {
            if (!(obj.getValue().getObject() instanceof EObject)) {
                continue;
            }
            EObject eObject = (EObject) obj.getValue().getObject();
            if (eObject instanceof XtextAssociationMemberEndReferencedType || eObject instanceof Cardinality) {
                Object parent = tree.get(eObject.eContainer()).getObject();
                if (parent instanceof XtextAssociation) {
                    tree.get(eObject.eContainer()).removeChild(tree.get(eObject));
                }
            }
        }
        return tree;
    }

    @Override
    public List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList) {
        return summaryList;
    }

}
