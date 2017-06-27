package de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher

import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingInstance
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import java.util.function.Function
import org.eclipse.emf.ecore.EObject

import static de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector.DEFAULT_SELECTOR
import org.eclipse.emf.ecore.EClass

interface ElementMatcher<LeftType extends EObject, RightType extends EObject> {
    def boolean acceptsAsLeft(LeftType leftInstance)
    def boolean acceptsAsRight(EClass rightInstance) 
    
    def Iterable<Function<ElementMatchingInstance<LeftType, RightType>, ElementMatcherCondition<LeftType, RightType>>> require() {
        #[]
    }
    
    def (ElementMatchingInstance<LeftType, RightType>) => ElementCandidateSelector<RightType> select() {
        DEFAULT_SELECTOR
    }
    
    def Iterable<Function<ElementMatchingInstance<LeftType, RightType>, ElementMatcherCondition<LeftType, RightType>>> match() {
        #[]
    }
}