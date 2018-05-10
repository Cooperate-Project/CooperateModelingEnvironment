/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Flow#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.Flow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends UMLReferencingElement<ControlFlow>, NamedElement {
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

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow_Source()
	 * @model
	 * @generated
	 */
	Node<ActivityNode> getSource();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node<ActivityNode> value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow_Target()
	 * @model
	 * @generated
	 */
	Node<ActivityNode> getTarget();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node<ActivityNode> value);

} // Flow
