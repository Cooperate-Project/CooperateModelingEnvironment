package de.cooperateproject.modeling.textual.activity.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.uml2.uml.ControlFlow;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.activity.act.Node;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

@Applicability(applicabilities = CLEANING)
public class FlowRemover extends AtomicDerivedStateProcessorBase<Flow> {

	public FlowRemover() {
		super(Flow.class);
	}

	@Override
	protected void applyTyped(Flow object) {
		if (object.getReferencedElement() != null) {
			if (Optional.ofNullable(object.getReferencedElement()).map(ControlFlow::getSource).orElse(null) == Optional
					.ofNullable(object.getSource()).map(Node::getReferencedElement).orElse(null)) {
				object.eUnset(ActPackage.Literals.FLOW__SOURCE);
			}
			if (Optional.ofNullable(object.getReferencedElement()).map(ControlFlow::getTarget).orElse(null) == Optional
					.ofNullable(object.getTarget()).map(Node::getReferencedElement).orElse(null)) {
				object.eUnset(ActPackage.Literals.FLOW__TARGET);
			}
		}
	}

}
