package de.cooperateproject.modeling.graphical.papyrus.extensions.cdo;

import java.util.Set;

import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.cdo.core.resource.CDOReadOnlyHandler;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;

import com.google.common.base.Optional;

public class CooperateCDOReadOnlyHandler extends CDOReadOnlyHandler {

    public CooperateCDOReadOnlyHandler(EditingDomain editingDomain) {
        super(editingDomain);
    }

    @Override
    public Optional<Boolean> isReadOnly(Set<ReadOnlyAxis> axes, EObject eObject) {
        if (axes.contains(ReadOnlyAxis.PERMISSION)) {
            Resource resource = eObject.eResource();
            if (isReadOnly(resource.getURI())) {
                return Optional.of(true);
            }
        }
        return super.isReadOnly(axes, eObject);
    }

    @Override
    protected boolean isReadOnly(URI uri) {
        if (!super.isReadOnly(uri)) {
            return Optional.fromNullable(CDOUtil.getView(getEditingDomain().getResourceSet(), uri))
                    .transform(CDOView::isReadOnly).or(false);
        }
        return false;
    }

}
