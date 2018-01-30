/**
 */
package de.cooperateproject.modeling.textual.activity.act;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.activity.act.ActFactory
 * @model kind="package"
 * @generated
 */
public interface ActPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "act";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cooperateproject.de/modeling/textual/activity/Activity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "act";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActPackage eINSTANCE = de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Root Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ROOT_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl <em>Root Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl
	 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getRootPackage()
	 * @generated
	 */
	int ROOT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__REFERENCED_ELEMENT = TextualCommonsPackage.PACKAGE_BASE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__NAME = TextualCommonsPackage.PACKAGE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__OWNING_PACKAGE = TextualCommonsPackage.PACKAGE_BASE__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__PACKAGES = TextualCommonsPackage.PACKAGE_BASE__PACKAGES;

	/**
	 * The feature id for the '<em><b>Package Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__PACKAGE_IMPORTS = TextualCommonsPackage.PACKAGE_BASE__PACKAGE_IMPORTS;

	/**
	 * The number of structural features of the '<em>Root Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE_FEATURE_COUNT = TextualCommonsPackage.PACKAGE_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE___GET_NEAREST_PACKAGE = TextualCommonsPackage.PACKAGE_BASE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get UML Parent Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE___GET_UML_PARENT_NAMESPACE = TextualCommonsPackage.PACKAGE_BASE___GET_UML_PARENT_NAMESPACE;

	/**
	 * The number of operations of the '<em>Root Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE_OPERATION_COUNT = TextualCommonsPackage.PACKAGE_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getTitle()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Title();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getRootPackage <em>Root Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Package</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.ActivityDiagram#getRootPackage()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_RootPackage();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.activity.act.RootPackage <em>Root Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Package</em>'.
	 * @see de.cooperateproject.modeling.textual.activity.act.RootPackage
	 * @generated
	 */
	EClass getRootPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActFactory getActFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActivityDiagramImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__TITLE = eINSTANCE.getActivityDiagram_Title();

		/**
		 * The meta object literal for the '<em><b>Root Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ROOT_PACKAGE = eINSTANCE.getActivityDiagram_RootPackage();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl <em>Root Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.RootPackageImpl
		 * @see de.cooperateproject.modeling.textual.activity.act.impl.ActPackageImpl#getRootPackage()
		 * @generated
		 */
		EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

	}

} //ActPackage
