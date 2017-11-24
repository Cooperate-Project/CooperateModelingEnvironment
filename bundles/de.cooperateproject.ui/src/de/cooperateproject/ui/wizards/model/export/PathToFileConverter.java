package de.cooperateproject.ui.wizards.model.export;

import java.io.File;

import org.eclipse.core.databinding.conversion.Converter;

/**
 * Converts an absolute path given as string to a {@link File} object.
 */
public class PathToFileConverter extends Converter {

    /**
     * Constructs the converter.
     */
    public PathToFileConverter() {
        super(String.class, File.class);
    }

    @Override
    public Object convert(Object fromObject) {
        return new File((String) fromObject);
    }

}
