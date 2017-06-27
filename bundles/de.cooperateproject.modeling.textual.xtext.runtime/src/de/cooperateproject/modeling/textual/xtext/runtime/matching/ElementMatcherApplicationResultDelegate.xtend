package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult

interface ElementMatcherApplicationResultDelegate<L> { 
    def boolean hasResult()
    
    def MatchingResult<L> getResult()
}