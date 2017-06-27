package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import org.eclipse.emf.ecore.EObject

class ConfigurationProviderDependentCandidatesPool<BaseType extends EObject, CandidateType extends EObject> extends CandidatesConfigurationPool<CandidateType> {
    val CandidatesConfigurationProvider<BaseType> baseProvider
    val (BaseType)=>Iterable<CandidateType> candidateGetter
    
    static def <U extends EObject, CandidateType extends EObject> CandidatesConfigurationPool<CandidateType> createDependentConfigurationPool(
        CandidatesConfigurationProvider<U> baseProvider, (U)=>Iterable<CandidateType> candidateGetter) {
        new ConfigurationProviderDependentCandidatesPool(baseProvider, candidateGetter)
    }
    
    override unregisterTemporary(EObject left, EObject right, CandidatesConfigurationProvider<?> provider) {
        super.unregisterTemporary(left, right, provider)

        if (provider == this.baseProvider) this.allCandidates = null
    }
    
    private new(CandidatesConfigurationProvider<BaseType> baseProvider, (BaseType)=>Iterable<CandidateType> candidateGetter) {
        super(baseProvider.candidatesPool)
        this.baseProvider = baseProvider
        this.candidateGetter = candidateGetter
    }
    
    override initializeCandidates() {
        candidateGetter.apply(baseProvider.currentConfiguration.candidateChoice)
    }
    
}