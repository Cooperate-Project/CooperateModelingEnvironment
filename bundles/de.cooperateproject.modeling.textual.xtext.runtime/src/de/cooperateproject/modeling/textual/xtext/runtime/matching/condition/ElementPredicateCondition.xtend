package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import java.util.function.BiPredicate

class ElementPredicateCondition<LeftType, RightType> implements ElementMatcherCondition<LeftType, RightType> {
    val BiPredicate<LeftType, RightType> predicate
    val LeftType element
    
    new (BiPredicate<LeftType, RightType> predicate, LeftType element) {
        this.predicate = predicate
        this.element = element
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        val cand = config.candidateChoice
        MatchingResultFactory.INSTANCE.create(element, if (predicate.test(this.element, cand)) cand)
    }
    
    override registerMatchings(ElementMatcherApplicationRegisterDelegate registerDelegate) {}
    
}
