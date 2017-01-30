package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.cls.cls.PackageableElement;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.ContentIteratingPostProcessor.PostProcessingSwitch;

public class ClsPostProcessingSwitch extends ClsSwitch<Boolean> implements PostProcessingSwitch {

    private final UnmappedElementDeleter elementDeleter;

    public ClsPostProcessingSwitch(Set<EObject> mappedElements) {
        this.elementDeleter = new UnmappedElementDeleter(mappedElements);
    }

    @Override
    public Boolean defaultCase(EObject object) {
        return true;
    }

    @Override
    public Boolean casePackage(Package object) {
        if (object.getNearestPackage() == null) {
            return true;
        }
        return null;
    }

    @Override
    public Boolean casePackageableElement(PackageableElement object) {
        return processObject(object);
    }

    @Override
    public <T extends NamedElement> Boolean caseNamedElement(
            de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> object) {
        return processObject(object);
    }

    @Override
    public Boolean caseConnector(Connector object) {
        return processObject(object);
    }

    @Override
    public Iterable<Runnable> getRequestedChanges() {
        return elementDeleter.getRequestedChanges();
    }

    @Override
    public boolean isPackageSupported(EPackage ePackage) {
        return isSwitchFor(ePackage);
    }

    private Boolean processObject(EObject object) {
        if (elementDeleter.registerChangeIfNecessary(object)) {
            return false;
        }
        return null;
    }

}