/**
 */
package de.cooperateproject.modeling.textual.cls.cls.util;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
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
import de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.PackageableElement;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.PrimitiveType;
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.cls.TypeReference;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage
 * @generated
 */
public class ClsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ClsValidator INSTANCE = new ClsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.cooperateproject.modeling.textual.cls.cls";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Referenced Element' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__HAS_REFERENCED_ELEMENT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Comment' of 'Comment Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT_LINK__HAS_COMMENT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ClsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ClsPackage.CLASS_DIAGRAM:
				return validateClassDiagram((ClassDiagram)value, diagnostics, context);
			case ClsPackage.PACKAGE:
				return validatePackage((de.cooperateproject.modeling.textual.cls.cls.Package)value, diagnostics, context);
			case ClsPackage.PACKAGEABLE_ELEMENT:
				return validatePackageableElement((PackageableElement)value, diagnostics, context);
			case ClsPackage.PACKAGE_IMPORT:
				return validatePackageImport((PackageImport)value, diagnostics, context);
			case ClsPackage.TYPE_REFERENCE:
				return validateTypeReference((TypeReference)value, diagnostics, context);
			case ClsPackage.DATA_TYPE_REFERENCE:
				return validateDataTypeReference((DataTypeReference)value, diagnostics, context);
			case ClsPackage.UML_TYPE_REFERENCE:
				return validateUMLTypeReference((UMLTypeReference)value, diagnostics, context);
			case ClsPackage.UML_REFERENCING_ELEMENT:
				return validateUMLReferencingElement((UMLReferencingElement<?>)value, diagnostics, context);
			case ClsPackage.NAMED_ELEMENT_OPTIONAL:
				return validateNamedElementOptional((NamedElementOptional<?>)value, diagnostics, context);
			case ClsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement<?>)value, diagnostics, context);
			case ClsPackage.NAMED_ELEMENT_ALIASED:
				return validateNamedElementAliased((NamedElementAliased<?>)value, diagnostics, context);
			case ClsPackage.CLASSIFIER:
				return validateClassifier((Classifier<?>)value, diagnostics, context);
			case ClsPackage.CLASS:
				return validateClass((de.cooperateproject.modeling.textual.cls.cls.Class)value, diagnostics, context);
			case ClsPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case ClsPackage.PROPERTY:
				return validateProperty((Property<?>)value, diagnostics, context);
			case ClsPackage.MEMBER:
				return validateMember((Member<?>)value, diagnostics, context);
			case ClsPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case ClsPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case ClsPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ClsPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case ClsPackage.TYPED_CONNECTOR:
				return validateTypedConnector((TypedConnector)value, diagnostics, context);
			case ClsPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case ClsPackage.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case ClsPackage.IMPLEMENTATION:
				return validateImplementation((Implementation)value, diagnostics, context);
			case ClsPackage.COMMENT_LINK:
				return validateCommentLink((CommentLink)value, diagnostics, context);
			case ClsPackage.ASSOCIATION_PROPERTIES:
				return validateAssociationProperties((AssociationProperties)value, diagnostics, context);
			case ClsPackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case ClsPackage.COMMENTABLE:
				return validateCommentable((Commentable)value, diagnostics, context);
			case ClsPackage.MULTI_ASSOCIATION:
				return validateMultiAssociation((MultiAssociation)value, diagnostics, context);
			case ClsPackage.MEMBER_END:
				return validateMemberEnd((MemberEnd)value, diagnostics, context);
			case ClsPackage.VISIBILITY:
				return validateVisibility((Visibility)value, diagnostics, context);
			case ClsPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case ClsPackage.AGGREGATION_KIND:
				return validateAggregationKind((AggregationKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassDiagram(ClassDiagram classDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)classDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(de.cooperateproject.modeling.textual.cls.cls.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(package_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageableElement(PackageableElement packageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)packageableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport(PackageImport packageImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)packageImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeReference(TypeReference typeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)typeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeReference(DataTypeReference dataTypeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataTypeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUMLTypeReference(UMLTypeReference umlTypeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)umlTypeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUMLReferencingElement(UMLReferencingElement<?> umlReferencingElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)umlReferencingElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementOptional(NamedElementOptional<?> namedElementOptional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)namedElementOptional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement<?> namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasReferencedElement constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_hasReferencedElement(NamedElement<?> namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.hasReferencedElement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementAliased(NamedElementAliased<?> namedElementAliased, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)namedElementAliased, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)namedElementAliased, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(namedElementAliased, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier<?> classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(classifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(de.cooperateproject.modeling.textual.cls.cls.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(class_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(interface_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property<?> property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(property, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member<?> member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)member, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)member, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(member, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(attribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)method, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)method, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(method, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(parameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)connector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedConnector(TypedConnector typedConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)typedConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(association, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)generalization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementation(Implementation implementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)implementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentLink(CommentLink commentLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)commentLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)commentLink, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommentLink_hasComment(commentLink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasComment constraint of '<em>Comment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentLink_hasComment(CommentLink commentLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return commentLink.hasComment(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationProperties(AssociationProperties associationProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)associationProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)cardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentable(Commentable commentable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)commentable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiAssociation(MultiAssociation multiAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)multiAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)multiAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasReferencedElement(multiAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberEnd(MemberEnd memberEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)memberEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(Visibility visibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationKind(AggregationKind aggregationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ClsValidator
