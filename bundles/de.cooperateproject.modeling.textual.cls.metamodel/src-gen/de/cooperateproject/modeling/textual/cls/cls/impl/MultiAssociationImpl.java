/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation;
import de.cooperateproject.modeling.textual.cls.cls.NamedElement;
import de.cooperateproject.modeling.textual.cls.cls.NamedElementOptional;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.MultiAssociationImpl#getConnectorEnds <em>Connector Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiAssociationImpl extends ElementImpl implements MultiAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.MULTI_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getReferencedElement() {
		return (Association)eGet(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(Association newReferencedElement) {
		eSet(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (getReferencedElement() == null) {
			return null;
		}
		return getReferencedElement().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MemberEnd> getConnectorEnds() {
		return (EList<MemberEnd>)eGet(ClsPackage.Literals.MULTI_ASSOCIATION__CONNECTOR_ENDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasReferencedElement(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (getReferencedElement() == null) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(BasicDiagnostic.ERROR, "hasReferencedElement", 1, "A referenced element is mandatory.", new Object[]{this});
			diagnostics.add(basicDiagnostic);
			return false;
		}
		diagnostics.add(BasicDiagnostic.OK_INSTANCE);
		return true;
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
				case ClsPackage.MULTI_ASSOCIATION__REFERENCED_ELEMENT: return ClsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElementOptional.class) {
			switch (derivedFeatureID) {
				case ClsPackage.MULTI_ASSOCIATION__NAME: return ClsPackage.NAMED_ELEMENT_OPTIONAL__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
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
				case ClsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return ClsPackage.MULTI_ASSOCIATION__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElementOptional.class) {
			switch (baseFeatureID) {
				case ClsPackage.NAMED_ELEMENT_OPTIONAL__NAME: return ClsPackage.MULTI_ASSOCIATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == UMLReferencingElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElementOptional.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				case ClsPackage.NAMED_ELEMENT___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP: return ClsPackage.MULTI_ASSOCIATION___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClsPackage.MULTI_ASSOCIATION___HAS_REFERENCED_ELEMENT__DIAGNOSTICCHAIN_MAP:
				return hasReferencedElement((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MultiAssociationImpl
