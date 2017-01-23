package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.NamedElement;

import java.util.HashMap;
import java.util.List;

/**.
 * Builds an own containment hierarchy of the diagram, also containing deleted elements from the Diff. 
 * @author Jasmin
 *
 */
public class DiffTreeBuilder {
	
	private final Resource resource;
	private final List<SummaryItem> changes; //a list of all changes on the diagram in this commit
	private final HashMap<EObject, DiffTreeItem> tree; //links all diffTreeItems to their corresponding EObject
	
	public DiffTreeBuilder(Resource pRes, List<SummaryItem> sumList){
		resource = pRes;
		changes = sumList;
		tree = new HashMap<EObject, DiffTreeItem>();
	}
	/**
	 * Builds the whole tree of the diagram, also with objects that were deleted in the commit, so it will be visible.
	 * Creates for all EObjects in the EMF Containment Hierarchy an own DiffTreeItem with added information such as the DiffKind.
	 * @return the new resource/first element of the tree's hierarchy
	 */
	public DiffTreeItem buildTree(){
		
		TreeIterator<EObject> it = resource.getAllContents();
		DiffTreeItem newResource = null;
		
		//firstly: create new DiffTreeItems for all EObjects in the EMF Containment Hierarchy of this diagram and set the new resource
		while(it.hasNext()){
			EObject obj = it.next();
			DiffTreeItem temp = new DiffTreeItem(obj);
			tree.put(obj, temp);
			
			if(obj instanceof ClassDiagram){
				newResource = temp;
			}
		}
		
		it = resource.getAllContents();
		//then: iterate a second time over all contents and build our own parent/child structure on the diffTreeItems
		while(it.hasNext()){
			EObject obj = it.next();
			DiffTreeItem diffItem = tree.get(obj);
			for(EObject child: obj.eContents()){
				diffItem.addChild(tree.get(child));
				tree.get(child).setParent(diffItem);
			}

			if(obj instanceof CommentLink){ //in this case, the object isn't the child of its parent in emf containment hierarchy and has to be changed
				@SuppressWarnings("rawtypes")
				NamedElement parent = CommentLinkAdapt.findParent((CommentLink)obj);
				if(tree.get(parent) != null){
					if(tree.get(obj.eContainer()) != null){
						tree.get(obj.eContainer()).removeChild(tree.get(obj));
					}
					tree.get(obj).setParent(tree.get(parent));
					tree.get(parent).addChild(tree.get(obj));
					
				}
			}
		}
		
		//finally: iterate over all changes in the changes' list and set the information about changes for affected diffTreeItems,
		//also deleted items will be re-added here.
		for(SummaryItem item: changes){
			if(item.getDifferenceKind() == DifferenceKind.DELETE){ //element was deleted
				Object deletedItem = item.getRight();
				if(tree.containsKey(item.getCommonParent())){
					DiffTreeItem affectedParent = tree.get(item.getCommonParent());
					DiffTreeItem newChild = new DiffTreeItem(deletedItem);
					affectedParent.addChild(newChild);
					newChild.setParent(affectedParent);
					addDeletedChildren(newChild);
					newChild.setDiffKind(DifferenceKind.DELETE);
				}
			}
			else if(item.getDifferenceKind() == DifferenceKind.ADD || item.getDifferenceKind() == DifferenceKind.CHANGE || item.getDifferenceKind() == DifferenceKind.MOVE){ //changed, moved or added element
				if(tree.containsKey(item.getLeft())){
					tree.get(item.getLeft()).setDiffKind(item.getDifferenceKind());
				}else if(tree.containsKey(item.getRight())){
					tree.get(item.getRight()).setDiffKind(item.getDifferenceKind());
				}else if(tree.containsKey(item.getCommonParent())){ //if the difference's source isn't in the tree, but its parent is: change the difference kind only if there isn't already another one set
					DiffTreeItem temp = tree.get(item.getCommonParent());
					if(temp.getDiffKind() == null){
						temp.setDiffKind(item.getDifferenceKind());
					}
				}
			}
		}
		return newResource;
	}
	
	/**
	 * Adds the deleted children of a parent, that has been deleted itself in the commit.
	 * @param parent the parent that has been deleted and whose children should be added
	 */
	private void addDeletedChildren(DiffTreeItem parent){
		
		if(parent.getObject() instanceof EObject){
			EObject eObj = (EObject)parent.getObject();
			if(eObj.eContents().size() > 0){
				
				EList<EObject> childrenList = eObj.eContents();
				
				for(EObject obj: childrenList){ // a child from the deleted parent
					DiffTreeItem diffItem = new DiffTreeItem(obj); //make a new diffTreeItem, because the deleted item is not contained yet in the tree
					diffItem.setDiffKind(DifferenceKind.DELETE);
					parent.addChild(diffItem);
					diffItem.setParent(parent);
				}
				
			}
		}
	}
	
}
