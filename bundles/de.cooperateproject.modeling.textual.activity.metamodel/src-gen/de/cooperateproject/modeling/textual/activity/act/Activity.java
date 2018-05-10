/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Activity#getFlows <em>Flows</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Activity#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends UMLReferencingElement<org.eclipse.uml2.uml.Activity>, NamedElement, Container {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.act.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivity_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlows();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.act.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivity_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getChildren();

} // Activity
