package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import de.cooperateproject.modeling.textual.cls.cls.Package;

import java.util.HashMap;
import java.util.List;

/**.
 * Builds an own containment hierarchy of the diagram, also containing deleted elements from the Diff. 
 * @author Jasmin
 *
 */
public class DiffTreeBuilder {
	
	private Resource resource;
	private List<SummaryItem> changedItems;
	private HashMap<EObject, DiffTreeItem> tree;
	
	public DiffTreeBuilder(Resource pRes, List<SummaryItem> pChangedItems){
		resource = pRes;
		changedItems = pChangedItems;
		tree = new HashMap<EObject, DiffTreeItem>();
	}
	
	public DiffTreeItem buildTree(){
		
		TreeIterator<EObject> it = resource.getAllContents();
		DiffTreeItem newResource = null;
		
		while(it.hasNext()){
		
			EObject obj = it.next();
			DiffTreeItem temp = new DiffTreeItem(obj);
			tree.put(obj, temp);
			
			if(obj instanceof Package){
				newResource = temp;
			}
		}
		
		it = resource.getAllContents();
		while(it.hasNext()){
			EObject obj = it.next();
			DiffTreeItem diffItem = tree.get(obj);
			
			for(EObject child: obj.eContents()){
				diffItem.addChild(tree.get(child));
			}

		}
		
		for(SummaryItem item: changedItems){
			if(item.getLeft() != null && item.getRight() == null){ //element was deleted
				EObject deletedItem = item.getLeft();
				
				if(tree.containsKey(deletedItem.eContainer())){
					DiffTreeItem affectedParent = tree.get(deletedItem.eContainer());
					DiffTreeItem newChild = new DiffTreeItem(deletedItem);
					affectedParent.addChild(newChild);
					addDeletedChildren(newChild);
					newChild.setDiffKind(DiffKind.deleted);
				}
			}
			else if(item.getRight() != null){ //changed or added element
				if(tree.containsKey(item.getRight())){ 
					tree.get(item.getRight()).setDiffKind(item.getKind());
				}else if(tree.containsKey(item.getLeft())){
					tree.get(item.getLeft()).setDiffKind(item.getKind());
				}
				
			}
		}
		return newResource;
	}
	
	private void addDeletedChildren(DiffTreeItem parent){
		
		if(parent.getEObject().eContents().size() > 0){
			
			EList<EObject> childrenList = parent.getEObject().eContents();
			
			for(EObject obj: childrenList){ // a child from the deleted parent
				
				DiffTreeItem diffItem = new DiffTreeItem(obj); //make a new diffTreeItem, because the deleted item is not contained yet in the tree
				parent.addChild(diffItem);
			}
			
		}
	}
	
}
