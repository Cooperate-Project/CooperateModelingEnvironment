/**
 */
package dummy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dummy.DummyFactory
 * @model kind="package"
 * @generated
 */
public interface DummyPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "dummy";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://example.org/dummy/model/internal/use/only";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "dummy";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	DummyPackage eINSTANCE = dummy.impl.DummyPackageImpl.init();

	/**
     * The meta object id for the '{@link dummy.Containable <em>Containable</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see dummy.Containable
     * @see dummy.impl.DummyPackageImpl#getContainable()
     * @generated
     */
	int CONTAINABLE = 0;

	/**
     * The number of structural features of the '<em>Containable</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINABLE_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>Containable</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINABLE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link dummy.impl.ReferencingElementImpl <em>Referencing Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see dummy.impl.ReferencingElementImpl
     * @see dummy.impl.DummyPackageImpl#getReferencingElement()
     * @generated
     */
	int REFERENCING_ELEMENT = 1;

	/**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT__REFERENCED_ELEMENT = CONTAINABLE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Referencing Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT_FEATURE_COUNT = CONTAINABLE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT___GET_NEAREST_PACKAGE = CONTAINABLE_OPERATION_COUNT + 0;

	/**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE = CONTAINABLE_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Referencing Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT_OPERATION_COUNT = CONTAINABLE_OPERATION_COUNT + 2;

	/**
     * The meta object id for the '{@link dummy.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see dummy.impl.ContainerImpl
     * @see dummy.impl.DummyPackageImpl#getContainer()
     * @generated
     */
	int CONTAINER = 2;

	/**
     * The feature id for the '<em><b>Content</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINER__CONTENT = CONTAINABLE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINER_FEATURE_COUNT = CONTAINABLE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Create Referencing Element</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINER___CREATE_REFERENCING_ELEMENT = CONTAINABLE_OPERATION_COUNT + 0;

	/**
     * The operation id for the '<em>Create Referencing Element2</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINER___CREATE_REFERENCING_ELEMENT2 = CONTAINABLE_OPERATION_COUNT + 1;

	/**
     * The operation id for the '<em>Create Container</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINER___CREATE_CONTAINER = CONTAINABLE_OPERATION_COUNT + 2;

	/**
     * The number of operations of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTAINER_OPERATION_COUNT = CONTAINABLE_OPERATION_COUNT + 3;


	/**
     * The meta object id for the '{@link dummy.impl.ReferencingElement2Impl <em>Referencing Element2</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see dummy.impl.ReferencingElement2Impl
     * @see dummy.impl.DummyPackageImpl#getReferencingElement2()
     * @generated
     */
	int REFERENCING_ELEMENT2 = 3;

	/**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT2__REFERENCED_ELEMENT = CONTAINABLE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Referencing Element2</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT2_FEATURE_COUNT = CONTAINABLE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT2___GET_NEAREST_PACKAGE = CONTAINABLE_OPERATION_COUNT + 0;

	/**
     * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCING_ELEMENT2___GET_UML_PARENT_NAMESPACE = CONTAINABLE_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Referencing Element2</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCING_ELEMENT2_OPERATION_COUNT = CONTAINABLE_OPERATION_COUNT + 2;


	/**
     * Returns the meta object for class '{@link dummy.Containable <em>Containable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Containable</em>'.
     * @see dummy.Containable
     * @generated
     */
	EClass getContainable();

	/**
     * Returns the meta object for class '{@link dummy.ReferencingElement <em>Referencing Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referencing Element</em>'.
     * @see dummy.ReferencingElement
     * @generated
     */
	EClass getReferencingElement();

	/**
     * Returns the meta object for class '{@link dummy.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see dummy.Container
     * @generated
     */
	EClass getContainer();

	/**
     * Returns the meta object for the containment reference list '{@link dummy.Container#getContent <em>Content</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Content</em>'.
     * @see dummy.Container#getContent()
     * @see #getContainer()
     * @generated
     */
	EReference getContainer_Content();

	/**
     * Returns the meta object for the '{@link dummy.Container#createReferencingElement() <em>Create Referencing Element</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Referencing Element</em>' operation.
     * @see dummy.Container#createReferencingElement()
     * @generated
     */
	EOperation getContainer__CreateReferencingElement();

	/**
     * Returns the meta object for the '{@link dummy.Container#createReferencingElement2() <em>Create Referencing Element2</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Referencing Element2</em>' operation.
     * @see dummy.Container#createReferencingElement2()
     * @generated
     */
	EOperation getContainer__CreateReferencingElement2();

	/**
     * Returns the meta object for the '{@link dummy.Container#createContainer() <em>Create Container</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Container</em>' operation.
     * @see dummy.Container#createContainer()
     * @generated
     */
	EOperation getContainer__CreateContainer();

	/**
     * Returns the meta object for class '{@link dummy.ReferencingElement2 <em>Referencing Element2</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referencing Element2</em>'.
     * @see dummy.ReferencingElement2
     * @generated
     */
	EClass getReferencingElement2();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	DummyFactory getDummyFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link dummy.Containable <em>Containable</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see dummy.Containable
         * @see dummy.impl.DummyPackageImpl#getContainable()
         * @generated
         */
		EClass CONTAINABLE = eINSTANCE.getContainable();

		/**
         * The meta object literal for the '{@link dummy.impl.ReferencingElementImpl <em>Referencing Element</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see dummy.impl.ReferencingElementImpl
         * @see dummy.impl.DummyPackageImpl#getReferencingElement()
         * @generated
         */
		EClass REFERENCING_ELEMENT = eINSTANCE.getReferencingElement();

		/**
         * The meta object literal for the '{@link dummy.impl.ContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see dummy.impl.ContainerImpl
         * @see dummy.impl.DummyPackageImpl#getContainer()
         * @generated
         */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
         * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONTAINER__CONTENT = eINSTANCE.getContainer_Content();

		/**
         * The meta object literal for the '<em><b>Create Referencing Element</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation CONTAINER___CREATE_REFERENCING_ELEMENT = eINSTANCE.getContainer__CreateReferencingElement();

		/**
         * The meta object literal for the '<em><b>Create Referencing Element2</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation CONTAINER___CREATE_REFERENCING_ELEMENT2 = eINSTANCE.getContainer__CreateReferencingElement2();

		/**
         * The meta object literal for the '<em><b>Create Container</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation CONTAINER___CREATE_CONTAINER = eINSTANCE.getContainer__CreateContainer();

		/**
         * The meta object literal for the '{@link dummy.impl.ReferencingElement2Impl <em>Referencing Element2</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see dummy.impl.ReferencingElement2Impl
         * @see dummy.impl.DummyPackageImpl#getReferencingElement2()
         * @generated
         */
		EClass REFERENCING_ELEMENT2 = eINSTANCE.getReferencingElement2();

	}

} //DummyPackage
