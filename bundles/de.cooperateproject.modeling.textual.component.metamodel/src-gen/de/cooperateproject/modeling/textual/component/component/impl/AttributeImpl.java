/**
 */
package de.cooperateproject.modeling.textual.component.component.impl;

import de.cooperateproject.modeling.textual.component.component.Attribute;
import de.cooperateproject.modeling.textual.component.component.ComponentPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AttributeImpl extends MemberImpl<Property> implements Attribute {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.ATTRIBUTE;
    }

} //AttributeImpl
