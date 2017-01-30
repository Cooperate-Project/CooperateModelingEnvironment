package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches.ClsPostProcessingSwitch;
import de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches.NotationPostProcessingSwitch;

public class ClassDiagramPostProcessor extends ContentIteratingPostProcessor {

    public ClassDiagramPostProcessor(int priority) {
        super(priority, mappedElements -> new CombinedPostProcessor(mappedElements));
    }

    private static class CombinedPostProcessor implements PostProcessingSwitch {

        private final Map<EPackage, PostProcessingSwitch> switches = new HashMap<>();

        public CombinedPostProcessor(Set<EObject> mappedElements) {
            switches.put(NotationPackage.eINSTANCE, new NotationPostProcessingSwitch(mappedElements));
            switches.put(ClsPackage.eINSTANCE, new ClsPostProcessingSwitch(mappedElements));
        }

        @Override
        public Boolean doSwitch(EObject content) {
            EPackage wantedPackage = content.eClass().getEPackage();
            if (switches.containsKey(wantedPackage)) {
                return switches.get(wantedPackage).doSwitch(content);
            }
            return false;
        }

        @Override
        public boolean isPackageSupported(EPackage ePackage) {
            return switches.containsKey(ePackage);
        }

        @Override
        public Iterable<Runnable> getRequestedChanges() {
            return Collections
                    .unmodifiableCollection(switches.values().stream().map(PostProcessingSwitch::getRequestedChanges)
                            .flatMap(c -> StreamSupport.stream(c.spliterator(), false)).collect(Collectors.toList()));
        }

    }

}
