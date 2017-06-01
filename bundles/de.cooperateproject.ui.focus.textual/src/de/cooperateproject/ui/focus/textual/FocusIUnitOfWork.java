package de.cooperateproject.ui.focus.textual;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

class FocusIUnitOfWork extends IUnitOfWork.Void<XtextResource> {

    private int offset = -1;
    private EObject focusedElement = null;

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public void process(XtextResource state) throws Exception {
        EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();
        if (offset != -1) {
            focusedElement = helper.resolveContainedElementAt(state, offset);
        }
    }

    public EObject getFocusedElement() {
        return focusedElement;
    }

}
