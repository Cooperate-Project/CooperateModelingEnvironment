package de.cooperateproject.ui.wizards.model.export;

import java.util.Optional;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;

/**
 * Converts a {@link CDOCommitInfo} element to a {@link Long} object by using the commit timestamp.
 */
public class CDOCommitInfoToTimestampConverter extends Converter {

    /**
     * Constructs the converter.
     */
    public CDOCommitInfoToTimestampConverter() {
        super(CDOCommitInfo.class, Long.class);
    }

    @Override
    public Object convert(Object fromObject) {
        return Optional.ofNullable(fromObject).filter(CDOCommitInfo.class::isInstance).map(CDOCommitInfo.class::cast)
                .map(CDOCommitInfo::getTimeStamp).orElse(null);
    }

}