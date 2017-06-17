/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.component.metamodel.component.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage
 * @generated
 */
public class ComponentSwitch<T1> extends Switch<T1> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ComponentPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentSwitch() {
        if (modelPackage == null) {
            modelPackage = ComponentPackage.eINSTANCE;
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
            case ComponentPackage.COMPONENT_DIAGRAM: {
                ComponentDiagram componentDiagram = (ComponentDiagram)theEObject;
                T1 result = caseComponentDiagram(componentDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ROOT_PACKAGE: {
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
            case ComponentPackage.ELEMENT_RELATION: {
                ElementRelation elementRelation = (ElementRelation)theEObject;
                T1 result = caseElementRelation(elementRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PORT_RELATION: {
                PortRelation portRelation = (PortRelation)theEObject;
                T1 result = casePortRelation(portRelation);
                if (result == null) result = caseAliasedElement(portRelation);
                if (result == null) result = caseNamedElement(portRelation);
                if (result == null) result = caseElement(portRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.CONNECTOR: {
                Connector connector = (Connector)theEObject;
                T1 result = caseConnector(connector);
                if (result == null) result = caseUMLReferencingElement(connector);
                if (result == null) result = casePortRelation(connector);
                if (result == null) result = caseAliasedElement(connector);
                if (result == null) result = caseNamedElement(connector);
                if (result == null) result = caseElement(connector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.GENERALIZATION: {
                Generalization generalization = (Generalization)theEObject;
                T1 result = caseGeneralization(generalization);
                if (result == null) result = caseUMLReferencingElement(generalization);
                if (result == null) result = caseElementRelation(generalization);
                if (result == null) result = caseElement(generalization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ABSTRACTION: {
                Abstraction abstraction = (Abstraction)theEObject;
                T1 result = caseAbstraction(abstraction);
                if (result == null) result = caseUMLReferencingElement(abstraction);
                if (result == null) result = caseElementRelation(abstraction);
                if (result == null) result = caseElement(abstraction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.MANIFESTATION: {
                Manifestation manifestation = (Manifestation)theEObject;
                T1 result = caseManifestation(manifestation);
                if (result == null) result = caseUMLReferencingElement(manifestation);
                if (result == null) result = caseElementRelation(manifestation);
                if (result == null) result = caseElement(manifestation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.SUBSTITUTION: {
                Substitution substitution = (Substitution)theEObject;
                T1 result = caseSubstitution(substitution);
                if (result == null) result = caseUMLReferencingElement(substitution);
                if (result == null) result = caseElementRelation(substitution);
                if (result == null) result = caseElement(substitution);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.DEPENDENCY: {
                Dependency dependency = (Dependency)theEObject;
                T1 result = caseDependency(dependency);
                if (result == null) result = caseUMLReferencingElement(dependency);
                if (result == null) result = caseElementRelation(dependency);
                if (result == null) result = caseElement(dependency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ELEMENT_CONTENT: {
                ElementContent elementContent = (ElementContent)theEObject;
                T1 result = caseElementContent(elementContent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PROPERTY: {
                Property<?> property = (Property<?>)theEObject;
                T1 result = caseProperty(property);
                if (result == null) result = caseUMLReferencingElement(property);
                if (result == null) result = caseNamedElement(property);
                if (result == null) result = caseElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T1 result = caseComponent(component);
                if (result == null) result = caseCommentable(component);
                if (result == null) result = caseAliasedElement(component);
                if (result == null) result = caseElementContent(component);
                if (result == null) result = caseUMLReferencingElement(component);
                if (result == null) result = caseNamedElement(component);
                if (result == null) result = caseElement(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.INTERFACE: {
                Interface interface_ = (Interface)theEObject;
                T1 result = caseInterface(interface_);
                if (result == null) result = caseCommentable(interface_);
                if (result == null) result = caseElementContent(interface_);
                if (result == null) result = caseAliasedElement(interface_);
                if (result == null) result = caseUMLReferencingElement(interface_);
                if (result == null) result = caseNamedElement(interface_);
                if (result == null) result = caseElement(interface_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.METHOD: {
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
            case ComponentPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T1 result = caseParameter(parameter);
                if (result == null) result = caseProperty(parameter);
                if (result == null) result = caseUMLReferencingElement(parameter);
                if (result == null) result = caseNamedElement(parameter);
                if (result == null) result = caseElement(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ATTRIBUTE: {
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
            case ComponentPackage.MEMBER: {
                Member member = (Member)theEObject;
                T1 result = caseMember(member);
                if (result == null) result = caseProperty(member);
                if (result == null) result = caseUMLReferencingElement(member);
                if (result == null) result = caseNamedElement(member);
                if (result == null) result = caseElement(member);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.INTERFACE_RELATION: {
                InterfaceRelation interfaceRelation = (InterfaceRelation)theEObject;
                T1 result = caseInterfaceRelation(interfaceRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PROVIDE: {
                Provide provide = (Provide)theEObject;
                T1 result = caseProvide(provide);
                if (result == null) result = caseInterfaceRelation(provide);
                if (result == null) result = caseUMLReferencingElement(provide);
                if (result == null) result = caseElement(provide);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.REQUIRE: {
                Require require = (Require)theEObject;
                T1 result = caseRequire(require);
                if (result == null) result = caseInterfaceRelation(require);
                if (result == null) result = caseUMLReferencingElement(require);
                if (result == null) result = caseElement(require);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
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
     * Returns the result of interpreting the object as an instance of '<em>Element Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseElementRelation(ElementRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePortRelation(PortRelation object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseAbstraction(Abstraction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Manifestation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Manifestation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseManifestation(Manifestation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Substitution</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Substitution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseSubstitution(Substitution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseDependency(Dependency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseElementContent(ElementContent object) {
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
    public T1 caseMember(Member object) {
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

} //ComponentSwitch
