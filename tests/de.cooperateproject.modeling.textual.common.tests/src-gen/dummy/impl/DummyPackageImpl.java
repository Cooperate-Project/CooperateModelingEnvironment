/**
 */
package dummy.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import dummy.Containable;
import dummy.DummyFactory;
import dummy.DummyPackage;
import dummy.ReferencingElement;

import dummy.ReferencingElement2;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DummyPackageImpl extends EPackageImpl implements DummyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencingElement2EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dummy.DummyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DummyPackageImpl() {
		super(eNS_URI, DummyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DummyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DummyPackage init() {
		if (isInited) return (DummyPackage)EPackage.Registry.INSTANCE.getEPackage(DummyPackage.eNS_URI);

		// Obtain or create and register package
		DummyPackageImpl theDummyPackage = (DummyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DummyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DummyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TextualCommonsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDummyPackage.createPackageContents();

		// Initialize created meta-data
		theDummyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDummyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DummyPackage.eNS_URI, theDummyPackage);
		return theDummyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainable() {
		return containableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencingElement() {
		return referencingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Content() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__CreateReferencingElement() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__CreateReferencingElement2() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__CreateContainer() {
		return containerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencingElement2() {
		return referencingElement2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyFactory getDummyFactory() {
		return (DummyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containableEClass = createEClass(CONTAINABLE);

		referencingElementEClass = createEClass(REFERENCING_ELEMENT);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENT);
		createEOperation(containerEClass, CONTAINER___CREATE_REFERENCING_ELEMENT);
		createEOperation(containerEClass, CONTAINER___CREATE_REFERENCING_ELEMENT2);
		createEOperation(containerEClass, CONTAINER___CREATE_CONTAINER);

		referencingElement2EClass = createEClass(REFERENCING_ELEMENT2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TextualCommonsPackage theTextualCommonsPackage = (TextualCommonsPackage)EPackage.Registry.INSTANCE.getEPackage(TextualCommonsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getContainable());
		referencingElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		EGenericType g2 = createEGenericType(theUMLPackage.getElement());
		g1.getETypeArguments().add(g2);
		referencingElementEClass.getEGenericSuperTypes().add(g1);
		containerEClass.getESuperTypes().add(this.getContainable());
		g1 = createEGenericType(this.getContainable());
		referencingElement2EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getElement());
		g1.getETypeArguments().add(g2);
		referencingElement2EClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(containableEClass, Containable.class, "Containable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencingElementEClass, ReferencingElement.class, "ReferencingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, dummy.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Content(), this.getContainable(), null, "content", null, 0, -1, dummy.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContainer__CreateReferencingElement(), this.getReferencingElement(), "createReferencingElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__CreateReferencingElement2(), this.getReferencingElement2(), "createReferencingElement2", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__CreateContainer(), this.getContainer(), "createContainer", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referencingElement2EClass, ReferencingElement2.class, "ReferencingElement2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DummyPackageImpl
