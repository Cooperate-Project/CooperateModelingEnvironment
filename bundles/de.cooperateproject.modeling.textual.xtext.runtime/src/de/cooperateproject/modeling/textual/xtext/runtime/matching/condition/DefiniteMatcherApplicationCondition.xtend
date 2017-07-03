package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.Match
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.NoMatch
import org.eclipse.emf.ecore.EObject

class DefiniteMatcherApplicationCondition<LeftType extends EObject, RightType extends EObject> implements ElementMatcherCondition<LeftType, RightType> {
    val ElementMatcherCondition<LeftType, RightType> nestedCondition
    
    new (ElementMatcherCondition<LeftType, RightType> nestedCondition) {
        this.nestedCondition = nestedCondition
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        nestedCondition.evaluate(config).createResult
    }
    
    private def dispatch createResult(NoMatch<LeftType> noMatch) {
        noMatch    
    }
    
    private def dispatch createResult(Match<LeftType, RightType> match) {
        MatchingResultFactory.INSTANCE.createDefinite(match.element, match.match, match.issues)
    }
    
    override prepare(ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        nestedCondition.prepare(registerDelegate, context)
    }    

}