package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.ElementMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResultFactory
import java.util.HashMap
import java.util.Iterator
import java.util.Map

class ElementMatchingInstance<LeftType, RightType> {
    
    static def <L, R> getOrCreateElementMatchingInstance(ElementMatchingContext<? super L,? super R> context, L elementToMatch, CandidatesConfigurationProvider<R> candidatesProvider) {
        context.getElementMatchingInstance(elementToMatch, candidatesProvider)
    }
    
    val CandidatesConfigurationProvider<RightType> candidatesProvider
    val Map<CandidatesConfiguration<RightType>, MatchingResult<LeftType>> evaluatedMatches = new HashMap
        
    new (LeftType elementToMatch, CandidatesConfigurationProvider<RightType> candidatesProvider) {
        this.elementToMatch = elementToMatch
        this.candidatesProvider = candidatesProvider
    }
    
    val LeftType elementToMatch
    def LeftType getElementToMatch() {
        elementToMatch
    }
    
    def Iterator<MatchingResult<LeftType>> evaluateWithMatcher(ElementMatcher<LeftType, RightType> matcher) {
        val matches = matcher.match.map[apply(elementToMatch)]
        
        new Iterator<MatchingResult<LeftType>>() {
            
            override hasNext() {
                candidatesProvider.hasNext
            }
            
            override next() {
                val cand = candidatesProvider.next
                val res = MatchingResultFactory.INSTANCE.wrap(matches.map[it.evaluate(cand)])
                evaluatedMatches.put(cand, res)
                res 
            }
            
        }
    }
}