/**
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Parameter#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Property<org.eclipse.uml2.uml.Parameter> {

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Method)
	 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getParameter_Owner()
	 * @see de.cooperateproject.modeling.textual.cls.cls.Method#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	Method getOwner();

	/**
	 * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Parameter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Method value);
} // Parameter
