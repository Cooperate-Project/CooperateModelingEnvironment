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
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(Node)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow_Source()
	 * @model unsettable="true" transient="true"
	 * @generated
	 */
	Node<ActivityNode> getSource();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node<ActivityNode> value);

	/**
	 * Unsets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(Node)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getSource <em>Source</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' reference is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(Node)
	 * @generated
	 */
	boolean isSetSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #setTarget(Node)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getFlow_Target()
	 * @model unsettable="true" transient="true"
	 * @generated
	 */
	Node<ActivityNode> getTarget();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node<ActivityNode> value);

	/**
	 * Unsets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTarget()
	 * @see #getTarget()
	 * @see #setTarget(Node)
	 * @generated
	 */
	void unsetTarget();

	/**
	 * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.activity.act.Flow#getTarget <em>Target</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target</em>' reference is set.
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @see #setTarget(Node)
	 * @generated
	 */
	boolean isSetTarget();

} // Flow
