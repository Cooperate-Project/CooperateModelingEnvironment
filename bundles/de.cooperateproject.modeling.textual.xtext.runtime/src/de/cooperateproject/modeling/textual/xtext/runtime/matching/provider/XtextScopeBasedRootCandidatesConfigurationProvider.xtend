package de.cooperateproject.modeling.textual.xtext.runtime.matching.provider

import com.google.common.base.Predicates
import com.google.common.collect.Sets
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import java.util.Collections
import java.util.function.Function
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource

class XtextScopeBasedRootCandidatesConfigurationProvider extends CandidatesConfigurationProvider<Void> {
    val IGlobalScopeTypeQueryProvider scopeProvider
    val Resource resource
    val Iterable<EPackage> registeredPackages
    
    new (IGlobalScopeTypeQueryProvider scopeProvider, Resource resource, Iterable<EPackage> registeredPackages) {
        super(Void)
        this.scopeProvider = scopeProvider
        this.resource = resource
        this.registeredPackages = registeredPackages
    }
    
    override <T> getDependentCandidatesProvider(Function<Void, Iterable<T>> candidateGetter, Class<T> candidateType) {
        val eclass = registeredPackages.map[it.getEClassifier(candidateType.name)].findFirst[it !== null && it instanceof EClass] as EClass 
        new CandidatesConfigurationProvider<T>(candidateType) {
            
            override protected internalCandidates() {
                Sets.newHashSet(scopeProvider
                    .queryScope(XtextScopeBasedRootCandidatesConfigurationProvider.this.resource, true, eclass, Predicates.alwaysTrue())
                    .getAllElements()).map[it.EObjectOrProxy].filter(candidateType)       
            }
        }
        
    }
    
    override protected internalCandidates() {
        return Collections.emptyList
    }
    
}