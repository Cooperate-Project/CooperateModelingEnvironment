/**
 */
package de.cooperateproject.modeling.textual.cls.cls.util;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
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
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

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
            case ClsPackage.PACKAGE: {
                de.cooperateproject.modeling.textual.cls.cls.Package package_ = (de.cooperateproject.modeling.textual.cls.cls.Package)theEObject;
                T1 result = casePackage(package_);
                if (result == null) result = casePackageBase(package_);
                if (result == null) result = casePackageableElement(package_);
                if (result == null) result = caseUMLReferencingElement(package_);
                if (result == null) result = caseNamedElement(package_);
                if (result == null) result = caseElement(package_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.CLASSIFIER: {
                Classifier<?> classifier = (Classifier<?>)theEObject;
                T1 result = caseClassifier(classifier);
                if (result == null) result = caseUMLReferencingElement(classifier);
                if (result == null) result = caseAliasedElement(classifier);
                if (result == null) result = casePackageableElement(classifier);
                if (result == null) result = caseNamedElement(classifier);
                if (result == null) result = caseElement(classifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.CLASS: {
                de.cooperateproject.modeling.textual.cls.cls.Class class_ = (de.cooperateproject.modeling.textual.cls.cls.Class)theEObject;
                T1 result = caseClass(class_);
                if (result == null) result = caseClassifier(class_);
                if (result == null) result = caseUMLReferencingElement(class_);
                if (result == null) result = caseAliasedElement(class_);
                if (result == null) result = casePackageableElement(class_);
                if (result == null) result = caseNamedElement(class_);
                if (result == null) result = caseElement(class_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.INTERFACE: {
                Interface interface_ = (Interface)theEObject;
                T1 result = caseInterface(interface_);
                if (result == null) result = caseClassifier(interface_);
                if (result == null) result = caseUMLReferencingElement(interface_);
                if (result == null) result = caseAliasedElement(interface_);
                if (result == null) result = casePackageableElement(interface_);
                if (result == null) result = caseNamedElement(interface_);
                if (result == null) result = caseElement(interface_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.PROPERTY: {
                Property<?> property = (Property<?>)theEObject;
                T1 result = caseProperty(property);
                if (result == null) result = caseUMLReferencingElement(property);
                if (result == null) result = caseNamedElement(property);
                if (result == null) result = caseElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.MEMBER: {
                Member<?> member = (Member<?>)theEObject;
                T1 result = caseMember(member);
                if (result == null) result = caseProperty(member);
                if (result == null) result = caseUMLReferencingElement(member);
                if (result == null) result = caseNamedElement(member);
                if (result == null) result = caseElement(member);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T1 result = caseAttribute(attribute);
                if (result == null) result = caseMember(attribute);
                if (result == null) result = caseProperty(attribute);
                if (result == null) result = caseUMLReferencingElement(attribute);
                if (result == null) result = caseNamedElement(attribute);
                if (result == null) result = caseElement(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.METHOD: {
                Method method = (Method)theEObject;
                T1 result = caseMethod(method);
                if (result == null) result = caseMember(method);
                if (result == null) result = caseProperty(method);
                if (result == null) result = caseUMLReferencingElement(method);
                if (result == null) result = caseNamedElement(method);
                if (result == null) result = caseElement(method);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T1 result = caseParameter(parameter);
                if (result == null) result = caseProperty(parameter);
                if (result == null) result = caseUMLReferencingElement(parameter);
                if (result == null) result = caseNamedElement(parameter);
                if (result == null) result = caseElement(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.CONNECTOR: {
                Connector connector = (Connector)theEObject;
                T1 result = caseConnector(connector);
                if (result == null) result = casePackageableElement(connector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.TYPED_CONNECTOR: {
                TypedConnector typedConnector = (TypedConnector)theEObject;
                T1 result = caseTypedConnector(typedConnector);
                if (result == null) result = caseConnector(typedConnector);
                if (result == null) result = casePackageableElement(typedConnector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.GENERALIZATION: {
                Generalization generalization = (Generalization)theEObject;
                T1 result = caseGeneralization(generalization);
                if (result == null) result = caseUMLReferencingElement(generalization);
                if (result == null) result = caseTypedConnector(generalization);
                if (result == null) result = caseElement(generalization);
                if (result == null) result = caseConnector(generalization);
                if (result == null) result = casePackageableElement(generalization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.IMPLEMENTATION: {
                Implementation implementation = (Implementation)theEObject;
                T1 result = caseImplementation(implementation);
                if (result == null) result = caseUMLReferencingElement(implementation);
                if (result == null) result = caseTypedConnector(implementation);
                if (result == null) result = caseElement(implementation);
                if (result == null) result = caseConnector(implementation);
                if (result == null) result = casePackageableElement(implementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.COMMENT_LINK: {
                CommentLink commentLink = (CommentLink)theEObject;
                T1 result = caseCommentLink(commentLink);
                if (result == null) result = caseConnector(commentLink);
                if (result == null) result = caseCommentable(commentLink);
                if (result == null) result = casePackageableElement(commentLink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.ASSOCIATION: {
                Association association = (Association)theEObject;
                T1 result = caseAssociation(association);
                if (result == null) result = caseUMLReferencingElement(association);
                if (result == null) result = caseConnector(association);
                if (result == null) result = caseCommentable(association);
                if (result == null) result = caseNamedElement(association);
                if (result == null) result = caseElement(association);
                if (result == null) result = casePackageableElement(association);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.ASSOCIATION_MEMBER_END: {
                AssociationMemberEnd associationMemberEnd = (AssociationMemberEnd)theEObject;
                T1 result = caseAssociationMemberEnd(associationMemberEnd);
                if (result == null) result = caseUMLReferencingElement(associationMemberEnd);
                if (result == null) result = caseNamedElement(associationMemberEnd);
                if (result == null) result = caseElement(associationMemberEnd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.XTEXT_ASSOCIATION: {
                XtextAssociation xtextAssociation = (XtextAssociation)theEObject;
                T1 result = caseXtextAssociation(xtextAssociation);
                if (result == null) result = caseAssociation(xtextAssociation);
                if (result == null) result = caseUMLReferencingElement(xtextAssociation);
                if (result == null) result = caseConnector(xtextAssociation);
                if (result == null) result = caseCommentable(xtextAssociation);
                if (result == null) result = caseNamedElement(xtextAssociation);
                if (result == null) result = caseElement(xtextAssociation);
                if (result == null) result = casePackageableElement(xtextAssociation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE: {
                XtextAssociationMemberEndReferencedType xtextAssociationMemberEndReferencedType = (XtextAssociationMemberEndReferencedType)theEObject;
                T1 result = caseXtextAssociationMemberEndReferencedType(xtextAssociationMemberEndReferencedType);
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
     * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePackage(de.cooperateproject.modeling.textual.cls.cls.Package object) {
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
    public <T extends NamedElement> T1 caseProperty(Property<T> object) {
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
    public <T extends NamedElement> T1 caseMember(Member<T> object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Association Member End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association Member End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseAssociationMemberEnd(AssociationMemberEnd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Xtext Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xtext Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseXtextAssociation(XtextAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Xtext Association Member End Referenced Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xtext Association Member End Referenced Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseXtextAssociationMemberEndReferencedType(XtextAssociationMemberEndReferencedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePackageableElement(PackageableElement object) {
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
    public <UMLType extends Element> T1 caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseElement(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element object) {
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
    public T1 caseNamedElement(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <PackageType extends PackageBase<?>> T1 casePackageBase(PackageBase<PackageType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aliased Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aliased Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseAliasedElement(AliasedElement object) {
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
