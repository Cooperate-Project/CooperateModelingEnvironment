/**
 */
package de.cooperateproject.modeling.textual.activity.act;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.ControlNode#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getControlNode()
 * @model
 * @generated
 */
public interface ControlNode extends Node {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.activity.act.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.activity.act.NodeType
	 * @see #setType(NodeType)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getControlNode_Type()
	 * @model required="true"
	 * @generated
	 */
	NodeType getType();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.ControlNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cooperateproject.modeling.textual.activity.act.NodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(NodeType value);

} // ControlNode
