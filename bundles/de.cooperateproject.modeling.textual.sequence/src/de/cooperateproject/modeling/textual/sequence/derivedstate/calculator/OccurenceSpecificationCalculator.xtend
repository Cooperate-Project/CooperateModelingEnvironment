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
        val alternatives = (spec.eContainer as UMLReferencingElement<? extends NamedElement>)?.referencedElement.alternatives
        val matches = newArrayList(); 
        alternatives.map[if (!spec.name.nullOrEmpty && spec.name == it.name) matches += it; it]
                    .forEach[if (!spec.alias.nullOrEmpty && spec.alias == it.nameExpression.name) matches += it]
        (spec as OccurenceSpecification<OccurrenceSpecification>).referencedElement = if(matches.size == 1) matches.get(0)   
    }
    
    private def dispatch getAlternatives(Interaction container) {
        container.fragments.filter(OccurrenceSpecification)
    }
    
    private def dispatch getAlternatives(InteractionOperand container) {
        container.fragments.filter(OccurrenceSpecification)
    }
    
    override getReplacements() {
        REPLACES
    }
    
}