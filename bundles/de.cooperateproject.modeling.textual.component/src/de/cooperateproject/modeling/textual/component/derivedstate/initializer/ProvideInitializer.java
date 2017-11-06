package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.component.cmp.Interface;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Provide} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ProvideInitializer extends AtomicDerivedStateProcessorBase<Provide> {

	public ProvideInitializer() {
		super(Provide.class);
	}

	@Override
	protected void applyTyped(Provide object) {
		if (object.getReferencedElement() != null) {
			InterfaceRealization realization = object.getReferencedElement();
			org.eclipse.uml2.uml.Interface umlInterface = realization.getContract();
			if (umlInterface != null) {
				UMLReferencingElementFinder finder = UMLReferencingElementFinder
						.create(EcoreUtil.getRootContainer(object));
				Optional<Interface> inf = finder.findElement(umlInterface, Interface.class);
				if (inf.isPresent())
					object.setInterface(inf.get());
			}
		}

	}

}
