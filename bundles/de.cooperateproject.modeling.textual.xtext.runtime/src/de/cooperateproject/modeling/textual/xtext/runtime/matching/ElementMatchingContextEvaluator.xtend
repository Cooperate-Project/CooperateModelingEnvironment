package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import java.util.Deque
import java.util.LinkedList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

class ElementMatchingContextEvaluator {
    val ElementMatchingContext matchingContext
    val Deque<ElementMatcherApplication<? extends EObject, ? extends EObject>> evaluationQueue = new LinkedList
    
    new (ElementMatchingContext context) {
        this.matchingContext = context
    }
    
    def <L extends EObject, R extends EObject> ElementMatcherApplicationResultDelegate<L> instantiateElementEvaluation(L elementToMatch) {
        instantiateElementEvaluation(elementToMatch, elementToMatch.eClass)
    }
    
    def <L extends EObject, R extends EObject> ElementMatcherApplicationResultDelegate<L> instantiateElementEvaluation(L elementToMatch, EClass matchAs) {
        val ElementMatcher<L, EObject> mat = matchingContext.findMatcher(elementToMatch, matchAs) as ElementMatcher<L, EObject> 
        val inst = matchingContext.getElementMatchingInstance(elementToMatch);
        
        var application = evaluationQueue.findFirst[isSimilarApplication(inst, mat)] as ElementMatcherApplication<L, EObject>
        if (application !== null) {
            evaluationQueue.remove(application)
        } else {
            application = inst.evaluateWithMatcher(mat, new EvaluatorRegisterDelegate(this), matchingContext)
        }
        evaluationQueue.addFirst(application)
        
        application.resultDelegate
    }
    
    def boolean isEvaluationFinished() {
        return evaluationQueue.empty
    }
    
    def evaluateNext() {
        if (evaluationFinished) return
        val application = evaluationQueue.peekFirst
        
        if (application.isEvaluationOfConfigurationRunning && !application.canEvaluateFurtherCondition) {
            matchingContext.appendMatchingResult(application.resultDelegate.result)
        }
        
        if (application.isEvaluationOfConfigurationRunning && application.canEvaluateFurtherCondition) {
            application.evaluateNextCondition
        } else if (application.canEvaluateFurtherConfiguration) {
            application.startEvaluateOfNextConfiguration
        }
        
        else evaluationQueue.removeFirst         
    }
}