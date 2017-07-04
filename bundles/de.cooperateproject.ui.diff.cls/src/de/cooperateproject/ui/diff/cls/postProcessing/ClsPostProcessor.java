package de.cooperateproject.ui.diff.cls.postProcessing;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.IPostProcessor;
import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Post-processor for the cls meta-model.
 * 
 * @author Jasmin
 *
 */
public class ClsPostProcessor implements IPostProcessor {

	@Override
	public HashMap<EObject, DiffTreeItem> postProcessDiffTreeBuilder(HashMap<EObject, DiffTreeItem> tree) {
		return tree;
	}

	@Override
	public List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList) {
		return summaryList;
	}


}
