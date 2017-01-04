package de.cooperateproject.ui.util;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransfer.ModelTransferContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.Sets;

public class CustomModelTransferContext extends ModelTransferContext {

	protected static class CustomCopier extends Copier {

		private static final long serialVersionUID = 5229864849464634761L;
		private static final Set<EReference> DUPLICATE_FILTERING_REFERENCES = Sets
				.newHashSet(UMLPackage.Literals.DEPENDENCY__CLIENT);

		@Override
		protected Setting getTarget(EStructuralFeature eStructuralFeature, EObject eObject, EObject copyEObject) {
			if (DUPLICATE_FILTERING_REFERENCES.contains(eStructuralFeature)
					&& isAlreadyUpToDate(eStructuralFeature, eObject, copyEObject)) {
				return null;
			}
			return super.getTarget(eStructuralFeature, eObject, copyEObject);
		}

		private boolean isAlreadyUpToDate(EStructuralFeature eStructuralFeature, EObject eObject, EObject copyEObject) {
			@SuppressWarnings("unchecked")
			List<EObject> targetList = (List<EObject>) copyEObject.eGet(eStructuralFeature);
			@SuppressWarnings("unchecked")
			List<EObject> sourceList = (List<EObject>) eObject.eGet(eStructuralFeature);
			if (targetList != null && sourceList != null && targetList.size() == sourceList.size()) {
				for (int i = 0; i < targetList.size(); ++i) {
					EObject targetCandidate = get(sourceList.get(i));
					EObject sourceCandidate = targetList.get(i);
					if (targetCandidate != sourceCandidate) {
						return false;
					}
				}
				return true;
			}
			return false;
		}

	}

	protected CustomModelTransferContext(CDOTransfer transfer) {
		super(transfer);
	}

	@Override
	protected Copier createCopier() {
		return new CustomCopier();
	}

}
