package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Attribute} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class PortInitializer extends AtomicDerivedStateProcessorBase<Port> {

	public PortInitializer() {
		super(Port.class);
	}

	@Override
	protected void applyTyped(Port object) {
		if (object.getReferencedElement() != null) {
			 org.eclipse.uml2.uml.Port umlPort = object.getReferencedElement();
			 Type umlType = umlPort.getType();
			if(umlType != null) {
				UMLReferencingElementFinder finder = UMLReferencingElementFinder
						.create(EcoreUtil.getRootContainer(object));
				Optional<Classifier> type = finder.findElement(umlType, Classifier.class);
				if (type.isPresent())
					object.setRealizedClassifier(type.get());
			}
			
			
		}

	}
	
}
