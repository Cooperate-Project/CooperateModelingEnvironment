/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Relationship;

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
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Flow#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends UMLReferencingElement<Relationship> {

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
	 * @model lower="2"
	 * @generated
	 */
	EList<Node> getRelatedElements();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow_Condition()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);
} // Flow
