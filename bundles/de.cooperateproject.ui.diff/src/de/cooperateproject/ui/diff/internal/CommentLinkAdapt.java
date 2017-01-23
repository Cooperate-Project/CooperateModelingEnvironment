package de.cooperateproject.ui.diff.internal;

import java.util.List;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;

import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.NamedElement;

/**
 * This class finds the cooperate-internal object corresponding to the comment's commented element. 
 * @author Jasmin
 *
 */
public class CommentLinkAdapt {

	private static CDOView view; //The cdo view on the diagram on which we can start an ocl-query.
	
	/**
	 * The view has to be set first (done by CommitManager) in order to be functional.
	 * Finds and returns the cooperate-internal object of the comment's commented element.
	 * @param commentLink the commentLink to be examined
	 * @return the commented element
	 */
	@SuppressWarnings("rawtypes")
	public static NamedElement findParent(CommentLink commentLink){
		
		NamedElement ret = null;
		if(view != null){
			CDOID contextID = CDOUtil.getCDOObject(commentLink.getComment()).cdoID();
			CDOQuery cqo = view.createQuery("ocl",
					"cls::NamedElement.allInstances()->select(e : cls::NamedElement | self.annotatedElement->includes(e.referencedElement))"
					, contextID);
				
			List<NamedElement> commentedObject = cqo.getResult();
				if(commentedObject.size() > 0){
					ret = commentedObject.get(0);
				}
		}
		return ret;
	}
	
	public static void setCDOView(CDOView view){
		CommentLinkAdapt.view = view;
	}
}
