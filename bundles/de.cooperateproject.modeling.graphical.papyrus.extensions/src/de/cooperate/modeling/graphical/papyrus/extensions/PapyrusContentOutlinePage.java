package de.cooperate.modeling.graphical.papyrus.extensions;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.ui.contentoutline.IPapyrusContentOutlinePage;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class PapyrusContentOutlinePage extends ContentOutlinePage implements IPapyrusContentOutlinePage, ITabbedPropertySheetPageContributor{

	private TreeViewer viewer;
	private IMultiDiagramEditor editor;

	public PapyrusContentOutlinePage() {
		super();
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		viewer = getTreeViewer();
		viewer.setContentProvider(new PapyrusContentProvider());
		viewer.setLabelProvider(new UMLLabelProvider());
		viewer.setInput(editor.getActiveEditor());
	}
	
	@Override
	public void init(IMultiDiagramEditor arg0) throws BackboneException {
		editor = arg0;
		editor.addPropertyListener(new IPropertyListener() {
			@Override
			public void propertyChanged(Object source, int propId) {
				PapyrusContentOutlinePage.this.viewer.setInput(editor.getActiveEditor());
			}
		});
	}

	@Override
	public String getContributorId() {
		return "42";
	}
	
}
