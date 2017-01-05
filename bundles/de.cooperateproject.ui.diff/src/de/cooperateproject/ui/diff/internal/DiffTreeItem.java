package de.cooperateproject.ui.diff.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public class DiffTreeItem{
	
	private List<DiffTreeItem> children;
	private EObject object;
	private DifferenceKind kind;

	public DiffTreeItem(EObject object){
		this.object = object;
		children = new ArrayList<DiffTreeItem>();
	}
	public void addChild(DiffTreeItem pChild){
			children.add(pChild);
	}
	public List<DiffTreeItem> getContents(){
		return children;
	}
	
	public EObject getEObject(){
		return object;
	}
	
	public void setDiffKind(DifferenceKind kind){
		this.kind = kind;
	}
	
	public DifferenceKind getDiffKind(){
		return kind;
	}
}
