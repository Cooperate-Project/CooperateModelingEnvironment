/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Port#getRealizedClassifier <em>Realized Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.Port#isConjugated <em>Conjugated</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement, VisibilityHavingElement, UMLReferencingElement<org.eclipse.uml2.uml.Port> {
    /**
     * Returns the value of the '<em><b>Realized Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realized Classifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realized Classifier</em>' reference.
     * @see #setRealizedClassifier(Classifier)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getPort_RealizedClassifier()
     * @model transient="true"
     * @generated
     */
    Classifier<org.eclipse.uml2.uml.Classifier> getRealizedClassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Port#getRealizedClassifier <em>Realized Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realized Classifier</em>' reference.
     * @see #getRealizedClassifier()
     * @generated
     */
    void setRealizedClassifier(Classifier<org.eclipse.uml2.uml.Classifier> value);

    /**
     * Returns the value of the '<em><b>Conjugated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conjugated</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conjugated</em>' attribute.
     * @see #isSetConjugated()
     * @see #unsetConjugated()
     * @see #setConjugated(boolean)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getPort_Conjugated()
     * @model unsettable="true" transient="true"
     * @generated
     */
    boolean isConjugated();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Port#isConjugated <em>Conjugated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conjugated</em>' attribute.
     * @see #isSetConjugated()
     * @see #unsetConjugated()
     * @see #isConjugated()
     * @generated
     */
    void setConjugated(boolean value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Port#isConjugated <em>Conjugated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConjugated()
     * @see #isConjugated()
     * @see #setConjugated(boolean)
     * @generated
     */
    void unsetConjugated();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Port#isConjugated <em>Conjugated</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conjugated</em>' attribute is set.
     * @see #unsetConjugated()
     * @see #isConjugated()
     * @see #setConjugated(boolean)
     * @generated
     */
    boolean isSetConjugated();

} // Port
