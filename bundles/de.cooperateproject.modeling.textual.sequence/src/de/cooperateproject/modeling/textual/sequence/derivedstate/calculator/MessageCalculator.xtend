package de.cooperateproject.modeling.textual.sequence.derivedstate.calculator

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Property

@Applicability(applicabilities=CALCULATION)
class MessageCalculator extends AtomicDerivedStateProcessorBase<Message> {
    val static REPLACEMENTS = Collections.unmodifiableList(
        Collections.singletonList(UMLReferencingElement as Class<? extends EObject>)
    )
        
    new() {
        super(Message)
    }
    
    override protected applyTyped(Message object) {
        object.referencedElement = if (object.sendEvent !== null)
            object.sendEvent.occurenceSpecification.referencedElement?.message
            else object.arrivalEvent?.occurenceSpecification?.referencedElement?.message
    }
    
    override getReplacements() {
        REPLACEMENTS    
    }
    
}