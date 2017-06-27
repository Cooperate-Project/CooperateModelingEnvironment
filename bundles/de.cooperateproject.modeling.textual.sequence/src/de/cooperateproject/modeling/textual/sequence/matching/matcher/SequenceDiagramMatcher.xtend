package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.Interaction
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import org.eclipse.uml2.uml.UMLPackage

class SequenceDiagramMatcher extends AbstractElementMatcherBase<SequenceDiagram, Interaction> {

    new () {
       super(SequencePackage.eINSTANCE.sequenceDiagram, UMLPackage.eINSTANCE.interaction) 
    }
    
    override match() {
        #[
            is([diag, cand| diag.title == cand.name]),
            matchesExist([actors], [lifelines]),
            matchesExist([fragments], [fragments])
        ]
    }
    
}