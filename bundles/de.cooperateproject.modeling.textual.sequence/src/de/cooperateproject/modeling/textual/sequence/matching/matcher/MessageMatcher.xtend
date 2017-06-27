package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.MessageOccurrenceSpecification
import org.eclipse.uml2.uml.UMLPackage

class MessageMatcher extends AbstractElementMatcherBase<Message, org.eclipse.uml2.uml.Message> {
    
    new() {
        super(SequencePackage.eINSTANCE.message, UMLPackage.eINSTANCE.message)
    }
    
    override match() {
        #[
            definiteIf(matchAs(TextualCommonsPackage.eINSTANCE.aliasedElement)),
            matches([left], [(sendEvent as MessageOccurrenceSpecification)?.covered]),
            matches([right], [(receiveEvent as MessageOccurrenceSpecification)?.covered]),
            is([el, cand | el.name == cand.name])
        ]
    }
    
}