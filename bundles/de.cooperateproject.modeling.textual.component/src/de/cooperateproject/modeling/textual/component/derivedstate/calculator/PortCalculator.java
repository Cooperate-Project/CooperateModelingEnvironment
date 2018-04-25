package de.cooperateproject.modeling.textual.component.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.component.component.Component;
import de.cooperateproject.modeling.textual.component.component.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for Port.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class PortCalculator extends AtomicDerivedStateProcessorBase<Port> {

	public PortCalculator() {
		super(Port.class);
	}

	@Override
	protected void applyTyped(Port object) {
		if (object.eContainer() instanceof Component) {
			Component component = (Component) object.eContainer();
			if (component.getReferencedElement() != null && object.getRealizedClassifier() != null
					&& object.getRealizedClassifier().getReferencedElement() != null && object.getName() != null) {
				org.eclipse.uml2.uml.Component umlComponent = (org.eclipse.uml2.uml.Component) component
						.getReferencedElement();
				Type umlType = (Type) object.getRealizedClassifier().getReferencedElement();
				Optional<org.eclipse.uml2.uml.Port> umlPort = Optional
						.ofNullable(umlComponent.getOwnedPort(object.getName(), umlType));

				if (umlPort.isPresent()) {
					object.setReferencedElement(umlPort.get());
				}
			}
		}

	}

	@Override
	public Collection<Class<? extends EObject>> getReplacements() {
		return Arrays.asList(UMLReferencingElement.class);
	}

}
