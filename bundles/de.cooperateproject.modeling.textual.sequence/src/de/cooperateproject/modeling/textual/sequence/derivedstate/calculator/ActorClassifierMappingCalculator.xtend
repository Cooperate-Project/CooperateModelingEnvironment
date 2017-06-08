package de.cooperateproject.modeling.textual.sequence.derivedstate.calculator

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import java.util.Collections
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability

@Applicability(applicabilities=CALCULATION)
class ActorClassifierMappingCalculator extends AtomicDerivedStateProcessorBase<ActorClassifierMapping> {
    val static REPLACEMENTS = Collections.unmodifiableList(
        Collections.singletonList(UMLReferencingElement as Class<? extends EObject>)
    )
        
    new() {
        super(ActorClassifierMapping)
    }
    
    override protected applyTyped(ActorClassifierMapping object) {
        val prop = object.actor?.referencedElement?.represents
        object.referencedElement = if (prop instanceof org.eclipse.uml2.uml.Property) prop
    }
    
    override getReplacements() {
        REPLACEMENTS    
    }
    
}