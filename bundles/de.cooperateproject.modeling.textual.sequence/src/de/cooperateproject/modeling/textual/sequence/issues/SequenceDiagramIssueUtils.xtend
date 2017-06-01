package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.SingleRegionContainer

class SequenceDiagramIssueUtils {
    def dispatch retrieveUMLEvents(OrderedFragmentContainer container) {
        return []
    }
    
    def dispatch retrieveUMLEvents(SequenceDiagram container) {
        return container.referencedElement.fragments
    }
    
    def dispatch retrieveUMLMessages(OrderedFragmentContainer container) {
        return []
    }
    
    def dispatch retrieveUMLMessages(SequenceDiagram container) {
        return container.referencedElement.messages
    }
    
    def dispatch retrieveUMLMessages(SingleRegionContainer container) {
        //TODO Implement according to UML spec
        return []
    }
    
    
}