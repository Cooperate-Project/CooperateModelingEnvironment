/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property<T extends NamedElement> extends UMLReferencingElement<T>, Element, de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement, VisibilityHavingElement {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(Classifier)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getProperty_Type()
     * @model unsettable="true" transient="true"
     * @generated
     */
    Classifier getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(Classifier value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(Classifier)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' reference is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(Classifier)
     * @generated
     */
    boolean isSetType();

} // Property
