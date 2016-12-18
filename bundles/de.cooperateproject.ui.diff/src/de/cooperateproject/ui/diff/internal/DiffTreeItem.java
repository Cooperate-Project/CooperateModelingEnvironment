package de.cooperateproject.ui.diff.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.TypeReference;


public class DiffTreeItem{
	
	private List<DiffTreeItem> children;
	private EObject object;
	private TypeReference type;
	private DiffKind kind;

	public DiffTreeItem(EObject object){
		this.object = object;
		children = new ArrayList<DiffTreeItem>();
	}
	public void addChild(DiffTreeItem pChild){
		if(pChild.getEObject() instanceof TypeReference){
			type = (TypeReference)pChild.getEObject(); 
		}else{
			children.add(pChild);
		}
		
	}
	public List<DiffTreeItem> getContents(){
		return children;
	}
	
	public EObject getEObject(){
		return object;
	}
	
	public boolean hasType(){
		return type == null;
	}
	
	public TypeReference getType(){
		return type;
	}
	
	public void setDiffKind(DiffKind kind){
		this.kind = kind;
	}
	
	public DiffKind getDiffKind(){
		return kind;
	}
}
