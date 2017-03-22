package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.CommentLink
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import org.apache.commons.lang3.StringUtils
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.OperationOwner
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.StructuredClassifier
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*

class ClsUMLReferencingElementMissingElement extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	public static val MISSING_UML_REFERENCE = "missingUMLReference";

	new(UMLReferencingElement<Element> element) {
		super(element)
	}

	static def hasIssue(UMLReferencingElement<Element> object) {
		return object.referencedElement == null
	}

	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}

	override resolvePossible() {
		getProblematicElement.resolvePossible
	}

	private def dispatch resolvePossible(Package element) {
		return element.owningPackage.hasReferencedElement
	}

	private def dispatch resolvePossible(Classifier<?> element) {
		return element.owningPackage.hasReferencedElement
	}

	private def dispatch resolvePossible(Association element) {
		return element.owningPackage.hasReferencedElement
	}

	private def dispatch resolvePossible(TypedConnector element) {
		return element.owningPackage.hasReferencedElement && element.left.hasReferencedElement &&
			element.right.hasReferencedElement
	}

	private def dispatch resolvePossible(Implementation element) {
		return element.owningPackage.hasReferencedElement &&
			element.left.hasReferencedElementOfType(org.eclipse.uml2.uml.Class) &&
			element.right.hasReferencedElementOfType(org.eclipse.uml2.uml.Interface)
	}

	private def dispatch resolvePossible(Comment element) {
		val commentElement = element.commentedElement
		if (commentElement instanceof UMLReferencingElement) {
			return commentElement.hasReferencedElement
		} else if (commentElement instanceof CommentLink) {
			return commentElement.commentedElement.hasReferencedElement
		}
		return false
	}

	private def dispatch resolvePossible(Attribute element) {
		return element.owner.hasReferencedElementOfType(StructuredClassifier) && element.type != null
	}

	private def dispatch resolvePossible(Method element) {
		return element.owner.hasReferencedElementOfType(OperationOwner) &&
			!element.parameters.map[type].contains(null) && !element.parameters.map[name].contains(null)
	}

	private def dispatch resolvePossible(Parameter element) {
		return element.owner.hasReferencedElement && element.type != null && StringUtils.isNotBlank(element.name) &&
			element.owner.referencedElement.ownedParameters.size >= element.owner.parameters.indexOf(element)
	}

	private def dispatch resolvePossible(AssociationMemberEnd element) {
		return element.association.hasReferencedElement && element.type.hasReferencedElement
	}

	private def dispatch fixMissingUMLElement(Package element) {
		if(!element.resolvePossible) return Void
		val umlParent = element.owningPackage.referencedElement
		val umlPackage = umlParent.createPackagedElement(element.name,
			UMLPackage.Literals.PACKAGE) as org.eclipse.uml2.uml.Package
		element.referencedElement = umlPackage
	}

	private def dispatch fixMissingUMLElement(Class element) {
		if(!element.resolvePossible) return Void
		val result = fixMissingUMLElement(element, UMLPackage.Literals.CLASS)
		if (result instanceof org.eclipse.uml2.uml.Class) {
			result.isAbstract = element.abstract
		}
	}

	private def dispatch fixMissingUMLElement(Interface element) {
		if(!element.resolvePossible) return Void
		fixMissingUMLElement(element, UMLPackage.Literals.INTERFACE)
	}

	private def dispatch fixMissingUMLElement(Association element) {
		if(!element.resolvePossible) return Void

		val umlAssociation = UMLFactory.eINSTANCE.createAssociation;
		umlAssociation.name = element.name
		element.owningPackage.referencedElement.packagedElements += umlAssociation
		element.referencedElement = umlAssociation
//		
//		element.memberEnds
//		
//		
//		
//		
//		
//		val leftClassifier = element.left.referencedElement
//		val rightClassifier = element.right.referencedElement
//		val leftCardinality = element.cardinalityLeft?.convert ?: Pair.of(0, 1)
//		val rightCardinality = element.cardinalityRight?.convert ?: Pair.of(0, 1)
//		
//		val umlAssociation = leftClassifier.createAssociation(
//			true,
//			element.aggregationKind.convert,
//			element.roleNameLeft,
//			leftCardinality.key,
//			leftCardinality.value,
//			rightClassifier,
//			element.bidirectional,
//			org.eclipse.uml2.uml.AggregationKind.NONE_LITERAL,
//			element.roleNameRight,
//			rightCardinality.key,
//			rightCardinality.value
//		)
//		
//		element.referencedElement = umlAssociation
	}

	private def dispatch fixMissingUMLElement(Generalization element) {
		if(!element.resolvePossible) return Void
		val umlGeneralization = element.left.referencedElement.createGeneralization(element.right.referencedElement)
		element.referencedElement = umlGeneralization
	}

	private def dispatch fixMissingUMLElement(Implementation element) {
		if(!element.resolvePossible) return Void
		val umlInterfaceRealization = (element.left.referencedElement as org.eclipse.uml2.uml.Class).
			createInterfaceRealization(null, element.right.referencedElement as org.eclipse.uml2.uml.Interface)
		element.referencedElement = umlInterfaceRealization
	}

	private def dispatch fixMissingUMLElement(Comment element) {
		if(!element.resolvePossible) return Void
		val commentedElement = element.commentedElement
		var Element umlCommentedElement = null

		if (commentedElement instanceof CommentLink) {
			umlCommentedElement = commentedElement.commentedElement.referencedElement
		} else if (commentedElement instanceof UMLReferencingElement) {
			umlCommentedElement = commentedElement.referencedElement
		}
		val umlComment = umlCommentedElement.nearestPackage.createOwnedComment()
		umlComment.body = element.body
		umlComment.annotatedElements.add(umlCommentedElement)
		element.referencedElement = umlComment
	}

	private def dispatch fixMissingUMLElement(Attribute element) {
		if(!element.resolvePossible) return Void
		val umlClassifier = element.owner.referencedElement as StructuredClassifier
		val umlAttribute = umlClassifier.createOwnedAttribute(element.name, element.type)
		umlAttribute.visibility = element.visibility
		umlAttribute.isStatic = element.static
		element.referencedElement = umlAttribute
	}

	private def dispatch fixMissingUMLElement(Method element) {
		if(!element.resolvePossible) return Void
		val umlClassifier = element.owner.referencedElement as OperationOwner
		val parameterNames = new BasicEList(element.parameters.map[name])
		val parameterTypes = new BasicEList(element.parameters.map[type].map[type|type as Type])
		val umlOperation = umlClassifier.createOwnedOperation(element.name, parameterNames, parameterTypes,
			element.type)
		umlOperation.visibility = element.visibility
		umlOperation.isStatic = element.static
		umlOperation.isAbstract = element.abstract
		element.referencedElement = umlOperation
	}

	private def dispatch fixMissingUMLElement(Parameter element) {
		if(!element.resolvePossible) return Void
		val method = element.owner
		val umlMethod = method.referencedElement
		val parameterIndex = method.parameters.indexOf(element)
		val umlParameter = umlMethod.createOwnedParameter(element.name, element.type)
		umlMethod.ownedParameters.move(parameterIndex, umlParameter)
		element.referencedElement = umlParameter
	}

	private def dispatch fixMissingUMLElement(AssociationMemberEnd element) {
		if(!element.resolvePossible) return Void
		val umlAssociation = element.association.referencedElement
		var Property umlProperty;
		if (element.navigable) {
			umlProperty = umlAssociation.createNavigableOwnedEnd(element.name, element.type.referencedElement)
		} else {
			umlProperty = umlAssociation.createOwnedEnd(element.name, element.type.referencedElement)
		}
		val cardinality = element.cardinality?.convert ?: Pair.of(0, 1)
		umlProperty.lower = cardinality.key
		umlProperty.upper = cardinality.value
		umlProperty.aggregation = element.aggregationKind.convert
		element.referencedElement = umlProperty
		
		// workaround for label display in Papyrus
		if (element.association.memberEnds.size == 2 && element.association.memberEnds.indexOf(element) == 1) {
			if (umlAssociation.memberEnds.indexOf(umlProperty) != 0) {
				umlAssociation.memberEnds.move(1, 0);
			}
		}
	}

	private def fixMissingUMLElement(Classifier element, EClass umlType) {
		if(!element.resolvePossible) return Void
		val umlParent = element.owningPackage.referencedElement
		val umlClassifier = umlParent.createPackagedElement(element.name, umlType) as org.eclipse.uml2.uml.Classifier
		umlClassifier.visibility = element.visibility
		if (element.alias != null) {
			umlClassifier.createNameExpression(element.alias, null)
		}
		element.referencedElement = umlClassifier
		return umlClassifier
	}

}
