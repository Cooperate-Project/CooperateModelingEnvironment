package de.cooperateproject.modeling.textual.xtext.runtime.matching

import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import de.cooperateproject.modeling.textual.xtext.runtime.matching.condition.ElementMatcherCondition
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject

class ElementMatcherApplication<L extends EObject, R extends EObject> {
    val ElementMatchingContext matchingContext
    val ElementMatchingInstance<L, R> instance
    val ElementMatcher<L, R> matcher
    val CandidatesConfigurationPool<R> candidatesPool
    val ElementMatcherApplicationRegisterDelegate registerDelegate
    var CandidatesConfigurationProvider<L, R> candidatesProvider
    
    val Multimap<CandidatesConfiguration<R>, MatchingResult<L>> resultMap = LinkedHashMultimap.create()
    
    val List<ElementMatcherCondition<L, R>> conditionsToMatch
    var CandidatesConfiguration<R> currentCandidate = null
    var int nextIndex = 0
    
    new (ElementMatchingInstance<L, R> instance, ElementMatcher<L, R> matcher, CandidatesConfigurationPool<R> candidatesPool, ElementMatcherApplicationRegisterDelegate registerDelegate, ElementMatchingContext context) {
        this.instance = instance
        this.matcher = matcher
        this.candidatesPool = candidatesPool       
        this.registerDelegate = registerDelegate
        this.matchingContext = context
        conditionsToMatch = new LinkedList(matcher.match.map[apply(this)])          
    }
    
    def getMatchingInstance () {
        instance
    }
    
    def getCandidatesProvider() {
        if (candidatesProvider === null) {
            candidatesProvider = this.candidatesPool.createConfigurationProvider(this.instance.elementToMatch, this.matcher.select.apply(this))
        }
        candidatesProvider
    }
    
    def canEvaluateFurtherConfiguration() {
        if (conditionsToMatch === null) throw new IllegalStateException("Before evaluating a new configuration, the evaluation has to be started.")
        this.getCandidatesProvider.hasNext
    }
    
    def startEvaluateOfNextConfiguration() {
        currentCandidate = this.getCandidatesProvider.next as CandidatesConfiguration<R>
        nextIndex = 0
        
        conditionsToMatch.forEach[prepare(this.registerDelegate, this.matchingContext)]
    }
    
    def isEvaluationOfConfigurationRunning() {
        currentCandidate !== null
    }
    
    def canEvaluateFurtherCondition() {
        nextIndex < conditionsToMatch.length    
    }
    
    def evaluateNextCondition() {
        if (conditionsToMatch === null) throw new IllegalStateException("Before evaluating a new configuration, the evaluation has to be started.")
        val cond = conditionsToMatch.get(nextIndex)
        nextIndex++
        resultMap.put(currentCandidate, cond.evaluate(currentCandidate))
    }
        
    def isSimilarApplication(ElementMatchingInstance<?,?> instance, ElementMatcher<?,?> matcher) {
        this.instance === instance && this.matcher === matcher
    }
    
    def getResultDelegate() {
        return new ElementMatcherApplicationResultDelegate<L>() {
            
            override hasResult() {
                resultMap.containsKey(currentCandidate)
            }
            
            override getResult() {
                if (!hasResult) throw new IllegalStateException("Cannot request results of an application which has not been evaluated yet.")
                MatchingResultFactory.INSTANCE.wrap(resultMap.get(currentCandidate))
            }
            
        }
    }
    
}