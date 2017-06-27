package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.sequence.sequence.SingleRegionContainer
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.CombinedFragment
import org.eclipse.uml2.uml.UMLPackage

class SingleRegionContainerMatcher extends AbstractElementMatcherBase<SingleRegionContainer, CombinedFragment> {
    
    new() {
        super(SequencePackage.eINSTANCE.singleRegionContainer, UMLPackage.eINSTANCE.combinedFragment)
    }
    
    override match() {
        #[
            matchAs(SequencePackage.eINSTANCE.combinedFragment),
            matchExists([region], [operands])
        ]
    }
    
}