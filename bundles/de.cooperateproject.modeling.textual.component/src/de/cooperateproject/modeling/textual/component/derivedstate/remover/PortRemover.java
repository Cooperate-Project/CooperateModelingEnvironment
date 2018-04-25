package de.cooperateproject.modeling.textual.component.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.component.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.component.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Port} elements.
 */
@Applicability(applicabilities = CLEANING)
public class PortRemover extends AtomicDerivedStateProcessorBase<Port> {

	/**
	 * Instantiates the remover.
	 */
	public PortRemover() {
		super(Port.class);
	}

	@Override
	protected void applyTyped(Port object) {
		
		Optional<org.eclipse.uml2.uml.Port> umlPort = Optional.ofNullable(object.getReferencedElement());
		
		if (umlPort.map(port -> port.isConjugated() == object.isConjugated()).orElse(false)) {
            object.eUnset(ComponentPackage.Literals.PORT__CONJUGATED);
        } else if (!object.isSetConjugated() && undergoesAutomatedIssueResolution(object)) {
            object.setConjugated(false);
        }
		
	}

}
