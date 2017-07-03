package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import de.cooperateproject.modeling.textual.xtext.runtime.matching.CandidatesConfiguration
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector
import java.util.HashMap
import java.util.Map
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject
import java.util.Set
import java.util.Optional

class CandidatesConfigurationProvider<LeftType extends EObject, CandidatesType extends EObject> {
    val ElementCandidateSelector<CandidatesType> selector
    val CandidatesConfigurationPool<CandidatesType> pool
    val LeftType elementToMatch
    
    val Map<Optional<CandidatesType>, CandidatesConfiguration<CandidatesType>> selectedChoices = new HashMap
    var CandidatesConfiguration<CandidatesType> nextVal = null
    var CandidatesConfiguration<CandidatesType> currentVal = null
    
    new (LeftType elementToMatch, CandidatesConfigurationPool<CandidatesType> pool) {
        this(elementToMatch, ElementCandidateSelector.DEFAULT_SELECTOR.apply(null), pool)
    }
    
    new (LeftType elementToMatch, ElementCandidateSelector<CandidatesType> selector, CandidatesConfigurationPool<CandidatesType> pool) {
        this.selector = selector
        this.pool = pool
        this.elementToMatch = elementToMatch
    }
    
    def hasNext() {
        if (nextVal === null) {
            if (currentVal !== null && currentVal.candidateChoice.present) {
                this.candidatesPool.unregisterTemporary(this.elementToMatch, currentVal.candidateChoice.get, this)
            }
            val candidates = this.availableCandidates.toSet
            
            this.nextVal = candidates.map[Optional.of(it)].map[getConfigurationIfNotAlreadyEvaluated(it, candidates)].findFirst[isPresent]?.get
            if (this.nextVal === null) {
                this.nextVal = getConfigurationIfNotAlreadyEvaluated(Optional.empty, candidates).orElse(null)
            }
            if (currentVal !== null && currentVal.candidateChoice.present) {
                this.candidatesPool.registerTemporary(this.elementToMatch, currentVal.candidateChoice.get, this)
            }        
        }
        nextVal !== null
    }
    
    private def Optional<CandidatesConfiguration<CandidatesType>> getConfigurationIfNotAlreadyEvaluated(Optional<CandidatesType> choice, Set<CandidatesType> candidates) {
        val config = new CandidatesConfiguration<CandidatesType>() {    
            override getCandidateChoice() {
                choice
            }
            
            override getRemainingCandidates() {
                if (choice.isPresent)
                    candidates.filter[it != choice.get].toSet
                else
                    candidates.toSet
            }   
        } 
        if (selectedChoices.containsKey(choice)) {
            if (selectedChoices.get(choice) == config) return Optional.empty
        }
        Optional.of(config)
    }
    
    def next() {
        if (this.nextVal === null && !hasNext) throw new NoSuchElementException  
        if (currentVal !== null && currentVal.candidateChoice.present) {
            this.candidatesPool.unregisterTemporary(this.elementToMatch, currentVal.candidateChoice.get, this)
        }
        currentVal = nextVal
        if (currentVal.candidateChoice.present) {
            this.candidatesPool.registerTemporary(this.elementToMatch, currentVal.candidateChoice.get, this)
        }
        this.selectedChoices.put(currentVal.candidateChoice, currentVal)
        nextVal = null
        currentVal
    }
    
    def CandidatesConfiguration<CandidatesType> getCurrentConfiguration() {
        currentVal
    }
    
    def <T extends EObject> CandidatesConfigurationPool<T> getDependentCandidatesPool((CandidatesType) => Iterable<T> candidateGetter) {
        ConfigurationProviderDependentCandidatesPool.createDependentConfigurationPool(this, candidateGetter)
    }
        
    protected def Iterable<CandidatesType> getAvailableCandidates() {
        selector.getCandidates(this.candidatesPool.availableCandidates).value
    }
    
    def CandidatesConfigurationPool<CandidatesType> getCandidatesPool() {
        pool
    }
}
