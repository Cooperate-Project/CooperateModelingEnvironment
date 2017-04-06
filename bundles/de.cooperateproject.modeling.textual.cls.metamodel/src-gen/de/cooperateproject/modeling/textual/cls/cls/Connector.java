/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.Connector#getOwningPackage <em>Owning Package</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getConnector()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Connector extends PackageableElement {
    /**
     * Returns the value of the '<em><b>Owning Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cooperateproject.modeling.textual.cls.cls.Package#getConnectors <em>Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Package</em>' container reference.
     * @see #setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getConnector_OwningPackage()
     * @see de.cooperateproject.modeling.textual.cls.cls.Package#getConnectors
     * @model opposite="connectors" required="true" transient="false"
     * @generated
     */
    de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.Connector#getOwningPackage <em>Owning Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Package</em>' container reference.
     * @see #getOwningPackage()
     * @generated
     */
    void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package value);

} // Connector
