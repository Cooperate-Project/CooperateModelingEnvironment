/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aliased Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AliasedElementImpl extends NamedElementImpl implements AliasedElement {
	/**
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
	protected static final String ALIAS_EDEFAULT = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AliasedElementImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TextualCommonsPackage.Literals.ALIASED_ELEMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAlias() {
        return (String)eDynamicGet(TextualCommonsPackage.ALIASED_ELEMENT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAlias(String newAlias) {
        eDynamicSet(TextualCommonsPackage.ALIASED_ELEMENT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAlias() {
        eDynamicUnset(TextualCommonsPackage.ALIASED_ELEMENT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlias() {
        return eDynamicIsSet(TextualCommonsPackage.ALIASED_ELEMENT__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS:
                return getAlias();
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
            case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS:
                setAlias((String)newValue);
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
            case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS:
                unsetAlias();
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
            case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS:
                return isSetAlias();
        }
        return super.eIsSet(featureID);
    }

} //AliasedElementImpl
