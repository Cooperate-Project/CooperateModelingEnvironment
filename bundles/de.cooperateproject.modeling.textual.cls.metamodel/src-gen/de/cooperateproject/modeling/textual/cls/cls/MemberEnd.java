/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#isNavigable <em>Navigable</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMemberEnd()
 * @model
 * @generated
 */
public interface MemberEnd extends AssociationEnd, NamedElementOptional<Property> {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMemberEnd_Cardinality()
	 * @model containment="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(UMLTypeReference)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMemberEnd_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UMLTypeReference getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(UMLTypeReference value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.MultiAssociation#getConnectorEnds <em>Connector Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' container reference.
	 * @see #setAssociation(MultiAssociation)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMemberEnd_Association()
	 * @see de.cooperateproject.modeling.textual.cls.cls.MultiAssociation#getConnectorEnds
	 * @model opposite="connectorEnds" required="true" transient="false"
	 * @generated
	 */
	MultiAssociation getAssociation();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#getAssociation <em>Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' container reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(MultiAssociation value);

	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(boolean)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMemberEnd_Navigable()
	 * @model required="true"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.MemberEnd#isNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #isNavigable()
	 * @generated
	 */
	void setNavigable(boolean value);

} // MemberEnd
