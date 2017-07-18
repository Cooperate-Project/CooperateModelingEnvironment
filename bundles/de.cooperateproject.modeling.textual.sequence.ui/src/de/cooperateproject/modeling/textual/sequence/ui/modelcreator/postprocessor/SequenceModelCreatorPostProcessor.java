package de.cooperateproject.modeling.textual.sequence.ui.modelcreator.postprocessor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.ui.modelcreator.IModelCreatorPostProcessor;

public class SequenceModelCreatorPostProcessor implements IModelCreatorPostProcessor{

    /**
     * Fixes the root element of the sequence diagram notation file. While other diagrams refer to the 
     * root uml element, the sequence diagram references the represented Interaction. As this element 
     * does not exist when creating a new diagram, it will be created and placed as child element of the
     * uml root.
     */
    @Override
    public void postProcessModel(EObject rootElement) {
        if (NotationPackage.eINSTANCE.getDiagram().isInstance(rootElement)) {
            Diagram diag = (Diagram) rootElement;
            
            if (diag.getType().equals(NotationDiagramTypes.SEQUENCE.getNotationDiagramType())) {
                if (diag.getElement() != null && UMLPackage.eINSTANCE.getPackage().isInstance(diag.getElement())){ 
                    org.eclipse.uml2.uml.Package model = (org.eclipse.uml2.uml.Package) diag.getElement();
                    Interaction act = UMLFactory.eINSTANCE.createInteraction();
                    act.setName(diag.getName());
                    model.getPackagedElements().add(act);
                    diag.setElement(act);
                }
            }
        }
    }
    
}
