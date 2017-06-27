package de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher

import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplication
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

import static de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector.DEFAULT_SELECTOR

interface ElementMatcher<LeftType extends EObject, RightType extends EObject> {
    def boolean acceptsAsLeft(LeftType leftInstance)
    def boolean acceptsAsRight(EClass rightInstance) 
    
    def (ElementMatcherApplication<LeftType, RightType>) => ElementCandidateSelector<RightType> select() {
        DEFAULT_SELECTOR
    }
    
    def Iterable<(ElementMatcherApplication<LeftType, RightType>) =>ElementMatcherCondition<LeftType, RightType>> match() {
        #[]
    }
}