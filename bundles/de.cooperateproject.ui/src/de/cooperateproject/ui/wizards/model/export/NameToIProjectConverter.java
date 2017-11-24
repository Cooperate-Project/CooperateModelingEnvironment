package de.cooperateproject.ui.wizards.model.export;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * Converts a project name to an {@link IProject} element.
 */
public class NameToIProjectConverter extends Converter {

    /**
     * Constructs the converter.
     */
    public NameToIProjectConverter() {
        super(String.class, IProject.class);
    }

    @Override
    public Object convert(Object fromObject) {
        try {
            return ResourcesPlugin.getWorkspace().getRoot().getProject((String) fromObject);
        } catch (Exception e) {
            return null;
        }
    }

}
