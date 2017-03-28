package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.AliasedElement
import de.cooperateproject.modeling.textual.usecase.usecase.Association
import de.cooperateproject.modeling.textual.usecase.usecase.Comment
import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization
import de.cooperateproject.modeling.textual.usecase.usecase.Include
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage
import de.cooperateproject.modeling.textual.usecase.usecase.System
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.OpaqueExpression
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.usecase.issues.UsecaseIssueResolutionUtilities.*

class UsecaseUMLReferencingElementMissingElement extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
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
	
	
	private def dispatch resolvePossible(Actor element) {
		return element.hasValidRootPackageParent
	}
	
	private def dispatch resolvePossible(System element) {
		return element.hasValidRootPackageParent;	
	}
	
	private def dispatch resolvePossible(UseCase element) {
		return element.hasValidParent(UsecasePackage.Literals.SYSTEM);	
	}
	
	private def dispatch resolvePossible(ExtensionPoint element) {
		return element.hasValidParent(UsecasePackage.Literals.USE_CASE);	
	}
	
	private def dispatch resolvePossible(Extend element) {
		return
			element.extension != null &&
			element.extendedCase != null &&
			element.extensionLocation != null &&
			element.extendedCase.hasReferencedElement &&
			element.extensionLocation.hasReferencedElement &&
			element.extension.hasReferencedElement;
	}
	
	private def dispatch resolvePossible(Include element) {
		return
			element.includingCase != null &&
			element.addition != null &&
			element.includingCase.hasReferencedElement &&
			element.addition.hasReferencedElement
	}

	private def dispatch resolvePossible(Generalization element) {
		 return
		 	element.specific != null &&
		 	element.general != null &&
		 	element.specific.hasReferencedElement &&
		 	element.general.hasReferencedElement
	}
	
	private def dispatch resolvePossible(Association element) {
		return
			element.actor != null &&
			element.usecase != null &&
			element.actor.hasReferencedElement &&
			element.usecase.hasReferencedElement
	}
	
	private def dispatch resolvePossible(Comment element) {
		return
			element.commentedElement instanceof UMLReferencingElement<?> &&
			(element.commentedElement as UMLReferencingElement<?>).referencedElement instanceof Element
	}
		
	private def dispatch fixMissingUMLElement(Actor element) {
		if (!element.resolvePossible) return Void
		val parent = element.eContainer as UMLReferencingElement<Package>
		val umlActor = UMLFactory.eINSTANCE.createActor
		umlActor.name = element.name
		umlActor.package = parent.referencedElement
		umlActor.isAbstract = element.abstract
		umlActor.setVisibility(element.visibility)
		umlActor.handleAliasOfMissingUMLElement(element);
		element.referencedElement = umlActor		
	}
	
	private def dispatch fixMissingUMLElement(System element) {
		if (!element.resolvePossible) return Void
		val parent = element.eContainer as RootPackage
		val umlSystem = UMLFactory.eINSTANCE.createComponent
		umlSystem.name = element.name
		umlSystem.package = parent.referencedElement
		element.referencedElement = umlSystem
	}
	
	private def dispatch fixMissingUMLElement(UseCase element) {
		if (!element.resolvePossible) return Void
		val parent = element.eContainer as System
		val umlUseCase = UMLFactory.eINSTANCE.createUseCase
		umlUseCase.name = element.name
		umlUseCase.setVisibility(element.visibility)
		parent.referencedElement.ownedUseCases.add(umlUseCase)
		umlUseCase.subjects += element.system.referencedElement
		umlUseCase.isAbstract = element.abstract
		umlUseCase.handleAliasOfMissingUMLElement(element);
		element.referencedElement = umlUseCase
	}
	
	private def dispatch fixMissingUMLElement(ExtensionPoint element) {
		if (!element.resolvePossible) return Void
		val parent = element.useCase
		val extensionPoint = parent.referencedElement.createExtensionPoint(element.name)
		extensionPoint.handleAliasOfMissingUMLElement(element);
		element.referencedElement = extensionPoint
	}
	
	private def dispatch fixMissingUMLElement(Extend element) {
		if (!element.resolvePossible) return Void
		val extendingUseCase = element.extension
		val umlExtend = extendingUseCase.referencedElement.createExtend(null, element.extendedCase.referencedElement)
		umlExtend.extensionLocations += element.extensionLocation.referencedElement
		val umlCondition = umlExtend.createCondition(null, UMLPackage.eINSTANCE.constraint)
		val umlExpression = umlCondition.createSpecification(null, null, UMLPackage.eINSTANCE.opaqueExpression) as OpaqueExpression
		umlExpression.languages += "Natural language"
		umlExpression.bodies += element.condition
		element.referencedElement = umlExtend
	}
	
	private def dispatch fixMissingUMLElement(Include element) {
		if (!element.resolvePossible) return Void
		val includingUseCase = element.includingCase
		val umlInclude = includingUseCase.referencedElement.createInclude(null, element.addition.referencedElement)
		element.referencedElement = umlInclude
	}
	
	private def dispatch fixMissingUMLElement(Generalization element) {
		if (!element.resolvePossible) return Void
		val specificElement = element.specific
		val umlGeneralization = specificElement.referencedElement.createGeneralization(element.general.referencedElement)
		element.referencedElement = umlGeneralization
	}
	
	private def dispatch fixMissingUMLElement(Association element) {
		if (!element.resolvePossible) return Void
		val umlActor = element.actor.referencedElement
		val umlUseCase = element.usecase.referencedElement
		
		var actorCardinality = element.actorCardinality?.convert ?: Pair.of(0, 1)
		var usecaseCardinality = element.useCaseCardinality?.convert ?: Pair.of(0, 1)
		
		val umlAssociation = umlActor.createAssociation(
			false,
			AggregationKind.NONE_LITERAL,
			null,
			usecaseCardinality.key,
			usecaseCardinality.value,
			umlUseCase,
			false,
			AggregationKind.NONE_LITERAL,
			null,
			actorCardinality.key,
			actorCardinality.value
		)
		element.referencedElement = umlAssociation
	}
	
	private def dispatch fixMissingUMLElement(Comment element) {
		if (!element.resolvePossible) return Void
		val commentedElement = element.commentedElement as UMLReferencingElement<Element>
		val umlCommentedElement = commentedElement.referencedElement
		val umlComment = umlCommentedElement.nearestPackage.createOwnedComment
		umlComment.body = element.comment
		umlComment.annotatedElements += umlCommentedElement
		element.referencedElement = umlComment
	}
	
	private static def hasValidRootPackageParent(EObject element) {
		return element.hasValidParent(UsecasePackage.Literals.ROOT_PACKAGE)
	}
	
	private static def hasValidParent(EObject element, EClass parentType) {
		var parent = element.eContainer
		if (parent != null && parentType.isInstance(parent)) {
			if (parent instanceof UMLReferencingElement<?>) {
				return parent.hasReferencedElement
			}
		}
		return false
	}
	
	private static def hasReferencedElement(UMLReferencingElement<?> element) {
		return element.referencedElement != null
	}
	
	private def void handleAliasOfMissingUMLElement(NamedElement classifier, AliasedElement element) {
		if (element.alias !== null) {
			classifier.createNameExpression(element.alias, null);
		}
	} 
	
	
}