package de.cooperateproject.modeling.textual.xtext.runtime.matching

import de.cooperateproject.modeling.textual.xtext.runtime.matching.result.MatchingResult
import org.eclipse.emf.ecore.EObject

interface ElementMatcherApplicationResultDelegate<L extends EObject> { 
    def boolean hasResult()
    
    def MatchingResult<L> getResult()
}