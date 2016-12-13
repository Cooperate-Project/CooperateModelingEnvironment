/**
 */
package de.cooperateproject.ui.launchermodel.Launcher;

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
 * @see de.cooperateproject.ui.launchermodel.Launcher.LauncherFactory
 * @model kind="package"
 * @generated
 */
public interface LauncherPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Launcher";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cooperateproject.de/ui/launchermodel/Launcher";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "launcher";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LauncherPackage eINSTANCE = de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.DiagramImpl
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concrete Syntax Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONCRETE_SYNTAX_MODELS = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.ConcreteSyntaxModelImpl <em>Concrete Syntax Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.ConcreteSyntaxModelImpl
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getConcreteSyntaxModel()
	 * @generated
	 */
	int CONCRETE_SYNTAX_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_MODEL__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Concrete Syntax Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concrete Syntax Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.TextualConcreteSyntaxModelImpl <em>Textual Concrete Syntax Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.TextualConcreteSyntaxModelImpl
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getTextualConcreteSyntaxModel()
	 * @generated
	 */
	int TEXTUAL_CONCRETE_SYNTAX_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONCRETE_SYNTAX_MODEL__EXTENSION = CONCRETE_SYNTAX_MODEL__EXTENSION;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT = CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Textual Concrete Syntax Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONCRETE_SYNTAX_MODEL_FEATURE_COUNT = CONCRETE_SYNTAX_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Textual Concrete Syntax Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONCRETE_SYNTAX_MODEL_OPERATION_COUNT = CONCRETE_SYNTAX_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.GraphicalConcreteSyntaxModelImpl <em>Graphical Concrete Syntax Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.GraphicalConcreteSyntaxModelImpl
	 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getGraphicalConcreteSyntaxModel()
	 * @generated
	 */
	int GRAPHICAL_CONCRETE_SYNTAX_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONCRETE_SYNTAX_MODEL__EXTENSION = CONCRETE_SYNTAX_MODEL__EXTENSION;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT = CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Graphical Concrete Syntax Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONCRETE_SYNTAX_MODEL_FEATURE_COUNT = CONCRETE_SYNTAX_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graphical Concrete Syntax Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONCRETE_SYNTAX_MODEL_OPERATION_COUNT = CONCRETE_SYNTAX_MODEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cooperateproject.ui.launchermodel.Launcher.Diagram#getConcreteSyntaxModels <em>Concrete Syntax Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Syntax Models</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.Diagram#getConcreteSyntaxModels()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_ConcreteSyntaxModels();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel <em>Concrete Syntax Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax Model</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel
	 * @generated
	 */
	EClass getConcreteSyntaxModel();

	/**
	 * Returns the meta object for the attribute '{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getExtension()
	 * @see #getConcreteSyntaxModel()
	 * @generated
	 */
	EAttribute getConcreteSyntaxModel_Extension();

	/**
	 * Returns the meta object for the reference '{@link de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel#getRootElement()
	 * @see #getConcreteSyntaxModel()
	 * @generated
	 */
	EReference getConcreteSyntaxModel_RootElement();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel <em>Textual Concrete Syntax Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Concrete Syntax Model</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel
	 * @generated
	 */
	EClass getTextualConcreteSyntaxModel();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel <em>Graphical Concrete Syntax Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Concrete Syntax Model</em>'.
	 * @see de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel
	 * @generated
	 */
	EClass getGraphicalConcreteSyntaxModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LauncherFactory getLauncherFactory();

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
		 * The meta object literal for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.DiagramImpl
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Concrete Syntax Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__CONCRETE_SYNTAX_MODELS = eINSTANCE.getDiagram_ConcreteSyntaxModels();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.ConcreteSyntaxModelImpl <em>Concrete Syntax Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.ConcreteSyntaxModelImpl
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getConcreteSyntaxModel()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX_MODEL = eINSTANCE.getConcreteSyntaxModel();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_SYNTAX_MODEL__EXTENSION = eINSTANCE.getConcreteSyntaxModel_Extension();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX_MODEL__ROOT_ELEMENT = eINSTANCE.getConcreteSyntaxModel_RootElement();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.TextualConcreteSyntaxModelImpl <em>Textual Concrete Syntax Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.TextualConcreteSyntaxModelImpl
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getTextualConcreteSyntaxModel()
		 * @generated
		 */
		EClass TEXTUAL_CONCRETE_SYNTAX_MODEL = eINSTANCE.getTextualConcreteSyntaxModel();

		/**
		 * The meta object literal for the '{@link de.cooperateproject.ui.launchermodel.Launcher.impl.GraphicalConcreteSyntaxModelImpl <em>Graphical Concrete Syntax Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.GraphicalConcreteSyntaxModelImpl
		 * @see de.cooperateproject.ui.launchermodel.Launcher.impl.LauncherPackageImpl#getGraphicalConcreteSyntaxModel()
		 * @generated
		 */
		EClass GRAPHICAL_CONCRETE_SYNTAX_MODEL = eINSTANCE.getGraphicalConcreteSyntaxModel();

	}

} //LauncherPackage
