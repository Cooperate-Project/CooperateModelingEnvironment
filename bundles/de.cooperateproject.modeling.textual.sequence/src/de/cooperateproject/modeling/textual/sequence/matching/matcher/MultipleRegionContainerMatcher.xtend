package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.MultipleRegionContainer
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.CombinedFragment
import org.eclipse.uml2.uml.UMLPackage

class MultipleRegionContainerMatcher extends AbstractElementMatcherBase<MultipleRegionContainer, CombinedFragment> {
    
    new() {
        super(SequencePackage.eINSTANCE.multipleRegionContainer, UMLPackage.eINSTANCE.combinedFragment)
    }
    
    override match() {
        #[
            matchAs(SequencePackage.eINSTANCE.combinedFragment),
            matchesExist([regions], [operands])            
        ]
    }
    
}