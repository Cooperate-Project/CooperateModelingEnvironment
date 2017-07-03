package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import java.util.Collections
import org.eclipse.emf.ecore.EObject

class ConfigurationProviderDependentCandidatesPool<LeftType extends EObject, BaseType extends EObject, CandidateType extends EObject> extends CandidatesConfigurationPool<CandidateType> {
    val CandidatesConfigurationProvider<? extends EObject, BaseType> baseProvider
    val (BaseType)=>Iterable<CandidateType> candidateGetter
    
    static def <L extends EObject, U extends EObject, CandidateType extends EObject> CandidatesConfigurationPool<CandidateType> createDependentConfigurationPool(
        CandidatesConfigurationProvider<L, U> baseProvider, (U)=>Iterable<CandidateType> candidateGetter) {
        new ConfigurationProviderDependentCandidatesPool(baseProvider, candidateGetter)
    }
    
    override unregisterTemporary(EObject left, EObject right, CandidatesConfigurationProvider<?,?> provider) {
        super.unregisterTemporary(left, right, provider)

        if (provider == this.baseProvider) this.allCandidates = null
    }
    
    private new(CandidatesConfigurationProvider<LeftType, BaseType> baseProvider, (BaseType)=>Iterable<CandidateType> candidateGetter) {
        super(baseProvider.candidatesPool)
        this.baseProvider = baseProvider
        this.candidateGetter = candidateGetter
    }
    
    override initializeCandidates() {
        if (baseProvider.currentConfiguration.candidateChoice.isPresent)
            candidateGetter.apply(baseProvider.currentConfiguration.candidateChoice.get)
        else
            Collections.emptySet
    }
    
}