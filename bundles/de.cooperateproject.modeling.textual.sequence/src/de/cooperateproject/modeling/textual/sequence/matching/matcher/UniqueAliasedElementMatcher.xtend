package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.NamedElement

class UniqueAliasedElementMatcher extends AbstractElementMatcherBase<AliasedElement, NamedElement> {
    
    new () {
        super(AliasedElement, NamedElement)
    }
    
    override select() {
        #[
            id([el, cand | !el.alias.nullOrEmpty && el.alias == cand.nameExpression?.name])
        ]
    }
    
}