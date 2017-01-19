/**
 */
package de.cooperateproject.ui.launchermodel.Launcher.impl;

import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherFactory;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;

import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LauncherPackageImpl extends EPackageImpl implements LauncherPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass diagramEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass concreteSyntaxModelEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass textualConcreteSyntaxModelEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass graphicalConcreteSyntaxModelEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType concreteSyntaxTypeNotAvailableExceptionWrapperEDataType = null;

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
     * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private LauncherPackageImpl() {
        super(eNS_URI, LauncherFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link LauncherPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static LauncherPackage init() {
        if (isInited) return (LauncherPackage)EPackage.Registry.INSTANCE.getEPackage(LauncherPackage.eNS_URI);

        // Obtain or create and register package
        LauncherPackageImpl theLauncherPackage = (LauncherPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LauncherPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LauncherPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theLauncherPackage.createPackageContents();

        // Initialize created meta-data
        theLauncherPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theLauncherPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(LauncherPackage.eNS_URI, theLauncherPackage);
        return theLauncherPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDiagram() {
        return diagramEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDiagram_Name() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDiagram_ConcreteSyntaxModels() {
        return (EReference)diagramEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDiagram__GetConcreteSyntaxModel__Class() {
        return diagramEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConcreteSyntaxModel() {
        return concreteSyntaxModelEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConcreteSyntaxModel_Extension() {
        return (EAttribute)concreteSyntaxModelEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConcreteSyntaxModel_RootElement() {
        return (EReference)concreteSyntaxModelEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTextualConcreteSyntaxModel() {
        return textualConcreteSyntaxModelEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGraphicalConcreteSyntaxModel() {
        return graphicalConcreteSyntaxModelEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getConcreteSyntaxTypeNotAvailableExceptionWrapper() {
        return concreteSyntaxTypeNotAvailableExceptionWrapperEDataType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LauncherFactory getLauncherFactory() {
        return (LauncherFactory)getEFactoryInstance();
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
        diagramEClass = createEClass(DIAGRAM);
        createEAttribute(diagramEClass, DIAGRAM__NAME);
        createEReference(diagramEClass, DIAGRAM__CONCRETE_SYNTAX_MODELS);
        createEOperation(diagramEClass, DIAGRAM___GET_CONCRETE_SYNTAX_MODEL__CLASS);

        concreteSyntaxModelEClass = createEClass(CONCRETE_SYNTAX_MODEL);
        createEAttribute(concreteSyntaxModelEClass, CONCRETE_SYNTAX_MODEL__EXTENSION);
        createEReference(concreteSyntaxModelEClass, CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT);

        textualConcreteSyntaxModelEClass = createEClass(TEXTUAL_CONCRETE_SYNTAX_MODEL);

        graphicalConcreteSyntaxModelEClass = createEClass(GRAPHICAL_CONCRETE_SYNTAX_MODEL);

        // Create data types
        concreteSyntaxTypeNotAvailableExceptionWrapperEDataType = createEDataType(CONCRETE_SYNTAX_TYPE_NOT_AVAILABLE_EXCEPTION_WRAPPER);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        textualConcreteSyntaxModelEClass.getESuperTypes().add(this.getConcreteSyntaxModel());
        graphicalConcreteSyntaxModelEClass.getESuperTypes().add(this.getConcreteSyntaxModel());

        // Initialize classes, features, and operations; add parameters
        initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagram_ConcreteSyntaxModels(), this.getConcreteSyntaxModel(), null, "concreteSyntaxModels", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getDiagram__GetConcreteSyntaxModel__Class(), null, "getConcreteSyntaxModel", 0, 1, IS_UNIQUE, IS_ORDERED);
        ETypeParameter t1 = addETypeParameter(op, "T");
        EGenericType g1 = createEGenericType(this.getConcreteSyntaxModel());
        t1.getEBounds().add(g1);
        g1 = createEGenericType(ecorePackage.getEJavaClass());
        EGenericType g2 = createEGenericType(t1);
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEException(op, this.getConcreteSyntaxTypeNotAvailableExceptionWrapper());
        g1 = createEGenericType(t1);
        initEOperation(op, g1);

        initEClass(concreteSyntaxModelEClass, ConcreteSyntaxModel.class, "ConcreteSyntaxModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConcreteSyntaxModel_Extension(), ecorePackage.getEString(), "extension", null, 1, 1, ConcreteSyntaxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConcreteSyntaxModel_RootElement(), ecorePackage.getEObject(), null, "rootElement", null, 1, 1, ConcreteSyntaxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(textualConcreteSyntaxModelEClass, TextualConcreteSyntaxModel.class, "TextualConcreteSyntaxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(graphicalConcreteSyntaxModelEClass, GraphicalConcreteSyntaxModel.class, "GraphicalConcreteSyntaxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(concreteSyntaxTypeNotAvailableExceptionWrapperEDataType, ConcreteSyntaxTypeNotAvailableException.class, "ConcreteSyntaxTypeNotAvailableExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //LauncherPackageImpl
