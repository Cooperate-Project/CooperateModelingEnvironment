package de.cooperateproject.ui.diff.metamodel;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.NamedElement;
import de.cooperateproject.ui.diff.content.DiffTreeItem;
import de.cooperateproject.ui.diff.content.IPostProcessor;
import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Post-processor for the cls meta-model.
 * 
 * @author Jasmin
 *
 */
public class ClsPostProcessor implements IPostProcessor {

	@Override
	public HashMap<EObject, DiffTreeItem> postProcessDiffTreeBuilder(HashMap<EObject, DiffTreeItem> tree) {
		for (EObject obj : tree.keySet()) {
			// in this case, the object isn't the child of its parent in emf
			// containment hierarchy and has to be changed
			if (obj instanceof CommentLink) {
				@SuppressWarnings("rawtypes")
				NamedElement parent = findParent((CommentLink) obj);
				if (tree.get(parent) != null) {
					if (tree.get(obj.eContainer()) != null) {
						tree.get(obj.eContainer()).removeChild(tree.get(obj));
					}
					tree.get(obj).setParent(tree.get(parent));
					tree.get(parent).addChild(tree.get(obj));

				}
			}
		}
		return tree;
	}

	@Override
	public List<SummaryItem> postProcessSummaryViewBuilder(List<SummaryItem> summaryList) {
		for (SummaryItem item : summaryList) {
			if (item.getValue() instanceof CommentLink) {
				item.setCommonParent(findParent((CommentLink) item.getValue()));
			}
		}
		return summaryList;
	}

	@SuppressWarnings("rawtypes")
	private NamedElement findParent(CommentLink commentLink) {
		CDOID contextID = CDOUtil.getCDOObject(commentLink.getComment()).cdoID();
		CDOQuery cqo = commentLink.cdoView().createQuery("ocl",
				"cls::NamedElement.allInstances()->select(e : cls::NamedElement | self.annotatedElement->includes(e.referencedElement))",
				contextID);

		List<NamedElement> commentedObject = cqo.getResult();
		if (commentedObject.size() > 0) {
			return commentedObject.get(0);
		}
		return null;
	}

}
