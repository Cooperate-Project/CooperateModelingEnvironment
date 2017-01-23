package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.PackageableElement;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.ContentIteratingPostProcessor.PostProcessingSwitch;

public class ClsPostProcessingSwitch extends ClsSwitch<Boolean> implements PostProcessingSwitch {

    private final Collection<Runnable> requestedChanges = new ArrayList<>();
    private final Set<Object> mappedTargets;

    public ClsPostProcessingSwitch(Set<Object> mappedTargets) {
        this.mappedTargets = mappedTargets;
    }

    @Override
    public Boolean defaultCase(EObject object) {
        return true;
    }

    @Override
    public Boolean casePackageableElement(PackageableElement object) {
        return !registerChangeIfNecessary(object);
    }

    @Override
    public <T extends NamedElement> Boolean caseNamedElement(
            de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> object) {
        return !registerChangeIfNecessary(object);
    }

    @Override
    public Boolean caseConnector(Connector object) {
        return !registerChangeIfNecessary(object);
    }

    @Override
    public Iterable<Runnable> getRequestedChanges() {
        return Collections.unmodifiableCollection(requestedChanges);
    }

    private boolean registerChangeIfNecessary(EObject object) {
        if (!mappedTargets.contains(object)) {
            requestedChanges.add(() -> EcoreUtil.delete(object));
            return true;
        }
        return false;
    }

    @Override
    public boolean isPackageSupported(EPackage ePackage) {
        return isSwitchFor(ePackage);
    }

}