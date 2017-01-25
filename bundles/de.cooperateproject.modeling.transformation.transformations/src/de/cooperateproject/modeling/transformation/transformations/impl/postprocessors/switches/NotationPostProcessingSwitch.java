package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches;

import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.notation.Compartment;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.util.NotationSwitch;

import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.ContentIteratingPostProcessor.PostProcessingSwitch;

public class NotationPostProcessingSwitch extends NotationSwitch implements PostProcessingSwitch {

    private final UnmappedElementDeleter elementDeleter;

    public NotationPostProcessingSwitch(Set<EObject> mappedElements) {
        this.elementDeleter = new UnmappedElementDeleter(mappedElements);
    }

    @Override
    public Object defaultCase(EObject object) {
        return false;
    }

    @Override
    public Object caseView(View object) {
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object caseShape(Shape object) {
        if (object.getType() == "Comment_Shape" || object.getType() == "Association_Shape") {
            if (!Stream
                    .concat((Stream<EObject>) object.getSourceEdges().stream(),
                            (Stream<EObject>) object.getTargetEdges().stream())
                    .allMatch(elementDeleter::testRegisterChangeIfNecessary)) {
                return true;
            }
        }
        return processObject(object);
    }

    @Override
    public Object caseEdge(Edge object) {
        return processObject(object);
    }

    @Override
    public Object caseCompartment(Compartment object) {
        return processObject(object);
    }

    @Override
    public Boolean doSwitch(EObject eObject) {
        return (Boolean) super.doSwitch(eObject);
    }

    @Override
    public Iterable<Runnable> getRequestedChanges() {
        return elementDeleter.getRequestedChanges();
    }

    @Override
    public boolean isPackageSupported(EPackage ePackage) {
        return NotationPackage.eINSTANCE == ePackage;
    }

    private Boolean processObject(EObject object) {
        if (elementDeleter.registerChangeIfNecessary(object)) {
            return false;
        }
        return null;
    }

}