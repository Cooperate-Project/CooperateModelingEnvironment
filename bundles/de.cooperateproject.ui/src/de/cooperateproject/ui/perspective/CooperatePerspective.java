package de.cooperateproject.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Special perspective which should be used when working with Cooperate projects.
 * 
 * @author persch
 *
 */
public class CooperatePerspective implements IPerspectiveFactory {

    public static final String PERSPECTIVE_ID = "de.cooperateproject.ui.perspective";

    @Override
    public void createInitialLayout(IPageLayout layout) {
        defineActions(layout);
        defineLayout(layout);
    }

    private static void defineActions(IPageLayout layout) {
        layout.addNewWizardShortcut("de.cooperateproject.ui.newCooperateProjectWizard");
        layout.addNewWizardShortcut("de.cooperateproject.ui.wizards.newClassDiagram");
        layout.addNewWizardShortcut("de.cooperateproject.ui.wizards.newUsecaseDiagram");
        layout.addNewWizardShortcut("de.cooperateproject.ui.wizards.newComponentDiagram");
    }

    private static void defineLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();
        final String bottom = "bottom";
        final String left = "left";

        layout.createFolder(left, IPageLayout.LEFT, (float) 0.23, editorArea);

        IFolderLayout lefttop = layout.createFolder("lefttop", IPageLayout.TOP, (float) 0.35, left);
        lefttop.addView(IPageLayout.ID_PROJECT_EXPLORER);

        IFolderLayout leftbottom = layout.createFolder("leftbottom", IPageLayout.BOTTOM, (float) 0.65, left);
        leftbottom.addView(IPageLayout.ID_OUTLINE);

        layout.createFolder(bottom, IPageLayout.BOTTOM, (float) 0.65, editorArea);

        IFolderLayout bottomleft = layout.createFolder("bottomleft", IPageLayout.LEFT, (float) 0.5, bottom);
        bottomleft.addView(IPageLayout.ID_PROP_SHEET);
        bottomleft.addView("de.cooperateproject.ui.focus.views.FocusView");
        // Exchange with addView once Branch AccessibleDiff is merged to master
        bottomleft.addPlaceholder("de.cooperateproject.ui.diff.views.DiffView");

        IFolderLayout bottomright = layout.createFolder("bottomright", IPageLayout.RIGHT, (float) 0.5, bottom);
        bottomright.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottomright.addView("org.eclipse.papyrus.views.validation.ModelValidationView");
    }
}
