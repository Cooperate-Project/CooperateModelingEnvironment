package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import java.util.Iterator
import org.eclipse.emf.ecore.EObject

class ElementMatcherApplication<L extends EObject, R extends EObject> {
    val ElementMatchingInstance<L, R> instance
    val ElementMatcher<L, R> matcher
    var Iterator<MatchingResult<L>> evaluator = null
    var MatchingResult<L> currentResult = null
    
    new (ElementMatchingInstance<L, R> instance, ElementMatcher<L, R> matcher) {
        this.instance = instance
        this.matcher = matcher                 
    }
    
    def isEvaluationRunning() {
        evaluator !== null
    }
    
    def startEvaluation() {
        evaluator = instance.evaluateWithMatcher(matcher)
    }
    
    def evaluateNextConfiguration() {
        if (!isEvaluationRunning) throw new IllegalStateException("Before evaluating a new configuration, the evaluation has to be started.")
        currentResult = evaluator.next
    }
    
    def canEvaluateFurtherConfiguration() {
        if (!isEvaluationRunning) throw new IllegalStateException("Before evaluating a new configuration, the evaluation has to be started.")
        evaluator.hasNext
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