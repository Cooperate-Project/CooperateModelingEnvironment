package de.cooperateproject.modeling.textual.activity.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.ActivityNode;

import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.activity.act.Node;
import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

@Applicability(applicabilities = INITIALIZATION)
public class FlowInitializer extends AtomicDerivedStateProcessorBase<Flow> {

	public FlowInitializer() {
		super(Flow.class);
	}

	@Override
	protected void applyTyped(Flow object) {
		if (object.getReferencedElement() != null) {
			UMLReferencingElementFinder elementFinder = UMLReferencingElementFinder
					.create(EcoreUtil.getRootContainer(object));
			if (!object.isSetSource()) {
				elementFinder.findElement(object.getReferencedElement().getSource(), getNodeClassifier())
						.ifPresent(object::setSource);
			}
			if (!object.isSetTarget()) {
				elementFinder.findElement(object.getReferencedElement().getTarget(), getNodeClassifier())
						.ifPresent(object::setTarget);
			}
		}

	}

	@SuppressWarnings("unchecked")
	private static Class<Node<ActivityNode>> getNodeClassifier() {
		return (Class<Node<ActivityNode>>) (Class<?>) Node.class;
	}

}
