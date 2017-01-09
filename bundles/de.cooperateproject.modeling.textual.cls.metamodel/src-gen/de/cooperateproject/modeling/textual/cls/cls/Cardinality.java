/**
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends Element {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCardinality_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getCardinality_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // Cardinality
