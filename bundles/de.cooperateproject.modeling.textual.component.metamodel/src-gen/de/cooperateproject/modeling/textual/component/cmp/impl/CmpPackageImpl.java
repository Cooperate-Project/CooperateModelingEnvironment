/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.component.cmp.Abstraction;
import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.cmp.CmpFactory;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.cmp.Dependency;
import de.cooperateproject.modeling.textual.component.cmp.Generalization;
import de.cooperateproject.modeling.textual.component.cmp.Interface;
import de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity;
import de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation;
import de.cooperateproject.modeling.textual.component.cmp.Manifestation;
import de.cooperateproject.modeling.textual.component.cmp.Member;
import de.cooperateproject.modeling.textual.component.cmp.Method;
import de.cooperateproject.modeling.textual.component.cmp.Parameter;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.component.cmp.Property;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;
import de.cooperateproject.modeling.textual.component.cmp.Substitution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmpPackageImpl extends EPackageImpl implements CmpPackage {
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
    private EClass connectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorEndEClass = null;

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
    private EClass classEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceProvidingRequiringEntityEClass = null;

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
     * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CmpPackageImpl() {
        super(eNS_URI, CmpFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CmpPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CmpPackage init() {
        if (isInited) return (CmpPackage)EPackage.Registry.INSTANCE.getEPackage(CmpPackage.eNS_URI);

        // Obtain or create and register package
        CmpPackageImpl theCmpPackage = (CmpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CmpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CmpPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        TextualCommonsPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theCmpPackage.createPackageContents();

        // Initialize created meta-data
        theCmpPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCmpPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CmpPackage.eNS_URI, theCmpPackage);
        return theCmpPackage;
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
    public EReference getRootPackage_Relations() {
        return (EReference)rootPackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRootPackage_Classifiers() {
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
    public EReference getClassifierRelation_LeftClassifier() {
        return (EReference)classifierRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifierRelation_RightClassifier() {
        return (EReference)classifierRelationEClass.getEStructuralFeatures().get(1);
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
    public EReference getConnector_ConnectorEnds() {
        return (EReference)connectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorEnd() {
        return connectorEndEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorEnd_Part() {
        return (EReference)connectorEndEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorEnd_Role() {
        return (EReference)connectorEndEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getProperty_Static() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Type() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(1);
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
    public EReference getComponent_Attributes() {
        return (EReference)componentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Port() {
        return (EReference)componentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Connectors() {
        return (EReference)componentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_PackagedElements() {
        return (EReference)componentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClass_() {
        return classEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceProvidingRequiringEntity() {
        return interfaceProvidingRequiringEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceProvidingRequiringEntity_InterfaceRelation() {
        return (EReference)interfaceProvidingRequiringEntityEClass.getEStructuralFeatures().get(0);
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
    public EReference getInterface_Members() {
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
    public EReference getPort_RealizedClassifier() {
        return (EReference)portEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPort_Conjugated() {
        return (EAttribute)portEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmpFactory getCmpFactory() {
        return (CmpFactory)getEFactoryInstance();
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
        createEReference(rootPackageEClass, ROOT_PACKAGE__RELATIONS);
        createEReference(rootPackageEClass, ROOT_PACKAGE__CLASSIFIERS);

        classifierRelationEClass = createEClass(CLASSIFIER_RELATION);
        createEReference(classifierRelationEClass, CLASSIFIER_RELATION__LEFT_CLASSIFIER);
        createEReference(classifierRelationEClass, CLASSIFIER_RELATION__RIGHT_CLASSIFIER);

        connectorEClass = createEClass(CONNECTOR);
        createEReference(connectorEClass, CONNECTOR__CONNECTOR_ENDS);

        connectorEndEClass = createEClass(CONNECTOR_END);
        createEReference(connectorEndEClass, CONNECTOR_END__PART);
        createEReference(connectorEndEClass, CONNECTOR_END__ROLE);

        generalizationEClass = createEClass(GENERALIZATION);

        abstractionEClass = createEClass(ABSTRACTION);

        manifestationEClass = createEClass(MANIFESTATION);

        substitutionEClass = createEClass(SUBSTITUTION);

        dependencyEClass = createEClass(DEPENDENCY);

        classifierEClass = createEClass(CLASSIFIER);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__STATIC);
        createEReference(propertyEClass, PROPERTY__TYPE);

        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__ATTRIBUTES);
        createEReference(componentEClass, COMPONENT__PORT);
        createEReference(componentEClass, COMPONENT__CONNECTORS);
        createEReference(componentEClass, COMPONENT__PACKAGED_ELEMENTS);

        classEClass = createEClass(CLASS);

        interfaceProvidingRequiringEntityEClass = createEClass(INTERFACE_PROVIDING_REQUIRING_ENTITY);
        createEReference(interfaceProvidingRequiringEntityEClass, INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_RELATION);

        interfaceEClass = createEClass(INTERFACE);
        createEReference(interfaceEClass, INTERFACE__MEMBERS);

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
        createEReference(portEClass, PORT__REALIZED_CLASSIFIER);
        createEAttribute(portEClass, PORT__CONJUGATED);
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
        ETypeParameter classifierRelationEClass_LeftUMLType = addETypeParameter(classifierRelationEClass, "LeftUMLType");
        ETypeParameter classifierRelationEClass_RightUMLType = addETypeParameter(classifierRelationEClass, "RightUMLType");
        ETypeParameter classifierEClass_T = addETypeParameter(classifierEClass, "T");
        ETypeParameter propertyEClass_T = addETypeParameter(propertyEClass, "T");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(theUMLPackage.getClassifier());
        classifierRelationEClass_LeftUMLType.getEBounds().add(g1);
        g1 = createEGenericType(theUMLPackage.getClassifier());
        classifierRelationEClass_RightUMLType.getEBounds().add(g1);
        g1 = createEGenericType(theUMLPackage.getClassifier());
        classifierEClass_T.getEBounds().add(g1);
        g1 = createEGenericType(theUMLPackage.getNamedElement());
        propertyEClass_T.getEBounds().add(g1);

        // Add supertypes to classes
        g1 = createEGenericType(theTextualCommonsPackage.getPackageBase());
        EGenericType g2 = createEGenericType(this.getRootPackage());
        g1.getETypeArguments().add(g2);
        rootPackageEClass.getEGenericSuperTypes().add(g1);
        classifierRelationEClass.getESuperTypes().add(theTextualCommonsPackage.getAliasedElement());
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getConnector());
        g1.getETypeArguments().add(g2);
        connectorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        connectorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getConnectorEnd());
        g1.getETypeArguments().add(g2);
        connectorEndEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getGeneralization());
        g1.getETypeArguments().add(g2);
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        g2 = createEGenericType(theUMLPackage.getInterface());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theUMLPackage.getInterface());
        g1.getETypeArguments().add(g2);
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getAbstraction());
        g1.getETypeArguments().add(g2);
        abstractionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        abstractionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getManifestation());
        g1.getETypeArguments().add(g2);
        manifestationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        manifestationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getSubstitution());
        g1.getETypeArguments().add(g2);
        substitutionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        substitutionEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getDependency());
        g1.getETypeArguments().add(g2);
        dependencyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifierRelation());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        dependencyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(classifierEClass_T);
        g1.getETypeArguments().add(g2);
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getPackageableElement());
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(propertyEClass_T);
        g1.getETypeArguments().add(g2);
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getElement());
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getVisibilityHavingElement());
        propertyEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getComponent());
        g1.getETypeArguments().add(g2);
        componentEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getInterfaceProvidingRequiringEntity());
        componentEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getClass_());
        g1.getETypeArguments().add(g2);
        classEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getInterfaceProvidingRequiringEntity());
        classEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getInterface());
        g1.getETypeArguments().add(g2);
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
        interfaceRelationEClass.getESuperTypes().add(theTextualCommonsPackage.getAliasedElement());
        g1 = createEGenericType(this.getInterfaceRelation());
        provideEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getInterfaceRealization());
        g1.getETypeArguments().add(g2);
        provideEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getInterfaceRelation());
        requireEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getUsage());
        g1.getETypeArguments().add(g2);
        requireEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        portEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getVisibilityHavingElement());
        portEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getPort());
        g1.getETypeArguments().add(g2);
        portEClass.getEGenericSuperTypes().add(g1);

        // Initialize classes, features, and operations; add parameters
        initEClass(componentDiagramEClass, ComponentDiagram.class, "ComponentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getComponentDiagram_Title(), ecorePackage.getEString(), "title", null, 1, 1, ComponentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponentDiagram_Rootpackage(), this.getRootPackage(), null, "rootpackage", null, 1, 1, ComponentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rootPackageEClass, RootPackage.class, "RootPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifierRelation());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEReference(getRootPackage_Relations(), g1, null, "relations", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        initEReference(getRootPackage_Classifiers(), g1, null, "classifiers", null, 0, -1, RootPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classifierRelationEClass, ClassifierRelation.class, "ClassifierRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(classifierRelationEClass_LeftUMLType);
        g1.getETypeArguments().add(g2);
        initEReference(getClassifierRelation_LeftClassifier(), g1, null, "leftClassifier", null, 1, 1, ClassifierRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(classifierRelationEClass_RightUMLType);
        g1.getETypeArguments().add(g2);
        initEReference(getClassifierRelation_RightClassifier(), g1, null, "rightClassifier", null, 1, 1, ClassifierRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnector_ConnectorEnds(), this.getConnectorEnd(), null, "connectorEnds", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorEndEClass, ConnectorEnd.class, "ConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnectorEnd_Part(), this.getAttribute(), null, "part", null, 0, 1, ConnectorEnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorEnd_Role(), this.getPort(), null, "role", null, 0, 1, ConnectorEnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(manifestationEClass, Manifestation.class, "Manifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_Type(), theUMLPackage.getClassifier(), null, "type", null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Port(), this.getPort(), null, "port", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComponent_PackagedElements(), theTextualCommonsPackage.getPackageableElement(), null, "packagedElements", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classEClass, de.cooperateproject.modeling.textual.component.cmp.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interfaceProvidingRequiringEntityEClass, InterfaceProvidingRequiringEntity.class, "InterfaceProvidingRequiringEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceProvidingRequiringEntity_InterfaceRelation(), this.getInterfaceRelation(), null, "interfaceRelation", null, 0, -1, InterfaceProvidingRequiringEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterface_Members(), this.getMember(), null, "members", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMethod_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMethod_Parameters(), this.getParameter(), this.getParameter_Owner(), "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameter_Owner(), this.getMethod(), this.getMethod_Parameters(), "owner", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interfaceRelationEClass, InterfaceRelation.class, "InterfaceRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceRelation_Interface(), this.getInterface(), null, "interface", null, 0, 1, InterfaceRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(provideEClass, Provide.class, "Provide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getClassifier());
        g1.getETypeArguments().add(g2);
        initEReference(getPort_RealizedClassifier(), g1, null, "realizedClassifier", null, 0, 1, Port.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPort_Conjugated(), theEcorePackage.getEBoolean(), "conjugated", null, 0, 1, Port.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //CmpPackageImpl
