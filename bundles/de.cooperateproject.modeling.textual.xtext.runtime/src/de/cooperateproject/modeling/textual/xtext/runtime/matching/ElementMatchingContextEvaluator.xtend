package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import java.util.Deque
import java.util.LinkedList
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import java.util.Iterator

class ElementMatchingContextEvaluator<LeftBase, RightBase> {
    protected static class MatcherApplication<L, R> {
        val ElementMatchingInstance<L, R> instance
        val ElementMatcher<L, R> matcher
        var Iterator<MatchingResult<L>> evaluator = null
        
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
    }
    
    val ElementMatchingContext<?,?> matchingContext
    val Deque<MatcherApplication<? extends LeftBase, ? extends RightBase>> evaluationQueue = new LinkedList
    
    new (ElementMatchingContext<?,?> context) {
        this.matchingContext = context
    }
    
    def <R extends RightBase> evaluateElement(LeftBase l, Class<R> matchToType) {
        val mat = matchingContext.getMatcher(l.class as Class<LeftBase>, matchToType)
        val inst = matchingContext.getElementMatchingInstance(l, matchToType);
        
        var application = evaluationQueue.findFirst[it.instance == inst && it.matcher == mat]
        if (application !== null) {
            if (application.evaluator !== null) throw new UnsupportedOperationException("Circular dependency during evaluation")
            evaluationQueue.remove(application)
        } else {
            application = new MatcherApplication(inst, mat)
        }
        evaluationQueue.addFirst(application)
    }
    
    def boolean isEvaluationFinished() {
        return evaluationQueue.empty
    }
    
    def evaluateNext() {
        if (evaluationFinished) return
        val application = evaluationQueue.peekFirst
        
        if (!application.evaluationRunning) {
            application.startEvaluation
        }
        
        if (application.evaluator.hasNext) application.evaluator.next
        else evaluationQueue.removeFirst         
    }
}