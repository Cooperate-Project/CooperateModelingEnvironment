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
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getReadingDirection <em>Reading Direction</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getNote <em>Note</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Reading Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.cls.cls.ReadingDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Direction</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ReadingDirection
	 * @see #setReadingDirection(ReadingDirection)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_ReadingDirection()
	 * @model unique="false"
	 * @generated
	 */
	ReadingDirection getReadingDirection();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getReadingDirection <em>Reading Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Direction</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.ReadingDirection
	 * @see #getReadingDirection()
	 * @generated
	 */
	void setReadingDirection(ReadingDirection value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(Comment)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationProperties_Note()
	 * @model containment="true"
	 * @generated
	 */
	Comment getNote();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationProperties#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Comment value);

} // AssociationProperties
