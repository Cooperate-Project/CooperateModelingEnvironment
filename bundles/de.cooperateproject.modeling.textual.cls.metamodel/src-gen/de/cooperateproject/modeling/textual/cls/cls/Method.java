/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Method#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Method#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member<Operation> {
    /**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #isSetAbstract()
     * @see #unsetAbstract()
     * @see #setAbstract(boolean)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMethod_Abstract()
     * @model default="false" unique="false" unsettable="true" transient="true"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Method#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isSetAbstract()
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Method#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    void unsetAbstract();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Method#isAbstract <em>Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abstract</em>' attribute is set.
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    boolean isSetAbstract();

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.cls.cls.Parameter}.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Parameter#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMethod_Parameters()
     * @see de.cooperateproject.modeling.textual.cls.cls.Parameter#getOwner
     * @model opposite="owner" containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

} // Method
