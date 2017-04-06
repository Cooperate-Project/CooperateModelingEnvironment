/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility;

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
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Property#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Property#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property<T extends NamedElement> extends UMLReferencingElement<T>, Element, de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement {
    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
     * @see #setVisibility(Visibility)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getProperty_Visibility()
     * @model unique="false"
     * @generated
     */
    Visibility getVisibility();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(Visibility value);

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getProperty_Static()
     * @model unique="false"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Property#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Classifier)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getProperty_Type()
     * @model
     * @generated
     */
    Classifier getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Property#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Classifier value);

} // Property
