/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Flow#getRelatedElements <em>Related Elements</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Flow extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Related Elements</b></em>' reference list.
	 * The list contents are of type {@link de.cooperateproject.modeling.textual.activity.act.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Elements</em>' reference list.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow_RelatedElements()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Node> getRelatedElements();
} // Flow
