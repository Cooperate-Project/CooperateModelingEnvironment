package de.cooperateproject.modeling.textual.sequence.derivedstate.calculator

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.ImplicitMessageOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.OccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.util.MessageMatcher
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Interaction
import org.eclipse.uml2.uml.InteractionOperand
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.OccurrenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.DestructionOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import org.eclipse.uml2.uml.DestructionOccurrenceSpecification

@Applicability(applicabilities=CALCULATION)
class OccurenceSpecificationCalculator extends AtomicDerivedStateProcessorBase<OccurenceSpecification<? extends OccurrenceSpecification>> {
    val static REPLACES = Collections.unmodifiableList(
        Collections.singletonList(UMLReferencingElement as Class<? extends EObject>)
    )
    
    new() {
        super(OccurenceSpecification as Class)
    }
    
    override protected applyTyped(OccurenceSpecification<? extends OccurrenceSpecification> object) {
         object.handleElement
    }
    
    private def dispatch handleElement(ImplicitMessageOccurenceSpecification spec) {
        val msg = spec.eContainer as Message
        val container = msg.eContainer
        val mm = new MessageMatcher(container as UMLReferencingElement<? extends NamedElement>)
        val refElement = if (spec.isArrival) mm.getReceiveEventOccurenceSpecification(msg)
            else if (spec.isSend) mm.getSendEventOccurenceSpecification(msg);
        spec.referencedElement = refElement
    }
    
    private def dispatch handleElement(AliasedElement spec) {
        if ((spec as Fragment).containingSequence === null || ((spec as Fragment).containingSequence as UMLReferencingElement<?>).referencedElement === null) return;
        val alternatives = (spec as Fragment).containingSequence.UMLFragmentSequence.filter(OccurrenceSpecification)
        val matches = newArrayList(); 
        alternatives.map[if (!spec.name.nullOrEmpty && spec.name == it.name) matches += it; it]
                    .forEach[if (!spec.alias.nullOrEmpty && spec.alias == it.nameExpression.name) matches += it]
        (spec as OccurenceSpecification<OccurrenceSpecification>).referencedElement = if(matches.size == 1) matches.get(0)   
    }
    
    private def dispatch handleElement(DestructionOccurenceSpecification spec) {
        if (spec.containingSequence === null || (spec.containingSequence as UMLReferencingElement<?>).referencedElement === null) return;
        val alternatives = spec.containingSequence.UMLFragmentSequence.filter(DestructionOccurrenceSpecification)
        val matches = newArrayList(); 
        alternatives.forEach[if (spec.target.referencedElement == it.covereds.get(0)) matches += it]
        spec.referencedElement = if(matches.size == 1) matches.get(0)  
    }
    
    override getReplacements() {
        REPLACES
    }
    
}