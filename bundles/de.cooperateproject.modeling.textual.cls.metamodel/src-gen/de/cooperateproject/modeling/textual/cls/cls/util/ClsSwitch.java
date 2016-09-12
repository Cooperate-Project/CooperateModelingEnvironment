/**
 */
package de.cooperateproject.modeling.textual.cls.cls.util;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClassifierAssociationEnd;
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
import de.cooperateproject.modeling.textual.cls.cls.Property;
import de.cooperateproject.modeling.textual.cls.cls.TypeReference;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage
 * @generated
 */
public class ClsSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClsSwitch() {
		if (modelPackage == null) {
			modelPackage = ClsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClsPackage.CLASS_DIAGRAM: {
				ClassDiagram classDiagram = (ClassDiagram)theEObject;
				T1 result = caseClassDiagram(classDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.PACKAGE_IMPORT: {
				PackageImport packageImport = (PackageImport)theEObject;
				T1 result = casePackageImport(packageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T1 result = caseTypeReference(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.DATA_TYPE_REFERENCE: {
				DataTypeReference dataTypeReference = (DataTypeReference)theEObject;
				T1 result = caseDataTypeReference(dataTypeReference);
				if (result == null) result = caseTypeReference(dataTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.UML_TYPE_REFERENCE: {
				UMLTypeReference umlTypeReference = (UMLTypeReference)theEObject;
				T1 result = caseUMLTypeReference(umlTypeReference);
				if (result == null) result = caseTypeReference(umlTypeReference);
				if (result == null) result = caseClassifierAssociationEnd(umlTypeReference);
				if (result == null) result = caseAssociationEnd(umlTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.UML_REFERENCING_ELEMENT: {
				UMLReferencingElement<?> umlReferencingElement = (UMLReferencingElement<?>)theEObject;
				T1 result = caseUMLReferencingElement(umlReferencingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.NAMED_ELEMENT_OPTIONAL: {
				NamedElementOptional<?> namedElementOptional = (NamedElementOptional<?>)theEObject;
				T1 result = caseNamedElementOptional(namedElementOptional);
				if (result == null) result = caseUMLReferencingElement(namedElementOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.NAMED_ELEMENT: {
				NamedElement<?> namedElement = (NamedElement<?>)theEObject;
				T1 result = caseNamedElement(namedElement);
				if (result == null) result = caseNamedElementOptional(namedElement);
				if (result == null) result = caseUMLReferencingElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.NAMED_ELEMENT_LONG_NAME: {
				NamedElementLongName<?> namedElementLongName = (NamedElementLongName<?>)theEObject;
				T1 result = caseNamedElementLongName(namedElementLongName);
				if (result == null) result = caseNamedElement(namedElementLongName);
				if (result == null) result = caseNamedElementOptional(namedElementLongName);
				if (result == null) result = caseUMLReferencingElement(namedElementLongName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.CLASSIFIER: {
				Classifier<?> classifier = (Classifier<?>)theEObject;
				T1 result = caseClassifier(classifier);
				if (result == null) result = caseNamedElementLongName(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseNamedElementOptional(classifier);
				if (result == null) result = caseUMLReferencingElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.CLASS: {
				de.cooperateproject.modeling.textual.cls.cls.Class class_ = (de.cooperateproject.modeling.textual.cls.cls.Class)theEObject;
				T1 result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseNamedElementLongName(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseNamedElementOptional(class_);
				if (result == null) result = caseUMLReferencingElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T1 result = caseInterface(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseNamedElementLongName(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseNamedElementOptional(interface_);
				if (result == null) result = caseUMLReferencingElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.PROPERTY: {
				Property<?> property = (Property<?>)theEObject;
				T1 result = caseProperty(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseNamedElementOptional(property);
				if (result == null) result = caseUMLReferencingElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.MEMBER: {
				Member<?> member = (Member<?>)theEObject;
				T1 result = caseMember(member);
				if (result == null) result = caseProperty(member);
				if (result == null) result = caseNamedElement(member);
				if (result == null) result = caseNamedElementOptional(member);
				if (result == null) result = caseUMLReferencingElement(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T1 result = caseAttribute(attribute);
				if (result == null) result = caseMember(attribute);
				if (result == null) result = caseProperty(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseNamedElementOptional(attribute);
				if (result == null) result = caseUMLReferencingElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.METHOD: {
				Method method = (Method)theEObject;
				T1 result = caseMethod(method);
				if (result == null) result = caseMember(method);
				if (result == null) result = caseProperty(method);
				if (result == null) result = caseNamedElement(method);
				if (result == null) result = caseNamedElementOptional(method);
				if (result == null) result = caseUMLReferencingElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T1 result = caseParameter(parameter);
				if (result == null) result = caseProperty(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseNamedElementOptional(parameter);
				if (result == null) result = caseUMLReferencingElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T1 result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.TYPED_CONNECTOR: {
				TypedConnector typedConnector = (TypedConnector)theEObject;
				T1 result = caseTypedConnector(typedConnector);
				if (result == null) result = caseConnector(typedConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T1 result = caseAssociation(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseTypedConnector(association);
				if (result == null) result = caseCommentable(association);
				if (result == null) result = caseNamedElementOptional(association);
				if (result == null) result = caseConnector(association);
				if (result == null) result = caseUMLReferencingElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.ASSOCIATION_END: {
				AssociationEnd associationEnd = (AssociationEnd)theEObject;
				T1 result = caseAssociationEnd(associationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.CLASSIFIER_ASSOCIATION_END: {
				ClassifierAssociationEnd classifierAssociationEnd = (ClassifierAssociationEnd)theEObject;
				T1 result = caseClassifierAssociationEnd(classifierAssociationEnd);
				if (result == null) result = caseAssociationEnd(classifierAssociationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T1 result = caseGeneralization(generalization);
				if (result == null) result = caseTypedConnector(generalization);
				if (result == null) result = caseConnector(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.IMPLEMENTATION: {
				Implementation implementation = (Implementation)theEObject;
				T1 result = caseImplementation(implementation);
				if (result == null) result = caseTypedConnector(implementation);
				if (result == null) result = caseConnector(implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.COMMENT_LINK: {
				CommentLink commentLink = (CommentLink)theEObject;
				T1 result = caseCommentLink(commentLink);
				if (result == null) result = caseConnector(commentLink);
				if (result == null) result = caseCommentable(commentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.ASSOCIATION_PROPERTIES: {
				AssociationProperties associationProperties = (AssociationProperties)theEObject;
				T1 result = caseAssociationProperties(associationProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.CARDINALITY: {
				Cardinality cardinality = (Cardinality)theEObject;
				T1 result = caseCardinality(cardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.COMMENTABLE: {
				Commentable commentable = (Commentable)theEObject;
				T1 result = caseCommentable(commentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.MULTI_ASSOCIATION: {
				MultiAssociation multiAssociation = (MultiAssociation)theEObject;
				T1 result = caseMultiAssociation(multiAssociation);
				if (result == null) result = caseConnector(multiAssociation);
				if (result == null) result = caseNamedElement(multiAssociation);
				if (result == null) result = caseNamedElementOptional(multiAssociation);
				if (result == null) result = caseUMLReferencingElement(multiAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClsPackage.MEMBER_END: {
				MemberEnd memberEnd = (MemberEnd)theEObject;
				T1 result = caseMemberEnd(memberEnd);
				if (result == null) result = caseAssociationEnd(memberEnd);
				if (result == null) result = caseNamedElementOptional(memberEnd);
				if (result == null) result = caseUMLReferencingElement(memberEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassDiagram(ClassDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePackageImport(PackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataTypeReference(DataTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUMLTypeReference(UMLTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Referencing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Referencing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.NamedElement> T1 caseUMLReferencingElement(UMLReferencingElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.NamedElement> T1 caseNamedElementOptional(NamedElementOptional<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.NamedElement> T1 caseNamedElement(NamedElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Long Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Long Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.NamedElement> T1 caseNamedElementLongName(NamedElementLongName<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.Classifier> T1 caseClassifier(Classifier<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClass(de.cooperateproject.modeling.textual.cls.cls.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.NamedElement> T1 caseProperty(Property<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends org.eclipse.uml2.uml.NamedElement> T1 caseMember(Member<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypedConnector(TypedConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssociationEnd(AssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassifierAssociationEnd(ClassifierAssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommentLink(CommentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssociationProperties(AssociationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCardinality(Cardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommentable(Commentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMultiAssociation(MultiAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemberEnd(MemberEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ClsSwitch
