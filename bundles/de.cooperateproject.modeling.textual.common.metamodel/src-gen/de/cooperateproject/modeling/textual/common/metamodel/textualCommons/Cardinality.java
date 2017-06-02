/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.uml2.uml.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends UMLReferencingElement<MultiplicityElement> {
	/**
     * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Bound</em>' attribute.
     * @see #isSetLowerBound()
     * @see #unsetLowerBound()
     * @see #setLowerBound(int)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getCardinality_LowerBound()
     * @model unsettable="true" transient="true"
     * @generated
     */
	int getLowerBound();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Bound</em>' attribute.
     * @see #isSetLowerBound()
     * @see #unsetLowerBound()
     * @see #getLowerBound()
     * @generated
     */
	void setLowerBound(int value);

	/**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowerBound()
     * @see #getLowerBound()
     * @see #setLowerBound(int)
     * @generated
     */
    void unsetLowerBound();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lower Bound</em>' attribute is set.
     * @see #unsetLowerBound()
     * @see #getLowerBound()
     * @see #setLowerBound(int)
     * @generated
     */
    boolean isSetLowerBound();

    /**
     * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Bound</em>' attribute.
     * @see #isSetUpperBound()
     * @see #unsetUpperBound()
     * @see #setUpperBound(int)
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#getCardinality_UpperBound()
     * @model unsettable="true" transient="true"
     * @generated
     */
	int getUpperBound();

	/**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Bound</em>' attribute.
     * @see #isSetUpperBound()
     * @see #unsetUpperBound()
     * @see #getUpperBound()
     * @generated
     */
	void setUpperBound(int value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpperBound()
     * @see #getUpperBound()
     * @see #setUpperBound(int)
     * @generated
     */
    void unsetUpperBound();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upper Bound</em>' attribute is set.
     * @see #unsetUpperBound()
     * @see #getUpperBound()
     * @see #setUpperBound(int)
     * @generated
     */
    boolean isSetUpperBound();

} // Cardinality
