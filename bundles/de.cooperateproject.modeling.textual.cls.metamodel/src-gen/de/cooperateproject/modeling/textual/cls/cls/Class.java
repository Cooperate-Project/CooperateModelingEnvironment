/**
 */
package de.cooperateproject.modeling.textual.cls.cls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Class#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier<org.eclipse.uml2.uml.Class> {
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
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getClass_Abstract()
     * @model default="false" unique="false" unsettable="true" transient="true"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Class#isAbstract <em>Abstract</em>}' attribute.
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
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Class#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    void unsetAbstract();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Class#isAbstract <em>Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abstract</em>' attribute is set.
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    boolean isSetAbstract();

} // Class
