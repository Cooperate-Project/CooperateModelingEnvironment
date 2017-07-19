package de.cooperate.modeling.graphical.papyrus.extensions.outline;

import java.util.concurrent.ExecutionException;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.papyrus.infra.properties.ui.xwt.XWTTabDescriptorProvider;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import de.cooperate.modeling.graphical.papyrus.extensions.outline.util.WorkbenchPartDelegate;

/**
 * Customized {@link ITabDescriptorProvider} that can handle outline views correctly.
 */
public class CooperateTabDescriptorProvider extends XWTTabDescriptorProvider {

    private static class ContributingContentOutlineWorkbenchPart extends WorkbenchPartDelegate
            implements ITabbedPropertySheetPageContributor {

        protected ContributingContentOutlineWorkbenchPart(IWorkbenchPart part) {
            super(part);
        }

        /**
         * Creates a new instance of {@link ContributingContentOutlineWorkbenchPart}.
         * 
         * @param part
         *            The part to which calls shall be delegated.
         * @return The new instance.
         */
        public static IWorkbenchPart create(IWorkbenchPart part) {
            return new ContributingContentOutlineWorkbenchPart(part);
        }

        @Override
        public String getContributorId() {
            return "TreeOutlinePage";
        }

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateTabDescriptorProvider.class);
    private static final int CACHE_SIZE = 10;
    private final Cache<IWorkbenchPart, IWorkbenchPart> cache = CacheBuilder.newBuilder().maximumSize(CACHE_SIZE)
            .build();

    @Override
    public ITabDescriptor[] getTabDescriptors(IWorkbenchPart part, ISelection selection) {
        try {
            IWorkbenchPart partToUse = part;
            if (part instanceof ContentOutline) {
                partToUse = cache.get(part, () -> ContributingContentOutlineWorkbenchPart.create(part));
            }
            return super.getTabDescriptors(partToUse, selection);
        } catch (ExecutionException e) {
            LOGGER.warn("Could not create wrapper for content outline property.", e);
            return new ITabDescriptor[0];
        }
    }

}
