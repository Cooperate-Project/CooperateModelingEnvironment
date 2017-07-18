package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.Association
import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization
import de.cooperateproject.modeling.textual.usecase.usecase.Include
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage
import de.cooperateproject.modeling.textual.usecase.usecase.System
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.OpaqueExpression
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.usecase.derivedstate.initializers.ExtendInitializer

class UsecaseUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}
	
	private def dispatch fixMissingUMLElement(Actor element) {
		if(!resolvePossible) return Void
		val parent = element.eContainer as UMLReferencingElement<Package>
		val umlActor = UMLFactory.eINSTANCE.createActor
		umlActor.name = element.name
		umlActor.package = parent.referencedElement
		umlActor.isAbstract = element.abstract
		if (element.isSetVisibility) {
			umlActor.setVisibility(element.visibility)
		}
		umlActor.handleAliasedElement(element);
		
		element.referencedElement = umlActor		
	}
	
	private def dispatch fixMissingUMLElement(System element) {
		if(!resolvePossible) return Void
		val parent = element.eContainer as RootPackage
		val umlSystem = UMLFactory.eINSTANCE.createComponent
		umlSystem.name = element.name
		umlSystem.package = parent.referencedElement
		element.referencedElement = umlSystem
	}
	
	private def dispatch fixMissingUMLElement(UseCase element) {
		if(!resolvePossible) return Void
		val parent = element.eContainer as System
		val umlUseCase = UMLFactory.eINSTANCE.createUseCase
		umlUseCase.name = element.name
		if (element.isSetVisibility) {
			umlUseCase.setVisibility(element.visibility)
		}
		parent.referencedElement.ownedUseCases.add(umlUseCase)
		umlUseCase.subjects += element.system.referencedElement
		umlUseCase.isAbstract = element.abstract
		
		umlUseCase.handleAliasedElement(element);
        
		element.referencedElement = umlUseCase
	}
	
	private def dispatch fixMissingUMLElement(ExtensionPoint element) {
		if(!resolvePossible) return Void
		val parent = element.useCase
		val extensionPoint = parent.referencedElement.createExtensionPoint(element.name)
		extensionPoint.handleAliasedElement(element);
		element.referencedElement = extensionPoint
	}
	
	private def dispatch fixMissingUMLElement(Extend element) {
		if(!resolvePossible) return Void
		val extendingUseCase = element.extension
		val umlExtend = extendingUseCase.referencedElement.createExtend(null, element.extendedCase.referencedElement)
		umlExtend.extensionLocations += element.extensionLocation.referencedElement
		val umlCondition = umlExtend.createCondition(null, UMLPackage.eINSTANCE.constraint)
		val umlExpression = umlCondition.createSpecification(null, null, UMLPackage.eINSTANCE.opaqueExpression) as OpaqueExpression
		umlExpression.languages += ExtendInitializer.CONDITION_LANGUAGE_NAME
		umlExpression.bodies += element.condition
		element.referencedElement = umlExtend
	}
	
	private def dispatch fixMissingUMLElement(Include element) {
		if(!resolvePossible) return Void
		val includingUseCase = element.includingCase
		val umlInclude = includingUseCase.referencedElement.createInclude(null, element.addition.referencedElement)
		element.referencedElement = umlInclude
	}
	
	private def dispatch fixMissingUMLElement(Generalization element) {
		if(!resolvePossible) return Void
		val specificElement = element.specific
		val umlGeneralization = specificElement.referencedElement.createGeneralization(element.general.referencedElement)
		element.referencedElement = umlGeneralization
	}
	
	private def dispatch fixMissingUMLElement(Association element) {
		if(!resolvePossible) return Void
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
	
	protected def handleAliasedElement(NamedElement umlElement, AliasedElement element) {
	    if (!element.alias.isNullOrEmpty) {
	        umlElement.createNameExpression(element.alias, null);
	    }
	}
	
}