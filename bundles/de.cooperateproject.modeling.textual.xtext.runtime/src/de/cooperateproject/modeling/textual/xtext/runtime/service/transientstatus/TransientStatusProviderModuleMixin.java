package de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus;

/**
 * Mixin for guice dependency injection modules that adds the default implementation of
 * {@link ITransientStatusProvider}.
 */
public interface TransientStatusProviderModuleMixin {

    /**
     * Binds the {@link ITransientStatusProvider}.
     * 
     * @return The default implementation of {@link ITransientStatusProvider}.
     */
    default Class<? extends ITransientStatusProvider> bindITransientStatusProvider() {
        return DelegatingTransientStatusProvider.class;
    }

}
