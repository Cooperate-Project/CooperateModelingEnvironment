package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public class SummaryItem {
	
	private EObject left;
	private EObject right;
	private DifferenceKind kind;

	public SummaryItem(EObject left, EObject right, DifferenceKind kind) {
		this.left = left;
		this.right = right;
		this.kind = kind;
	}
	
	public EObject getLeft(){
		return left;
	}
	
	public EObject getRight(){
		return right;
	}
	
	public DifferenceKind getDifferenceKind(){
		return kind;
	}
	
	

}
