package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import java.util.Collections
import java.util.function.Function

class DependentCandidatesConfigurationProvider<BaseType, RightType> extends CandidatesConfigurationProvider<RightType> {
    val CandidatesConfigurationProvider<BaseType> baseProvider
    val Function<BaseType, RightType> candidateGetter
    
    static def <U, RightType> CandidatesConfigurationProvider<RightType> createDependentConfigurationProvider(
        CandidatesConfigurationProvider<U> baseProvider, Function<U, RightType> candidateGetter, Class<RightType> targetType) {
        new DependentCandidatesConfigurationProvider(baseProvider, candidateGetter, targetType)
    } 
    
    private new(CandidatesConfigurationProvider<BaseType> baseProvider, Function<BaseType, RightType> candidateGetter, Class<RightType> targetType) {
        super(targetType)
        this.baseProvider = baseProvider
        this.candidateGetter = candidateGetter
    }
    
    override protected internalCandidates() {
        Collections.singletonList(candidateGetter.apply(baseProvider.currentConfiguration.candidateChoice))
    }
    
}