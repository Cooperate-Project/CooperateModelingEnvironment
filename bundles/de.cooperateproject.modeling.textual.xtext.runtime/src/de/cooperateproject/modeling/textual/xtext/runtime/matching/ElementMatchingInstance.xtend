package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

class ElementMatchingInstance<LeftType extends EObject, RightType extends EObject> {
    
    @Accessors var CandidatesConfigurationPool<RightType> candidatesPool
    @Accessors val LeftType elementToMatch
    @Accessors val EClass rightType
    
    new (LeftType elementToMatch, EClass rightType) {
        this.elementToMatch = elementToMatch
        this.rightType = rightType        
    }
       
    def ElementMatcherApplication<LeftType, RightType> evaluateWithMatcher(ElementMatcher<LeftType, RightType> matcher, ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        if (candidatesPool === null) {
            candidatesPool = context.getCandidatesPool(matcher.rightType)
        }
        
        new ElementMatcherApplication(this, matcher, ElementMatchingInstance.this.candidatesPool, registerDelegate, context)
    }
}