package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.component.component.Interface;
import de.cooperateproject.modeling.textual.component.component.Require;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Require} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class RequireInitializer extends AtomicDerivedStateProcessorBase<Require> {

	public RequireInitializer() {
		super(Require.class);
	}

	@Override
	protected void applyTyped(Require object) {
		if (object.getReferencedElement() != null) {
			org.eclipse.uml2.uml.Usage umlUsage = object.getReferencedElement();
			EList<NamedElement> suppliers = umlUsage.getSuppliers();
			if (suppliers.size() == 1) {
				NamedElement umlInterface = suppliers.get(0);
				if (umlInterface instanceof org.eclipse.uml2.uml.Interface) {
					UMLReferencingElementFinder finder = UMLReferencingElementFinder
							.create(EcoreUtil.getRootContainer(object));
					Optional<Interface> inf = finder.findElement(umlInterface, Interface.class);
					if (inf.isPresent())
						object.setInterface(inf.get());
				}
			}
		}

	}

}
