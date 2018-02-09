package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage
import de.cooperateproject.modeling.textual.component.cmp.Method
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation
import de.cooperateproject.modeling.textual.component.cmp.Attribute
import de.cooperateproject.modeling.textual.component.cmp.Component
import de.cooperateproject.modeling.textual.component.cmp.Member
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.component.cmp.Port
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd
import de.cooperateproject.modeling.textual.component.cmp.Connector
import de.cooperateproject.modeling.textual.component.cmp.Parameter
import org.apache.commons.lang3.StringUtils
import de.cooperateproject.modeling.textual.common.issues.DependingElementMissingElementResolvableCheckerBase
import org.eclipse.uml2.uml.AttributeOwner
import de.cooperateproject.modeling.textual.component.cmp.Generalization

class ComponentMissingUMLElementResolvableChecker extends DependingElementMissingElementResolvableCheckerBase {
	
	protected def dispatch localResolutionPossible(UMLReferencingElement element) {
	    val referencedType = element.eClass.getFeatureType(TextualCommonsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement).EClassifier as EClass
	    return (UMLPackage.eINSTANCE.classifier.isSuperTypeOf(referencedType) 
	         && UMLPackage.eINSTANCE.packageableElement.isSuperTypeOf(referencedType)
	         && (element.hasValidParent(CmpPackage.eINSTANCE.component) || element.hasValidParent(CmpPackage.eINSTANCE.rootPackage)))
	}
	
	protected def dispatch resolvePossible(Component element) {
		if (!element.hasValidParent(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT)) {
			return false;
		}
		val parent = element.eContainer as UMLReferencingElement<Element>
		return parent.referencedElementHasEitherType(UMLPackage.Literals.PACKAGE, UMLPackage.Literals.CLASS)
	}
	
	protected def dispatch localResolutionPossible(InterfaceRelation element) {
		return element.hasValidParent(CmpPackage.eINSTANCE.classifier)
	}
	
	protected def dispatch localResolutionPossible(Attribute element) {
		return element.type !== null && element.hasValidParent(CmpPackage.eINSTANCE.classifier)
	}
	
	protected def dispatch localResolutionPossible(Port element) {
		return element.hasValidParent(CmpPackage.eINSTANCE.component)
	}
	
	protected def dispatch localResolutionPossible(ConnectorEnd element) {
		return element.hasValidParent(CmpPackage.eINSTANCE.connector)
	}
	
	protected def dispatch localResolutionPossible(Connector element) {
		return element.name !== null && element.hasValidParent(CmpPackage.eINSTANCE.component) && !element.connectorEnds.map[role].contains(null)
	}
	
	protected def dispatch localResolutionPossible(Method element) {
		return !element.parameters.map[type].contains(null) && !element.parameters.map[name].contains(null) 
		&& element.eContainer !== null
	}
	
    protected def dispatch localResolutionPossible(Parameter element) {
        return element.type !== null && element.type.eResource !== null && StringUtils.isNotBlank(element.name)
    }
    
    protected def dispatch localResolutionPossible(Generalization element) {
    	return element.leftClassifier.referencedElementHasType(UMLPackage.Literals.INTERFACE) &&
    	element.rightClassifier.referencedElementHasType(UMLPackage.Literals.INTERFACE)
    }
    
    protected def dispatch getDependencies(InterfaceRelation object) {
    	#[object.interface]
    }
    
    protected def dispatch getDependencies(Parameter object) {
        object.owner.parameters.take(object.owner.parameters.indexOf(object)).map[it as UMLReferencingElement<? extends Element>].toList => [
            add(0, object.owner)
        ]
    }
    
    protected def dispatch getDependencies(Port object) {
    	#[object.realizedClassifier]
    }
    
    protected def dispatch getDependencies(ConnectorEnd object) {
    	#[object.role]
    }
    
    protected def dispatch getDependencies(Generalization object) {
    	#[object.leftClassifier, object.rightClassifier]
    }
    
}