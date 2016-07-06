/**
 */
package de.cooperateproject.modeling.textual.cls.cls.util;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClassifierAssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClassifierReference;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Commentable;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.NamedElement;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementLongName;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Comment' of 'Comment Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT_LINK__HAS_COMMENT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
			case ClsPackage.PACKAGE_IMPORT:
				return validatePackageImport((PackageImport)value, diagnostics, context);
			case ClsPackage.TYPE_REFERENCE:
				return validateTypeReference((TypeReference)value, diagnostics, context);
			case ClsPackage.DATA_TYPE_REFERENCE:
				return validateDataTypeReference((DataTypeReference)value, diagnostics, context);
			case ClsPackage.CLASSIFIER_REFERENCE:
				return validateClassifierReference((ClassifierReference)value, diagnostics, context);
			case ClsPackage.UML_TYPE_REFERENCE:
				return validateUMLTypeReference((UMLTypeReference)value, diagnostics, context);
			case ClsPackage.UML_REFERENCING_ELEMENT:
				return validateUMLReferencingElement((UMLReferencingElement<?>)value, diagnostics, context);
			case ClsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement<?>)value, diagnostics, context);
			case ClsPackage.NAMED_ELEMENT_LONG_NAME:
				return validateNamedElementLongName((NamedElementLongName<?>)value, diagnostics, context);
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
			case ClsPackage.ASSOCIATION_END:
				return validateAssociationEnd((AssociationEnd)value, diagnostics, context);
			case ClsPackage.CLASSIFIER_ASSOCIATION_END:
				return validateClassifierAssociationEnd((ClassifierAssociationEnd)value, diagnostics, context);
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
			case ClsPackage.VISIBILITY:
				return validateVisibility((Visibility)value, diagnostics, context);
			case ClsPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case ClsPackage.READING_DIRECTION:
				return validateReadingDirection((ReadingDirection)value, diagnostics, context);
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
	public boolean validateClassifierReference(ClassifierReference classifierReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)classifierReference, diagnostics, context);
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
	public boolean validateNamedElement(NamedElement<?> namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementLongName(NamedElementLongName<?> namedElementLongName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)namedElementLongName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier<?> classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)classifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(de.cooperateproject.modeling.textual.cls.cls.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)class_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property<?> property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member<?> member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)member, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)method, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)parameter, diagnostics, context);
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
		return validate_EveryDefaultConstraint((EObject)association, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnd(AssociationEnd associationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)associationEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierAssociationEnd(ClassifierAssociationEnd classifierAssociationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)classifierAssociationEnd, diagnostics, context);
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
	public boolean validateReadingDirection(ReadingDirection readingDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
