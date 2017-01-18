package de.cooperateproject.ui.nature;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;

public class CDOTextDecorator implements ILightweightLabelDecorator {

    private static final Logger LOGGER = Logger.getLogger(CooperateProjectBuilder.class);

    @Override
    public void addListener(ILabelProviderListener listener) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
    }

    @Override
    public void decorate(Object element, IDecoration decoration) {
        if (element instanceof IProject) {
            IProject project = (IProject) element;
            if (!project.isOpen()) {
                try {
                    IProjectDescription pd = ResourcesPlugin.getWorkspace()
                            .loadProjectDescription(project.getLocation().append("/.project"));
                    for (String nature : pd.getNatureIds()) {
                        if (nature.contentEquals(CooperateProjectNature.NATURE_ID)) {
                            decoration.addSuffix(" [Disconnected]");
                        }
                    }
                } catch (CoreException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
    }

}
