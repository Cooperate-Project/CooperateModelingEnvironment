package de.cooperateproject.modeling.textual.common.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable
import org.eclipse.jface.viewers.StyledString
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import java.util.Collection
import com.google.common.base.Predicate
import org.eclipse.swt.graphics.Image

class CooperateOutlineTreeProvider extends DefaultOutlineTreeProvider {
    dispatch def createChildren(IOutlineNode parentNode, Commentable<?> commentable) {
        if (!commentable.comments.isEmpty) {
            val comment = commentable.comments.findFirst[true]
            createEObjectNode(parentNode, comment , UMLImage.COMMENT.image, textDispatcher.invoke(comment), true)
        }
    }
    
    def getStyledString(String name, int counter) {
        var styledLabel = new StyledString()
        styledLabel.append(name)
        styledLabel.append(new StyledString(" : " + counter, StyledString::DECORATIONS_STYLER))
        return styledLabel
    }

    def <T extends EObject> createFeatureNode(IOutlineNode parentNode, T parent, EReference ref, Image img,
        StyledString text, boolean isLeaf) {
        val result = parent.eGet(ref);
        if (result instanceof Collection<?>) {
            createFeatureNode(parentNode, parent, ref, img, text, isLeaf, [!result.empty])
        } else if (result !== null) {
            createFeatureNode(parentNode, parent, ref, img, text, isLeaf, [true])
        }
    }

    def <T extends EObject> createFeatureNode(IOutlineNode parentNode, T parent, EReference ref, Image img,
        StyledString text, boolean isLeaf, Predicate<T> pred) {
        if (pred.apply(parent)) {
            createEStructuralFeatureNode(parentNode, parent, ref, img, text, isLeaf)
        }
    }
}
