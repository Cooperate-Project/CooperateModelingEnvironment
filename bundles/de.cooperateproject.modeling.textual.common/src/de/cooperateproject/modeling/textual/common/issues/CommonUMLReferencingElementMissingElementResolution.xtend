package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport

class CommonUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	new(UMLReferencingElement<Element> element, IResolvableChecker<UMLReferencingElement<Element>> resolvableChecker) {
		super(element, resolvableChecker)
	}
	
	static def getAcceptableTypes() {
		CommonUMLReferencingElementMissingElementResolution.declaredMethods.filter [
			name == "_fixMissingUMLElement" && parameterCount == 1
		].map[parameters.get(0).type]
	}

	override resolve() {
		problematicElement.fixMissingUMLElement
	}

	private def dispatch fixMissingUMLElement(Comment element) {
		if(!resolvePossible) return Void
		val commentedElement = element.commentedElement
		val Element umlCommentedElement = commentedElement.referencedElement
		val umlComment = umlCommentedElement.nearestPackage.createOwnedComment()
		umlComment.body = element.body
		umlComment.annotatedElements.add(umlCommentedElement)
		element.referencedElement = umlComment
	}
	
	private def dispatch fixMissingUMLElement(PackageImport element) {
		if(!resolvePossible) return Void
		val importingPackage = element.importingPackage.referencedElement
		val importedPackage = element.importedPackage
		val packageImport = importingPackage.createPackageImport(importedPackage)
		element.referencedElement = packageImport
	}
}
