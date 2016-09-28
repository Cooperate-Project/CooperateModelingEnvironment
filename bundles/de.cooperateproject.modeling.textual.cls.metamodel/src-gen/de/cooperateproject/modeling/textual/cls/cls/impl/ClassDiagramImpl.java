/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import org.eclipse.emf.common.util.BasicEList;
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
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getRootPackage <em>Root Package</em>}</li>
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
	public String getTitle() {
		return (String)eGet(ClsPackage.Literals.CLASS_DIAGRAM__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(ClsPackage.Literals.CLASS_DIAGRAM__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.modeling.textual.cls.cls.Package getRootPackage() {
		return (de.cooperateproject.modeling.textual.cls.cls.Package)eGet(ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package newRootPackage) {
		eSet(ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE, newRootPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getAllTransitiveConnectors() {
		EList<Connector> transitiveConnectors = new BasicEList<Connector>();
		
		LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();
		queue.add(getRootPackage());
		while (!queue.isEmpty()) {
			de.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();
			queue.addAll(0, currentPackage.getPackages());
			transitiveConnectors.addAll(currentPackage.getConnectors());
		}
		
		return transitiveConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.cooperateproject.modeling.textual.cls.cls.Package> getAllTransitivePackages() {
		EList<de.cooperateproject.modeling.textual.cls.cls.Package> transitivePackages = new BasicEList<de.cooperateproject.modeling.textual.cls.cls.Package>();
		
		LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();
		queue.add(getRootPackage());
		while (!queue.isEmpty()) {
			de.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();
			queue.addAll(0, currentPackage.getPackages());
			transitivePackages.add(currentPackage);
		}
		
		return transitivePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClsPackage.CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CONNECTORS:
				return getAllTransitiveConnectors();
			case ClsPackage.CLASS_DIAGRAM___GET_ALL_TRANSITIVE_PACKAGES:
				return getAllTransitivePackages();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClassDiagramImpl
