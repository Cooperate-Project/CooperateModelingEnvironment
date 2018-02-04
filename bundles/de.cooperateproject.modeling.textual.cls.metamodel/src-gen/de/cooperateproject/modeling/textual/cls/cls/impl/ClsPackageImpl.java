/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class ClsPackageImpl extends EPackageImpl implements ClsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packageEClass = null;

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
    private EClass classEClass = null;

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
    private EClass propertyEClass = null;

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
    private EClass attributeEClass = null;

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
    private EClass connectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typedConnectorEClass = null;

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
    private EClass implementationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationMemberEndEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xtextAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xtextAssociationMemberEndReferencedTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum aggregationKindEEnum = null;

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
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ClsPackageImpl() {
        super(eNS_URI, ClsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ClsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ClsPackage init() {
        if (isInited) return (ClsPackage)EPackage.Registry.INSTANCE.getEPackage(ClsPackage.eNS_URI);

        // Obtain or create and register package
        ClsPackageImpl theClsPackage = (ClsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClsPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        TextualCommonsPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theClsPackage.createPackageContents();

        // Initialize created meta-data
        theClsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theClsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ClsPackage.eNS_URI, theClsPackage);
        return theClsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassDiagram() {
        return classDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassDiagram_Title() {
        return (EAttribute)classDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassDiagram_RootPackage() {
        return (EReference)classDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getClassDiagram__GetAllTransitiveConnectors() {
        return classDiagramEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getClassDiagram__GetAllTransitivePackages() {
        return classDiagramEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getClassDiagram__GetAllTransitiveClassifiers() {
        return classDiagramEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackage() {
        return packageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPackage_Classifiers() {
        return (EReference)packageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPackage_Connectors() {
        return (EReference)packageEClass.getEStructuralFeatures().get(1);
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
    public EReference getClassifier_Members() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifier_OwningPackage() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getClass_Abstract() {
        return (EAttribute)classEClass.getEStructuralFeatures().get(0);
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
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Type() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(0);
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
    public EReference getMember_Owner() {
        return (EReference)memberEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMember_Static() {
        return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
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
    public EClass getConnector() {
        return connectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnector_OwningPackage() {
        return (EReference)connectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypedConnector() {
        return typedConnectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypedConnector_Left() {
        return (EReference)typedConnectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypedConnector_Right() {
        return (EReference)typedConnectorEClass.getEStructuralFeatures().get(1);
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
    public EClass getImplementation() {
        return implementationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociation() {
        return associationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociation_MemberEnds() {
        return (EReference)associationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociationMemberEnd() {
        return associationMemberEndEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationMemberEnd_Cardinality() {
        return (EReference)associationMemberEndEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationMemberEnd_Type() {
        return (EReference)associationMemberEndEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociationMemberEnd_Navigable() {
        return (EAttribute)associationMemberEndEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationMemberEnd_Association() {
        return (EReference)associationMemberEndEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociationMemberEnd_AggregationKind() {
        return (EAttribute)associationMemberEndEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXtextAssociation() {
        return xtextAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXtextAssociation_MemberEndTypes() {
        return (EReference)xtextAssociationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXtextAssociation_MemberEndNames() {
        return (EAttribute)xtextAssociationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXtextAssociation_MemberEndCardinalities() {
        return (EReference)xtextAssociationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXtextAssociation_MemberEndNavigabilities() {
        return (EAttribute)xtextAssociationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXtextAssociation_TwoSideBidirectionality() {
        return (EAttribute)xtextAssociationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXtextAssociation_TwoSideAggregationKind() {
        return (EAttribute)xtextAssociationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getXtextAssociation__CollectMemberEndTypes() {
        return xtextAssociationEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXtextAssociationMemberEndReferencedType() {
        return xtextAssociationMemberEndReferencedTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXtextAssociationMemberEndReferencedType_Type() {
        return (EReference)xtextAssociationMemberEndReferencedTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAggregationKind() {
        return aggregationKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClsFactory getClsFactory() {
        return (ClsFactory)getEFactoryInstance();
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
        classDiagramEClass = createEClass(CLASS_DIAGRAM);
        createEAttribute(classDiagramEClass, CLASS_DIAGRAM__TITLE);
        createEReference(classDiagramEClass, CLASS_DIAGRAM__ROOT_PACKAGE);
        createEOperation(classDiagramEClass, CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CONNECTORS);
        createEOperation(classDiagramEClass, CLASS_DIAGRAM___GET_ALL_TRANSITIVE_PACKAGES);
        createEOperation(classDiagramEClass, CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CLASSIFIERS);

        packageEClass = createEClass(PACKAGE);
        createEReference(packageEClass, PACKAGE__CLASSIFIERS);
        createEReference(packageEClass, PACKAGE__CONNECTORS);

        classifierEClass = createEClass(CLASSIFIER);
        createEReference(classifierEClass, CLASSIFIER__MEMBERS);
        createEReference(classifierEClass, CLASSIFIER__OWNING_PACKAGE);

        classEClass = createEClass(CLASS);
        createEAttribute(classEClass, CLASS__ABSTRACT);

        interfaceEClass = createEClass(INTERFACE);

        propertyEClass = createEClass(PROPERTY);
        createEReference(propertyEClass, PROPERTY__TYPE);

        memberEClass = createEClass(MEMBER);
        createEReference(memberEClass, MEMBER__OWNER);
        createEAttribute(memberEClass, MEMBER__STATIC);

        attributeEClass = createEClass(ATTRIBUTE);

        methodEClass = createEClass(METHOD);
        createEAttribute(methodEClass, METHOD__ABSTRACT);
        createEReference(methodEClass, METHOD__PARAMETERS);

        parameterEClass = createEClass(PARAMETER);
        createEReference(parameterEClass, PARAMETER__OWNER);

        connectorEClass = createEClass(CONNECTOR);
        createEReference(connectorEClass, CONNECTOR__OWNING_PACKAGE);

        typedConnectorEClass = createEClass(TYPED_CONNECTOR);
        createEReference(typedConnectorEClass, TYPED_CONNECTOR__LEFT);
        createEReference(typedConnectorEClass, TYPED_CONNECTOR__RIGHT);

        generalizationEClass = createEClass(GENERALIZATION);

        implementationEClass = createEClass(IMPLEMENTATION);

        associationEClass = createEClass(ASSOCIATION);
        createEReference(associationEClass, ASSOCIATION__MEMBER_ENDS);

        associationMemberEndEClass = createEClass(ASSOCIATION_MEMBER_END);
        createEReference(associationMemberEndEClass, ASSOCIATION_MEMBER_END__CARDINALITY);
        createEReference(associationMemberEndEClass, ASSOCIATION_MEMBER_END__TYPE);
        createEAttribute(associationMemberEndEClass, ASSOCIATION_MEMBER_END__NAVIGABLE);
        createEReference(associationMemberEndEClass, ASSOCIATION_MEMBER_END__ASSOCIATION);
        createEAttribute(associationMemberEndEClass, ASSOCIATION_MEMBER_END__AGGREGATION_KIND);

        xtextAssociationEClass = createEClass(XTEXT_ASSOCIATION);
        createEReference(xtextAssociationEClass, XTEXT_ASSOCIATION__MEMBER_END_TYPES);
        createEAttribute(xtextAssociationEClass, XTEXT_ASSOCIATION__MEMBER_END_NAMES);
        createEReference(xtextAssociationEClass, XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES);
        createEAttribute(xtextAssociationEClass, XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES);
        createEAttribute(xtextAssociationEClass, XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY);
        createEAttribute(xtextAssociationEClass, XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND);
        createEOperation(xtextAssociationEClass, XTEXT_ASSOCIATION___COLLECT_MEMBER_END_TYPES);

        xtextAssociationMemberEndReferencedTypeEClass = createEClass(XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE);
        createEReference(xtextAssociationMemberEndReferencedTypeEClass, XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE);

        // Create enums
        aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
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
        UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
        TextualCommonsPackage theTextualCommonsPackage = (TextualCommonsPackage)EPackage.Registry.INSTANCE.getEPackage(TextualCommonsPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters
        ETypeParameter classifierEClass_T = addETypeParameter(classifierEClass, "T");
        ETypeParameter propertyEClass_T = addETypeParameter(propertyEClass, "T");
        ETypeParameter memberEClass_T = addETypeParameter(memberEClass, "T");
        ETypeParameter typedConnectorEClass_T = addETypeParameter(typedConnectorEClass, "T");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(theUMLPackage.getClassifier());
        classifierEClass_T.getEBounds().add(g1);
        g1 = createEGenericType(theUMLPackage.getNamedElement());
        propertyEClass_T.getEBounds().add(g1);
        g1 = createEGenericType(theUMLPackage.getFeature());
        memberEClass_T.getEBounds().add(g1);
        g1 = createEGenericType(theUMLPackage.getDirectedRelationship());
        typedConnectorEClass_T.getEBounds().add(g1);

        // Add supertypes to classes
        g1 = createEGenericType(theTextualCommonsPackage.getPackageBase());
        EGenericType g2 = createEGenericType(this.getPackage());
        g1.getETypeArguments().add(g2);
        packageEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getPackageableElement());
        packageEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(classifierEClass_T);
        g1.getETypeArguments().add(g2);
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getAliasedElement());
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getPackageableElement());
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(classifierEClass_T);
        g1.getETypeArguments().add(g2);
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getVisibilityHavingElement());
        classifierEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getClass_());
        g1.getETypeArguments().add(g2);
        classEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType(theUMLPackage.getInterface());
        g1.getETypeArguments().add(g2);
        interfaceEClass.getEGenericSuperTypes().add(g1);
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
        g1 = createEGenericType(this.getProperty());
        g2 = createEGenericType(memberEClass_T);
        g1.getETypeArguments().add(g2);
        memberEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getMember());
        g2 = createEGenericType(theUMLPackage.getProperty());
        g1.getETypeArguments().add(g2);
        attributeEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getMember());
        g2 = createEGenericType(theUMLPackage.getOperation());
        g1.getETypeArguments().add(g2);
        methodEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getProperty());
        g2 = createEGenericType(theUMLPackage.getParameter());
        g1.getETypeArguments().add(g2);
        parameterEClass.getEGenericSuperTypes().add(g1);
        connectorEClass.getESuperTypes().add(theTextualCommonsPackage.getPackageableElement());
        g1 = createEGenericType(this.getConnector());
        typedConnectorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(typedConnectorEClass_T);
        g1.getETypeArguments().add(g2);
        typedConnectorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getTypedConnector());
        g2 = createEGenericType(theUMLPackage.getGeneralization());
        g1.getETypeArguments().add(g2);
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(theUMLPackage.getGeneralization());
        g1.getETypeArguments().add(g2);
        generalizationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getTypedConnector());
        g2 = createEGenericType(theUMLPackage.getInterfaceRealization());
        g1.getETypeArguments().add(g2);
        implementationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getAssociation());
        g1.getETypeArguments().add(g2);
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getConnector());
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getCommentable());
        g2 = createEGenericType(theUMLPackage.getAssociation());
        g1.getETypeArguments().add(g2);
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNameOptional());
        associationEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getUMLReferencingElement());
        g2 = createEGenericType(theUMLPackage.getProperty());
        g1.getETypeArguments().add(g2);
        associationMemberEndEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNamedElement());
        associationMemberEndEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(theTextualCommonsPackage.getNameOptional());
        associationMemberEndEClass.getEGenericSuperTypes().add(g1);
        xtextAssociationEClass.getESuperTypes().add(this.getAssociation());

        // Initialize classes, features, and operations; add parameters
        initEClass(classDiagramEClass, ClassDiagram.class, "ClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClassDiagram_Title(), ecorePackage.getEString(), "title", null, 1, 1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassDiagram_RootPackage(), this.getPackage(), null, "rootPackage", null, 1, 1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getClassDiagram__GetAllTransitiveConnectors(), this.getConnector(), "getAllTransitiveConnectors", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getClassDiagram__GetAllTransitivePackages(), this.getPackage(), "getAllTransitivePackages", 0, -1, IS_UNIQUE, IS_ORDERED);

        EOperation op = initEOperation(getClassDiagram__GetAllTransitiveClassifiers(), null, "getAllTransitiveClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        EGenericType g3 = createEGenericType(theUMLPackage.getClassifier());
        g2.setEUpperBound(g3);
        initEOperation(op, g1);

        initEClass(packageEClass, de.cooperateproject.modeling.textual.cls.cls.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g3 = createEGenericType(theUMLPackage.getClassifier());
        g2.setEUpperBound(g3);
        initEReference(getPackage_Classifiers(), g1, this.getClassifier_OwningPackage(), "classifiers", null, 0, -1, de.cooperateproject.modeling.textual.cls.cls.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPackage_Connectors(), this.getConnector(), this.getConnector_OwningPackage(), "connectors", null, 0, -1, de.cooperateproject.modeling.textual.cls.cls.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getMember());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g3 = createEGenericType(theUMLPackage.getFeature());
        g2.setEUpperBound(g3);
        initEReference(getClassifier_Members(), g1, this.getMember_Owner(), "members", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClassifier_OwningPackage(), this.getPackage(), this.getPackage_Classifiers(), "owningPackage", null, 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classEClass, de.cooperateproject.modeling.textual.cls.cls.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 0, 1, de.cooperateproject.modeling.textual.cls.cls.Class.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProperty_Type(), theUMLPackage.getClassifier(), null, "type", null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEReference(getMember_Owner(), g1, this.getClassifier_Members(), "owner", null, 1, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMember_Static(), ecorePackage.getEBoolean(), "static", "false", 0, 1, Member.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMethod_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 0, 1, Method.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMethod_Parameters(), this.getParameter(), this.getParameter_Owner(), "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameter_Owner(), this.getMethod(), this.getMethod_Parameters(), "owner", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnector_OwningPackage(), this.getPackage(), this.getPackage_Connectors(), "owningPackage", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typedConnectorEClass, TypedConnector.class, "TypedConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g3 = createEGenericType(theUMLPackage.getClassifier());
        g2.setEUpperBound(g3);
        initEReference(getTypedConnector_Left(), g1, null, "left", null, 1, 1, TypedConnector.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g3 = createEGenericType(theUMLPackage.getClassifier());
        g2.setEUpperBound(g3);
        initEReference(getTypedConnector_Right(), g1, null, "right", null, 1, 1, TypedConnector.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssociation_MemberEnds(), this.getAssociationMemberEnd(), this.getAssociationMemberEnd_Association(), "memberEnds", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(associationMemberEndEClass, AssociationMemberEnd.class, "AssociationMemberEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssociationMemberEnd_Cardinality(), theTextualCommonsPackage.getCardinality(), null, "cardinality", null, 0, 1, AssociationMemberEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g3 = createEGenericType(theUMLPackage.getClassifier());
        g2.setEUpperBound(g3);
        initEReference(getAssociationMemberEnd_Type(), g1, null, "type", null, 1, 1, AssociationMemberEnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociationMemberEnd_Navigable(), theEcorePackage.getEBoolean(), "navigable", "false", 1, 1, AssociationMemberEnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociationMemberEnd_Association(), this.getAssociation(), this.getAssociation_MemberEnds(), "association", null, 1, 1, AssociationMemberEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociationMemberEnd_AggregationKind(), this.getAggregationKind(), "aggregationKind", null, 0, 1, AssociationMemberEnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(xtextAssociationEClass, XtextAssociation.class, "XtextAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getXtextAssociation_MemberEndTypes(), this.getXtextAssociationMemberEndReferencedType(), null, "memberEndTypes", null, 0, -1, XtextAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getXtextAssociation_MemberEndNames(), ecorePackage.getEString(), "memberEndNames", null, 0, -1, XtextAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXtextAssociation_MemberEndCardinalities(), theTextualCommonsPackage.getCardinality(), null, "memberEndCardinalities", null, 0, -1, XtextAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getXtextAssociation_MemberEndNavigabilities(), ecorePackage.getEBoolean(), "memberEndNavigabilities", null, 0, -1, XtextAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getXtextAssociation_TwoSideBidirectionality(), ecorePackage.getEBoolean(), "twoSideBidirectionality", "false", 1, 1, XtextAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getXtextAssociation_TwoSideAggregationKind(), this.getAggregationKind(), "twoSideAggregationKind", null, 1, 1, XtextAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getXtextAssociation__CollectMemberEndTypes(), null, "collectMemberEndTypes", 0, -1, !IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEOperation(op, g1);

        initEClass(xtextAssociationMemberEndReferencedTypeEClass, XtextAssociationMemberEndReferencedType.class, "XtextAssociationMemberEndReferencedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getClassifier());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEReference(getXtextAssociationMemberEndReferencedType_Type(), g1, null, "type", null, 1, 1, XtextAssociationMemberEndReferencedType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
        addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);
        addEEnumLiteral(aggregationKindEEnum, AggregationKind.AGGREGATION);
        addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITION);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "settingDelegates", "http://cooperate-project.de/ecore/settingdelegate/duplicatefiltering"
           });
    }

} //ClsPackageImpl
