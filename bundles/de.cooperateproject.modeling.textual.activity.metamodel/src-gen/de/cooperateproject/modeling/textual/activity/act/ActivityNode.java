/**
 */
package de.cooperateproject.modeling.textual.activity.act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.ActivityNode#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends Node {

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see de.cooperateproject.modeling.textual.activity.act.ActPackage#getActivityNode_Alias()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.activity.act.ActivityNode#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);
} // ActivityNode
