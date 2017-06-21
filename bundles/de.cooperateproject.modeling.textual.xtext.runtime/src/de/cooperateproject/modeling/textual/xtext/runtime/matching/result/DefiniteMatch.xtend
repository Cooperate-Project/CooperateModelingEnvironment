package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import de.cooperateproject.modeling.textual.xtext.runtime.matching.MatchingIssue

class DefiniteMatch<RootType, ResultType> extends SuccessfulMatch<RootType, ResultType> {
    
    new(RootType element, ResultType match) {
        super(element, match)
    }
    
    new(RootType element, ResultType match, Iterable<MatchingIssue> issues) {
        super(element, match, issues)
    }
    
}