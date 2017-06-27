package de.cooperateproject.modeling.textual.xtext.runtime.matching.condition

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationRegisterDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatcherApplicationResultDelegate
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingInstance
import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.NoMatchIssue
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.NoMatch
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.SuccessfulMatch
import org.eclipse.emf.ecore.EObject

class MatchExistsCondition<LeftType extends EObject, RightType extends EObject, T extends EObject, U extends EObject> implements ElementMatcherCondition<LeftType, RightType> {
    val ElementMatchingInstance<LeftType, RightType> matchingInstance
    val T leftElement
    val CandidatesConfigurationPool<U> candidatesPool
    var ElementMatcherApplicationResultDelegate<EObject> resultDelegate = null
    
    new (ElementMatchingInstance<LeftType, RightType> matchingInstance, T leftElement, CandidatesConfigurationPool<U> candidatesPool) {
        this.matchingInstance = matchingInstance
        this.candidatesPool = candidatesPool
        this.leftElement = leftElement
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        resultDelegate.result.createResult(config)
    }
    
    private def dispatch createResult(NoMatch<EObject> noMatch, CandidatesConfiguration<RightType> config) {
        MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch, config.candidateChoice, #[new NoMatchIssue(noMatch.element)])
    }
    
    private def dispatch createResult(SuccessfulMatch<EObject, EObject> match, CandidatesConfiguration<RightType> config) {
        MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch, config.candidateChoice, match.issues)
    }
        
    override prepare(ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        val instance = context.getElementMatchingInstance(leftElement)
        resultDelegate = registerDelegate.evaluate(matchingInstance.elementToMatch)
    }
    
}