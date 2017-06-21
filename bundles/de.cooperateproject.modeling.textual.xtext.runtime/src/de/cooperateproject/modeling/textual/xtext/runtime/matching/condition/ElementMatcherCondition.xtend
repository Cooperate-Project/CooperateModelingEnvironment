package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult

interface ElementMatcherCondition<LeftType, RightType> {
    def MatchingResult<LeftType> evaluate(CandidatesConfiguration<RightType> config)
    
    def void registerMatchings(ElementMatcherApplicationRegisterDelegate registerDelegate) 
}
