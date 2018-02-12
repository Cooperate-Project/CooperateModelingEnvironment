/**
 */
package de.cooperateproject.modeling.textual.component.cmp.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.cmp.Generalization;
import de.cooperateproject.modeling.textual.component.cmp.Interface;
import de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity;
import de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation;
import de.cooperateproject.modeling.textual.component.cmp.Member;
import de.cooperateproject.modeling.textual.component.cmp.Method;
import de.cooperateproject.modeling.textual.component.cmp.Parameter;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.component.cmp.Property;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Feature;
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
 * @see de.cooperateproject.modeling.textual.component.cmp.CmpPackage
 * @generated
 */
public class CmpSwitch<T1> extends Switch<T1> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CmpPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmpSwitch() {
        if (modelPackage == null) {
            modelPackage = CmpPackage.eINSTANCE;
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
            case CmpPackage.COMPONENT_DIAGRAM: {
                ComponentDiagram componentDiagram = (ComponentDiagram)theEObject;
                T1 result = caseComponentDiagram(componentDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.ROOT_PACKAGE: {
                RootPackage rootPackage = (RootPackage)theEObject;
                T1 result = caseRootPackage(rootPackage);
                if (result == null) result = casePackageBase(rootPackage);
                if (result == null) result = casePackageableElement(rootPackage);
                if (result == null) result = caseUMLReferencingElement(rootPackage);
                if (result == null) result = caseNamedElement(rootPackage);
                if (result == null) result = caseElement(rootPackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.CLASSIFIER_RELATION: {
                ClassifierRelation<?, ?> classifierRelation = (ClassifierRelation<?, ?>)theEObject;
                T1 result = caseClassifierRelation(classifierRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.CONNECTOR: {
                Connector connector = (Connector)theEObject;
                T1 result = caseConnector(connector);
                if (result == null) result = caseUMLReferencingElement(connector);
                if (result == null) result = caseAliasedElement(connector);
                if (result == null) result = caseNamedElement(connector);
                if (result == null) result = caseElement(connector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.CONNECTOR_END: {
                ConnectorEnd connectorEnd = (ConnectorEnd)theEObject;
                T1 result = caseConnectorEnd(connectorEnd);
                if (result == null) result = caseUMLReferencingElement(connectorEnd);
                if (result == null) result = caseElement(connectorEnd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.GENERALIZATION: {
                Generalization generalization = (Generalization)theEObject;
                T1 result = caseGeneralization(generalization);
                if (result == null) result = caseClassifierRelation(generalization);
                if (result == null) result = caseCommentable(generalization);
                if (result == null) result = caseUMLReferencingElement(generalization);
                if (result == null) result = caseElement(generalization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.CLASSIFIER: {
                Classifier<?> classifier = (Classifier<?>)theEObject;
                T1 result = caseClassifier(classifier);
                if (result == null) result = caseCommentable(classifier);
                if (result == null) result = caseAliasedElement(classifier);
                if (result == null) result = casePackageableElement(classifier);
                if (result == null) result = caseUMLReferencingElement(classifier);
                if (result == null) result = caseNamedElement(classifier);
                if (result == null) result = caseElement(classifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.PROPERTY: {
                Property<?> property = (Property<?>)theEObject;
                T1 result = caseProperty(property);
                if (result == null) result = caseUMLReferencingElement(property);
                if (result == null) result = caseNamedElement(property);
                if (result == null) result = caseVisibilityHavingElement(property);
                if (result == null) result = caseElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T1 result = caseComponent(component);
                if (result == null) result = caseClassifier(component);
                if (result == null) result = caseInterfaceProvidingRequiringEntity(component);
                if (result == null) result = caseCommentable(component);
                if (result == null) result = caseAliasedElement(component);
                if (result == null) result = casePackageableElement(component);
                if (result == null) result = caseUMLReferencingElement(component);
                if (result == null) result = caseNamedElement(component);
                if (result == null) result = caseElement(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.CLASS: {
                de.cooperateproject.modeling.textual.component.cmp.Class class_ = (de.cooperateproject.modeling.textual.component.cmp.Class)theEObject;
                T1 result = caseClass(class_);
                if (result == null) result = caseClassifier(class_);
                if (result == null) result = caseInterfaceProvidingRequiringEntity(class_);
                if (result == null) result = caseCommentable(class_);
                if (result == null) result = caseAliasedElement(class_);
                if (result == null) result = casePackageableElement(class_);
                if (result == null) result = caseUMLReferencingElement(class_);
                if (result == null) result = caseNamedElement(class_);
                if (result == null) result = caseElement(class_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY: {
                InterfaceProvidingRequiringEntity interfaceProvidingRequiringEntity = (InterfaceProvidingRequiringEntity)theEObject;
                T1 result = caseInterfaceProvidingRequiringEntity(interfaceProvidingRequiringEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.INTERFACE: {
                Interface interface_ = (Interface)theEObject;
                T1 result = caseInterface(interface_);
                if (result == null) result = caseClassifier(interface_);
                if (result == null) result = caseCommentable(interface_);
                if (result == null) result = caseAliasedElement(interface_);
                if (result == null) result = casePackageableElement(interface_);
                if (result == null) result = caseUMLReferencingElement(interface_);
                if (result == null) result = caseNamedElement(interface_);
                if (result == null) result = caseElement(interface_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.METHOD: {
                Method method = (Method)theEObject;
                T1 result = caseMethod(method);
                if (result == null) result = caseMember(method);
                if (result == null) result = caseProperty(method);
                if (result == null) result = caseUMLReferencingElement(method);
                if (result == null) result = caseNamedElement(method);
                if (result == null) result = caseVisibilityHavingElement(method);
                if (result == null) result = caseElement(method);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T1 result = caseParameter(parameter);
                if (result == null) result = caseProperty(parameter);
                if (result == null) result = caseUMLReferencingElement(parameter);
                if (result == null) result = caseNamedElement(parameter);
                if (result == null) result = caseVisibilityHavingElement(parameter);
                if (result == null) result = caseElement(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T1 result = caseAttribute(attribute);
                if (result == null) result = caseMember(attribute);
                if (result == null) result = caseProperty(attribute);
                if (result == null) result = caseUMLReferencingElement(attribute);
                if (result == null) result = caseNamedElement(attribute);
                if (result == null) result = caseVisibilityHavingElement(attribute);
                if (result == null) result = caseElement(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.MEMBER: {
                Member<?> member = (Member<?>)theEObject;
                T1 result = caseMember(member);
                if (result == null) result = caseProperty(member);
                if (result == null) result = caseUMLReferencingElement(member);
                if (result == null) result = caseNamedElement(member);
                if (result == null) result = caseVisibilityHavingElement(member);
                if (result == null) result = caseElement(member);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.INTERFACE_RELATION: {
                InterfaceRelation interfaceRelation = (InterfaceRelation)theEObject;
                T1 result = caseInterfaceRelation(interfaceRelation);
                if (result == null) result = caseAliasedElement(interfaceRelation);
                if (result == null) result = caseNamedElement(interfaceRelation);
                if (result == null) result = caseElement(interfaceRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.PROVIDE: {
                Provide provide = (Provide)theEObject;
                T1 result = caseProvide(provide);
                if (result == null) result = caseInterfaceRelation(provide);
                if (result == null) result = caseCommentable(provide);
                if (result == null) result = caseAliasedElement(provide);
                if (result == null) result = caseUMLReferencingElement(provide);
                if (result == null) result = caseNamedElement(provide);
                if (result == null) result = caseElement(provide);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.REQUIRE: {
                Require require = (Require)theEObject;
                T1 result = caseRequire(require);
                if (result == null) result = caseInterfaceRelation(require);
                if (result == null) result = caseCommentable(require);
                if (result == null) result = caseAliasedElement(require);
                if (result == null) result = caseUMLReferencingElement(require);
                if (result == null) result = caseNamedElement(require);
                if (result == null) result = caseElement(require);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CmpPackage.PORT: {
                Port port = (Port)theEObject;
                T1 result = casePort(port);
                if (result == null) result = caseNamedElement(port);
                if (result == null) result = caseVisibilityHavingElement(port);
                if (result == null) result = caseUMLReferencingElement(port);
                if (result == null) result = caseElement(port);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Component Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseComponentDiagram(ComponentDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Root Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Root Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseRootPackage(RootPackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classifier Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <LeftUMLType extends org.eclipse.uml2.uml.Classifier, RightUMLType extends org.eclipse.uml2.uml.Classifier> T1 caseClassifierRelation(ClassifierRelation<LeftUMLType, RightUMLType> object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseConnectorEnd(ConnectorEnd object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseComponent(Component object) {
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
    public T1 caseClass(de.cooperateproject.modeling.textual.component.cmp.Class object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
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
    public <T extends Feature> T1 caseMember(Member<T> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseInterfaceRelation(InterfaceRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provide</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provide</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseProvide(Provide object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Require</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Require</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseRequire(Require object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePort(Port object) {
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
    public T1 caseElement(Element object) {
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
    public <UMLType extends org.eclipse.uml2.uml.Element> T1 caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
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
    public <CommentableUMLType extends org.eclipse.uml2.uml.Element> T1 caseCommentable(Commentable<CommentableUMLType> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Visibility Having Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Visibility Having Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseVisibilityHavingElement(VisibilityHavingElement object) {
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

} //CmpSwitch
