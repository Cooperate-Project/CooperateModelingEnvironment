package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import java.util.Set
import java.util.HashSet

class InitialCandidatesConfigurationProvider<RightType> extends CandidatesConfigurationProvider<RightType> {
    val Set<RightType> candidates
    
    new (Iterable<RightType> initialCandidates, Class<RightType> candidateType) {
        super(candidateType)
        this.candidates = new HashSet() => [
            addAll(initialCandidates)
        ]
    }
    
    override protected internalCandidates() {
        candidates
    }    
}
