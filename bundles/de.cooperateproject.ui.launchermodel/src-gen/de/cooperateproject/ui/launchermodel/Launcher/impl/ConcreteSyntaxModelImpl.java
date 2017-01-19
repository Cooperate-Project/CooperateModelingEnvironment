/**
 */
package de.cooperateproject.ui.launchermodel.Launcher.impl;

import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Syntax Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.impl.ConcreteSyntaxModelImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.impl.ConcreteSyntaxModelImpl#getRootElement <em>Root Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConcreteSyntaxModelImpl extends MinimalEObjectImpl.Container implements ConcreteSyntaxModel {
	/**
     * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
	protected String extension = EXTENSION_EDEFAULT;

	/**
     * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRootElement()
     * @generated
     * @ordered
     */
	protected EObject rootElement;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConcreteSyntaxModelImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return LauncherPackage.Literals.CONCRETE_SYNTAX_MODEL;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getExtension() {
        return extension;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExtension(String newExtension) {
        String oldExtension = extension;
        extension = newExtension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LauncherPackage.CONCRETE_SYNTAX_MODEL__EXTENSION, oldExtension, extension));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EObject getRootElement() {
        if (rootElement != null && rootElement.eIsProxy()) {
            InternalEObject oldRootElement = (InternalEObject)rootElement;
            rootElement = eResolveProxy(oldRootElement);
            if (rootElement != oldRootElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, LauncherPackage.CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT, oldRootElement, rootElement));
            }
        }
        return rootElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EObject basicGetRootElement() {
        return rootElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRootElement(EObject newRootElement) {
        EObject oldRootElement = rootElement;
        rootElement = newRootElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LauncherPackage.CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT, oldRootElement, rootElement));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__EXTENSION:
                return getExtension();
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT:
                if (resolve) return getRootElement();
                return basicGetRootElement();
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
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__EXTENSION:
                setExtension((String)newValue);
                return;
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT:
                setRootElement((EObject)newValue);
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
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__EXTENSION:
                setExtension(EXTENSION_EDEFAULT);
                return;
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT:
                setRootElement((EObject)null);
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
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__EXTENSION:
                return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
            case LauncherPackage.CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT:
                return rootElement != null;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (extension: ");
        result.append(extension);
        result.append(')');
        return result.toString();
    }

} //ConcreteSyntaxModelImpl
