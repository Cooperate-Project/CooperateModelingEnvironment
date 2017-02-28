package de.cooperateproject.ui.diff.content;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for creating an own post-processor. 
 * Edits the results of the builders of the diff tree and the summary list.
 * 
 * @author Jasmin
 *
 */
public interface IPostProcessor {

	HashMap<EObject, DiffTreeItem> postProcessDiffTreeBuilder(HashMap<EObject, DiffTreeItem> tree);

	List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList);

}
