/**
 *
 * $Id$
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.validation;

import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortRelationValidator {
    boolean validate();

    boolean validatePort(EList<Component> value);
    boolean validateInterface(Interface value);
}
