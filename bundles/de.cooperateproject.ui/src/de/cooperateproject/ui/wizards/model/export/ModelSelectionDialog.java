package de.cooperateproject.ui.wizards.model.export;

import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

import de.cooperateproject.ui.nature.tasks.ModelGenCheckoutTask;

/**
 * Dialog that allows selecting a UML file from a local project.
 */
public class ModelSelectionDialog extends FilteredResourcesSelectionDialog {

    private class ModelFilter extends ItemsFilter {

        private final ItemsFilter baseFilter;

        public ModelFilter(ItemsFilter baseFilter) {
            this.baseFilter = baseFilter;
        }

        @Override
        public boolean matchItem(Object item) {
            if (baseFilter.matchItem(item)) {
                return false;
            }

            return Optional.ofNullable(item).filter(IFile.class::isInstance).map(IFile.class::cast)
                    .filter(f -> ModelGenCheckoutTask.WORKSPACE_FOLDER_NAME.equals(f.getParent().getName()))
                    .map(IFile::getFileExtension).filter("uml"::equals).isPresent();
        }

        @Override
        public boolean isConsistentItem(Object item) {
            return baseFilter.isConsistentItem(item);
        }

    }

    /**
     * Constructs the dialog.
     * 
     * @param shell
     *            The shell to use for opening the window.
     * @param multi
     *            True if multi selection shall be possible. False, otherwise.
     */
    public ModelSelectionDialog(Shell shell, boolean multi) {
        super(shell, multi, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
    }

    @Override
    protected ItemsFilter createFilter() {
        ItemsFilter baseFilter = super.createFilter();
        return new ModelFilter(baseFilter);
    }

}
