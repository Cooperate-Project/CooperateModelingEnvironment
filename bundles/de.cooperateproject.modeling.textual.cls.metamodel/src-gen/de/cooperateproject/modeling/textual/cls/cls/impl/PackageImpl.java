/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.Element;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.PackageableElement;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getPackageImports <em>Package Imports</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl<org.eclipse.uml2.uml.Package> implements de.cooperateproject.modeling.textual.cls.cls.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<PackageImport> getPackageImports() {
		return (EList<PackageImport>)eGet(ClsPackage.Literals.PACKAGE__PACKAGE_IMPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getClassifiers() {
		return (EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>>)eGet(ClsPackage.Literals.PACKAGE__CLASSIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Connector> getConnectors() {
		return (EList<Connector>)eGet(ClsPackage.Literals.PACKAGE__CONNECTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage() {
		return (de.cooperateproject.modeling.textual.cls.cls.Package)eGet(ClsPackage.Literals.PACKAGE__OWNING_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<de.cooperateproject.modeling.textual.cls.cls.Package> getPackages() {
		return (EList<de.cooperateproject.modeling.textual.cls.cls.Package>)eGet(ClsPackage.Literals.PACKAGE__PACKAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.cooperateproject.modeling.textual.cls.cls.Package getNearestPackage() {
		EObject focus = this.eContainer();
		while (focus != null && !(focus instanceof de.cooperateproject.modeling.textual.cls.cls.Package)) {
			focus = focus.eContainer();
		}
		return (de.cooperateproject.modeling.textual.cls.cls.Package)focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseOperationID) {
				case ClsPackage.ELEMENT___GET_NEAREST_PACKAGE: return ClsPackage.PACKAGE___GET_NEAREST_PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClsPackage.PACKAGE___GET_NEAREST_PACKAGE:
				return getNearestPackage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PackageImpl
