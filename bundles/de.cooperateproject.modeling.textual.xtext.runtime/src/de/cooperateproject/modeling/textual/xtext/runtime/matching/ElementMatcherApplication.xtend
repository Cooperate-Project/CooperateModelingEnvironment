package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import org.eclipse.emf.ecore.EObject

class ElementMatcherApplication<L extends EObject, R extends EObject> {
    val ElementMatchingInstance<L, R> instance
    val ElementMatcher<L, R> matcher
    val CandidatesConfigurationPool<R> candidatesPool
    var CandidatesConfigurationProvider<R> candidatesProvider
    
    var MatchingResult<L> currentResult = null
    
    Iterable<ElementMatcherCondition<L, R>> conditionsToMatch
    
    new (ElementMatchingInstance<L, R> instance, ElementMatcher<L, R> matcher, CandidatesConfigurationPool<R> candidatesPool) {
        this.instance = instance
        this.matcher = matcher
        this.candidatesPool = candidatesPool                 
    }
    
    def isEvaluationRunning() {
        currentResult !== null
    }
    
    def startEvaluation() {
        conditionsToMatch = matcher.match.map[apply(this)]    
    }
    
    def getMatchingInstance () {
        instance
    }
    
    def getCandidatesProvider() {
        if (candidatesProvider === null) {
            candidatesProvider = this.candidatesPool.createConfigurationProvider(this.matcher.select.apply(this))
        }
        candidatesProvider
    }
    
    def evaluateNextConfiguration() {
        if (!isEvaluationRunning) throw new IllegalStateException("Before evaluating a new configuration, the evaluation has to be started.")
        
        val cand = candidatesProvider.next(instance.elementToMatch) as CandidatesConfiguration<R>
        currentResult = MatchingResultFactory.INSTANCE.wrap(conditionsToMatch.map[evaluate(cand)])
    }
    
    def canEvaluateFurtherConfiguration() {
        if (!isEvaluationRunning) throw new IllegalStateException("Before evaluating a new configuration, the evaluation has to be started.")
        candidatesProvider.hasNext(instance.elementToMatch)
    }
    
    def isSimilarApplication(ElementMatchingInstance<?,?> instance, ElementMatcher<?,?> matcher) {
        this.instance === instance && this.matcher === matcher
    }
    
    def getResultDelegate() {
        return new ElementMatcherApplicationResultDelegate<L>() {
            
            override hasResult() {
                currentResult !== null
            }
            
            override getResult() {
                if (!hasResult) throw new IllegalStateException("Cannot request results of an application which has not been evaluated yet.")
                currentResult
            }
            
        }
    }
    
}