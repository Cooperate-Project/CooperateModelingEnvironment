/**
 */
package de.cooperateproject.ui.launchermodel.Launcher.impl;

import de.cooperateproject.ui.launchermodel.Launcher.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LauncherFactoryImpl extends EFactoryImpl implements LauncherFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LauncherFactory init() {
		try {
			LauncherFactory theLauncherFactory = (LauncherFactory)EPackage.Registry.INSTANCE.getEFactory(LauncherPackage.eNS_URI);
			if (theLauncherFactory != null) {
				return theLauncherFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LauncherFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LauncherFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LauncherPackage.DIAGRAM: return createDiagram();
			case LauncherPackage.TEXTUAL_CONCRETE_SYNTAX_MODEL: return createTextualConcreteSyntaxModel();
			case LauncherPackage.GRAPHICAL_CONCRETE_SYNTAX_MODEL: return createGraphicalConcreteSyntaxModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualConcreteSyntaxModel createTextualConcreteSyntaxModel() {
		TextualConcreteSyntaxModelImpl textualConcreteSyntaxModel = new TextualConcreteSyntaxModelImpl();
		return textualConcreteSyntaxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalConcreteSyntaxModel createGraphicalConcreteSyntaxModel() {
		GraphicalConcreteSyntaxModelImpl graphicalConcreteSyntaxModel = new GraphicalConcreteSyntaxModelImpl();
		return graphicalConcreteSyntaxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LauncherPackage getLauncherPackage() {
		return (LauncherPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LauncherPackage getPackage() {
		return LauncherPackage.eINSTANCE;
	}

} //LauncherFactoryImpl
