package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.component.component.Attribute;
import de.cooperateproject.modeling.textual.component.component.Classifier;
import de.cooperateproject.modeling.textual.component.component.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.component.Interface;
import de.cooperateproject.modeling.textual.component.component.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link ConnectorEnd} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ConnectorEndInitializer extends AtomicDerivedStateProcessorBase<ConnectorEnd> {

	public ConnectorEndInitializer() {
		super(ConnectorEnd.class);
	}

	@Override
	protected void applyTyped(ConnectorEnd object) {
		if (object.getReferencedElement() != null) {
			org.eclipse.uml2.uml.ConnectorEnd umlEnd = object.getReferencedElement();
			Property umlPart = umlEnd.getPartWithPort();
			ConnectableElement umlRole = umlEnd.getRole();

			UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));

			if (umlPart != null) {
				Optional<Attribute> attribute = finder.findElement(umlPart, Attribute.class);
				if (attribute.isPresent())
					object.setPart(attribute.get());
			}

			if (umlRole != null) {
				Optional<Port> port = finder.findElement(umlRole, Port.class);
				if (port.isPresent())
					object.setRole(port.get());
			}

		}

	}

}
