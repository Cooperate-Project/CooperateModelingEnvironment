package de.cooperateproject.modeling.textual.sequence.matching

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.sequence.matching.matcher.CombinedFragmentMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.MessageMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.MultipleRegionContainerMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.OrderedFragmentContainerMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.SingleRegionContainerMatcher
import de.cooperateproject.modeling.textual.sequence.matching.matcher.UniqueAliasedElementMatcher
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.MultipleRegionContainer
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.SingleRegionContainer
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementMatchingContext
import de.cooperateproject.modeling.textual.xtext.runtime.matching.provider.CandidatesConfigurationProvider
import org.eclipse.uml2.uml.Interaction

class SequenceMatchingContext extends ElementMatchingContext<SequenceDiagram, Interaction> {
    
    new(CandidatesConfigurationProvider<Interaction> rootCandidatesProvider) {
        super(rootCandidatesProvider)
    }
    
    override def initializeMatchers() {
        this.registeredMatchers.put(Message, new MessageMatcher)
        this.registeredMatchers.put(CombinedFragment, new CombinedFragmentMatcher)
        this.registeredMatchers.put(MultipleRegionContainer, new MultipleRegionContainerMatcher)
        this.registeredMatchers.put(SingleRegionContainer, new SingleRegionContainerMatcher)
        this.registeredMatchers.put(AliasedElement, new UniqueAliasedElementMatcher)
        this.registeredMatchers.put(OrderedFragmentContainer, new OrderedFragmentContainerMatcher)
    }   
}