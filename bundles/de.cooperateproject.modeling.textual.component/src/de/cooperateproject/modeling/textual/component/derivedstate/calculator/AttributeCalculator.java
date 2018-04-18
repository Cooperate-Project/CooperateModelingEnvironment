package de.cooperateproject.modeling.textual.component.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.component.component.Attribute;
import de.cooperateproject.modeling.textual.component.component.Classifier;
import de.cooperateproject.modeling.textual.component.component.Require;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for Attribute.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class AttributeCalculator extends AtomicDerivedStateProcessorBase<Attribute> {

	public AttributeCalculator() {
		super(Attribute.class);
	}

	@Override
	protected void applyTyped(Attribute object) {
		if (object.eContainer() instanceof Classifier) {
			Classifier classifier = (Classifier) object.eContainer();
			if (classifier.getReferencedElement() != null && object.getType() != null && object.getName() != null) {
				org.eclipse.uml2.uml.Classifier umlClassifier = (org.eclipse.uml2.uml.Classifier) classifier
						.getReferencedElement();
				Optional<Property> umlAttribute = Optional
						.ofNullable(umlClassifier.getAttribute(object.getName(), object.getType()));

				if (umlAttribute.isPresent()) {
					object.setReferencedElement(umlAttribute.get());
				}
			}
		}

	}

	@Override
	public Collection<Class<? extends EObject>> getReplacements() {
		return Arrays.asList(UMLReferencingElement.class);
	}

}
