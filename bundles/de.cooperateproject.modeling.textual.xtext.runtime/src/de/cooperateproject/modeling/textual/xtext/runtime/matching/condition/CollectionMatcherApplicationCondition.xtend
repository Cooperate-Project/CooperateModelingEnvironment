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
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject

class CollectionMatcherApplicationCondition<LeftType extends EObject, RightType extends EObject, T extends EObject, U extends EObject> implements ElementMatcherCondition<LeftType, RightType> {
    val ElementMatchingInstance<LeftType, RightType> matchingInstance
    val Iterable<T> leftElements
    val CandidatesConfigurationPool<U> candidatesPool
    val Map<T, ElementMatcherApplicationResultDelegate<T>> resultDelegates = new HashMap
    
    new (ElementMatchingInstance<LeftType, RightType> matchingInstance, Iterable<T> leftElements, CandidatesConfigurationPool<U> candidatesPool) {
        this.matchingInstance = matchingInstance
        this.candidatesPool = candidatesPool
        this.leftElements = leftElements
    }
    
    override evaluate(CandidatesConfiguration<RightType> config) {
        MatchingResultFactory.INSTANCE.wrap(resultDelegates.values.map[result.createResult(config)])
    }
    
    private def dispatch createResult(NoMatch<T> noMatch, CandidatesConfiguration<RightType> config) {
        MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch, config.candidateChoice, #[new NoMatchIssue(noMatch.element)])
    }
    
    private def dispatch createResult(SuccessfulMatch<T, U> match, CandidatesConfiguration<RightType> config) {
        MatchingResultFactory.INSTANCE.create(matchingInstance.elementToMatch, config.candidateChoice, match.issues)
    }
        
    override prepare(ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        leftElements.forEach[
            val instance = context.getElementMatchingInstance(it)
            instance.candidatesPool = this.candidatesPool
            resultDelegates.put(it, registerDelegate.evaluate(it))    
        ]
        
    }

}