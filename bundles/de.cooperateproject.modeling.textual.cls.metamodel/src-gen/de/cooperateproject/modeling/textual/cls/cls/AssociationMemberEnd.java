/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NameOptional;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Member End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getType <em>Type</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAggregationKind <em>Aggregation Kind</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationMemberEnd()
 * @model
 * @generated
 */
public interface AssociationMemberEnd extends UMLReferencingElement<Property>, NamedElement, NameOptional {
    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinality</em>' containment reference.
     * @see #setCardinality(Cardinality)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationMemberEnd_Cardinality()
     * @model containment="true"
     * @generated
     */
    Cardinality getCardinality();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getCardinality <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' containment reference.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(Cardinality value);

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
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationMemberEnd_Type()
     * @model required="true" transient="true"
     * @generated
     */
    Classifier<? extends org.eclipse.uml2.uml.Classifier> getType();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Classifier<? extends org.eclipse.uml2.uml.Classifier> value);

    /**
     * Returns the value of the '<em><b>Navigable</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Navigable</em>' attribute.
     * @see #isSetNavigable()
     * @see #unsetNavigable()
     * @see #setNavigable(boolean)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationMemberEnd_Navigable()
     * @model default="false" unsettable="true" required="true" transient="true"
     * @generated
     */
    boolean isNavigable();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#isNavigable <em>Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Navigable</em>' attribute.
     * @see #isSetNavigable()
     * @see #unsetNavigable()
     * @see #isNavigable()
     * @generated
     */
    void setNavigable(boolean value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#isNavigable <em>Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNavigable()
     * @see #isNavigable()
     * @see #setNavigable(boolean)
     * @generated
     */
    void unsetNavigable();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#isNavigable <em>Navigable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Navigable</em>' attribute is set.
     * @see #unsetNavigable()
     * @see #isNavigable()
     * @see #setNavigable(boolean)
     * @generated
     */
    boolean isSetNavigable();

    /**
     * Returns the value of the '<em><b>Association</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Association#getMemberEnds <em>Member Ends</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association</em>' container reference.
     * @see #setAssociation(Association)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationMemberEnd_Association()
     * @see de.cooperateproject.modeling.textual.cls.cls.Association#getMemberEnds
     * @model opposite="memberEnds" required="true" transient="false"
     * @generated
     */
    Association getAssociation();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAssociation <em>Association</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Association</em>' container reference.
     * @see #getAssociation()
     * @generated
     */
    void setAssociation(Association value);

    /**
     * Returns the value of the '<em><b>Aggregation Kind</b></em>' attribute.
     * The literals are from the enumeration {@link de.cooperateproject.modeling.textual.cls.cls.AggregationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregation Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregation Kind</em>' attribute.
     * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
     * @see #isSetAggregationKind()
     * @see #unsetAggregationKind()
     * @see #setAggregationKind(AggregationKind)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationMemberEnd_AggregationKind()
     * @model unsettable="true" transient="true"
     * @generated
     */
    AggregationKind getAggregationKind();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAggregationKind <em>Aggregation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregation Kind</em>' attribute.
     * @see de.cooperateproject.modeling.textual.cls.cls.AggregationKind
     * @see #isSetAggregationKind()
     * @see #unsetAggregationKind()
     * @see #getAggregationKind()
     * @generated
     */
    void setAggregationKind(AggregationKind value);

    /**
     * Unsets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAggregationKind <em>Aggregation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAggregationKind()
     * @see #getAggregationKind()
     * @see #setAggregationKind(AggregationKind)
     * @generated
     */
    void unsetAggregationKind();

    /**
     * Returns whether the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd#getAggregationKind <em>Aggregation Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aggregation Kind</em>' attribute is set.
     * @see #unsetAggregationKind()
     * @see #getAggregationKind()
     * @see #setAggregationKind(AggregationKind)
     * @generated
     */
    boolean isSetAggregationKind();

} // AssociationMemberEnd
