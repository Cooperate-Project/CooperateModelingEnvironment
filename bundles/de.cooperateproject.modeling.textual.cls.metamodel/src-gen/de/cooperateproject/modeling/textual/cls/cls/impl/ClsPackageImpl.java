/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClassifierAssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Commentable;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation;
import de.cooperateproject.modeling.textual.cls.cls.NamedElement;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementLongName;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.PrimitiveType;
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.cls.ReadingDirection;
import de.cooperateproject.modeling.textual.cls.cls.TypeReference;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import de.cooperateproject.modeling.textual.cls.cls.util.ClsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlReferencingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementLongNameEClass = null;

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
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierAssociationEndEClass = null;

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
	private EClass commentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum readingDirectionEEnum = null;

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
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theClsPackage.createPackageContents();

		// Initialize created meta-data
		theClsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theClsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ClsValidator.INSTANCE;
				 }
			 });

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
	public EReference getClassDiagram_PackageImports() {
		return (EReference)classDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagram_Classifiers() {
		return (EReference)classDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagram_Connectors() {
		return (EReference)classDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagram_Name() {
		return (EAttribute)classDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_Package() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeReference() {
		return dataTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeReference_Type() {
		return (EAttribute)dataTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLTypeReference() {
		return umlTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLTypeReference_Type() {
		return (EReference)umlTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLReferencingElement() {
		return umlReferencingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLReferencingElement_ReferencedElement() {
		return (EReference)umlReferencingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElementOptional() {
		return namedElementOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElementOptional_Name() {
		return (EAttribute)namedElementOptionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__HasReferencedElement__DiagnosticChain_Map() {
		return namedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElementLongName() {
		return namedElementLongNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElementLongName_LongName() {
		return (EAttribute)namedElementLongNameEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getClassifier_Visibility() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Members() {
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
	public EAttribute getProperty_Final() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
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
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Properties() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AggregationKind() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Bidirectional() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__GetCommentedElement() {
		return associationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEnd() {
		return associationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierAssociationEnd() {
		return classifierAssociationEndEClass;
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
	public EClass getCommentLink() {
		return commentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentLink_Left() {
		return (EReference)commentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentLink__HasComment__DiagnosticChain_Map() {
		return commentLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentLink__GetCommentedElement() {
		return commentLinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationProperties() {
		return associationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationProperties_CardinalityLeft() {
		return (EReference)associationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationProperties_CardinalityRight() {
		return (EReference)associationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_LowerBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_UpperBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentable() {
		return commentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentable_Comment() {
		return (EReference)commentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetCommentedElement() {
		return commentableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiAssociation() {
		return multiAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiAssociation_ConnectorEnds() {
		return (EReference)multiAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberEnd() {
		return memberEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberEnd_Cardinality() {
		return (EReference)memberEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberEnd_Type() {
		return (EReference)memberEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberEnd_Association() {
		return (EReference)memberEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberEnd_Navigable() {
		return (EAttribute)memberEndEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReadingDirection() {
		return readingDirectionEEnum;
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
		createEReference(classDiagramEClass, CLASS_DIAGRAM__PACKAGE_IMPORTS);
		createEReference(classDiagramEClass, CLASS_DIAGRAM__CLASSIFIERS);
		createEReference(classDiagramEClass, CLASS_DIAGRAM__CONNECTORS);
		createEAttribute(classDiagramEClass, CLASS_DIAGRAM__NAME);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEReference(packageImportEClass, PACKAGE_IMPORT__PACKAGE);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		dataTypeReferenceEClass = createEClass(DATA_TYPE_REFERENCE);
		createEAttribute(dataTypeReferenceEClass, DATA_TYPE_REFERENCE__TYPE);

		umlTypeReferenceEClass = createEClass(UML_TYPE_REFERENCE);
		createEReference(umlTypeReferenceEClass, UML_TYPE_REFERENCE__TYPE);

		umlReferencingElementEClass = createEClass(UML_REFERENCING_ELEMENT);
		createEReference(umlReferencingElementEClass, UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);

		namedElementOptionalEClass = createEClass(NAMED_ELEMENT_OPTIONAL);
		createEAttribute(namedElementOptionalEClass, NAMED_ELEMENT_OPTIONAL__NAME);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEOperation(namedElementEClass, NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP);

		namedElementLongNameEClass = createEClass(NAMED_ELEMENT_LONG_NAME);
		createEAttribute(namedElementLongNameEClass, NAMED_ELEMENT_LONG_NAME__LONG_NAME);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__VISIBILITY);
		createEReference(classifierEClass, CLASSIFIER__MEMBERS);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__ABSTRACT);

		interfaceEClass = createEClass(INTERFACE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VISIBILITY);
		createEAttribute(propertyEClass, PROPERTY__STATIC);
		createEAttribute(propertyEClass, PROPERTY__FINAL);
		createEReference(propertyEClass, PROPERTY__TYPE);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__OWNER);

		attributeEClass = createEClass(ATTRIBUTE);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__ABSTRACT);
		createEReference(methodEClass, METHOD__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OWNER);

		connectorEClass = createEClass(CONNECTOR);

		typedConnectorEClass = createEClass(TYPED_CONNECTOR);
		createEReference(typedConnectorEClass, TYPED_CONNECTOR__LEFT);
		createEReference(typedConnectorEClass, TYPED_CONNECTOR__RIGHT);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__PROPERTIES);
		createEAttribute(associationEClass, ASSOCIATION__AGGREGATION_KIND);
		createEAttribute(associationEClass, ASSOCIATION__BIDIRECTIONAL);
		createEOperation(associationEClass, ASSOCIATION___GET_COMMENTED_ELEMENT);

		associationEndEClass = createEClass(ASSOCIATION_END);

		classifierAssociationEndEClass = createEClass(CLASSIFIER_ASSOCIATION_END);

		generalizationEClass = createEClass(GENERALIZATION);

		implementationEClass = createEClass(IMPLEMENTATION);

		commentLinkEClass = createEClass(COMMENT_LINK);
		createEReference(commentLinkEClass, COMMENT_LINK__LEFT);
		createEOperation(commentLinkEClass, COMMENT_LINK___HAS_COMMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(commentLinkEClass, COMMENT_LINK___GET_COMMENTED_ELEMENT);

		associationPropertiesEClass = createEClass(ASSOCIATION_PROPERTIES);
		createEReference(associationPropertiesEClass, ASSOCIATION_PROPERTIES__CARDINALITY_LEFT);
		createEReference(associationPropertiesEClass, ASSOCIATION_PROPERTIES__CARDINALITY_RIGHT);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__LOWER_BOUND);
		createEAttribute(cardinalityEClass, CARDINALITY__UPPER_BOUND);

		commentableEClass = createEClass(COMMENTABLE);
		createEReference(commentableEClass, COMMENTABLE__COMMENT);
		createEOperation(commentableEClass, COMMENTABLE___GET_COMMENTED_ELEMENT);

		multiAssociationEClass = createEClass(MULTI_ASSOCIATION);
		createEReference(multiAssociationEClass, MULTI_ASSOCIATION__CONNECTOR_ENDS);

		memberEndEClass = createEClass(MEMBER_END);
		createEReference(memberEndEClass, MEMBER_END__CARDINALITY);
		createEReference(memberEndEClass, MEMBER_END__TYPE);
		createEReference(memberEndEClass, MEMBER_END__ASSOCIATION);
		createEAttribute(memberEndEClass, MEMBER_END__NAVIGABLE);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		readingDirectionEEnum = createEEnum(READING_DIRECTION);
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

		// Create type parameters
		ETypeParameter umlReferencingElementEClass_T = addETypeParameter(umlReferencingElementEClass, "T");
		ETypeParameter namedElementOptionalEClass_T = addETypeParameter(namedElementOptionalEClass, "T");
		ETypeParameter namedElementEClass_T = addETypeParameter(namedElementEClass, "T");
		ETypeParameter namedElementLongNameEClass_T = addETypeParameter(namedElementLongNameEClass, "T");
		ETypeParameter classifierEClass_T = addETypeParameter(classifierEClass, "T");
		ETypeParameter propertyEClass_T = addETypeParameter(propertyEClass, "T");
		ETypeParameter memberEClass_T = addETypeParameter(memberEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theUMLPackage.getNamedElement());
		umlReferencingElementEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUMLPackage.getNamedElement());
		namedElementOptionalEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUMLPackage.getNamedElement());
		namedElementEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUMLPackage.getNamedElement());
		namedElementLongNameEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUMLPackage.getClassifier());
		classifierEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUMLPackage.getNamedElement());
		propertyEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUMLPackage.getNamedElement());
		memberEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		dataTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		umlTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		umlTypeReferenceEClass.getESuperTypes().add(this.getClassifierAssociationEnd());
		g1 = createEGenericType(this.getUMLReferencingElement());
		EGenericType g2 = createEGenericType(namedElementOptionalEClass_T);
		g1.getETypeArguments().add(g2);
		namedElementOptionalEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElementOptional());
		g2 = createEGenericType(namedElementEClass_T);
		g1.getETypeArguments().add(g2);
		namedElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		g2 = createEGenericType(namedElementLongNameEClass_T);
		g1.getETypeArguments().add(g2);
		namedElementLongNameEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElementLongName());
		g2 = createEGenericType(classifierEClass_T);
		g1.getETypeArguments().add(g2);
		classifierEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getClassifier());
		g2 = createEGenericType(theUMLPackage.getClass_());
		g1.getETypeArguments().add(g2);
		classEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getClassifier());
		g2 = createEGenericType(theUMLPackage.getInterface());
		g1.getETypeArguments().add(g2);
		interfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		g2 = createEGenericType(propertyEClass_T);
		g1.getETypeArguments().add(g2);
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
		typedConnectorEClass.getESuperTypes().add(this.getConnector());
		g1 = createEGenericType(this.getNamedElement());
		g2 = createEGenericType(theUMLPackage.getAssociation());
		g1.getETypeArguments().add(g2);
		associationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTypedConnector());
		associationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCommentable());
		associationEClass.getEGenericSuperTypes().add(g1);
		classifierAssociationEndEClass.getESuperTypes().add(this.getAssociationEnd());
		generalizationEClass.getESuperTypes().add(this.getTypedConnector());
		implementationEClass.getESuperTypes().add(this.getTypedConnector());
		commentLinkEClass.getESuperTypes().add(this.getConnector());
		commentLinkEClass.getESuperTypes().add(this.getCommentable());
		g1 = createEGenericType(this.getConnector());
		multiAssociationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		g2 = createEGenericType(theUMLPackage.getAssociation());
		g1.getETypeArguments().add(g2);
		multiAssociationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAssociationEnd());
		memberEndEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElementOptional());
		g2 = createEGenericType(theUMLPackage.getProperty());
		g1.getETypeArguments().add(g2);
		memberEndEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(classDiagramEClass, ClassDiagram.class, "ClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDiagram_PackageImports(), this.getPackageImport(), null, "packageImports", null, 0, -1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getClassifier());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getClassDiagram_Classifiers(), g1, null, "classifiers", null, 0, -1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagram_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDiagram_Name(), ecorePackage.getEString(), "name", null, 1, 1, ClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageImport_Package(), theUMLPackage.getPackage(), null, "package", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeReferenceEClass, DataTypeReference.class, "DataTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypeReference_Type(), this.getPrimitiveType(), "type", null, 1, 1, DataTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlTypeReferenceEClass, UMLTypeReference.class, "UMLTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLTypeReference_Type(), theUMLPackage.getType(), null, "type", null, 1, 1, UMLTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlReferencingElementEClass, UMLReferencingElement.class, "UMLReferencingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(umlReferencingElementEClass_T);
		initEReference(getUMLReferencingElement_ReferencedElement(), g1, null, "referencedElement", null, 0, 1, UMLReferencingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementOptionalEClass, NamedElementOptional.class, "NamedElementOptional", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElementOptional_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElementOptional.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getNamedElement__HasReferencedElement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasReferencedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementLongNameEClass, NamedElementLongName.class, "NamedElementLongName", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElementLongName_LongName(), ecorePackage.getEString(), "longName", null, 0, 1, NamedElementLongName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMember());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getClassifier_Members(), g1, this.getMember_Owner(), "members", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, de.cooperateproject.modeling.textual.cls.cls.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, de.cooperateproject.modeling.textual.cls.cls.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Type(), this.getTypeReference(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getClassifier());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMember_Owner(), g1, this.getClassifier_Members(), "owner", null, 1, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameters(), this.getParameter(), this.getParameter_Owner(), "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Owner(), this.getMethod(), this.getMethod_Parameters(), "owner", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedConnectorEClass, TypedConnector.class, "TypedConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedConnector_Left(), this.getClassifierAssociationEnd(), null, "left", null, 1, 1, TypedConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedConnector_Right(), this.getClassifierAssociationEnd(), null, "right", null, 1, 1, TypedConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Properties(), this.getAssociationProperties(), null, "properties", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_AggregationKind(), this.getAggregationKind(), "aggregationKind", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAssociation__GetCommentedElement(), theUMLPackage.getType(), "getCommentedElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierAssociationEndEClass, ClassifierAssociationEnd.class, "ClassifierAssociationEnd", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentLinkEClass, CommentLink.class, "CommentLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentLink_Left(), this.getClassifierAssociationEnd(), null, "left", null, 1, 1, CommentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCommentLink__HasComment__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasComment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentLink__GetCommentedElement(), theUMLPackage.getType(), "getCommentedElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(associationPropertiesEClass, AssociationProperties.class, "AssociationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationProperties_CardinalityLeft(), this.getCardinality(), null, "cardinalityLeft", null, 0, 1, AssociationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationProperties_CardinalityRight(), this.getCardinality(), null, "cardinalityRight", null, 0, 1, AssociationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentableEClass, Commentable.class, "Commentable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentable_Comment(), theUMLPackage.getComment(), null, "comment", null, 0, 1, Commentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommentable__GetCommentedElement(), theUMLPackage.getType(), "getCommentedElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multiAssociationEClass, MultiAssociation.class, "MultiAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiAssociation_ConnectorEnds(), this.getMemberEnd(), this.getMemberEnd_Association(), "connectorEnds", null, 2, -1, MultiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEndEClass, MemberEnd.class, "MemberEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberEnd_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, MemberEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberEnd_Type(), this.getUMLTypeReference(), null, "type", null, 1, 1, MemberEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberEnd_Association(), this.getMultiAssociation(), this.getMultiAssociation_ConnectorEnds(), "association", null, 1, 1, MemberEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberEnd_Navigable(), ecorePackage.getEBoolean(), "navigable", null, 1, 1, MemberEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
		addEEnumLiteral(visibilityEEnum, Visibility.PACKAGE);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.CHAR);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BYTE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.SHORT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.LONG);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.FLOAT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);

		initEEnum(readingDirectionEEnum, ReadingDirection.class, "ReadingDirection");
		addEEnumLiteral(readingDirectionEEnum, ReadingDirection.LEFT);
		addEEnumLiteral(readingDirectionEEnum, ReadingDirection.RIGHT);

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
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasReferencedElement"
		   });	
		addAnnotation
		  (commentLinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasComment"
		   });
	}

} //ClsPackageImpl
