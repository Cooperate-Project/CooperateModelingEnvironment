package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Element

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

abstract class DependingElementMissingElementResolvableCheckerBase implements IResolvableChecker<UMLReferencingElement<Element>>{
    
    override isResolvable(UMLReferencingElement<Element> element) {
        element.dependenciesAreResolvable && element.localResolutionPossible
    }
    
    override isDirectlyResolvable(UMLReferencingElement<Element> element) {
        element.dependenciesAreResolved && element.localResolutionPossible
    }
    
    protected def dispatch localResolutionPossible(EObject element) {
        return false;
    }
    
    protected def boolean dependenciesAreResolved(UMLReferencingElement<? extends Element> element) {
        element.dependencies.map[it as UMLReferencingElement<Element>].forall[it !== null && hasReferencedElement]
    }
    
    protected def boolean dependenciesAreResolvable(UMLReferencingElement<? extends Element> element) {
        element.dependencies.map[it as UMLReferencingElement<Element>].forall[it !== null && (hasReferencedElement || isResolvable)]   
    }
    
    protected def dispatch Iterable<? extends UMLReferencingElement<? extends Element>> getDependencies(EObject object) {
        if (object.eContainer instanceof UMLReferencingElement<?>) #[object.eContainer as UMLReferencingElement<Element>] else #[]
    }
    
    protected def boolean referencedElementHasType(EObject object, EClass type) {
        return object !== null
            && type.isSuperTypeOf(object.eClass.getFeatureType(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT).getEClassifier as EClass)
    }
    
    protected def boolean referencedElementHasEitherType(EObject object, EClass... types) {
        types.exists[object.referencedElementHasType(it)]
    }
    
}
						