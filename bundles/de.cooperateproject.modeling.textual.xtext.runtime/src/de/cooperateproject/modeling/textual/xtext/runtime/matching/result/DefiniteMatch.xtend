package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import org.eclipse.emf.ecore.EObject

class DefiniteMatch<RootType extends EObject, ResultType extends EObject> extends Match<RootType, ResultType> {
    
    new(RootType element, ResultType match) {
        super(element, match)
    }
    
    new(RootType element, ResultType match, Iterable<MatchingIssue> issues) {
        super(element, match, issues)
    }
    
}