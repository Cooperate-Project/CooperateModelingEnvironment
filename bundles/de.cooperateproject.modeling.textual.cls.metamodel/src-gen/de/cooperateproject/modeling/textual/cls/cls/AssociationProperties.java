/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityLeft <em>Cardinality Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityRight <em>Cardinality Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AssociationProperties extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Cardinality Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Left</em>' containment reference.
	 * @see #setCardinalityLeft(Cardinality)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_CardinalityLeft()
	 * @model containment="true"
	 * @generated
	 */
	Cardinality getCardinalityLeft();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityLeft <em>Cardinality Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Left</em>' containment reference.
	 * @see #getCardinalityLeft()
	 * @generated
	 */
	void setCardinalityLeft(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Cardinality Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Right</em>' containment reference.
	 * @see #setCardinalityRight(Cardinality)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_CardinalityRight()
	 * @model containment="true"
	 * @generated
	 */
	Cardinality getCardinalityRight();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getCardinalityRight <em>Cardinality Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Right</em>' containment reference.
	 * @see #getCardinalityRight()
	 * @generated
	 */
	void setCardinalityRight(Cardinality value);

} // AssociationProperties
