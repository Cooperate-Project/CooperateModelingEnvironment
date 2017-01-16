package de.cooperateproject.ui.diff.labeling.itemlabels;

import de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl;

public class CommentLinkLabel implements SummaryItemLabelHandler{
	private final String classText = "comment";

	@Override
	public String getText(Object item) {
		return ((CommentLinkImpl)item).getComment().getBody();
	}

	@Override
	public String getClassText() {
		return classText;
	}

}
