package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.apache.commons.lang3.StringUtils
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.OperationOwner
import org.eclipse.uml2.uml.StructuredClassifier

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsUMLReferencingElementMissingElementResolvableChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}
	
	private def dispatch resolvePossible(UMLReferencingElement element) {
	    return false;
	}

	private def dispatch resolvePossible(Package element) {
		if (element.owningPackage === null) {
			return false
		}
		return element.owningPackage.hasReferencedElement
	}

	private def dispatch resolvePossible(Classifier<?> element) {
		return element.owningPackage.hasReferencedElement
	}

	private def dispatch resolvePossible(Association element) {
		return element.owningPackage.hasReferencedElement && StringUtils.isNotBlank(element.name) && element.memberEnds.size > 1 && !element.memberEnds.map[type].contains(null)
	}

	private def dispatch resolvePossible(TypedConnector element) {
		return element.owningPackage.hasReferencedElement && element.left.hasReferencedElement &&
			element.right.hasReferencedElement
	}

	private def dispatch resolvePossible(Implementation element) {
		return element.owningPackage.hasReferencedElement &&
			element.left.hasReferencedElementOfType(Class) &&
			element.right.hasReferencedElementOfType(Interface)
	}

	private def dispatch resolvePossible(Attribute element) {
		return element.owner.hasReferencedElementOfType(StructuredClassifier) && element.type !== null
	}

	private def dispatch resolvePossible(Method element) {
		return element.owner.hasReferencedElementOfType(OperationOwner) &&
			!element.parameters.map[type].contains(null) && !element.parameters.map[name].contains(null)
	}

	private def dispatch resolvePossible(Parameter element) {
		return element.owner.hasReferencedElement && element.type !== null && StringUtils.isNotBlank(element.name) &&
			element.owner.referencedElement.ownedParameters.size >= element.owner.parameters.indexOf(element)
	}

	private def dispatch resolvePossible(AssociationMemberEnd element) {
		return element.association.hasReferencedElement && element.type.hasReferencedElement
	}
	
}