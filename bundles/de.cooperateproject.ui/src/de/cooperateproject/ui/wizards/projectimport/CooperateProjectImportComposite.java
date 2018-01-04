package de.cooperateproject.ui.wizards.projectimport;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.jface.layout.PixelConverter;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.cooperateproject.cdo.util.utils.CDOHelper;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

/**
 * Composite for the ImportWizardPage of the cooperate project.
 * 
 * @author persch
 *
 */
public class CooperateProjectImportComposite extends Composite {

    private static Set<String> selectedProjects;
    private static CheckboxTableViewer tv;

    /**
     * Constructor, creates a CheckboxTableViewer and selection buttons.
     * 
     * @param parent
     *            The parent composite.
     * @param style
     *            Style which will be used.
     * @param page
     *            Page which uses this composite.
     */
    public CooperateProjectImportComposite(Composite parent, int style, ImportWizardPage page) {
        super(parent, style);
        Composite tableComposite = new Composite(this, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 0;
        layout.makeColumnsEqualWidth = false;
        tableComposite.setLayout(layout);

        tableComposite
                .setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL | GridData.FILL_BOTH));

        tv = CheckboxTableViewer.newCheckList(tableComposite, style | SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.widthHint = new PixelConverter(tv.getControl()).convertWidthInCharsToPixels(25);
        gridData.heightHint = new PixelConverter(tv.getControl()).convertHeightInCharsToPixels(10);
        tv.getControl().setLayoutData(gridData);
        setLayout(layout);
        tv.addSelectionChangedListener(event -> selectionChanged(page));
        addSelectionButtons(page);
    }

    /**
     * Opens connection to CDO server with the given connection information from projectProperties. Checks if projects
     * on server exist in the workspace.
     * Already existing projects are added as grayedElements to the end of the table, others are added at the top of the
     * table.
     * 
     * @param projectProperties
     *            Stores the connection information for the CDO server which stores the cooperate projects.
     */
    public static void fillTable(ProjectPropertiesDTO projectProperties) {
        CDOSession session = CDOHelper.createCDOSession(projectProperties.getCdoHost(),
                projectProperties.getCdoPort(), projectProperties.getCdoRepo());
        try {
            tv.getTable().removeAll();
            Set<String> exists = new TreeSet<>();
            for (CDOResourceNode node : session.openView().getElements()) {
                String name = node.getName();
                if (ResourcesPlugin.getWorkspace().getRoot().getProject(name).exists()) {
                    String existsName = name + " (Already in your workspace.)";
                    exists.add(existsName);
                } else {
                    tv.add(name);
                }
            }
            tv.add(exists.toArray());
            tv.setGrayedElements(exists.toArray());
            tv.setCheckedElements(exists.toArray());
        } finally {
            IOUtil.closeSilent(session);
        }
    }

    public static Set<String> getSelectedProjects() {
        selectedProjects = new HashSet<>();
        for (Object o : tv.getCheckedElements()) {
            if (!tv.getGrayed(o.toString())) {
                selectedProjects.add(o.toString());
            }
        }
        return selectedProjects;
    }

    private void addSelectionButtons(ImportWizardPage page) {
        Composite buttonsComposite = new Composite(this, SWT.NONE);
        GridLayout layout = new GridLayout();
        buttonsComposite.setLayout(layout);
        buttonsComposite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
        GridData gd = new GridData();
        gd.grabExcessHorizontalSpace = true;
        gd.horizontalAlignment = SWT.FILL;

        Button selectAll = new Button(buttonsComposite, SWT.PUSH);
        selectAll.setText("Select All");
        selectAll.setLayoutData(gd);
        selectAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                tv.setAllChecked(true);
                checkSelection(page);
            }
        });

        Button deselectAll = new Button(buttonsComposite, SWT.PUSH);
        deselectAll.setText("Deselect All");
        deselectAll.setLayoutData(gd);
        deselectAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                tv.setCheckedElements(tv.getGrayedElements());
                checkSelection(page);
            }
        });
    }

    private static void checkSelection(ImportWizardPage page) {
        if (tv.getCheckedElements().length > tv.getGrayedElements().length) {
            page.setPageComplete(true);
        } else {
            page.setPageComplete(false);
        }
    }

    private static void selectionChanged(ImportWizardPage page) {
        Set<Object> checked = new HashSet<>(Arrays.asList(tv.getGrayedElements()));
        checked.addAll(Arrays.asList(tv.getCheckedElements()));
        tv.setCheckedElements(checked.toArray());
        checkSelection(page);
    }
}
