package de.cooperateproject.modeling.textual.xtext.runtime.matching.issues

import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import org.eclipse.emf.ecore.EObject

class WrongOrderIssue extends MatchingIssue {
    
    EObject rightElement
    
    int difference
    
    new(EObject left, EObject right, int difference) {
        super(left)
        this.rightElement = right
        this.difference = difference
    }
}