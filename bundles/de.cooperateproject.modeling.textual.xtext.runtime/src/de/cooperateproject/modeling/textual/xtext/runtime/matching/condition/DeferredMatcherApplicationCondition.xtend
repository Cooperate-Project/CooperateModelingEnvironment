package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate

class DeferredMatcherApplicationCondition<LeftType, RightType> implements ElementMatcherCondition<LeftType, RightType> {
    val LeftType elementToMatch
    val Class<RightType> matchAs
    val boolean before
    
    new (LeftType elementToMatch, Class<RightType> matchAs, boolean before) {
        this.elementToMatch = elementToMatch
        this.matchAs = matchAs
        this.before = before
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override registerMatchings(ElementMatcherApplicationRegisterDelegate registerDelegate) {
        if (before) registerDelegate.evaluateBefore(elementToMatch, matchAs)
        else registerDelegate.evaluate(elementToMatch, matchAs)
    }
    
}