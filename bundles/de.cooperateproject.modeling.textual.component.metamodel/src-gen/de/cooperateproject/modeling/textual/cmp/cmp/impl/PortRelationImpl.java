/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.impl;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.cmp.cmp.Port;
import de.cooperateproject.modeling.textual.cmp.cmp.PortRelation;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PortRelationImpl#getOuterPort <em>Outer Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cmp.cmp.impl.PortRelationImpl#getInnerPort <em>Inner Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortRelationImpl extends AliasedElementImpl implements PortRelation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PortRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmpPackage.Literals.PORT_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port getOuterPort() {
        return (Port)eDynamicGet(CmpPackage.PORT_RELATION__OUTER_PORT, CmpPackage.Literals.PORT_RELATION__OUTER_PORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetOuterPort() {
        return (Port)eDynamicGet(CmpPackage.PORT_RELATION__OUTER_PORT, CmpPackage.Literals.PORT_RELATION__OUTER_PORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOuterPort(Port newOuterPort) {
        eDynamicSet(CmpPackage.PORT_RELATION__OUTER_PORT, CmpPackage.Literals.PORT_RELATION__OUTER_PORT, newOuterPort);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port getInnerPort() {
        return (Port)eDynamicGet(CmpPackage.PORT_RELATION__INNER_PORT, CmpPackage.Literals.PORT_RELATION__INNER_PORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port basicGetInnerPort() {
        return (Port)eDynamicGet(CmpPackage.PORT_RELATION__INNER_PORT, CmpPackage.Literals.PORT_RELATION__INNER_PORT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInnerPort(Port newInnerPort) {
        eDynamicSet(CmpPackage.PORT_RELATION__INNER_PORT, CmpPackage.Literals.PORT_RELATION__INNER_PORT, newInnerPort);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.PORT_RELATION__OUTER_PORT:
                if (resolve) return getOuterPort();
                return basicGetOuterPort();
            case CmpPackage.PORT_RELATION__INNER_PORT:
                if (resolve) return getInnerPort();
                return basicGetInnerPort();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CmpPackage.PORT_RELATION__OUTER_PORT:
                setOuterPort((Port)newValue);
                return;
            case CmpPackage.PORT_RELATION__INNER_PORT:
                setInnerPort((Port)newValue);
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
            case CmpPackage.PORT_RELATION__OUTER_PORT:
                setOuterPort((Port)null);
                return;
            case CmpPackage.PORT_RELATION__INNER_PORT:
                setInnerPort((Port)null);
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
            case CmpPackage.PORT_RELATION__OUTER_PORT:
                return basicGetOuterPort() != null;
            case CmpPackage.PORT_RELATION__INNER_PORT:
                return basicGetInnerPort() != null;
        }
        return super.eIsSet(featureID);
    }

} //PortRelationImpl
