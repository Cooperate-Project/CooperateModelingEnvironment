package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationResultDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

class DeferredMatcherApplicationCondition<LeftType extends EObject, RightType extends EObject> implements ElementMatcherCondition<LeftType, RightType> {
    val LeftType elementToMatch
    val EClass matchAs
    var ElementMatcherApplicationResultDelegate<LeftType> delegate = null
    
    new (LeftType elementToMatch, EClass matchAs) {
        this.elementToMatch = elementToMatch
        this.matchAs = matchAs
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        if (delegate !== null && delegate.hasResult) {
            delegate.result
        } else throw new IllegalStateException("Trying to evaluate a deferred condition without properly initializing the deferred matches")
    }
    
    override prepare(ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        this.delegate = registerDelegate.evaluateAs(elementToMatch, matchAs)
    }    

}