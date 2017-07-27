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
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getLeftclassifier <em>Leftclassifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getRightclassifier <em>Rightclassifier</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getClassifierRelation()
 * @model abstract="true"
 * @generated
 */
public interface ClassifierRelation<LeftUMLType extends Classifier, RightUMLType extends Classifier> extends AliasedElement {
    /**
     * Returns the value of the '<em><b>Leftclassifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leftclassifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leftclassifier</em>' reference.
     * @see #setLeftclassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getClassifierRelation_Leftclassifier()
     * @model required="true"
     * @generated
     */
    de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<LeftUMLType> getLeftclassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getLeftclassifier <em>Leftclassifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leftclassifier</em>' reference.
     * @see #getLeftclassifier()
     * @generated
     */
    void setLeftclassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<LeftUMLType> value);

    /**
     * Returns the value of the '<em><b>Rightclassifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rightclassifier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rightclassifier</em>' reference.
     * @see #setRightclassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getClassifierRelation_Rightclassifier()
     * @model required="true"
     * @generated
     */
    de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<RightUMLType> getRightclassifier();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation#getRightclassifier <em>Rightclassifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rightclassifier</em>' reference.
     * @see #getRightclassifier()
     * @generated
     */
    void setRightclassifier(de.cooperateproject.modeling.textual.component.metamodel.component.Classifier<RightUMLType> value);

} // ClassifierRelation
