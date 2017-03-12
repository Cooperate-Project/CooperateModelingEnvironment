package de.cooperateproject.modeling.textual.cls.ui.inFile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

public class ClsLocationInFileProvider extends DefaultLocationInFileProvider {

    @Override
    protected EStructuralFeature getIdentifierFeature(EObject obj) {
        if (obj instanceof Association && !((Association) obj).getComments().isEmpty()) {
            return super.getIdentifierFeature(obj);
        } else if (obj instanceof NamedElement) {
            return TextualCommonsPackage.eINSTANCE.getNamedElement_Name();
        } else if (obj instanceof PackageImport) {
            return TextualCommonsPackage.eINSTANCE.getPackageImport_ImportedPackage();
        }
        return super.getIdentifierFeature(obj);
    }

    @Override
    protected boolean useKeyword(Keyword keyword, EObject context) {
        if (context instanceof Association && !((Association) context).getComments().isEmpty()) {
            return "note".equals(keyword.getValue());
        }
        return super.useKeyword(keyword, context);
    }
}
