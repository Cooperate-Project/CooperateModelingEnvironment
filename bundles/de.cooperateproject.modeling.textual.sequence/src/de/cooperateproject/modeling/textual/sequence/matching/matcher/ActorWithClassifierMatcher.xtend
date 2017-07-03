package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.Lifeline
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.UMLPackage

class ActorWithClassifierMatcher extends AbstractElementMatcherBase<Actor, Lifeline> {
    
    new () {
        super(SequencePackage.eINSTANCE.actor, UMLPackage.eINSTANCE.lifeline)
    }
    
    override acceptsAsLeft(Actor leftInstance) {
        leftInstance.typeMapping !== null
    }
    
    override match() {        
        #[
            is([el, cand | el.typeMapping.classifier == (cand.represents as Property).type]),
            is([el, cand | el.name == (cand.represents as Property).name])
        ]
    }
    
}