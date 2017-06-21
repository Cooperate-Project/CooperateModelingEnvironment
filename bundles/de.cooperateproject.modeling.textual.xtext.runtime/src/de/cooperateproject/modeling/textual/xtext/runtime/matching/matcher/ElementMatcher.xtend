package de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher

import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition

import static de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector.DEFAULT_SELECTOR
import java.util.function.Function

interface ElementMatcher<LeftType, RightType> {
    def boolean isMatcherFor(Class<?> leftType, Class<?> rightType)
    
    def Iterable<Function<LeftType, ElementMatcherCondition<LeftType, RightType>>> require() {
        #[]
    }
    
    def Iterable<Function<LeftType, ElementCandidateSelector<RightType>>> select() {
        #[DEFAULT_SELECTOR]
    }
    
    def Iterable<Function<LeftType, ElementMatcherCondition<LeftType, RightType>>> match() {
        #[]
    }
}