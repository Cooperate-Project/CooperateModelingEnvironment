package de.cooperateproject.modeling.textual.xtext.runtime.matching.issues

import org.eclipse.emf.ecore.EObject

abstract class MatchingIssue {
    val EObject elementWithIssue
    
    new(EObject elementWithIssue) {
        this.elementWithIssue = elementWithIssue
    }
}
