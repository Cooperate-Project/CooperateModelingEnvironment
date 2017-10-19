/**
 */
package de.cooperateproject.modeling.textual.component.cmp;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

import org.eclipse.uml2.uml.Classifier;

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
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getPort()
 * @model
 * @generated
 */
public interface Port<realizeClassifierUMLType extends Classifier> extends NamedElement, VisibilityHavingElement, UMLReferencingElement<org.eclipse.uml2.uml.Port> {
    /**
     * Returns the value of the '<em><b>Realized Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realized Classifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realized Classifier</em>' reference.
     * @see #setRealizedClassifier(de.cooperateproject.modeling.textual.component.cmp.Classifier)
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#getPort_RealizedClassifier()
     * @model required="true"
     * @generated
     */
    de.cooperateproject.modeling.textual.component.cmp.Classifier<realizeClassifierUMLType> getRealizedClassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.cmp.Port#getRealizedClassifier <em>Realized Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realized Classifier</em>' reference.
     * @see #getRealizedClassifier()
     * @generated
     */
    void setRealizedClassifier(de.cooperateproject.modeling.textual.component.cmp.Classifier<realizeClassifierUMLType> value);

} // Port
