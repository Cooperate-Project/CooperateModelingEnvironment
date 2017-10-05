/**
 */
package dummy.impl;

import dummy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DummyFactoryImpl extends EFactoryImpl implements DummyFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DummyFactory init() {
        try {
            DummyFactory theDummyFactory = (DummyFactory)EPackage.Registry.INSTANCE.getEFactory(DummyPackage.eNS_URI);
            if (theDummyFactory != null) {
                return theDummyFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DummyFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DummyFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DummyPackage.REFERENCING_ELEMENT: return (EObject)createReferencingElement();
            case DummyPackage.CONTAINER: return (EObject)createContainer();
            case DummyPackage.REFERENCING_ELEMENT2: return (EObject)createReferencingElement2();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReferencingElement createReferencingElement() {
        ReferencingElementImpl referencingElement = new ReferencingElementImpl();
        return referencingElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public dummy.Container createContainer() {
        ContainerImpl container = new ContainerImpl();
        return container;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReferencingElement2 createReferencingElement2() {
        ReferencingElement2Impl referencingElement2 = new ReferencingElement2Impl();
        return referencingElement2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DummyPackage getDummyPackage() {
        return (DummyPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static DummyPackage getPackage() {
        return DummyPackage.eINSTANCE;
    }

} //DummyFactoryImpl
