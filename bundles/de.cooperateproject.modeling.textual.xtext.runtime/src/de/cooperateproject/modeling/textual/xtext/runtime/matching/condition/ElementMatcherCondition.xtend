package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import org.eclipse.emf.ecore.EObject

interface ElementMatcherCondition<LeftType extends EObject, RightType> {
    def MatchingResult<LeftType> evaluate(CandidatesConfiguration<RightType> config)
    
    def void prepare(ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) 
}
