/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.component.metamodel.component.Abstraction;
import de.cooperateproject.modeling.textual.component.metamodel.component.Attribute;
import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier;
import de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.Component;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentFactory;
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Connector;
import de.cooperateproject.modeling.textual.component.metamodel.component.Dependency;
import de.cooperateproject.modeling.textual.component.metamodel.component.Generalization;
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface;
import de.cooperateproject.modeling.textual.component.metamodel.component.InterfaceRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.Manifestation;
import de.cooperateproject.modeling.textual.component.metamodel.component.Member;
import de.cooperateproject.modeling.textual.component.metamodel.component.Method;
import de.cooperateproject.modeling.textual.component.metamodel.component.Parameter;
import de.cooperateproject.modeling.textual.component.metamodel.component.Port;
import de.cooperateproject.modeling.textual.component.metamodel.component.PortRelation;
import de.cooperateproject.modeling.textual.component.metamodel.component.Property;
import de.cooperateproject.modeling.textual.component.metamodel.component.Provide;
import de.cooperateproject.modeling.textual.component.metamodel.component.Require;
import de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Substitution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rootPackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass portRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass manifestationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass substitutionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dependencyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memberEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass provideEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requireEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass portEClass = null;

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
     * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ComponentPackageImpl() {
        super(eNS_URI, ComponentFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ComponentPackage init() {
        if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

        // Obtain or create and register package
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TextualCommonsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theComponentPackage.createPackageContents();

        // Initialize created meta-data
        theComponentPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theComponentPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
        return theComponentPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComponentDiagram() {
        return componentDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComponentDiagram_Title() {
        return (EAttribute)componentDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponentDiagram_Rootpackage() {
        return (EReference)componentDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRootPackage() {
        return rootPackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Relation() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Classifier() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassifierRelation() {
        return classifierRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifierRelation_Leftclassifier() {
        return (EReference)classifierRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifierRelation_Rightclassifier() {
        return (EReference)classifierRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPortRelation() {
        return portRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPortRelation_Interface() {
        return (EReference)portRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPortRelation_Leftport() {
        return (EReference)portRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPortRelation_Rightport() {
        return (EReference)portRelationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPortRelation_Static() {
        return (EAttribute)portRelationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnector() {
        return connectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneralization() {
        return generalizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstraction() {
        return abstractionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getManifestation() {
        return manifestationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubstitution() {
        return substitutionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDependency() {
        return dependencyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassifier() {
        return classifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Visibility() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Static() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Type() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComponent() {
        return componentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Component() {
        return (EReference)componentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Portrelation() {
        return (EReference)componentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Port() {
        return (EReference)componentEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Interfacerelation() {
        return (EReference)componentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Interface() {
        return (EReference)componentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterface() {
        return interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterface_Member() {
        return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMethod() {
        return methodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMethod_Abstract() {
        return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMethod_Parameters() {
        return (EReference)methodEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameter_Owner() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMember() {
        return memberEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceRelation() {
        return interfaceRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceRelation_Interface() {
        return (EReference)interfaceRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProvide() {
        return provideEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRequire() {
        return requireEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPort() {
        return portEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPort_Visibility() {
        return (EAttribute)portEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentFactory getComponentFactory() {
        return (ComponentFactory)getEFactoryInstance();
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
        componentDiagramEClass = createEClass(COMPONENT_DIAGRAM);
        createEAttribute(componentDiagramEClass, COMPONENT_DIAGRAM__TITLE);
        createEReference(componentDiagramEClass, COMPONENT_DIAGRAM__ROOTPACKAGE);

        rootPackageEClass = createEClass(ROOT_PACKAGE);
        createEReference(rootPackageEClass, ROOT_PACKAGE__RELATION);
        createEReference(rootPackageEClass, ROOT_PACKAGE__CLASSIFIER);

        classifierRelationEClass = createEClass(CLASSIFIER_RELATION);
        createEReference(classifierRelationEClass, CLASSIFIER_RELATION__LEFTCLASSIFIER);
        createEReference(classifierRelationEClass, CLASSIFIER_RELATION__RIGHTCLASSIFIER);

        portRelationEClass = createEClass(PORT_RELATION);
        createEReference(portRelationEClass, PORT_RELATION__INTERFACE);
        createEReference(portRelationEClass, PORT_RELATION__LEFTPORT);
        createEReference(portRelationEClass, PORT_RELATION__RIGHTPORT);
        createEAttribute(portRelationEClass, PORT_RELATION__STATIC);

        connectorEClass = createEClass(CONNECTOR);

        generalizationEClass = createEClass(GENERALIZATION);

        abstractionEClass = createEClass(ABSTRACTION);

        manifestationEClass = createEClass(MANIFESTATION);

        substitutionEClass = createEClass(SUBSTITUTION);

        dependencyEClass = createEClass(DEPENDENCY);

        classifierEClass = createEClass(CLASSIFIER);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__VISIBILITY);
        createEAttribute(propertyEClass, PROPERTY__STATIC);
        createEReference(propertyEClass, PROPERTY__TYPE);

        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__COMPONENT);
        createEReference(componentEClass, COMPONENT__PORTRELATION);
        createEReference(componentEClass, COMPONENT__INTERFACERELATION);
        createEReference(componentEClass, COMPONENT__INTERFACE);
        createEReference(componentEClass, COMPONENT__PORT);

        interfaceEClass = createEClass(INTERFACE);
        createEReference(interfaceEClass, INTERFACE__MEMBER);

        methodEClass = createEClass(METHOD);
        createEAttribute(methodEClass, METHOD__ABSTRACT);
        createEReference(methodEClass, METHOD__PARAMETERS);

        parameterEClass = createEClass(PARAMETER);
        createEReference(parameterEClass, PARAMETER__OWNER);

        attributeEClass = createEClass(ATTRIBUTE);

        memberEClass = createEClass(MEMBER);

        interfaceRelationEClass = createEClass(INTERFACE_RELATION);
        createEReference(interfaceRelationEClass, INTERFACE_RELATION__INTERFACE);

        provideEClass = createEClass(PROVIDE);

        requireEClass = createEClass(REQUIRE);

        portEClass = createEClass(PORT);
        createEAttribute(portEClass, PORT__VISIBILITY);
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
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters
        ETypeParameter propertyEClass_T = addETypeParameter(propertyEClass, "T");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(theUMLPackage.getNamedElement());
        propertyEClass_T.getEBounds().add(g1);

        // Add supertypes to classes
        g1 = createEGenericType(theTextualCommonsPackage.getPackageBase());
        EGenericType g2 = createEGenericType(this.getRootPackage());
        g1.getETypeArguments().add(g2);
        rootPackageEClass.getEGenericSuperTypes().add(g1);
        classifierRelationEClass.getESuperTypes().add(theTextualCommonsPackage.getAliasedElement());
        portRelationEClass.getESuperTypes().add(theTextualCommonsPackage.getAliasedElement());
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getConnector());
        g1.getETypeArguments().add(g2);
        connectorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getPortRelation());
        connectorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getGeneralization());
        g1.getETypeArguments().add(g2);
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getAbstraction());
        g1.getETypeArguments().add(g2);
        abstractionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        abstractionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getManifestation());
        g1.getETypeArguments().add(g2);
        manifestationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        manifestationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getSubstitution());
        g1.getETypeArguments().add(g2);
        substitutionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        substitutionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getDependency());
        g1.getETypeArguments().add(g2);
        dependencyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        dependencyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(propertyEClass_T);
        g1.getETypeArguments().add(g2);
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getElement());
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(theUMLPackage.getComponent());
        g1.getETypeArguments().add(g2);
        componentEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        componentEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        componentEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(theUMLPackage.getInterface());
        g1.getETypeArguments().add(g2);
        interfaceEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        interfaceEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        interfaceEClass.getEGenericSuperTypes().add(g1);
        methodEClass.getESuperTypes().add(this.getMember());
        g1 = createEGenericType(this.getProperty());
        g2 = createEGenericType(theUMLPackage.getParameter());
        g1.getETypeArguments().add(g2);
        parameterEClass.getEGenericSuperTypes().add(g1);
        attributeEClass.getESuperTypes().add(this.getMember());
        g1 = createEGenericType(this.getProperty());
        g2 = createEGenericType(theUMLPackage.getProperty());
        g1.getETypeArguments().add(g2);
        memberEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getInterfaceRelation());
        provideEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getInterfaceRealization());
        g1.getETypeArguments().add(g2);
        provideEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getInterfaceRelation());
        requireEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getDependency());
        g1.getETypeArguments().add(g2);
        requireEClass.getEGenericSuperTypes().add(g1);
        portEClass.getESuperTypes().add(theTextualCommonsPackage.getNamedElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(componentDiagramEClass, ComponentDiagram.class, "ComponentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getComponentDiagram_Title(), ecorePackage.getEString(), "title", null, 1, 1, ComponentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponentDiagram_Rootpackage(), this.getRootPackage(), null, "rootpackage", null, 1, 1, ComponentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rootPackageEClass, RootPackage.class, "RootPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRootPackage_Relation(), this.getClassifierRelation(), null, "relation", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRootPackage_Classifier(), this.getClassifier(), null, "classifier", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classifierRelationEClass, ClassifierRelation.class, "ClassifierRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClassifierRelation_Leftclassifier(), this.getClassifier(), null, "leftclassifier", null, 1, 1, ClassifierRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassifierRelation_Rightclassifier(), this.getClassifier(), null, "rightclassifier", null, 1, 1, ClassifierRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(portRelationEClass, PortRelation.class, "PortRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPortRelation_Interface(), this.getInterface(), null, "interface", null, 1, 1, PortRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPortRelation_Leftport(), this.getPort(), null, "leftport", null, 1, 1, PortRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPortRelation_Rightport(), this.getPort(), null, "rightport", null, 1, 1, PortRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPortRelation_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, PortRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(manifestationEClass, Manifestation.class, "Manifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Visibility(), theTextualCommonsPackage.getVisibility(), "visibility", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_Type(), theUMLPackage.getClassifier(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_Component(), this.getComponent(), null, "component", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Portrelation(), this.getPortRelation(), null, "portrelation", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Interfacerelation(), this.getInterfaceRelation(), null, "interfacerelation", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Interface(), this.getInterface(), null, "interface", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Port(), this.getPort(), null, "port", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterface_Member(), this.getMember(), null, "member", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMethod_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMethod_Parameters(), this.getParameter(), this.getParameter_Owner(), "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameter_Owner(), this.getMethod(), this.getMethod_Parameters(), "owner", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interfaceRelationEClass, InterfaceRelation.class, "InterfaceRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceRelation_Interface(), this.getInterface(), null, "interface", null, 1, 1, InterfaceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(provideEClass, Provide.class, "Provide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPort_Visibility(), theTextualCommonsPackage.getVisibility(), "visibility", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ComponentPackageImpl
