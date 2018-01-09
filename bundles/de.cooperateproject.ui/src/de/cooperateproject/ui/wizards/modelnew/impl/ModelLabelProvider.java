package de.cooperateproject.ui.wizards.modelnew.impl;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.wizards.modelnew.impl.ModelContentProvider.ContentNode;

public class ModelLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ContentNode) {
			ContentNode node = (ContentNode)element;
			return node.getName();
		}
		return super.getText(element);
	}

}
