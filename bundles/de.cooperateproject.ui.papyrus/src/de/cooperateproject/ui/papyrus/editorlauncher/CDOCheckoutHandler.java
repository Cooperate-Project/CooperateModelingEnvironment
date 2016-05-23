package de.cooperateproject.ui.papyrus.editorlauncher;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.ui.cdo.util.CDOHelper;

public class CDOCheckoutHandler {

	private final CDOCheckout cdoCheckout;
	private final CDOView cdoView;
	
	public CDOCheckoutHandler(CDORepository cdoRepository) {
		this.cdoCheckout = createCheckout(cdoRepository);
		this.cdoView = cdoCheckout.openView();
	}
	
	public CDOObject getObject(CDOID cdoId) {
		return cdoView.getObject(cdoId);
	}
	
	public EObject getObject(EObject eObject) {
		if (eObject instanceof CDOObject) {
			return getObject(((CDOObject)eObject).cdoID());
		}
		return eObject;
	}
	
	public void delete() {
		IOUtil.closeSilent(cdoView);
		deleteCheckout(cdoCheckout);
	}
	
	private static CDOCheckout createCheckout(CDORepository cdoRepository) {
		CDOCheckout checkout = CDOHelper.createCheckout(cdoRepository);
		checkout.open();
		return checkout;
	}
	
	private static void deleteCheckout(CDOCheckout cdoCheckout) {
		cdoCheckout.close();
		cdoCheckout.delete(true);
	}
	
}
