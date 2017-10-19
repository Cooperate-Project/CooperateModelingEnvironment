/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Port;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorEndImpl#getPart <em>Part</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndImpl extends UMLReferencingElementImpl<ConnectorEnd> implements de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmpPackage.Literals.CONNECTOR_END;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(ConnectorEnd newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute getPart() {
        return (Attribute)eDynamicGet(CmpPackage.CONNECTOR_END__PART, CmpPackage.Literals.CONNECTOR_END__PART, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute basicGetPart() {
        return (Attribute)eDynamicGet(CmpPackage.CONNECTOR_END__PART, CmpPackage.Literals.CONNECTOR_END__PART, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPart(Attribute newPart) {
        eDynamicSet(CmpPackage.CONNECTOR_END__PART, CmpPackage.Literals.CONNECTOR_END__PART, newPart);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Port<Classifier> getRole() {
        return (Port<Classifier>)eDynamicGet(CmpPackage.CONNECTOR_END__ROLE, CmpPackage.Literals.CONNECTOR_END__ROLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port<Classifier> basicGetRole() {
        return (Port<Classifier>)eDynamicGet(CmpPackage.CONNECTOR_END__ROLE, CmpPackage.Literals.CONNECTOR_END__ROLE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(Port<Classifier> newRole) {
        eDynamicSet(CmpPackage.CONNECTOR_END__ROLE, CmpPackage.Literals.CONNECTOR_END__ROLE, newRole);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.CONNECTOR_END__PART:
                if (resolve) return getPart();
                return basicGetPart();
            case CmpPackage.CONNECTOR_END__ROLE:
                if (resolve) return getRole();
                return basicGetRole();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CmpPackage.CONNECTOR_END__PART:
                setPart((Attribute)newValue);
                return;
            case CmpPackage.CONNECTOR_END__ROLE:
                setRole((Port<Classifier>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CmpPackage.CONNECTOR_END__PART:
                setPart((Attribute)null);
                return;
            case CmpPackage.CONNECTOR_END__ROLE:
                setRole((Port<Classifier>)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CmpPackage.CONNECTOR_END__PART:
                return basicGetPart() != null;
            case CmpPackage.CONNECTOR_END__ROLE:
                return basicGetRole() != null;
        }
        return super.eIsSet(featureID);
    }

} //ConnectorEndImpl
