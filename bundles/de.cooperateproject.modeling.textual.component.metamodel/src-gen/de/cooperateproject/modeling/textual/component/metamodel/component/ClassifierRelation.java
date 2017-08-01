/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getLeftClassifier <em>Left Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getRightClassifier <em>Right Classifier</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getClassifierRelation()
 * @model abstract="true"
 * @generated
 */
public interface ClassifierRelation<LeftUMLType extends Classifier, RightUMLType extends Classifier> extends AliasedElement {
    /**
     * Returns the value of the '<em><b>Left Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left Classifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left Classifier</em>' reference.
     * @see #setLeftClassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getClassifierRelation_LeftClassifier()
     * @model required="true"
     * @generated
     */
    de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<LeftUMLType> getLeftClassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getLeftClassifier <em>Left Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left Classifier</em>' reference.
     * @see #getLeftClassifier()
     * @generated
     */
    void setLeftClassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<LeftUMLType> value);

    /**
     * Returns the value of the '<em><b>Right Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right Classifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right Classifier</em>' reference.
     * @see #setRightClassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getClassifierRelation_RightClassifier()
     * @model required="true"
     * @generated
     */
    de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<RightUMLType> getRightClassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getRightClassifier <em>Right Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right Classifier</em>' reference.
     * @see #getRightClassifier()
     * @generated
     */
    void setRightClassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<RightUMLType> value);

} // ClassifierRelation
