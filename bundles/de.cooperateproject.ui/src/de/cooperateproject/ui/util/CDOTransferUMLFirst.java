package de.cooperateproject.ui.util;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransferMapping;
import org.eclipse.emf.cdo.transfer.CDOTransferSystem;

public class CDOTransferUMLFirst extends CDOTransfer {

	public CDOTransferUMLFirst(CDOTransferSystem sourceSystem, CDOTransferSystem targetSystem) {
		super(sourceSystem, targetSystem);
		
	}

	@Override
	protected void performFolder(CDOTransferMapping mapping, IProgressMonitor monitor) {
		super.performFolder(new CDOTransferMappingUMLFirst(mapping), monitor);
	}

	@Override
	protected ModelTransferContext createModelTransferContext() {
		return new CustomModelTransferContext(this);
	}
	
}