package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.sequence.sequence.SingleRegionContainer
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.CombinedFragment

class SingleRegionContainerMatcher extends AbstractElementMatcherBase<SingleRegionContainer, CombinedFragment> {
    
    new() {
        super(SingleRegionContainer, CombinedFragment)
    }
    
    override match() {
        #[
            matchAs(SequencePackage.eINSTANCE.combinedFragment),
            defer(SequencePackage.eINSTANCE.singleRegionContainer_Region)            
        ]
    }
    
}