package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EObject;

public class SummaryItem {
	
	private EObject left;
	private EObject right;
	private DiffKind kind;

	public SummaryItem(EObject left, EObject right, DifferenceKind kind) {
		this.left = left;
		this.right = right;
		switch(kind){ //TODO MEMO if you change the non-intuitive emf compare add/delete/change, do it here
			case ADD: this.kind = DiffKind.added; break;
			case DELETE: this.kind = DiffKind.deleted; break;
			case CHANGE: this.kind = DiffKind.changed; break;
		default:
			this.kind = null;
		}
	}
	
	public EObject getLeft(){
		return left;
	}
	
	public EObject getRight(){
		return right;
	}
	
	public DiffKind getKind(){
		return kind;
	}
	
	

}
