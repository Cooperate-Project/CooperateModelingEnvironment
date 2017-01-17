/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.RootPackageImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootPackageImpl extends NamedElementImpl implements RootPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.ROOT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getReferencedElement() {
		return (org.eclipse.uml2.uml.Package)eDynamicGet(UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetReferencedElement() {
		return (org.eclipse.uml2.uml.Package)eDynamicGet(UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(org.eclipse.uml2.uml.Package newReferencedElement) {
		eDynamicSet(UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getActors() {
		return (EList<Actor>)eDynamicGet(UsecasePackage.ROOT_PACKAGE__ACTORS, UsecasePackage.Literals.ROOT_PACKAGE__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<de.cooperateproject.modeling.textual.usecase.usecase.System> getSystems() {
		return (EList<de.cooperateproject.modeling.textual.usecase.usecase.System>)eDynamicGet(UsecasePackage.ROOT_PACKAGE__SYSTEMS, UsecasePackage.Literals.ROOT_PACKAGE__SYSTEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relationship> getRelationships() {
		return (EList<Relationship>)eDynamicGet(UsecasePackage.ROOT_PACKAGE__RELATIONSHIPS, UsecasePackage.Literals.ROOT_PACKAGE__RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDiagram getDiagram() {
		return (UseCaseDiagram)eDynamicGet(UsecasePackage.ROOT_PACKAGE__DIAGRAM, UsecasePackage.Literals.ROOT_PACKAGE__DIAGRAM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(UseCaseDiagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, UsecasePackage.ROOT_PACKAGE__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(UseCaseDiagram newDiagram) {
		eDynamicSet(UsecasePackage.ROOT_PACKAGE__DIAGRAM, UsecasePackage.Literals.ROOT_PACKAGE__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsecasePackage.ROOT_PACKAGE__SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystems()).basicAdd(otherEnd, msgs);
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((UseCaseDiagram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsecasePackage.ROOT_PACKAGE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case UsecasePackage.ROOT_PACKAGE__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
			case UsecasePackage.ROOT_PACKAGE__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				return basicSetDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, UsecasePackage.USE_CASE_DIAGRAM__ROOT_PACKAGE, UseCaseDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case UsecasePackage.ROOT_PACKAGE__ACTORS:
				return getActors();
			case UsecasePackage.ROOT_PACKAGE__SYSTEMS:
				return getSystems();
			case UsecasePackage.ROOT_PACKAGE__RELATIONSHIPS:
				return getRelationships();
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				return getDiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Package)newValue);
				return;
			case UsecasePackage.ROOT_PACKAGE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case UsecasePackage.ROOT_PACKAGE__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends de.cooperateproject.modeling.textual.usecase.usecase.System>)newValue);
				return;
			case UsecasePackage.ROOT_PACKAGE__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				setDiagram((UseCaseDiagram)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Package)null);
				return;
			case UsecasePackage.ROOT_PACKAGE__ACTORS:
				getActors().clear();
				return;
			case UsecasePackage.ROOT_PACKAGE__SYSTEMS:
				getSystems().clear();
				return;
			case UsecasePackage.ROOT_PACKAGE__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				setDiagram((UseCaseDiagram)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT:
				return basicGetReferencedElement() != null;
			case UsecasePackage.ROOT_PACKAGE__ACTORS:
				return !getActors().isEmpty();
			case UsecasePackage.ROOT_PACKAGE__SYSTEMS:
				return !getSystems().isEmpty();
			case UsecasePackage.ROOT_PACKAGE__RELATIONSHIPS:
				return !getRelationships().isEmpty();
			case UsecasePackage.ROOT_PACKAGE__DIAGRAM:
				return getDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UMLReferencingElement.class) {
			switch (derivedFeatureID) {
				case UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UMLReferencingElement.class) {
			switch (baseFeatureID) {
				case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.ROOT_PACKAGE__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RootPackageImpl
