package de.cooperateproject.modeling.textual.xtext.runtime.ui.quickfix;

import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.ui.editor.quickfix.LanguageResourceHelper;

import de.cooperateproject.ui.launchermodel.Launcher.util.LauncherResourceImpl;

/**
 * Customized version of {@link LanguageResourceHelper} that can identify resources that can have
 * markers and are relevant for Cooperate. Basically, it accepts resources that are launchers.
 */
public class CooperateLanguageResourceHelper extends LanguageResourceHelper {

    @Override
    public boolean isLanguageResource(IResource resource) {
        return LauncherResourceImpl.EXTENSION.equals(resource.getFileExtension()) || super.isLanguageResource(resource);
    }

}
