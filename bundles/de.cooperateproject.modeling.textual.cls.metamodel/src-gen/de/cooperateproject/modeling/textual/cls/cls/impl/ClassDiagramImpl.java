/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getPackageImports <em>Package Imports</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramImpl extends CDOObjectImpl implements ClassDiagram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageImport> getPackageImports() {
		return (EList<PackageImport>)eDynamicGet(ClsPackage.CLASS_DIAGRAM__PACKAGE_IMPORTS, ClsPackage.Literals.CLASS_DIAGRAM__PACKAGE_IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getClassifiers() {
		return (EList<Classifier>)eDynamicGet(ClsPackage.CLASS_DIAGRAM__CLASSIFIERS, ClsPackage.Literals.CLASS_DIAGRAM__CLASSIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connector> getConnectors() {
		return (EList<Connector>)eDynamicGet(ClsPackage.CLASS_DIAGRAM__CONNECTORS, ClsPackage.Literals.CLASS_DIAGRAM__CONNECTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClsPackage.CLASS_DIAGRAM__PACKAGE_IMPORTS:
				return ((InternalEList<?>)getPackageImports()).basicRemove(otherEnd, msgs);
			case ClsPackage.CLASS_DIAGRAM__CLASSIFIERS:
				return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
			case ClsPackage.CLASS_DIAGRAM__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClsPackage.CLASS_DIAGRAM__PACKAGE_IMPORTS:
				return getPackageImports();
			case ClsPackage.CLASS_DIAGRAM__CLASSIFIERS:
				return getClassifiers();
			case ClsPackage.CLASS_DIAGRAM__CONNECTORS:
				return getConnectors();
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
			case ClsPackage.CLASS_DIAGRAM__PACKAGE_IMPORTS:
				getPackageImports().clear();
				getPackageImports().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case ClsPackage.CLASS_DIAGRAM__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ClsPackage.CLASS_DIAGRAM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
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
			case ClsPackage.CLASS_DIAGRAM__PACKAGE_IMPORTS:
				getPackageImports().clear();
				return;
			case ClsPackage.CLASS_DIAGRAM__CLASSIFIERS:
				getClassifiers().clear();
				return;
			case ClsPackage.CLASS_DIAGRAM__CONNECTORS:
				getConnectors().clear();
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
			case ClsPackage.CLASS_DIAGRAM__PACKAGE_IMPORTS:
				return !getPackageImports().isEmpty();
			case ClsPackage.CLASS_DIAGRAM__CLASSIFIERS:
				return !getClassifiers().isEmpty();
			case ClsPackage.CLASS_DIAGRAM__CONNECTORS:
				return !getConnectors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassDiagramImpl
