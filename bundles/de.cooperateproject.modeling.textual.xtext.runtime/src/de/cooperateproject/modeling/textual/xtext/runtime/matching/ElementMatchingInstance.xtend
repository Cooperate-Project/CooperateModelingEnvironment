package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

class ElementMatchingInstance<LeftType extends EObject, RightType extends EObject> {
    
    var CandidatesConfigurationPool<RightType> candidatesPool
        
    new (LeftType elementToMatch, EClass rightType) {
        this.elementToMatch = elementToMatch
        this.rightType = rightType        
    }
    
    val LeftType elementToMatch
    def LeftType getElementToMatch() {
        elementToMatch
    }
    
    val EClass rightType
    def EClass getRightType() {
        rightType
    }
    
    def void setCandidatesPool(CandidatesConfigurationPool<?> pool) {
        candidatesPool = pool
    }
    
    def getCandidatesPool() {
        candidatesPool
    }
       
    def ElementMatcherApplication<LeftType, RightType> evaluateWithMatcher(ElementMatcher<LeftType, RightType> matcher) {
        if (candidatesPool === null) {
            throw new IllegalStateException("The matching instance has not been initialized with a candidates provider!")
        }
        
        new ElementMatcherApplication(this, matcher, ElementMatchingInstance.this.candidatesPool)
    }
}