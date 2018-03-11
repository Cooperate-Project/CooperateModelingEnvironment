package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Member
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector
import de.cooperateproject.modeling.textual.common.issues.DependingElementMissingElementResolvableCheckerBase
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.apache.commons.lang3.StringUtils
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLPackage

class ClsUMLReferencingElementMissingElementResolvableChecker extends DependingElementMissingElementResolvableCheckerBase {
   
    protected def dispatch localResolutionPossible(Classifier<?> element) { true }
    protected def dispatch localResolutionPossible(AssociationMemberEnd element) { true }
    
	protected def dispatch localResolutionPossible(Package element) {
		return element.owningPackage !== null
	}
	
	protected def dispatch localResolutionPossible(Association element) {
        return element.memberEnds.size > 1 && !element.memberEnds.map[type].contains(null)
    }

    protected def dispatch localResolutionPossible(Generalization element) {
        return (element.left.referencedElementHasType(UMLPackage.Literals.CLASS) &&
            element.right.referencedElementHasType(UMLPackage.Literals.CLASS)) 
            || (element.left.referencedElementHasType(UMLPackage.Literals.INTERFACE) &&
            element.right.referencedElementHasType(UMLPackage.Literals.INTERFACE)) 
    }
    
    protected def dispatch localResolutionPossible(Implementation element) {
        return element.left.referencedElementHasType(UMLPackage.Literals.CLASS) &&
            element.right.referencedElementHasType(UMLPackage.Literals.INTERFACE)
    }

    protected def dispatch localResolutionPossible(Attribute element) {
        return (element.owner.referencedElementHasType(UMLPackage.Literals.CLASS) 
        	|| element.owner.referencedElementHasType(UMLPackage.Literals.INTERFACE))
            && element.type !== null && !element.type.eIsProxy
    }

    protected def dispatch localResolutionPossible(Method element) {
        element.owner.referencedElementHasEitherType(UMLPackage.Literals.CLASS, UMLPackage.Literals.INTERFACE)
          && !element.parameters.map[type].contains(null) && !element.parameters.map[name].contains(null)
    }

    protected def dispatch localResolutionPossible(Parameter element) {
        return element.type !== null && element.type.eResource !== null && StringUtils.isNotBlank(element.name)
    }
	
	protected def dispatch getDependencies(Package object) {
	    if (object.owningPackage !== null) #[object.owningPackage] else #[]
	}
	
	protected def dispatch getDependencies(Classifier<?> object) {
        #[object.owningPackage]
    }
    
    protected def dispatch getDependencies(Connector object) {
        #[object.owningPackage]
    }
    
    protected def dispatch getDependencies(TypedConnector<?> object) {
        #[object.owningPackage, object.left, object.right]
    }
    
    protected def dispatch getDependencies(Member<?> object) {
        #[object.owner as UMLReferencingElement<Element>]
    }
    
    protected def dispatch getDependencies(AssociationMemberEnd object) {
        #[object.association, object.type]
    }
    
    protected def dispatch getDependencies(Parameter object) {
        object.owner.parameters.take(object.owner.parameters.indexOf(object)).map[it as UMLReferencingElement<? extends Element>].toList => [
            add(0, object.owner)
        ]
    }


}