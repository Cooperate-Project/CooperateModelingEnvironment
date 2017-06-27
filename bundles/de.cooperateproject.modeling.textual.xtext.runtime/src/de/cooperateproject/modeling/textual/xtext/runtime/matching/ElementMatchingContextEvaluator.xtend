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
    
    def <L extends EObject, R extends EObject> instantiateElementEvaluation(L elementToMatch) {
        instantiateElementEvaluation(elementToMatch, elementToMatch.eClass)
    }
    
    def <L extends EObject, R extends EObject> instantiateElementEvaluation(L elementToMatch, EClass matchAs) {
        val ElementMatcher<L, EObject> mat = matchingContext.findMatcher(elementToMatch, matchAs) as ElementMatcher<L, EObject>
        val inst = matchingContext.getElementMatchingInstance(elementToMatch);
        
        var application = evaluationQueue.findFirst[isSimilarApplication(inst, mat)] as ElementMatcherApplication<L, EObject>
        if (application !== null) {
            if (application.evaluationRunning) throw new UnsupportedOperationException("Circular dependency during evaluation")
            evaluationQueue.remove(application)
        } else {
            application = new ElementMatcherApplication(inst, mat)
        }
        evaluationQueue.addFirst(application)
        
        application => [app |
            mat.match.map[apply(inst)].forEach[prepare(app.getApplicationRegisterDelegate, matchingContext)]    
        ]
        
        application.resultDelegate
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
        
        if (application.canEvaluateFurtherConfiguration) application.evaluateNextConfiguration
        else evaluationQueue.removeFirst         
    }
    
    def <L extends EObject> ElementMatcherApplicationRegisterDelegate getApplicationRegisterDelegate(ElementMatcherApplication<L, ? extends EObject> parent) {
        new EvaluatorRegisterDelegate(this)
    } 
}