package de.cooperateproject.modeling.textual.xtext.runtime.matching.issues

import de.cooperateproject.modeling.textual.xtext.runtime.matching.issues.MatchingIssue
import org.eclipse.emf.ecore.EObject

class NoMatchIssue extends MatchingIssue {
    
    new(EObject elementWithIssue) {
        super(elementWithIssue)
    }
    
}