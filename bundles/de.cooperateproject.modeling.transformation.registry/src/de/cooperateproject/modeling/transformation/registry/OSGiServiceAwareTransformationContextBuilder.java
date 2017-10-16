package de.cooperateproject.modeling.transformation.registry;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import de.cooperateproject.modeling.transformation.common.IQVTOResourceProvider;
import de.cooperateproject.modeling.transformation.common.IQVTOTransformationExecutorProvider;
import de.cooperateproject.modeling.transformation.common.impl.TransformationContextBuilder;

public class OSGiServiceAwareTransformationContextBuilder extends TransformationContextBuilder {

    public TransformationContextBuilder processBundleContext(BundleContext context) {
        ServiceReference<IQVTOResourceProvider> resProvRef = context.getServiceReference(IQVTOResourceProvider.class);
        IQVTOResourceProvider resProv = context.getService(resProvRef);
        if (resProv != null) {
            this.setQVTOResourceProvider(resProv);
        }

        ServiceReference<IQVTOTransformationExecutorProvider> transExRef = context
                .getServiceReference(IQVTOTransformationExecutorProvider.class);
        IQVTOTransformationExecutorProvider transEx = context.getService(transExRef);
        if (transEx != null) {
            this.setQVTOTransformationExecutorProvider(transEx);
        }

        return this;
    }

}
