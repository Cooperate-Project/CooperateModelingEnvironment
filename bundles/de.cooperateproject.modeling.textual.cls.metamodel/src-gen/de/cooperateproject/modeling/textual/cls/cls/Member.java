/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Member#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Member#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member<T extends Feature> extends Property<T> {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMember_Owner()
     * @see de.cooperateproject.modeling.textual.cls.cls.Classifier#getMembers
     * @model opposite="members" required="true" transient="false" changeable="false"
     * @generated
     */
    Classifier<?> getOwner();

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #isSetStatic()
     * @see #unsetStatic()
     * @see #setStatic(boolean)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getMember_Static()
     * @model default="false" unique="false" unsettable="true" transient="true"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Member#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isSetStatic()
     * @see #unsetStatic()
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Member#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatic()
     * @see #isStatic()
     * @see #setStatic(boolean)
     * @generated
     */
    void unsetStatic();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Member#isStatic <em>Static</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static</em>' attribute is set.
     * @see #unsetStatic()
     * @see #isStatic()
     * @see #setStatic(boolean)
     * @generated
     */
    boolean isSetStatic();

} // Member
