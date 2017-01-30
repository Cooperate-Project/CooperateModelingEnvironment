package de.cooperateproject.ui.diff.content;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.*;
import de.cooperateproject.ui.diff.internal.DiffTreeItem;
/**
 * Content Provider for a tree viewer which lists the content of a diagram
 * @author Jasmin
 *
 */
public class CommitContentProvider implements ITreeContentProvider{

	@Override
	public Object[] getChildren(Object parentElement) {
		
		Object[] ret = {};
		if(parentElement instanceof DiffTreeItem){
			ret = ((DiffTreeItem)parentElement).getContents().toArray();
		}else if(parentElement instanceof EObject){
			ret = ((EObject)parentElement).eContents().toArray();

		}
		return ret;
	}

	@Override
	public Object getParent(Object element) {
		Object ret = null;
		if(element instanceof DiffTreeItem){
			ret = ((DiffTreeItem)element).getParent();
		}
		return ret;
	}

	@Override
	public boolean hasChildren(Object element) {
		boolean ret = false;
		if(element instanceof DiffTreeItem){
			ret = (((DiffTreeItem)element).getContents().size() > 0);
		}else if(element instanceof EObject){
			ret = (((EObject)element).eContents().size() > 0);
		}
		return ret;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}
	
}
