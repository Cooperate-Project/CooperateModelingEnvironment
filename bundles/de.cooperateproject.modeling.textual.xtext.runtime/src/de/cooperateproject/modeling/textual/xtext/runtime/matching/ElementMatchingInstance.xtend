package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import java.util.HashMap
import java.util.Iterator
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationPool

class ElementMatchingInstance<LeftType extends EObject, RightType extends EObject> {
    
    var CandidatesConfigurationPool<RightType> candidatesPool
    val Map<CandidatesConfiguration<RightType>, MatchingResult<LeftType>> evaluatedMatches = new HashMap
        
    new (LeftType elementToMatch, EClass rightType) {
        this.elementToMatch = elementToMatch
        this.rightType = rightType        
    }
    
    val LeftType elementToMatch
    def LeftType getElementToMatch() {
        elementToMatch
    }
    
    val EClass rightType
    def EClass getRightType() {
        rightType
    }
    
    def void setCandidatesPool(CandidatesConfigurationPool<?> pool) {
        candidatesPool = pool
    }
    
    def getCandidatesPool() {
        candidatesPool
    }
       
    def Iterator<MatchingResult<LeftType>> evaluateWithMatcher(ElementMatcher<LeftType, RightType> matcher) {
        if (candidatesPool === null) {
            throw new IllegalStateException("The matching instance has not been initialized with a candidates provider!")
        }
        val matches = matcher.match.map[apply(this)]
        
        new Iterator<MatchingResult<LeftType>>() {
            val candidatesProvider = ElementMatchingInstance.this.candidatesPool.createConfigurationProvider(matcher.select.apply(ElementMatchingInstance.this))
            
            override hasNext() {
                candidatesProvider.hasNext(ElementMatchingInstance.this.elementToMatch)
            }
            
            override next() {
                val cand = candidatesProvider.next(ElementMatchingInstance.this.elementToMatch) as CandidatesConfiguration<RightType>
                val res = MatchingResultFactory.INSTANCE.wrap(matches.map[evaluate(cand)])
                evaluatedMatches.put(cand, res)
                res 
            }
            
        }
    }
}