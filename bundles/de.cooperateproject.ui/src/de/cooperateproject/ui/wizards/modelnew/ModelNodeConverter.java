package de.cooperateproject.ui.wizards.modelnew;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.cooperateproject.ui.wizards.modelnew.ModelContentProvider.ContentNode;

public class ModelNodeConverter implements IConverter {

	@Override
	public Object getFromType() {
		return IStructuredSelection.class;
	}

	@Override
	public Object getToType() {
		return String.class;
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject == null) {
			return null;
		}

		ContentNode node = (ContentNode)fromObject;
		if (node.getParent().isPresent()) {
			return String.format("%s/%s", node.getParent().get().getName(), node.getName());
		}
		return node.getName();
	}

}
