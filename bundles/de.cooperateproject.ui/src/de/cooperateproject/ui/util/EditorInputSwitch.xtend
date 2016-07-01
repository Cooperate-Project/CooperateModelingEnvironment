package de.cooperateproject.ui.util

import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput
import org.eclipse.emf.common.util.URI
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IFileEditorInput
import org.eclipse.ui.IURIEditorInput
import org.eclipse.emf.common.ui.URIEditorInput

class EditorInputSwitch {
	
	def URI doSwitch(IEditorInput editorInput) {
		return editorInput.internalSwitch
	}
	
	def dispatch internalSwitch(IFileEditorInput editorInput) {
		return URI.createPlatformResourceURI(editorInput.file.getFullPath().toString(), true)
	}
	
	def dispatch internalSwitch(IURIEditorInput editorInput) {
		return URI.createURI(editorInput.URI.toString)
	}
	
	def dispatch internalSwitch(URIEditorInput editorInput) {
		return URI.createURI(editorInput.URI.toString)
	}
	
	def dispatch internalSwitch(CDOLobEditorInput editorInput) {
		return editorInput.resource.URI
	}
	
}