package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import org.eclipse.emf.ecore.EObject

class NoMatch<RootType extends EObject> extends MatchingResult<RootType> {
    
    new(RootType element) {
        super(element)
    }
    
}