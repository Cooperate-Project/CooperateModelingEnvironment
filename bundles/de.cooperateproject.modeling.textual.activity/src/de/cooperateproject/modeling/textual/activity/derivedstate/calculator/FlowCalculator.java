package de.cooperateproject.modeling.textual.activity.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ControlFlow;

import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class FlowCalculator extends AtomicDerivedStateProcessorBase<Flow> {

	public FlowCalculator() {
		super(Flow.class);
	}

	@Override
	protected void applyTyped(Flow flow) {
		if (flow.getSource() != null && flow.getSource().getReferencedElement() != null && flow.getTarget() != null
				&& flow.getTarget().getReferencedElement() != null) {

			List<ActivityEdge> possibleFlows = flow.getSource().getReferencedElement().getOutgoings().stream()
					.filter(flw -> flw.getTarget().equals(flow.getTarget().getReferencedElement())).distinct()
					.collect(Collectors.toList());

			if (possibleFlows.size() == 1) {
				if (possibleFlows.get(0) != flow.getReferencedElement()) {
					flow.setReferencedElement((ControlFlow) possibleFlows.get(0));
				}
			} else {
				flow.setReferencedElement(null);
			}
		}
	}

	@Override
	public Collection<java.lang.Class<? extends EObject>> getReplacements() {
		return Arrays.asList(UMLReferencingElement.class);
	}

}
