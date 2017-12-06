package de.cooperateproject.ui.diff.component.postprocessing;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.IPostProcessor;
import de.cooperateproject.ui.diff.content.SummaryItem;

public class ComponentPostProcessor implements IPostProcessor {

    @Override
    public Map<EObject, DiffTreeItem> postProcessDiffTreeBuilder(Map<EObject, DiffTreeItem> tree) {
        return tree;
    }

    @Override
    public List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList) {
        return summaryList;
    }

}
