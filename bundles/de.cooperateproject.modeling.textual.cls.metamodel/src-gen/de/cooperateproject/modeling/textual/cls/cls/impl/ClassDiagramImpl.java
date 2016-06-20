/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
		return (EList<PackageImport>)eGet(ClsPackage.Literals.CLASS_DIAGRAM__PACKAGE_IMPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier<?>> getClassifiers() {
		return (EList<Classifier<?>>)eGet(ClsPackage.Literals.CLASS_DIAGRAM__CLASSIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connector> getConnectors() {
		return (EList<Connector>)eGet(ClsPackage.Literals.CLASS_DIAGRAM__CONNECTORS, true);
	}

} //ClassDiagramImpl
