package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element

class CommonUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	new(UMLReferencingElement<Element> element, IResolvableChecker<UMLReferencingElement<Element>> resolvableChecker) {
		super(element, resolvableChecker)
	}

	override resolve() {
	    val e = getProblematicElement as UMLReferencingElement;
	    if (e instanceof Comment) {
	        e.fixMissingUMLElement
	    }
	}

	private def dispatch fixMissingUMLElement(Comment element) {
		if(!resolvePossible) return Void
		val commentedElement = element.commentedElement
		var Element umlCommentedElement = null
    
        umlCommentedElement = commentedElement.referencedElement

		val umlComment = umlCommentedElement.nearestPackage.createOwnedComment()
		umlComment.body = element.body
		umlComment.annotatedElements.add(umlCommentedElement)
		element.referencedElement = umlComment
	}
}
