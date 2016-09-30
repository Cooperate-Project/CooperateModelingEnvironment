/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.Property;

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
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyLeft <em>Property Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyRight <em>Property Right</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties()
 * @model
 * @generated
 */
public interface AssociationProperties extends Element {
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

	/**
	 * Returns the value of the '<em><b>Property Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Left</em>' reference.
	 * @see #setPropertyLeft(Property)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_PropertyLeft()
	 * @model
	 * @generated
	 */
	Property getPropertyLeft();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyLeft <em>Property Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Left</em>' reference.
	 * @see #getPropertyLeft()
	 * @generated
	 */
	void setPropertyLeft(Property value);

	/**
	 * Returns the value of the '<em><b>Property Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Right</em>' reference.
	 * @see #setPropertyRight(Property)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_PropertyRight()
	 * @model
	 * @generated
	 */
	Property getPropertyRight();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getPropertyRight <em>Property Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Right</em>' reference.
	 * @see #getPropertyRight()
	 * @generated
	 */
	void setPropertyRight(Property value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' container reference.
	 * @see #setAssociation(Association)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_Association()
	 * @see de.cooperateproject.modeling.textual.cls.cls.Association#getProperties
	 * @model opposite="properties" required="true" transient="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getAssociation <em>Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' container reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

} // AssociationProperties
