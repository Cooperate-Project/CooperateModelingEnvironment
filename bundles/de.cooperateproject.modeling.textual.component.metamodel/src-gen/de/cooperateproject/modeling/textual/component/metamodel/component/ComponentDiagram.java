/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getRootpackage <em>Rootpackage</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponentDiagram()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ComponentDiagram extends CDOObject {
    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponentDiagram_Title()
     * @model required="true"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Rootpackage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rootpackage</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rootpackage</em>' containment reference.
     * @see #setRootpackage(RootPackage)
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#getComponentDiagram_Rootpackage()
     * @model containment="true" required="true"
     * @generated
     */
    RootPackage getRootpackage();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram#getRootpackage <em>Rootpackage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rootpackage</em>' containment reference.
     * @see #getRootpackage()
     * @generated
     */
    void setRootpackage(RootPackage value);

} // ComponentDiagram
