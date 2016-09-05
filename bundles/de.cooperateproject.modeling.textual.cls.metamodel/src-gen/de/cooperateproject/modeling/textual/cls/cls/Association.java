/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.Type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Association#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Association#getAggregationKind <em>Aggregation Kind</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends TypedConnector, UMLReferencingElement<org.eclipse.uml2.uml.Association>, Commentable {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(AssociationProperties)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociation_Properties()
	 * @model containment="true"
	 * @generated
	 */
	AssociationProperties getProperties();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(AssociationProperties value);

	/**
	 * Returns the value of the '<em><b>Aggregation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Kind</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
	 * @see #setAggregationKind(AggregationKind)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociation_AggregationKind()
	 * @model required="true"
	 * @generated
	 */
	AggregationKind getAggregationKind();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getAggregationKind <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Kind</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
	 * @see #getAggregationKind()
	 * @generated
	 */
	void setAggregationKind(AggregationKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getReferencedElement();'"
	 * @generated
	 */
	Type getCommentedElement();

} // Association
