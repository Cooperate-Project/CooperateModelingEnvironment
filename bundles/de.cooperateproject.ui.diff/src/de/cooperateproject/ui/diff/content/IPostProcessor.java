package de.cooperateproject.ui.diff.content;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for creating an own post-processor. Edits the results of the builders of the diff tree
 * and the summary list.
 * 
 * @author Jasmin
 *
 */
public interface IPostProcessor {

    /**
     * Postprocessor to edit the results of the builder of the diff tree.
     * @param tree to edit.
     * @return the edited diff tree.
     */
    Map<EObject, DiffTreeItem> postProcessDiffTreeBuilder(Map<EObject, DiffTreeItem> tree);

    /**
     * Postprocessor to edit the summary list.
     * @param summaryList to edit.
     * @return the edited summary list.
     */
    List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList);

}
