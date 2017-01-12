package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.ui.diff.labeling.CardinalityHelper;

public class SummaryItem {
	
	private Object left;
	private Object right;
	private DifferenceKind kind;
	private EObject commonParent;

	public SummaryItem(Object left, Object right, EObject commonParent, DifferenceKind kind) {
		
		this.left = left;
		this.right = right;
		if(left instanceof EAttribute){
			this.left = commonParent.eGet((EAttribute)left);
		}
		if(right instanceof EAttribute){
			this.right = commonParent.eGet((EAttribute)right);
		}
		if(left instanceof Integer){
			CardinalityHelper helper = new CardinalityHelper();
			this.left = helper.convertToString((Integer)left);
		}
		if(right instanceof Integer){
			CardinalityHelper helper = new CardinalityHelper();
			this.right = helper.convertToString((Integer)right);
		}
		
		this.kind = kind;
		this.commonParent = commonParent;
	}
	
	public Object getLeft(){
		return left;
	}
	
	public Object getRight(){
		return right;
	}
	
	public EObject getCommonParent(){
		return commonParent;
	}

	public DifferenceKind getDifferenceKind(){
		return kind;
	}
	
	

}
