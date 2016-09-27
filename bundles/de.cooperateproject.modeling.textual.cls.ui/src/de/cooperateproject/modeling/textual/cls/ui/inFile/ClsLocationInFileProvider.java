package de.cooperateproject.modeling.textual.cls.ui.inFile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;

public class ClsLocationInFileProvider extends DefaultLocationInFileProvider {

	@Override
	protected EStructuralFeature getIdentifierFeature(EObject obj) {
		if (obj instanceof Association && ((Association) obj).getComment() != null) {
			return super.getIdentifierFeature(obj);
		} else if (obj instanceof UMLReferencingElement<?>) {
			return ClsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement();
		} else if (obj instanceof PackageImport) {
			return ClsPackage.eINSTANCE.getPackageImport_ReferencedElement();
		}
			return super.getIdentifierFeature(obj);
	}
	
	@Override
	protected boolean useKeyword(Keyword keyword, EObject context) {
		if (context instanceof Association && ((Association) context).getComment() != null) {
			return "note".equals(keyword.getValue());
		}
		return super.useKeyword(keyword, context);
	}
}
