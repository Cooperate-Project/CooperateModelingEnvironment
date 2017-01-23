package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.util.NotationSwitch;

import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.ContentIteratingPostProcessor.PostProcessingSwitch;

public class NotationPostProcessingSwitch extends NotationSwitch implements PostProcessingSwitch {

    private final Collection<Runnable> requestedChanges = new ArrayList<>();

    @Override
    public Object defaultCase(EObject object) {
        return false;
    }

    @Override
    public Boolean doSwitch(EObject eObject) {
        return (Boolean) super.doSwitch(eObject);
    }

    @Override
    public Object caseEdge(Edge object) {
        if (!object.isSetElement()) {
            requestedChanges.add(() -> object.setElement(null));
        }
        return false;
    }

    @Override
    public Object caseDiagram(Diagram object) {
        return true;
    }

    @Override
    public Iterable<Runnable> getRequestedChanges() {
        return Collections.unmodifiableCollection(requestedChanges);
    }

    @Override
    public boolean isPackageSupported(EPackage ePackage) {
        return NotationPackage.eINSTANCE == ePackage;
    }

}