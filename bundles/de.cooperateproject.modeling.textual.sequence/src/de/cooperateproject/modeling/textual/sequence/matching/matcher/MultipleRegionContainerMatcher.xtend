package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.sequence.sequence.MultipleRegionContainer
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage

class MultipleRegionContainerMatcher extends AbstractElementMatcherBase<MultipleRegionContainer, CombinedFragment> {
    
    new() {
        super(MultipleRegionContainer, CombinedFragment)
    }
    
    override match() {
        #[
            matchAs(SequencePackage.eINSTANCE.combinedFragment),
            defer(SequencePackage.eINSTANCE.multipleRegionContainer_Regions)            
        ]
    }
    
}