package de.cooperateproject.ui.focus.textual;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

class UMLToConcreteSyntaxElementWork extends IUnitOfWork.Void<XtextResource> {

    private EObject umlElement = null;
    private EObject concreteSyntaxElement = null;

    public void setUmlElement(EObject element) {
        umlElement = element;
    }

    @Override
    public void process(XtextResource state) throws Exception {
        if (umlElement == null) {
            return;
        }
        TreeIterator<EObject> it = state.getAllContents();
        while (it.hasNext()) {
            EObject clsTempElement = it.next();
            if (clsTempElement instanceof UMLReferencingElement) {
                Element referencedElement = ((UMLReferencingElement) clsTempElement).getReferencedElement();
                if (EcoreUtil.equals(referencedElement, umlElement)) {
                    concreteSyntaxElement = clsTempElement;
                    break;
                }
            }
        }
    }

    public EObject getConcreteSyntaxElement() {
        return concreteSyntaxElement;
    }

}
