/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getCardinality()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Cardinality extends CDOObject {
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
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getCardinality_LowerBound()
     * @model
     * @generated
     */
	int getLowerBound();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute.
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
     * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getCardinality_UpperBound()
     * @model
     * @generated
     */
	int getUpperBound();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.usecase.usecase.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Bound</em>' attribute.
     * @see #getUpperBound()
     * @generated
     */
	void setUpperBound(int value);

} // Cardinality
