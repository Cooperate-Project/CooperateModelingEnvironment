package de.cooperateproject.ui.diff.usecase.postprocessing;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.IPostProcessor;
import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Postprocessor for editing the results of the builders of the usecase diff tree and the summary
 * list.
 * 
 * @author czogalik
 *
 */
public class UsecasePostProcessor implements IPostProcessor {

    @Override
    public Map<EObject, DiffTreeItem> postProcessDiffTreeBuilder(Map<EObject, DiffTreeItem> tree) {
        for (Entry<EObject, DiffTreeItem> obj : tree.entrySet()) {
            if (!(obj.getValue().getObject() instanceof EObject)) {
                continue;
            }
            EObject eAssociation = (EObject) obj.getValue().getObject();
            if (eAssociation instanceof Association) {
                Association association = (Association) eAssociation;
                addMemberEndToAssociation(tree, obj, association.getActor(), association.getActorCardinality());
                addMemberEndToAssociation(tree, obj, association.getUsecase(), association.getUseCaseCardinality());
            }
        }
        return tree;
    }

    @Override
    public List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList) {
        return summaryList;
    }

    private static void addMemberEndToAssociation(Map<EObject, DiffTreeItem> tree, Entry<EObject, DiffTreeItem> obj,
            EObject memberEnd, Cardinality cardinality) {

        DiffTreeItem diffTreeItem = new DiffTreeItem(memberEnd);
        if (cardinality != null) {
            diffTreeItem.addChild(tree.get(cardinality));
            tree.get(cardinality.eContainer()).removeChild(tree.get(cardinality));
        }
        obj.getValue().addChild(diffTreeItem);
    }

}
