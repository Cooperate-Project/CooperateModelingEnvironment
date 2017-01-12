package de.cooperateproject.ui.diff.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public class DiffTreeItem{
	
	private List<DiffTreeItem> children;
	private Object object;
	private DiffTreeItem parent;
	private DifferenceKind kind;

	public DiffTreeItem(Object object){
		this.object = object;
		this.kind = null;
		this.parent = null;
		children = new ArrayList<DiffTreeItem>();
	}
	public void addChild(DiffTreeItem pChild){
			children.add(pChild);
	}
	public List<DiffTreeItem> getContents(){
		return children;
	}
	
	public List<DiffTreeItem> getAllContents(){
		List<DiffTreeItem> allChildren = new ArrayList<DiffTreeItem>();
		for(DiffTreeItem item: children){
			allChildren.addAll(item.getAllContents());
		}
		return allChildren;
	}
	
	public Object getObject(){
		return object;
	}

	public void setParent(DiffTreeItem parent){
		this.parent = parent;
	}
	
	public DiffTreeItem getParent(){
		return parent;
	}
	public void setDiffKind(DifferenceKind kind){
		this.kind = kind;
	}
	
	public DifferenceKind getDiffKind(){
		return kind;
	}
}
