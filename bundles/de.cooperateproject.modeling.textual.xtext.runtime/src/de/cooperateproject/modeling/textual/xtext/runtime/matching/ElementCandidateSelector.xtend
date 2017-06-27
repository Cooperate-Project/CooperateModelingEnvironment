package de.cooperateproject.modeling.textual.xtext.runtime.matching

import java.util.Collections
import java.util.function.Function

class ElementCandidateSelector<RightType> {
    public static def <U, T> (U)=>ElementCandidateSelector<T> DEFAULT_SELECTOR() {
         [U u | new ElementCandidateSelector<T> {           
            override protected match(T match) {
                true
            }
        }]
    }
    
    protected def boolean matchDefinite(RightType match) {
        false
    }
    
    protected def boolean mustMatchDefinite() {
        false
    }
    
    protected def boolean match(RightType match) {
        false
    }
    
    def Pair<Boolean, Iterable<RightType>> getCandidates(Iterable<RightType> unfilteredCandidates) {
        val result = unfilteredCandidates.findFirst[matchDefinite]
        if (result !== null) {
            true -> Collections.singletonList(result)
        } else {
            false ->
                if (mustMatchDefinite) Collections.emptyList
                else unfilteredCandidates.filter[match]
        }
    }
}