package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Type;


import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Attribute} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class AttributeInitializer extends AtomicDerivedStateProcessorBase<Attribute> {

	public AttributeInitializer() {
		super(Attribute.class);
	}

	@Override
	protected void applyTyped(Attribute object) {
		if (object.getReferencedElement() != null) {
			Type umlType = object.getReferencedElement().getType();
			if(umlType instanceof Classifier)
				object.setType((Classifier) umlType);
		}

	}

}
