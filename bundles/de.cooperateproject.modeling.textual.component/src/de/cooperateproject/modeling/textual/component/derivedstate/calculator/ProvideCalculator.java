package de.cooperateproject.modeling.textual.component.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for Provide.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class ProvideCalculator extends AtomicDerivedStateProcessorBase<Provide> {

	public ProvideCalculator() {
		super(Provide.class);
	}

	@Override
	protected void applyTyped(Provide object) {
		if (object.eContainer() instanceof Classifier) {
			Classifier classifier = (Classifier) object.eContainer();
			if (classifier.getReferencedElement() != null && object.getInterface() != null
					&& object.getInterface().getReferencedElement() != null) {
				Element umlClassifier = classifier.getReferencedElement();
				EList<DirectedRelationship> realizations = umlClassifier
						.getSourceDirectedRelationships(UMLPackage.eINSTANCE.getInterfaceRealization());
				Optional<InterfaceRealization> umlRealization = realizations.stream().map(InterfaceRealization.class::cast)
						.filter(u -> u.getContract() == object.getInterface().getReferencedElement())
						.filter(u -> object.getName() == null? true : u.getName().equals(object.getName()))
						.findFirst();
				if (umlRealization.isPresent()) {
					object.setReferencedElement(umlRealization.get());
				}
			}
		}

	}

	@Override
	public Collection<Class<? extends EObject>> getReplacements() {
		return Arrays.asList(UMLReferencingElement.class);
	}

}
