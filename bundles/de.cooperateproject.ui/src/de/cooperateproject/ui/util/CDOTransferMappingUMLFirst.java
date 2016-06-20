package de.cooperateproject.ui.util;

import java.util.Arrays;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.cdo.transfer.CDOTransfer;
import org.eclipse.emf.cdo.transfer.CDOTransferElement;
import org.eclipse.emf.cdo.transfer.CDOTransferMapping;
import org.eclipse.emf.cdo.transfer.CDOTransferType;

public class CDOTransferMappingUMLFirst implements CDOTransferMapping {

	private static final String UML_EXTENSION = "uml";
	private final CDOTransferMapping delegate;
	
	public CDOTransferMappingUMLFirst(CDOTransferMapping delegate) {
		this.delegate = delegate;
	}
	
	public CDOTransferMapping[] getChildren() {
		CDOTransferMapping[] children = delegate.getChildren();
		Arrays.sort(children, CDOTransferMappingUMLFirst::compare);
		return children;
	}
	
	private static int compare(CDOTransferMapping m1, CDOTransferMapping m2) {
		boolean b1 = m1.getName().endsWith(UML_EXTENSION);
		boolean b2 = m2.getName().endsWith(UML_EXTENSION);
		
		if (b1 ^ b2) {
			return b1 ? -1 : 1;
		}
		return 0;
	}
	
	// only delegation starting from here

	public CDOTransfer getTransfer() {
		return delegate.getTransfer();
	}

	public CDOTransferElement getSource() {
		return delegate.getSource();
	}

	public CDOTransferMapping getParent() {
		return delegate.getParent();
	}

	public boolean isRoot() {
		return delegate.isRoot();
	}

	public boolean isDirectory() {
		return delegate.isDirectory();
	}

	public String getName() {
		return delegate.getName();
	}

	public void setName(String name) {
		delegate.setName(name);
	}

	public IPath getRelativePath() {
		return delegate.getRelativePath();
	}

	public void setRelativePath(IPath path) {
		delegate.setRelativePath(path);
	}

	public void setRelativePath(String path) {
		delegate.setRelativePath(path);
	}

	public void accept(Visitor visitor) {
		delegate.accept(visitor);
	}

	public CDOTransferMapping getChild(IPath path) {
		return delegate.getChild(path);
	}

	public CDOTransferMapping getChild(String path) {
		return delegate.getChild(path);
	}

	public void unmap() {
		delegate.unmap();
	}

	public CDOTransferType getTransferType() {
		return delegate.getTransferType();
	}

	public void setTransferType(CDOTransferType transferType) {
		delegate.setTransferType(transferType);
	}

	public IPath getFullPath() {
		return delegate.getFullPath();
	}

	public Status getStatus() {
		return delegate.getStatus();
	}

	public CDOTransferElement getTarget() {
		return delegate.getTarget();
	}

	public int compareTo(CDOTransferMapping o) {
		return delegate.compareTo(o);
	}

	

}
