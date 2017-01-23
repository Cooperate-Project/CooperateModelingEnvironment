package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * Represents an item of the differences' summary table.
 * @author Jasmin
 *
 */
public class SummaryItem {
	
	private Object left; //the object in the "new version" of the diagram
	private Object right; //the object in the "old version" of the diagram
	private DifferenceKind kind;
	private EObject commonParent;

	/**
	 * Constructs a new SummaryItem.
	 * @param left the object in the "new version" of the diagram
	 * @param right the object in the "old version" of the diagram
	 * @param commonParent the common parent of both
	 * @param kind the DifferenceKind
	 */
	public SummaryItem(Object left, Object right, EObject commonParent, DifferenceKind kind) {
		
		this.left = left;
		this.right = right;
		if(left instanceof EAttribute){
			this.left = commonParent.eGet((EAttribute)left);
		}
		
		if(right instanceof EAttribute){
			this.right = commonParent.eGet((EAttribute)right);
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
