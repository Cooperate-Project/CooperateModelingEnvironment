package de.cooperateproject.modeling.textual.xtext.runtime.matching

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass

class EvaluatorRegisterDelegate implements ElementMatcherApplicationRegisterDelegate {
    val ElementMatchingContextEvaluator evaluator
    
    new (ElementMatchingContextEvaluator evaluator) {
        this.evaluator = evaluator    
    }
    
    override <L extends EObject> evaluate(L instanceToMatch) {
        return evaluator.instantiateElementEvaluation(instanceToMatch)
    }
    
    override <L extends EObject> evaluateAs(L instanceToMatch, EClass leftType) {
        evaluator.instantiateElementEvaluation(instanceToMatch, leftType)
    }
    
}