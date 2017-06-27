package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import java.util.HashMap
import java.util.LinkedList
import java.util.Map
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.xtext.runtime.matching.ElementCandidateSelector

abstract class CandidatesConfigurationPool<CandidatesType extends EObject> {
    abstract def Iterable<CandidatesType> initializeCandidates()
    
    var protected LinkedList<CandidatesType> allCandidates = new LinkedList
    var protected LinkedList<CandidatesType> availableCandidates = new LinkedList
    
    val Map<EObject, EObject> fixedMappings
    val Map<EObject, Pair<EObject, CandidatesConfigurationProvider<?>>> temporaryMappings
    val Map<EObject, CandidatesConfigurationPool<?>> nestedPoolAllocations
    val Optional<CandidatesConfigurationPool<?>> parent 
    
    new () {
        this.parent = Optional.empty    
        this.temporaryMappings = new HashMap
        this.nestedPoolAllocations = new HashMap
        this.fixedMappings = new HashMap
    }
    
    new (CandidatesConfigurationPool<?> parent) {
        this.parent = Optional.of(parent)
        this.fixedMappings = parent.fixedMappings    
        this.temporaryMappings = parent.temporaryMappings
        this.nestedPoolAllocations = parent.nestedPoolAllocations
    }
    
    
    def <T extends EObject> CandidatesConfigurationPool<T> registerCandidatesSet(Iterable<T> candidates) {
        val result = new CandidatesConfigurationPool<T>(this) {
            val candInternal = newArrayList() => [addAll(candidates)]
            override initializeCandidates() {
                candInternal
            }
        }
        candidates.forEach[nestedPoolAllocations.put(it, result)]
        result
    }
    
    def void registerTemporary(EObject left, EObject right, CandidatesConfigurationProvider<?> provider) {
        if (parent.isPresent) {
            parent.get.registerTemporary(left, right, provider)
        } else {
            temporaryMappings.put(left, right -> provider)
        }
        if (availableCandidates.contains(right)) availableCandidates.remove(right)
    }
    
    def void unregisterTemporary(EObject left, EObject right, CandidatesConfigurationProvider<?> provider) {
        if (parent.isPresent) {
            parent.get.unregisterTemporary(left, right, provider)
        } else {
            temporaryMappings.remove(left)
        }
        
        if (allCandidates.contains(right)) availableCandidates.add(right as CandidatesType)
    }
    
    def void registerDefinite(EObject left, EObject right) {
        val alreadyRegistered = fixedMappings.put(left, right as CandidatesType)
        if (availableCandidates.contains(right)) availableCandidates.remove(right)    
        if (alreadyRegistered != right) {
            throw new IllegalStateException("Conflicting definite register attempts")
        }       
    }
    
    
    def Iterable<CandidatesType> getAvailableCandidates() {
        if (availableCandidates === null) {
            availableCandidates = new LinkedList() => [addAll(allAvailableCandidates)] 
        }
        availableCandidates
    }
    
    def Iterable<CandidatesType> getAllAvailableCandidates() {
        if (allCandidates === null) {
            allCandidates = new LinkedList() => [addAll(initializeCandidates)]
        }
        allCandidates
    }
    
    def CandidatesConfigurationProvider<CandidatesType> createConfigurationProvider() {
        new CandidatesConfigurationProvider(this)
    }
    
    def CandidatesConfigurationProvider<CandidatesType> createConfigurationProvider(ElementCandidateSelector<CandidatesType> selector) {
        new CandidatesConfigurationProvider(selector, this)
    }
    
    
}