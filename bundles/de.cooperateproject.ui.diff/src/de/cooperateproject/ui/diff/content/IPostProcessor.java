package de.cooperateproject.ui.diff.content;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for creating an own post-processor. 
 * Edits the results of the builders of the diff tree and the summary list.
 * 
 * @author Jasmin
 *
 */
public interface IPostProcessor {

	Map<EObject, DiffTreeItem> postProcessDiffTreeBuilder(Map<EObject, DiffTreeItem> tree);

	List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList);

}
