/**
 */
package dummy.impl;

import dummy.Containable;
import dummy.DummyFactory;
import dummy.DummyPackage;

import dummy.ReferencingElement;
import dummy.ReferencingElement2;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dummy.impl.ContainerImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends CDOObjectImpl implements dummy.Container {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ContainerImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DummyPackage.Literals.CONTAINER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected int eStaticFeatureCount() {
        return 0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public EList<Containable> getContent() {
        return (EList<Containable>)eDynamicGet(DummyPackage.CONTAINER__CONTENT, DummyPackage.Literals.CONTAINER__CONTENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReferencingElement createReferencingElement() {
        ReferencingElement element = DummyFactory.eINSTANCE.createReferencingElement();
        getContent().add(element);
        return element;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReferencingElement2 createReferencingElement2() {
        ReferencingElement2 element = DummyFactory.eINSTANCE.createReferencingElement2();
        getContent().add(element);
        return element;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public dummy.Container createContainer() {
        dummy.Container element = DummyFactory.eINSTANCE.createContainer();
        getContent().add(element);
        return element;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DummyPackage.CONTAINER__CONTENT:
                return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DummyPackage.CONTAINER__CONTENT:
                return getContent();
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
            case DummyPackage.CONTAINER__CONTENT:
                getContent().clear();
                getContent().addAll((Collection<? extends Containable>)newValue);
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
            case DummyPackage.CONTAINER__CONTENT:
                getContent().clear();
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
            case DummyPackage.CONTAINER__CONTENT:
                return !getContent().isEmpty();
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case DummyPackage.CONTAINER___CREATE_REFERENCING_ELEMENT:
                return createReferencingElement();
            case DummyPackage.CONTAINER___CREATE_REFERENCING_ELEMENT2:
                return createReferencingElement2();
            case DummyPackage.CONTAINER___CREATE_CONTAINER:
                return createContainer();
        }
        return super.eInvoke(operationID, arguments);
    }

} //ContainerImpl
