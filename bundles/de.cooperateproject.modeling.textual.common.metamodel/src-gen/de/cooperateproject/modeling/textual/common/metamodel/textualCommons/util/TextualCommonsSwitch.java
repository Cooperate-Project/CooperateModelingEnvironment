/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.*;

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
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
 * @generated
 */
public class TextualCommonsSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static TextualCommonsPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextualCommonsSwitch() {
        if (modelPackage == null) {
            modelPackage = TextualCommonsPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TextualCommonsPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.NAMED_ELEMENT: {
                NamedElement namedElement = (NamedElement)theEObject;
                T result = caseNamedElement(namedElement);
                if (result == null) result = caseElement(namedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.ALIASED_ELEMENT: {
                AliasedElement aliasedElement = (AliasedElement)theEObject;
                T result = caseAliasedElement(aliasedElement);
                if (result == null) result = caseNamedElement(aliasedElement);
                if (result == null) result = caseElement(aliasedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT: {
                UMLReferencingElement<?> umlReferencingElement = (UMLReferencingElement<?>)theEObject;
                T result = caseUMLReferencingElement(umlReferencingElement);
                if (result == null) result = caseElement(umlReferencingElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.PACKAGE_BASE: {
                PackageBase<?> packageBase = (PackageBase<?>)theEObject;
                T result = casePackageBase(packageBase);
                if (result == null) result = casePackageableElement(packageBase);
                if (result == null) result = caseUMLReferencingElement(packageBase);
                if (result == null) result = caseNamedElement(packageBase);
                if (result == null) result = caseElement(packageBase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.COMMENTABLE: {
                Commentable<?> commentable = (Commentable<?>)theEObject;
                T result = caseCommentable(commentable);
                if (result == null) result = caseUMLReferencingElement(commentable);
                if (result == null) result = caseElement(commentable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.COMMENT: {
                Comment comment = (Comment)theEObject;
                T result = caseComment(comment);
                if (result == null) result = caseUMLReferencingElement(comment);
                if (result == null) result = caseElement(comment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.CARDINALITY: {
                Cardinality cardinality = (Cardinality)theEObject;
                T result = caseCardinality(cardinality);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.PACKAGEABLE_ELEMENT: {
                PackageableElement packageableElement = (PackageableElement)theEObject;
                T result = casePackageableElement(packageableElement);
                if (result == null) result = caseElement(packageableElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.PACKAGE_IMPORT: {
                PackageImport packageImport = (PackageImport)theEObject;
                T result = casePackageImport(packageImport);
                if (result == null) result = caseUMLReferencingElement(packageImport);
                if (result == null) result = caseElement(packageImport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT: {
                VisibilityHavingElement visibilityHavingElement = (VisibilityHavingElement)theEObject;
                T result = caseVisibilityHavingElement(visibilityHavingElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
	public T caseElement(Element object) {
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
	public T caseNamedElement(NamedElement object) {
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
	public T caseAliasedElement(AliasedElement object) {
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
	public <UMLType extends org.eclipse.uml2.uml.Element> T caseUMLReferencingElement(UMLReferencingElement<UMLType> object) {
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
	public <PackageType extends PackageBase<?>> T casePackageBase(PackageBase<PackageType> object) {
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
	public <CommentableUMLType extends org.eclipse.uml2.uml.Element> T caseCommentable(Commentable<CommentableUMLType> object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComment(Comment object) {
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
	public T caseCardinality(Cardinality object) {
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
	public T casePackageableElement(PackageableElement object) {
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
	public T casePackageImport(PackageImport object) {
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
    public T caseVisibilityHavingElement(VisibilityHavingElement object) {
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
	public T defaultCase(EObject object) {
        return null;
    }

} //TextualCommonsSwitch
