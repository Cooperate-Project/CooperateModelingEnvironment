package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public class SummaryItem {
	
	private EObject left;
	private EObject right;
	private DifferenceKind kind;
	private EObject commonParent;

	public SummaryItem(EObject left, EObject right, EObject commonParent, DifferenceKind kind) {
		this.left = left;
		this.right = right;
		this.kind = kind;
		this.commonParent = commonParent;
	}
	
	public EObject getLeft(){
		return left;
	}
	
	public EObject getRight(){
		return right;
	}
	
	public EObject getCommonParent(){
		return commonParent;
	}

	public DifferenceKind getDifferenceKind(){
		return kind;
	}
	
	

}
