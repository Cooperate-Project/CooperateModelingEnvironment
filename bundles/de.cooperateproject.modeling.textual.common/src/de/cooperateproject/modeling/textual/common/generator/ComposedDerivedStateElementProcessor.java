package de.cooperateproject.modeling.textual.common.generator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.cooperateproject.modeling.textual.xtext.runtime.generator.IDerivedStateElementProcessor;

public class ComposedDerivedStateElementProcessor implements IDerivedStateElementProcessor {

    @Inject
    @Named(IDerivedStateElementProcessor.DERIVED_STATE_PROCESSOR_MAIN_PROCESSOR)
    protected Set<IDerivedStateElementProcessor> processors = Collections.emptySet();
    protected Map<EClass, IDerivedStateElementProcessor> delegates = new HashMap<>();

    @Override
    public boolean isDirectlyCompatibleWith(EClass eClass) {
        return delegates.containsKey(eClass) || processors.stream().anyMatch(p -> p.isDirectlyCompatibleWith(eClass));
    }

    @Override
    public boolean processElementUsingType(EClass clazz, EObject object) {
        return findDelegate(clazz).map(proc -> {
            if (!proc.processElement(object)) {
                return processors.stream().filter(p -> p != proc)
                        .filter(p -> p.hasCapabilitiesForHandling(clazz).isPresent())
                        .filter(p -> p.processElementUsingType(clazz, object)).findAny().isPresent();
            }
            return true;
        }).orElse(false);
    }

    protected Optional<IDerivedStateElementProcessor> findDelegate(EClass clazz) {
        Optional<IDerivedStateElementProcessor> delegate = Optional.ofNullable(delegates.get(clazz));
        if (!delegate.isPresent()) {
            delegate = processors.stream().filter(p -> p.isDirectlyCompatibleWith(clazz)).findFirst();
            if (!delegate.isPresent()) {
                delegate = processors.stream().filter(p -> p.hasCapabilitiesForHandling(clazz).isPresent()).findFirst();
            }
            if (delegate.isPresent()) {
                delegates.put(clazz, delegate.get());
            }
        }

        return delegate;
    }

}
