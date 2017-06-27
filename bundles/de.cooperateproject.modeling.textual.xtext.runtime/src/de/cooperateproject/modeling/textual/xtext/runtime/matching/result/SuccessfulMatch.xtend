package de.cooperateproject.modeling.textual.xtext.runtime.matching.result

import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import java.util.List

class SuccessfulMatch<RootType, ResultType> extends MatchingResult<RootType> {
    val ResultType match
    val List<MatchingIssue> issues
    
    new(RootType element, ResultType match) {
        super(element)
        this.match = match
        issues = null
    }
    
    new(RootType element, ResultType match, Iterable<MatchingIssue> issues) {
        super(element)
        this.match = match
        this.issues = newArrayList(issues) 
    }
    
    def hasIssues() {
        issues !== null && !issues.empty
    }
    
    def getIssues() {
        issues
    }
    
    def getMatch() {
        match
    }
}