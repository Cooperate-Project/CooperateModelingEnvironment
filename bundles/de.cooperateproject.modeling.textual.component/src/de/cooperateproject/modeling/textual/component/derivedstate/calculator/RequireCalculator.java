package de.cooperateproject.modeling.textual.component.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for Require.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class RequireCalculator extends AtomicDerivedStateProcessorBase<Require> {

	public RequireCalculator() {
		super(Require.class);
	}

	@Override
	protected void applyTyped(Require object) {
		if (object.eContainer() instanceof Classifier) {
			Classifier classifier = (Classifier) object.eContainer();
			if (classifier.getReferencedElement() != null && object.getInterface() != null
					&& object.getInterface().getReferencedElement() != null) {
				Element umlClassifier = classifier.getReferencedElement();
				EList<DirectedRelationship> usages = umlClassifier
						.getSourceDirectedRelationships(UMLPackage.eINSTANCE.getUsage());
				Optional<Usage> umlUsage = usages.stream().map(Usage.class::cast)
						.filter(u -> u.getSuppliers().contains(object.getInterface().getReferencedElement()))
						.filter(u -> object.getName() == null? true : u.getName().equals(object.getName()))
						.findFirst();
				if (umlUsage.isPresent()) {
					object.setReferencedElement(umlUsage.get());
				}
			}
		}

	}

	@Override
	public Collection<Class<? extends EObject>> getReplacements() {
		return Arrays.asList(UMLReferencingElement.class);
	}

}
